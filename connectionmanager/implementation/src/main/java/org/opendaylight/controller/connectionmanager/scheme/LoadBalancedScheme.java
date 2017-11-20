/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.connectionmanager.scheme;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import laboratory.controller.efficiency.LoadCollection;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.opendaylight.controller.clustering.services.CacheConfigException;
import org.opendaylight.controller.clustering.services.CacheExistException;
import org.opendaylight.controller.clustering.services.IClusterGlobalServices;
import org.opendaylight.controller.clustering.services.IClusterServices;
import org.opendaylight.controller.connectionmanager.ConnectionMgmtScheme;
import org.opendaylight.controller.connectionmanager.loadbalanced.ControllerState;
import org.opendaylight.controller.sal.core.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.sal.utils.StatusCode;

/**
 * Load Balancing scheme will let the nodes connect with controller based
 * on the resource usage in each of the controllers in a cluster.
 */

public class LoadBalancedScheme extends AbstractScheme {
	private static final Logger log = LoggerFactory.getLogger(LoadBalancedScheme.class);
	
	// some configurations of scheduled task.
	private static final int INTERNAL_THREAD_START_TIME = 60;
	private static final int CONTROLLER_STATE_UPDATE_INTERVAL = 60;
	private static final int STATE_HISTORY_SIZE = 10;
	
