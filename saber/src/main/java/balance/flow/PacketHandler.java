package balance.flow;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.opendaylight.controller.connectionmanager.IConnectionManager;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.packet.Ethernet;
import org.opendaylight.controller.sal.packet.IDataPacketService;
import org.opendaylight.controller.sal.packet.IListenDataPacket;
import org.opendaylight.controller.sal.packet.IPv4;
import org.opendaylight.controller.sal.packet.Packet;
import org.opendaylight.controller.sal.packet.PacketResult;
import org.opendaylight.controller.sal.packet.RawPacket;
import org.opendaylight.controller.sal.utils.ServiceHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Map;

//这个模块负责做一些统计，比如统计一段时间间隔内的控制器消息速率，一段时间内的交换机的消息速率，共享给connecttionManager模块
public class PacketHandler implements IListenDataPacket {
    private static final Logger log = LoggerFactory.getLogger(PacketHandler.class);
    private IDataPacketService dataPacketService;
//    private Timer disconnectTimer;
//    private int threshold;//交换机p_IN上报速率门槛
    public static int packet_in_number;
    public static Map<Node, Integer> burden = new HashMap<Node, Integer>();

    public void init() {
        packet_in_number = 0;
//        disconnectTimer = new Timer("disconnect PeriodTimer");
//        threshold = 1;
    }

    public void start() {
        //定时断开控制器的
//        disconnectTimer.scheduleAtFixedRate(new TimerTask() {
//            public void run() {
//                IConnectionManager connectionManager = (IConnectionManager) ServiceHelper.getGlobalInstance(IConnectionManager.class, this);
//                if (connectionManager == null) {
//                    System.out.println("no connectionManager!");
//                } else {
//                    Set<Node> localNodes = connectionManager.getLocalNodes();
//                    if (localNodes == null) {
//                        System.out.println("该控制器没有管控交换机 -ptt");
//                    } else {
//                        for (Node localNode : localNodes) {
//                            if (burden.containsKey(localNode)) {
//                                System.out.println("遍历到交换机：" + localNode.toString()+"它的packetin计数为："+burden.get(localNode)+" -ptt");
//                                if (burden.get(localNode) > threshold) {
//                                }
//                                Integer tmp_value = 0;
//                                burden.put(localNode, tmp_value);
//                            }
//                        }
//                    }
//                    System.out.println("控制器packet-in-number为:"+ packet_in_number);
//                    packet_in_number = 0;
//                }
//            }
//        }, 30 * 1000L, (long) (1 * 8000L));
    }

    public int getPackage() {
        return packet_in_number;
    }

    static private InetAddress intToInetAddress(int i) {
        byte b[] = new byte[] { (byte) ((i >> 24) & 0xff), (byte) ((i >> 16) & 0xff), (byte) ((i >> 8) & 0xff),
                (byte) (i & 0xff) };
        InetAddress addr;
        try {
            addr = InetAddress.getByAddress(b);
        } catch (UnknownHostException e) {
            return null;
        }
        return addr;
    }

    /*
     * Sets a reference to the requested DataPacketService See
     * Activator.configureInstance(...):
     * c.add(createContainerServiceDependency(containerName).setService(
     * IDataPacketService.class).setCallbacks( "setDataPacketService",
     * "unsetDataPacketService") .setRequired(true));
     */
    void setDataPacketService(IDataPacketService s) {
        log.trace("Set DataPacketService.");

        dataPacketService = s;
    }

    /*
     * Unsets DataPacketService See Activator.configureInstance(...):
     * c.add(createContainerServiceDependency(containerName).setService(
     * IDataPacketService.class).setCallbacks( "setDataPacketService",
     * "unsetDataPacketService") .setRequired(true));
     */
    void unsetDataPacketService(IDataPacketService s) {
        log.trace("Removed DataPacketService.");

        if (dataPacketService == s) {
            dataPacketService = null;
        }
    }

    @Override
    public PacketResult receiveDataPacket(RawPacket inPkt) {
        log.trace("Received data packet.");
        // The connector, the packet came from ("port")
        NodeConnector ingressConnector = inPkt.getIncomingNodeConnector();
        // The node that received the packet ("switch")
        Node node = ingressConnector.getNode();
        if (!burden.containsKey(node)) {
            Integer tmp_value = 0;
            burden.put(node, tmp_value);
        }
        // Use DataPacketService to decode the packet.
        Packet l2pkt = dataPacketService.decodeDataPacket(inPkt);
        if (l2pkt instanceof Ethernet) {
            Object l3Pkt = l2pkt.getPayload();
            if (l3Pkt instanceof IPv4) {
                packet_in_number++;
                Integer tmp_burden = new Integer(burden.get(node) + 1);
                burden.put(node, tmp_burden);

                IPv4 ipv4Pkt = (IPv4) l3Pkt;
                int dstAddr = ipv4Pkt.getDestinationAddress();
                InetAddress addr = intToInetAddress(dstAddr);
                System.out.println("Pkt. to " + addr.toString()
                        + " received by node " + node.getNodeIDString()
                        + " on connector " + ingressConnector.getNodeConnectorIDString()+" 当前packetin总数为："+packet_in_number);
                return PacketResult.KEEP_PROCESSING;
            }
        }
        // We did not process the packet -> let someone else do the job.
        return PacketResult.IGNORED;
    }
}