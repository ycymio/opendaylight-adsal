package my.flowinstall;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.opendaylight.controller.forwardingrulesmanager.FlowEntry;
import org.opendaylight.controller.forwardingrulesmanager.IForwardingRulesManager;
import org.opendaylight.controller.hosttracker.IfIptoHost;
import org.opendaylight.controller.hosttracker.hostAware.HostNodeConnector;
import org.opendaylight.controller.protocol_plugin.openflow.internal.FlowProgrammerService;
import org.opendaylight.controller.protocol_plugin.openflow.mio.DetectionKey;
import org.opendaylight.controller.protocol_plugin.openflow.mio.DetectionValue;
import org.opendaylight.controller.sal.action.Action;
import org.opendaylight.controller.sal.action.Output;
import org.opendaylight.controller.sal.action.SetDlDst;
import org.opendaylight.controller.sal.core.ConstructionException;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Path;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.sal.core.UpdateType;
import org.opendaylight.controller.sal.core.NodeConnector.NodeConnectorIDType;
import org.opendaylight.controller.sal.flowprogrammer.Flow;
import org.opendaylight.controller.sal.flowprogrammer.IFlowProgrammerService;
import org.opendaylight.controller.sal.match.Match;
import org.opendaylight.controller.sal.match.MatchField;
import org.opendaylight.controller.sal.match.MatchType;
import org.opendaylight.controller.sal.packet.Ethernet;
import org.opendaylight.controller.sal.packet.IDataPacketService;
import org.opendaylight.controller.sal.packet.IListenDataPacket;
import org.opendaylight.controller.sal.packet.IPv4;
import org.opendaylight.controller.sal.packet.Packet;
import org.opendaylight.controller.sal.packet.PacketResult;
import org.opendaylight.controller.sal.packet.RawPacket;
import org.opendaylight.controller.sal.topology.TopoEdgeUpdate;
import org.opendaylight.controller.sal.utils.EtherTypes;
import org.opendaylight.controller.sal.utils.NetUtils;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.statisticsmanager.IStatisticsManager;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.opendaylight.controller.topologymanager.ITopologyManagerAware;
import org.openflow.protocol.OFPort;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class FlowInstall implements ITopologyManagerAware, IListenDataPacket, CommandProvider {

    private static Logger log = LoggerFactory.getLogger(FlowInstall.class);
    
    private IStatisticsManager statisticsManager = null;
    private ITopologyManager topologyManager;
    private IDataPacketService dataPacketService = null;
    private IFlowProgrammerService programmer = null;
    private ISwitchManager switchManager = null;
    private IForwardingRulesManager forwarder = null;
    private IfIptoHost hostTracker;
    // topology graph
    private Graph<Node, Edge> topo;
    // short path graph
    private DijkstraShortestPath<Node, Edge> shortPath;
    private short priority = 5;
    private Set<Short> havingSet;
    private Random random;
    private int hundreds = 2018950298;

 // int tranform net address
    static private InetAddress intToInetAddress(int i) {
        byte b[] = new byte[] { (byte) ((i >> 24) & 0xff),
                (byte) ((i >> 16) & 0xff), (byte) ((i >> 8) & 0xff),
                (byte) (i & 0xff) };
        InetAddress addr;
        try {
            addr = InetAddress.getByAddress(b);
        } catch (UnknownHostException e) {

            return null;
        }
        return addr;
    }

    public void init() {
        log.debug("flowInstall init() is called");
        topo = new SparseMultigraph<Node, Edge>();
        shortPath = new DijkstraShortestPath<Node, Edge>(topo);
        random = new Random(328);
        havingSet = new HashSet<Short>();
//        havingSet.add(arg0)
    }
    
    void start() {
        registerWithOSGIConsole();
        Map<Edge, Set<Property>> edges = topologyManager.getEdges();
        if (edges.isEmpty()) {
            return;
        }
        List<TopoEdgeUpdate> topoedgeupdateList = new ArrayList<TopoEdgeUpdate>();
        log.debug("Creating routing database from the topology");
        for (Iterator<Map.Entry<Edge, Set<Property>>> i = edges.entrySet()
                .iterator(); i.hasNext();) {
            Map.Entry<Edge, Set<Property>> entry = i.next();
            Edge e = entry.getKey();
            Set<Property> props = entry.getValue();
            TopoEdgeUpdate topoedgeupdate = new TopoEdgeUpdate(e, props,
                    UpdateType.ADDED);
            topoedgeupdateList.add(topoedgeupdate);
        }
        edgeUpdate(topoedgeupdateList);
    }
    
    void stop() {
        
    }
    
    private boolean insFlow(String flowName, Flow flow, Node node) {
        //flow.setIdleTimeout((short) 11);
        // programmer.addFlow(node, flow); //FlowEntry fe
        flow.setPriority((short)priority );
        Status status = forwarder.modifyOrAddFlowEntry(new FlowEntry(
                "loadbalanced", flowName, flow, node));
       //Status status = forwarder.installFlowEntry(new FlowEntry("edm.cfgen", flowName, flow, node));

        if (!status.isSuccess()) {
            log.error(
                    "SDN Plugin failed to program the flow: {} @ {}. Failure is: {}",
                    flow, node, status.getDescription());
            return false;
        } else {
//            System.out.println(flow);
            return true;
        }
    }
    
    private Path getshortPath(Node src, Node dst) {

        List<Edge> path = shortPath.getPath(src, dst);// call shortpath function
        Path res;
        try {
            res = new Path(path);
        } catch (ConstructionException e) {
            log.debug("A vertex is yet not known between {} {}", src, dst);
            return null;
        }
        return res;

    }
    
    private synchronized boolean updateTopo(Edge edge, UpdateType type) {
        boolean edgePresentInGraph = false;
        // spt = new DijkstraShortestPath(topo);
        NodeConnector src = edge.getTailNodeConnector();
        NodeConnector dst = edge.getHeadNodeConnector();

        switch (type) {
        case ADDED: // Make sure the vertex are there before adding the edge

            topo.addVertex(src.getNode());
            topo.addVertex(dst.getNode());

            // Add the link between
            edgePresentInGraph = topo.containsEdge(edge);
            if (!edgePresentInGraph) {
                try {

                    // System.out.print(edge.toString()+"\n");

                    topo.addEdge(new Edge(src, dst), src.getNode(),
                            dst.getNode(), EdgeType.DIRECTED);

                } catch (final ConstructionException e) {

                    log.error("", e);
                    return edgePresentInGraph;
                }
            }
        case CHANGED: // Mainly raised only on properties update, so not really
                        // useful in this case
            break;
        case REMOVED: // Remove the edge
            try {
                topo.removeEdge(new Edge(src, dst));
            } catch (final ConstructionException e) {
                log.error("", e);
                return edgePresentInGraph;
            }

            // If the src and dst vertex don't have incoming or
            // outgoing links we can get ride of them
            if (topo.containsVertex(src.getNode())
                    && (topo.inDegree(src.getNode()) == 0)
                    && (topo.outDegree(src.getNode()) == 0)) {
                log.debug("Removing vertex {}", src);
                topo.removeVertex(src.getNode());
            }
            if (topo.containsVertex(dst.getNode())
                    && (topo.inDegree(dst.getNode()) == 0)
                    && (topo.outDegree(dst.getNode()) == 0)) {
                log.debug("Removing vertex {}", dst);
                topo.removeVertex(dst.getNode());
            }
            break;
        }
        shortPath.reset();

        // if (bw.equals(baseBW)) {
        // clearMaxThroughput(); }
        return edgePresentInGraph;
    }

    private boolean edgeUpdate(Edge e, UpdateType type, Set<Property> props,
            boolean local) {
        // log.trace("Got an edgeUpdate: {} of type {} with props: {} local? {}",
        // new Object[] { e, type,
        // props, local });

        if ((e == null) || (type == null)) {
            System.out.print("Edge or Update type are null!");
            return false;
        }
        String srcType = e.getTailNodeConnector().getType();
        String dstType = e.getHeadNodeConnector().getType();

        if (srcType.equals(NodeConnector.NodeConnectorIDType.PRODUCTION)
                || dstType.equals(NodeConnector.NodeConnectorIDType.PRODUCTION)) {
            log.debug("Skip updates for {}", e);
            return false;
        }

        return !updateTopo(e, type);
        // Update base topo
        // if (newEdge && bw.getValue() != baseBW) {
        // Update BW topo // updateTopo(e, type);
    }

    // topology update
    public void edgeUpdate(List<TopoEdgeUpdate> topoedgeupdateList) {
        for (TopoEdgeUpdate u : topoedgeupdateList) { // e, type, p, isLocal
            edgeUpdate(u.getEdge(), u.getUpdateType(), u.getProperty(),
                    u.isLocal());
        }
    }


    public void edgeOverUtilized(Edge edge) {
        
    }

    public void edgeUtilBackToNormal(Edge edge) {
        
    }

    private static byte[] intToBytes( int value )   
    {   
        byte[] src = new byte[6];  
        src[0] =  (byte) ((value>>40) & 0xFF);
        src[1] =  (byte) ((value>>32) & 0xFF);  
        src[2] =  (byte) ((value>>24) & 0xFF);  
        src[3] =  (byte) ((value>>16) & 0xFF);  
        src[4] =  (byte) ((value>>8) & 0xFF);    
        src[5] =  (byte) (value & 0xFF);                  
        return src;   
    }
    
    public static short toOFPort(NodeConnector salPort) {
        log.trace("SAL Port", salPort);
        if (salPort.getType().equals(NodeConnectorIDType.SWSTACK)) {
            return OFPort.OFPP_LOCAL.getValue();
        } else if (salPort.getType().equals(NodeConnectorIDType.HWPATH)) {
            return OFPort.OFPP_NORMAL.getValue();
        } else if (salPort.getType().equals(NodeConnectorIDType.CONTROLLER)) {
            return OFPort.OFPP_CONTROLLER.getValue();
        }
        return (Short) salPort.getID();
    }

    public PacketResult receiveDataPacket(RawPacket inPkt) {
        if (inPkt == null) {
            return PacketResult.IGNORED;
        }
        NodeConnector incoming_connector = inPkt.getIncomingNodeConnector();

        Packet fmtPkt = this.dataPacketService.decodeDataPacket(inPkt);
        
        if (!(fmtPkt instanceof Ethernet)) {
            return PacketResult.IGNORED;
            
        } else if (fmtPkt.getPayload() instanceof IPv4) {
            final IPv4 ipv4 = (IPv4) fmtPkt.getPayload();
            
            int srip = ipv4.getSourceAddress(), dvip = ipv4.getDestinationAddress();
            InetAddress dIP = NetUtils.getInetAddress(dvip);
            InetAddress sIP = NetUtils.getInetAddress(srip);
            
            if (dIP == null) {
                return PacketResult.IGNORED;
            }

            byte srcMac1[] = intToBytes(hundreds++);
            DetectionKey dc = new DetectionKey(srcMac1, srip, dvip);
            List<DetectionValue> listDv = new ArrayList<DetectionValue>();

            HostNodeConnector host = hostTracker.hostFind(dIP);
//            System.out.println("The dIP is " + dIP.toString() + "     !!!!!");
//            System.out.println("The sIP is " + sIP.toString() + "     !!!!!");
//            System.out.println("The hostTracker getAllHosts is " + hostTracker.getAllHosts().toString() + "     !!!!!");
//            System.out.println("hostTracker:"+host);

            Node snode = incoming_connector.getNode(), 
                dnode = host.getnodeconnectorNode();
           //Match smatch = fmtPkt.getMatch().clone();
            
            Match smatch = new Match();
            smatch.setField(new MatchField(MatchType.DL_TYPE, EtherTypes.IPv4.shortValue()));
            smatch.setField(new MatchField(MatchType.NW_SRC, intToInetAddress(srip)));
            smatch.setField(new MatchField(MatchType.NW_DST, intToInetAddress(dvip)));
//            smatch.setField(new MatchField(MatchType.TP_SRC, ));
//
//            short val = (short)(random.nextInt(10000) + 8196);
//            while ( havingSet.contains(val) ) {
//                val = (short)(random.nextInt(10000) + 8196);
//            }
//          smatch.setField(new MatchField(MatchType.TP_SRC, hundreds++));

            smatch.setField(new MatchField(MatchType.DL_SRC, srcMac1));

            Match dmatch=new Match();
            dmatch.setField(new MatchField(MatchType.DL_TYPE, EtherTypes.IPv4.shortValue()));
            dmatch.setField(new MatchField(MatchType.NW_SRC, intToInetAddress(dvip)));
            dmatch.setField(new MatchField(MatchType.NW_DST, intToInetAddress(srip)));
            dmatch.setField(new MatchField(MatchType.DL_SRC, srcMac1));
        
            if(!snode.equals(dnode)){
                //link the same switch  
                
                Path go = getshortPath(snode, dnode);
            
                for (Edge edge : go.getEdges()) {
                    NodeConnector sec = edge.getTailNodeConnector();
                    Node hnode = sec.getNode();
                    List<Action> acts = new ArrayList<Action>(1);
                    acts.add(new Output(sec));
                    insFlow("multi", new Flow(smatch.clone(), acts), hnode);
                    listDv.add(new DetectionValue((Long) hnode.getID(), toOFPort(sec)));
                }

                for (Edge edge : go.getEdges()) {
                    NodeConnector sec = edge.getHeadNodeConnector();
                    Node hnode = sec.getNode();
                    List<Action> acts = new ArrayList<Action>(1);
                    acts.add(new Output(sec));
                    insFlow("multi", new Flow(dmatch.clone(), acts), hnode);
                    listDv.add(new DetectionValue((Long) hnode.getID(), toOFPort(sec)));
//                    DetectionValue
                }
            }
            
            List<Action> acts = new ArrayList<Action>(2);
            acts.add(new SetDlDst(host.getDataLayerAddressBytes()));
            acts.add(new Output(host.getnodeConnector()));
            insFlow("multi", new Flow(smatch.clone(), acts), dnode);
            listDv.add(new DetectionValue((Long) dnode.getID(), toOFPort(host.getnodeConnector())));

            acts = new ArrayList<Action>(2);
            acts.add(new SetDlDst(hostTracker.hostFind(sIP).getDataLayerAddressBytes()));
            acts.add(new Output(incoming_connector));
            insFlow("multi", new Flow(dmatch.clone(), acts), snode);
            listDv.add(new DetectionValue((Long) snode.getID(), toOFPort(incoming_connector)));
            FlowProgrammerService.setDectionSlaves(dc, listDv);
            // process
//            InetAddress SRC = sIP;
//            HostNodeConnector host2 = hostTracker.hostFind(SRC);
//            NodeConnector nc = host2.getnodeConnector();
//            RawPacket rp = this.dataPacketService.encodeDataPacket(ipv4.getParent());
//            rp.setOutgoingNodeConnector(nc);
//            this.dataPacketService.transmitDataPacket(rp);

            HostNodeConnector destHost = hostTracker.hostFind(dIP);
            NodeConnector nc = destHost.getnodeConnector();
            RawPacket rp = this.dataPacketService.encodeDataPacket(ipv4.getParent());
            rp.setOutgoingNodeConnector(nc);
            this.dataPacketService.transmitDataPacket(rp);
            
            return PacketResult.KEEP_PROCESSING;
        } 

        
        return PacketResult.IGNORED;
    }
//    
//
//    private void handlePuntedIPPacket(IPv4 pkt, NodeConnector incomingNodeConnector, boolean allowAddPending) {
//        InetAddress dIP = NetUtils.getInetAddress(pkt.getDestinationAddress());
//        if (dIP == null || hostTracker == null) {
//            log.debug("Invalid param(s) in handlePuntedIPPacket.. DestIP: {}. hostTracker: {}", dIP, hostTracker);
//            return;
//        }
//        HostNodeConnector destHost = hostTracker.hostFind(dIP);
//        /*
//         * In cases when incoming and outgoing connectors are in the same node, there is no need
//         * to verify that there is a route. Because of that, we will only need routing.getRoute()
//         * if we know that src and dst nodes are different.
//         */
//        if (destHost != null
//                && (incomingNodeConnector.getNode().equals(destHost.getnodeconnectorNode()) )) {
//
//            log.trace("Host {} is at {}", dIP, destHost.getnodeConnector());
//
//            // If SimpleForwarding is aware of this host, it will try to install
//            // a path. Forward packet until it's done.
//            if (dataPacketService != null) {
//
//                /*
//                 * if we know where the host is and there's a path from where this
//                 * packet was punted to where the host is, then attempt best effort delivery to the host
//                 */
//                NodeConnector nc = destHost.getnodeConnector();
//                log.trace("Forwarding punted IP received at {} to {}", incomingNodeConnector, nc);
//                // re-encode the Ethernet packet (the parent of the IPv4 packet)
//                RawPacket rp = this.dataPacketService.encodeDataPacket(pkt.getParent());
//                rp.setOutgoingNodeConnector(nc);
//                this.dataPacketService.transmitDataPacket(rp);
//            }
//        } else {
//            log.warn("Dropping punted IP packet received at {} to Host {}", incomingNodeConnector, dIP);
//        }
//    }
    
    public void setStatisticsManager(IStatisticsManager s) {
        log.debug("StatisticsManager set");
        this.statisticsManager = s;
    }
    public void unsetStatisticsManager(IStatisticsManager s) {
        if (this.statisticsManager == s) {
            log.debug("StatisticsManager removed!");
            this.statisticsManager = null;
        }
    }

    public void setDataPacketService(IDataPacketService s) {
        log.trace("Set DataPacketService.");

        this.dataPacketService = s;
    }
    public void unsetDataPacketService(IDataPacketService s) {
        log.trace("Removed DataPacketService.");

        if (this.dataPacketService == s) {
            this.dataPacketService = null;
        }
    }

    public void setTopologyManager(ITopologyManager tm) {
        this.topologyManager = tm;
    }
    public void unsetTopologyManager(ITopologyManager tm) {
        if (this.topologyManager == tm) {
            this.topologyManager = null;
        }
    }

    public void setFlowProgrammerService(IFlowProgrammerService s) {
        log.trace("Set FlowProgrammerService.");

        this.programmer = s;
    }
    public void unsetFlowProgrammerService(IFlowProgrammerService s) {
        log.trace("Removed FlowProgrammerService.");

        if (this.programmer == s) {
            this.programmer = null;
        }
    }
    
    public void setSwitchManager(ISwitchManager s) {
            log.trace("Set SwitchManager.");
            this.switchManager = s;
        }
    public void unsetSwitchManager(ISwitchManager s) {
            log.trace("Removed SwitchManager.");

            if (this.switchManager == s) {
                this.switchManager = null;
            }
        }
    public void setForwarder(IForwardingRulesManager s) {
            this.forwarder = s;
        }

    public void unsetForwarder(IForwardingRulesManager s) {
            if (this.forwarder == s) {
                this.forwarder = null;
            }
        }

    public void setHostTracker(IfIptoHost hostTracker) {
            log.debug("Setting HostTracker");
            this.hostTracker = hostTracker;
        }

    public void unsetHostTracker(IfIptoHost s) {
            log.debug("UNSetting HostTracker");
            if (this.hostTracker == s) {
                this.hostTracker = null;
            }
        }

    @Override
    public String getHelp() {
        StringBuffer help = new StringBuffer();
        help.append("--- FlowInstall commands---\n");
        help.append("flowtest : test function\n");
        return help.toString();
    }
    
    private void registerWithOSGIConsole() {
        BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass())
                .getBundleContext();
        bundleContext.registerService(CommandProvider.class.getName(), this,
                null);
    }

    public void _flowtesti(CommandInterpreter ci) throws UnknownHostException {
        ci.println("hhh");
        ci.println(FlowProgrammerService.class);
        ci.println(FlowProgrammerService.detectionSlaves);
        mockSlaves();
        ci.println(FlowProgrammerService.detectionSlaves);
    }
    
    private void mockSlaves() {
        byte srcMac1[] = intToBytes(999);
        DetectionKey key = new DetectionKey(srcMac1, 1, 1);
        DetectionValue val = new DetectionValue(1L, (short)1);
        List<DetectionValue> l = new ArrayList<DetectionValue>();
        l.add(val);
        FlowProgrammerService.setDectionSlaves(key, l);
    }
}