	private static ScheduledExecutorService scheduledService = null;
	private static ExecutorService updateInClusterService = null;
    private static AbstractScheme myScheme= null;
    private final String controllerStateCacheName;
    private LinkedList<ControllerState> stateHistory;
    protected static ConcurrentMap<InetAddress, ControllerState> controllerState;

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new LoadBalancedScheme(clusterServices);
        }
        return myScheme;
    }

    protected LoadBalancedScheme(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.LOAD_BALANCED);
        controllerStateCacheName = "connectionmanager.load_balanced.controllerstate";
        // some cache operations here
        if ( clusterServices != null ) {
        	allocateCachesInLB();
        	retrieveCachesInLB();
            final Runnable updateRunnable = new Runnable() {
            	public void run() {
            		long startTime = System.nanoTime();
            		updateControllerStateInCluster();
            		long endTime = System.nanoTime();
            		log.info("[update controller state] Process Time:"+(endTime-startTime)+"ns");
            	}
            };
            updateInClusterService = Executors.newSingleThreadExecutor();
        	// Scheduled Task for Update Load.
            Runnable collectRunnable = new Runnable() {  
                public void run() {  
                    // task to run goes here  
                	long startTime = System.nanoTime();
                	if ( controllerState != null) {
                		collectControllerState();
                		updateInClusterService.execute(updateRunnable);
                	}
              	    long endTime=System.nanoTime();
              	    log.info("[collect controller state] Process Time:"+(endTime-startTime)+"ns");
                }  
            };  
            scheduledService = Executors.newSingleThreadScheduledExecutor(); 
            scheduledService.scheduleAtFixedRate(collectRunnable, INTERNAL_THREAD_START_TIME, CONTROLLER_STATE_UPDATE_INTERVAL, TimeUnit.SECONDS);  
            stateHistory = new LinkedList<ControllerState>();
            
        }
    }
    
    // Initialize cache.
    private void allocateCachesInLB() {
        if (this.clusterServices == null) {
            log.error("Un-initialized clusterServices, can't create cache");
            return;
        }
        try {
            clusterServices.createCache(controllerStateCacheName, EnumSet.of(IClusterServices.cacheMode.TRANSACTIONAL));
        } catch (CacheExistException cee) {
            log.debug("\nCache already exists: {}", controllerStateCacheName);
        } catch (CacheConfigException cce) {
            log.error("\nCache configuration invalid - check cache mode");
        } catch (Exception e) {
            log.error("An error occured",e);
        }
    }
    
    @SuppressWarnings({ "unchecked" })
    private void retrieveCachesInLB() {
        if (this.clusterServices == null) {
            log.error("Un-initialized Cluster Services, can't retrieve caches for scheme: load_balance");
            return;
        }
        controllerState = (ConcurrentMap<InetAddress, ControllerState>) clusterServices.getCache(controllerStateCacheName);
        if (nodeConnections == null) {
            log.error("\nFailed to get cache: {}", controllerStateCacheName);
        }
    }

    /**
     * Get the working controllers excluding those fall asleep.
     * @return
     */
    public List<InetAddress> getWorkingControllers(){
        Iterator<Entry<Node, Set<InetAddress>>> iter = nodeConnections.entrySet().iterator();
        Set<InetAddress> resultSet = new HashSet<InetAddress>();
        List<InetAddress> result = new ArrayList<InetAddress>();
        while( iter.hasNext() ){
            Entry<Node, Set<InetAddress>> entry =  iter.next();
            Set<InetAddress> val = entry.getValue();
            for( InetAddress addr: val){
                if ( !resultSet.contains(addr) ){
                    resultSet.add(addr);
                }
            }
        }
        for (InetAddress address : resultSet) {
            result.add(address);
        }
        return result;
    }
    
    public Status updateNodeWithoutConstraint (Node node, InetAddress controller) {
        if (node == null || controller == null) {
            return new Status(StatusCode.BADREQUEST, "Invalid Node or Controller Address Specified.");
        }

        if (clusterServices == null || nodeConnections == null) {
            return new Status(StatusCode.SUCCESS);
        }
        log.debug("Trying to Put {} to {}", controller.getHostAddress(), node.toString());

        Set<InetAddress> oldControllers = nodeConnections.get(node);
        if ( oldControllers != null && oldControllers.contains(controller) ) {
        	return new Status(StatusCode.NOSERVICE, "The master controller is not changed");
        }
        if ( oldControllers != null && oldControllers.size() > 1 ) {
        	return new Status(StatusCode.FORBIDDEN, "The size of master is more than one");
        }
        
        Set<InetAddress> newControllers = new HashSet<InetAddress>();
        
        if (newControllers.add(controller)) { // true -> controller exists
             try {
                 clusterServices.tbegin();
                 if ( oldControllers != null ) {
                	 if (!nodeConnections.replace(node, oldControllers, newControllers)) {
                		 clusterServices.trollback();
     					 log.debug("Retrying ... {} with {}",
    							controller.getHostAddress(), node.toString());
                		 try {
                			 Thread.sleep(100);
                		 } catch ( InterruptedException e) {}
                         return updateNodeWithoutConstraint(node, controller);
                     }
                	 else {
     					log.info(
     							"Replace successful old={} with new={} for {} to {}",
     							oldControllers.toString(),
     							newControllers.toString(),
     							controller.getHostAddress(), node.toString());
                	 }
                 }
                 else {
                	 if (nodeConnections.putIfAbsent(node, newControllers) != null) {
                		 clusterServices.trollback();
     					 log.debug("Retrying ... {} with {}",
    							controller.getHostAddress(), node.toString());
                		 try {
                			 Thread.sleep(100);
                		 } catch ( InterruptedException e) {}
                		 return updateNodeWithoutConstraint(node, controller);
                	 }
                	 else {
         				log.info("Added {} to {}", controller.getHostAddress(), node.toString());
                	 }
                 }
                 clusterServices.tcommit();
             } catch (Exception e) {
                log.error("Exception in removing Controller from a Node", e);
                try {
                   clusterServices.trollback();
                } catch (Exception e1) {
                    log.error("Error Rolling back the node Connections Changes ", e);
                }
                return new Status(StatusCode.INTERNALERROR);
            }
        }
        return new Status(StatusCode.SUCCESS);
    }

    public void stopScheduledTask() {
    	scheduledService.shutdown();
    }
    
    @Override
    public boolean isConnectionAllowedInternal(Node node) {
        Set <InetAddress> controllers = nodeConnections.get(node);
        if (controllers == null || controllers.size() == 0) return true;
        return (controllers.size() == 1 && controllers.contains(clusterServices.getMyAddress()));
    }
    
    public static void test() {
    	System.out.println(LoadCollection.getNumbersOfPacketIn());
    }

    private void collectControllerState() {
    	try {
            Sigar sigar = new Sigar(); 
            
            // cpu
            CpuInfo infos[] = sigar.getCpuInfoList(); 
            CpuPerc cpuList[] = null; 
            cpuList = sigar.getCpuPercList(); 
            double cpuUsage = 0.0d;
            for (int i = 0; i < infos.length; i++) { 
                cpuUsage += cpuList[i].getCombined();
            } 
            cpuUsage /= infos.length;
            
            // net error
            String ifNames[] = sigar.getNetInterfaceList();
            String provisions = System.getProperty("net.provisioning"); // read from ./configuration/config.ini
            String[] array = provisions.split(";");
            Set<String> provision = new HashSet<String>();
            long netErrors = 0L;
            for( String str: array) {
            	provision.add(str);
            }
            for (int i = 0; i < ifNames.length; i++) { 
                String name = ifNames[i]; 
                if ( !provision.contains(name) ) {
                	continue;
                }
                NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name); 
//                System.out.println("IP Address: \t" + ifconfig.getAddress()); 
                if ((ifconfig.getFlags() & 1L) <= 0L) { 
                    log.info("!IFF_UP...skipping getNetInterfaceStat"); 
                    continue; 
                } 
                NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name); 
                netErrors += ifstat.getRxErrors() + ifstat.getTxErrors() + ifstat.getRxDropped() + ifstat.getTxDropped();
            }
            int packetIns = LoadCollection.getAndClearPacketIn();
            long processTime = LoadCollection.getAndClearProcessTime();
            processTime = ( packetIns == 0 ) ? 0L :processTime/packetIns;
            ControllerState cs = new ControllerState(1.0 - cpuUsage, sigar.getMem().getFree(), 
            		netErrors, (double)packetIns/CONTROLLER_STATE_UPDATE_INTERVAL,
            		processTime, LoadCollection.getRtt());
            while ( stateHistory.size() >= STATE_HISTORY_SIZE ) {
            	stateHistory.pollFirst();
            }
        	stateHistory.offerLast(cs);
        	log.debug("Stored In stateHistory\n {}", stateHistory.toString());
    	} catch (Exception e1) { 
            e1.printStackTrace(); 
        }
    }
    
    private void updateControllerStateInCluster() {
    	InetAddress address = clusterServices.getMyAddress();
    	ControllerState first = stateHistory.peekFirst();
    	ControllerState last = stateHistory.peekLast();
    	double averagePacketIns = 0;
    	long averageProcessTime = 0L;
    	double averageCpuLeft = 0.0d;
    	for (Iterator<ControllerState> iterator = stateHistory.iterator(); iterator.hasNext();)
    	{
    		ControllerState state = iterator.next();
    		averageProcessTime += state.getProcessTime();
    		averageCpuLeft += state.getCpuLeft();
    		averagePacketIns += state.getPacketIns();
    	}
    	ControllerState cs = new ControllerState(averageCpuLeft/stateHistory.size(), last.getMemLeft(), last.getNetErrors() - first.getNetErrors(),
    			averagePacketIns/stateHistory.size(), averageProcessTime, last.getRtt());

        if (clusterServices == null || nodeConnections == null) {
            log.warn("Cluster service unavailable, or node connections info missing.");
        }
        
        ControllerState oldState = controllerState.get(address);
        try {
            clusterServices.tbegin();
            if (controllerState.putIfAbsent(address, cs) != null) {
            	if ( oldState == null || !controllerState.replace(address, oldState, cs)) {
            		clusterServices.trollback();
            		try {
            			Thread.sleep(100);
            		} catch ( InterruptedException e) {}
            		log.debug("Retrying ... {} with {}", address.toString(), cs.toString());
            		updateControllerStateInCluster();
            		return;
            	}
                else {
                	log.debug("Replace successful old={} with new={} for {})", oldState.toString(), cs.toString(), address.toString());
                }
            }
            else {
                log.debug("Added {} to {}", cs.toString(), address.toString());
            }
            clusterServices.tcommit();
        } catch (Exception e) {
            log.error("Excepion in adding Controller to a Node", e);
            try {
                clusterServices.trollback();
            } catch (Exception e1) {
                log.error("Error Rolling back the controller state Changes ", e);
            }
        }
    }

	
    
    
//
//		System.out.println("updater::" + clusterServices.getMyAddress() + " : "
//				+ avg + " p/s");
//		if (myControllerBurden.putIfAbsent(clusterServices.getMyAddress(), avg) != null) {
//			myControllerBurden
//					.replace(clusterServices.getMyAddress(), myControllerBurden
//							.get(clusterServices.getMyAddress()), avg);
//		}
//		PacketHandler.packet_in_number = 0;// 重新计数
//
//		// 更新本控制器连接交换机的消息上报速率。
//		if (localNodes == null) {
//			return;
//		}
//		for (Node localNode : localNodes) {
//			if (PacketHandler.burden.containsKey(localNode)) {
//				int speed = PacketHandler.burden.get(localNode)
//						/ updateInterval;
//				nodeburdenMap.put(localNode, speed);// 更新这interval秒内的交换机的上报速率；
//				System.out.println("updater:: s" + localNode.getID() + " : "
//						+ nodeburdenMap.get(localNode) + " p/s");
//				Integer tmp_value = 0;// 重新计数
//				PacketHandler.burden.put(localNode, tmp_value);
//			}
//		}
//		updateTotalLimits();
//    }
     
//    // 固定的映射关系
//    public void FixedMapping1() {
// 		// 构造controller集合
// 		System.out.println("FixedMapping::start Fixed FatTree Mapping TO 1 controllers");
// 		if (nodeConnections == null) {
// 			System.out.println("nodeConnection is null");
// 		}
// 		Set<Node>nodeSet = new HashSet<Node>();
// 		nodeSet = new HashSet<Node>(nodeConnections.keySet());
// 		for (Node node : nodeSet) {
//			try {
//				updateNodeWithoutConstraint(node, InetAddress.getByName("10.15.123.143"));
//			} catch (UnknownHostException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
// 		}
// 	}
//    
// 	public void FixedMapping2() {
// 		// 构造controller集合
// 		System.out.println("FixedMapping::start Fixed FatTree Mapping TO 2 controllers");
// 		List<InetAddress> controllerList = new ArrayList<InetAddress>();
// 		try {
// 			controllerList.add(InetAddress.getByName("10.15.123.143"));
// 			controllerList.add(InetAddress.getByName("10.15.123.144"));
// 		} catch (UnknownHostException e) {
// 			e.printStackTrace();
// 		}
// 		if (nodeConnections == null) {
// 			System.out.println("nodeConnection is null");
// 		}
// 		Set<Node>nodeSet = new HashSet<Node>();
// 		nodeSet = new HashSet<Node>(nodeConnections.keySet());
// 		for (Node node : nodeSet) {
// 			long level = getLevel(node);
// 			long number = getLowestNodeNumber(node);
// 			//检查是不是判断逻辑错了还是不能用指定的那个函数
// 			if (level == 1) {
// 				if (number < 3) {
// 					updateNodeWithoutConstraint(node, controllerList.get(0));
// 				} else {
// 					updateNodeWithoutConstraint(node, controllerList.get(1));
// 				}
// 			} else {
// 				if (number < 5) {
// 					updateNodeWithoutConstraint(node, controllerList.get(0));
// 				} else {
// 					updateNodeWithoutConstraint(node, controllerList.get(1));
// 				}
// 			}
// 		}
// 	}
//
//	public void FixedMapping4() {
//		// 构造controller集合
//		System.out.println("FixedMapping::start Fixed FatTree Mapping TO 4 Controllers");
//
//		List<InetAddress> controllerList = new ArrayList<InetAddress>();
//		try {
//			controllerList.add(InetAddress.getByName("10.15.123.141"));
//			controllerList.add(InetAddress.getByName("10.15.123.142"));
//			controllerList.add(InetAddress.getByName("10.15.123.143"));
//			controllerList.add(InetAddress.getByName("10.15.123.144"));
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
//		if (nodeConnections == null) {
//			System.out.println("nodeConnection is null");
//		}
//		Set<Node> nodeSet = new HashSet<Node>();
//		nodeSet = new HashSet<Node>(nodeConnections.keySet());
//		for (Node node : nodeSet) {
//			int level = (int) getLevel(node);
//			int number = (int) getLowestNodeNumber(node);
//			// 检查是不是判断逻辑错了还是不能用指定的那个函数
//			if (level == 1) {
//				int idx = (int)number-1;
//				System.out.println("node s"+node.getID() +"->" + controllerList.get(idx));
//				updateNodeWithoutConstraint(node, controllerList.get(idx));
//			} else {
//				//发现如果不是整除，例如5 经过下式计算idx = 2；
//				int idx = (int) (Math.ceil(number/2));
//				if (number%2 == 0) {
//					idx-=1;
//				}
//				System.out.println("node s"+node.getID() +"->" + controllerList.get(idx));
//				updateNodeWithoutConstraint(node, controllerList.get(idx));
//			}
//		}
//	}
// 	// 拿到nodeID的千位数
// 	private long getLevel(Node node) {
// 		long nodeId = (long) node.getID();
// 		long ans = (nodeId / 1000) % 10;
// 		return ans;
// 	}
//
// 	// 拿到nodeId的个位数
// 	private long getLowestNodeNumber(Node node) {
// 		long nodeId = (long) node.getID();
// 		long ans = nodeId%10;
// 		return ans;
// 	}
// 	public void startChecker() {
//		;
//	}


    private static void property() throws UnknownHostException { 
        Runtime r = Runtime.getRuntime(); 
        log.info("JVM total memory:\t" + r.totalMemory()); // <--------
        log.info("JVM free memory:\t" + r.freeMemory());   // <--------
    } 

    private static void cpu() throws SigarException { 
        Sigar sigar = new Sigar(); 
        CpuInfo infos[] = sigar.getCpuInfoList(); 
        CpuPerc cpuList[] = null; 
        cpuList = sigar.getCpuPercList(); 
        for (int i = 0; i < infos.length; i++) { 
            printCpuPerc(cpuList[i]); 
            if( i != infos.length - 1) {
            	log.info("");
            }
        } 
    } 

    private static void printCpuPerc(CpuPerc cpu) { 
        log.info("CPU us: \t" + CpuPerc.format(cpu.getUser()));  
        log.info("CPU sys: \t" + CpuPerc.format(cpu.getSys())); 
        log.info("CPU wa: \t" + CpuPerc.format(cpu.getWait())); 
        log.info("CPU ni: \t" + CpuPerc.format(cpu.getNice()));
        log.info("CPU id: \t" + CpuPerc.format(cpu.getIdle())); 
        log.info("CPU total usage: \t" + CpuPerc.format(cpu.getCombined())); // <--------
    } 

    private static void memory() throws SigarException { 
        Sigar sigar = new Sigar(); 
        Mem mem = sigar.getMem();  
        log.info("Total Memory: \t" + mem.getTotal() / 1024L + "K av");   // <-------- ?
        log.info("Used Memory: \t" + mem.getUsed() / 1024L + "K used");   // <-------- ?
        log.info("Free Memory: \t" + mem.getFree() / 1024L + "K free");   // <-------- ?
    }

    private static void specifiedNet() throws Exception { // <--------
        Sigar sigar = new Sigar(); 
        String ifNames[] = sigar.getNetInterfaceList();
        String provisions = System.getProperty("net.provisioning"); // read from ./configuration/config.ini
        String[] array = provisions.split(";");
        Set<String> provision = new HashSet<String>();
        for( String str: array) {
        	provision.add(str);
        }
        for (int i = 0; i < ifNames.length; i++) { 
            String name = ifNames[i]; 
            if ( !provision.contains(name) ) {
            	continue;
            }
            NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(name); 
            log.info("Network Name: \t" + name); 
            log.info("IP Address: \t" + ifconfig.getAddress()); 
            log.info("Net Mask: \t" + ifconfig.getNetmask()); 
            if ((ifconfig.getFlags() & 1L) <= 0L) { 
                log.info("!IFF_UP...skipping getNetInterfaceStat"); 
                continue; 
            } 
            NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name); 
            log.info(name + " rx packets: \t" + ifstat.getRxPackets()); // minus
            log.info(name + " tx packets: \t" + ifstat.getTxPackets()); 
            log.info(name + " rx bytes: \t" + ifstat.getRxBytes()); 
            log.info(name + " tx bytes: \t" + ifstat.getTxBytes()); 
            log.info(name + " rx errors: \t" + ifstat.getRxErrors()); 
            log.info(name + " tx errors: \t" + ifstat.getTxErrors()); 
            log.info(name + " rx dropped: \t" + ifstat.getRxDropped());
            log.info(name + " tx dropped: \t" + ifstat.getTxDropped()); 
        }
    }
    
    
}
