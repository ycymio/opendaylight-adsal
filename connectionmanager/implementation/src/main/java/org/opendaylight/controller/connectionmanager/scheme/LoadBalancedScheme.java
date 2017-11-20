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
import org.opendaylight.controller.connectionmanager.loadbalanced.ControllerStateInCluster;
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
	private static final int INTERNAL_THREAD_START_TIME = 120;
	private static final int CONTROLLER_STATE_UPDATE_INTERVAL = 60;
	private static final int CONTROLLER_STATE_CHECK_INTERVAL = 60;
	private static final int MIGRATION_INTERVAL = 120;
	private static final int STATE_HISTORY_SIZE = 10;
	
	private static ControllerState stardard = null;
	private static int packetin_lower_limit = 1;
	
	private static ScheduledExecutorService scheduledService = null;
	private static ExecutorService updateInClusterService = null;
    private static AbstractScheme myScheme= null;
    private LinkedList<ControllerState> stateHistory;
    private static long maxPacketIns = 500L;
    
    private final String controllerStateCacheName;
    protected static ConcurrentMap<InetAddress, ControllerStateInCluster> controllerState;
    private final String migrationLockName;
    protected static ConcurrentMap<Integer, InetAddress> migrationLock;
    private ControllerState determinedState = null;
    

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new LoadBalancedScheme(clusterServices);
        }
        return myScheme;
    }

    protected LoadBalancedScheme(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.LOAD_BALANCED);
        controllerStateCacheName = "connectionmanager.load_balanced.controllerstate";
        migrationLockName = "connectionmanager.load_balanced.migrationlock";
        // some cache operations here
        if ( clusterServices != null ) {
        	allocateCachesInLB();
        	retrieveCachesInLB();
            final Runnable updateRunnable = new Runnable() {
            	public void run() {
            		long startTime = System.nanoTime();
            		updateControllerStateInCluster();
            		long endTime = System.nanoTime();
            		log.debug("[update controller state] Process Time:"+(endTime-startTime)+"ns");
            	}
            };
            Runnable checkRunnable = new Runnable() {
            	public void run() {
            		long startTime = System.nanoTime();
            		checkControllerState();
            		long endTime = System.nanoTime();
            		log.debug("[check controller state] Process Time:"+(endTime-startTime)+"ns");
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
              	    log.debug("[collect controller state] Process Time:"+(endTime-startTime)+"ns");
                }  
            };  
            scheduledService = Executors.newScheduledThreadPool(2); 
            scheduledService.scheduleAtFixedRate(collectRunnable, INTERNAL_THREAD_START_TIME, CONTROLLER_STATE_UPDATE_INTERVAL, TimeUnit.SECONDS);  
//            scheduledServiceForCheck = Executors.newSingleThreadScheduledExecutor();
            scheduledService.scheduleAtFixedRate(checkRunnable, INTERNAL_THREAD_START_TIME, CONTROLLER_STATE_CHECK_INTERVAL, TimeUnit.SECONDS);
            stateHistory = new LinkedList<ControllerState>();
            
            // TODO: stardard. can modify.
            stardard = new ControllerState(0.1d, 100L << 20, 1, 0, 600*1000000L, null);
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
            clusterServices.createCache(migrationLockName, EnumSet.of(IClusterServices.cacheMode.TRANSACTIONAL));
        } catch (CacheExistException cee) {
            log.debug("\nCache already exists: {} || {}", controllerStateCacheName, migrationLockName);
        } catch (CacheConfigException cce) {
            log.error("\nCache configuration invalid - check cache mode");
        } catch (Exception e) {
            log.error("An error occured",e);
        }
    }
    
    @SuppressWarnings({ "unchecked" })
    private void retrieveCachesInLB() {
        if (this.clusterServices == null) {
            log.error("Un-initialized Cluster Services, can't retrieve caches for scheme: load_balance.");
            return;
        }
        controllerState = (ConcurrentMap<InetAddress, ControllerStateInCluster>) clusterServices.getCache(controllerStateCacheName);
        migrationLock = (ConcurrentMap<Integer, InetAddress>) clusterServices.getCache(migrationLockName);
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
     					 log.trace("Retrying ... {} with {}",
    							controller.getHostAddress(), node.toString());
                		 try {
                			 Thread.sleep(100);
                		 } catch ( InterruptedException e) {}
                		 return updateNodeWithoutConstraint(node, controller);
                	 }
                	 else {
         				log.trace("Added {} to {}", controller.getHostAddress(), node.toString());
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
    
    // TODO: load balance in the beginning.
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
                    log.debug("!IFF_UP...skipping getNetInterfaceStat"); 
                    continue; 
                } 
                NetInterfaceStat ifstat = sigar.getNetInterfaceStat(name); 
                netErrors += ifstat.getRxErrors() + ifstat.getTxErrors() + ifstat.getRxDropped() + ifstat.getTxDropped();
            }
            int packetIns = LoadCollection.getAndClearPacketIn();
            long processTime = LoadCollection.getAndClearProcessTime();
            processTime = ( packetIns == 0 ) ? 0L :processTime/packetIns;
            // calculate 
            ControllerState cs = new ControllerState(1.0 - cpuUsage, sigar.getMem().getFree(), 
            		netErrors, (double)packetIns/CONTROLLER_STATE_UPDATE_INTERVAL,
            		processTime, LoadCollection.getRtt());
            while ( stateHistory.size() >= STATE_HISTORY_SIZE ) {
            	stateHistory.pollFirst();
            }
        	stateHistory.offerLast(cs);
        	log.debug("Local Controller State In stateHistory\n {}", stateHistory.toString());
    	} catch (Exception e1) { 
            e1.printStackTrace(); 
        }
    }
    
    private void updateControllerStateInCluster() {
    	if ( clusterServices == null ) {
            log.error("Un-initialized Cluster Services, can't retrieve caches for scheme: load_balance");
    	}
    	InetAddress address = clusterServices.getMyAddress();

        if (clusterServices == null || controllerState == null) {
            log.warn("Cluster service unavailable, or controller state info missing.");
        }
        
        ControllerStateInCluster oldState = controllerState.get(address);
    	ControllerStateInCluster csic = calculatePacketInAvailable();
        try {
            clusterServices.tbegin();
            if ( oldState != null ) {
            	long timeStamp = oldState.getTimeStamp();
            	csic.setTimeStamp(timeStamp);
            }
            if (controllerState.putIfAbsent(address, csic) != null) {
            	if ( oldState == null || !controllerState.replace(address, oldState, csic)) {
            		clusterServices.trollback();
            		try {
            			Thread.sleep(100);
            		} catch ( InterruptedException e) {}
            		log.trace("Retrying ... {} with {}", address.toString(), csic.toString());
            		updateControllerStateInCluster();
            		return;
            	}
                else {
                	log.trace("Replace successful old={} with new={} for {})", oldState.toString(), csic.toString(), address.toString());
                }
            }
            else {
                log.trace("Added {} to {}", csic.toString(), address.toString());
            }
            clusterServices.tcommit();
        } catch (Exception e) {
            log.error("Excepion in changing Controller state to a Node", e);
            try {
                clusterServices.trollback();
            } catch (Exception e1) {
                log.error("Error Rolling back the controller state Changes ", e);
            }
        }
    }
    
    private ControllerStateInCluster calculatePacketInAvailable() {
        // TODO: calculate Controller State In Cluster
    	// stateHistory
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

    	determinedState = new ControllerState(averageCpuLeft/stateHistory.size(), last.getMemLeft(), last.getNetErrors() - first.getNetErrors(),
    			averagePacketIns/stateHistory.size(), averageProcessTime, last.getRtt());
    	long available = maxPacketIns - (int)averagePacketIns/stateHistory.size();
    	return new ControllerStateInCluster(available, last.getRtt());
    }

    // TODO: add log info?
	private void checkControllerState() {
        if (clusterServices == null || controllerState == null) {
            log.warn("Cluster service unavailable, or controller state info missing.");
        }
    	InetAddress address = clusterServices.getMyAddress();
    	ControllerStateInCluster csic = controllerState.get(address);
    	if ( csic == null ) {
    		log.info("[check controller state]: {} is not in use now. Please wait a moment.", address);
    		return;
    	}
    	ControllerLocalState flag = checkLocalState(csic);
    	log.debug("[check controller state]: The state of controller is {}", flag.name());
		if ( flag == ControllerLocalState.NORMAL ) {
			log.debug("[check controller state]: {} does not need to change. {}", address, csic);
			return ;
		}
		if ( flag == ControllerLocalState.BUSY ){
			// busy.
			// need to start a new controller?
			if ( !checkClusterLoad(true) ) {
				List<InetAddress> workingController = getWorkingControllers();
				List<InetAddress> remainedController = clusterServices.getClusteredControllers();
				if ( remainedController.removeAll(workingController) ) {
					log.error("[check controller state]: {} get remained controller unsuccessfully.", address);
					return ;
				}
				InetAddress newController = remainedController.get(0);
				// register new controller ...
				if (!registerNewController(newController)) {
					log.error("[check controller state]: {} check state again coz registerring failed.", address);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
					checkControllerState();
					return;
				}
			}
			migrateFitSwitch(false);
			// migrating.
		}
		else if ( flag == ControllerLocalState.IDLE ){
			if ( getWorkingControllers().size() <= 2 ) { // promise there are more than 2 working controllers.
				log.info("[check controller state]: the controller node is less than 3. No need to close controllers");
				return;
			}
			if ( System.currentTimeMillis() - csic.getTimeStamp() < MIGRATION_INTERVAL) {
				log.info("[check controller state]: the controller state is changed at the moment. No need to close controllers");
				return;
			}
			if ( !checkClusterLoad(false)) {
				migrateFitSwitch(true);
				log.info("[check controller state]: the controller {} is closed", address);
			}
		}
	}

	private enum ControllerLocalState {
		BUSY("BUSY"), NORMAL("NORMAL"), IDLE("IDLE");
		 private String name; 
		 private ControllerLocalState(String name) {  
	            this.name = name;  
	        }  
	   
	        @Override  
	        public String toString() {  
	            return this.name;  
	        }  
	}
	// TODO:
	/**
	 * Determine whether it need migration.
	 * @param cs
	 * @return 0: normal, 1: busy, -1: idle
	 */
	private ControllerLocalState checkLocalState(ControllerStateInCluster csic) {
		if ( System.currentTimeMillis() - csic.getTimeStamp() < MIGRATION_INTERVAL ) {
			return ControllerLocalState.NORMAL;
		}
		long available = csic.getPacketInAvailable();
		
		if ( available == 0 ) {
			return ControllerLocalState.BUSY;
		}
		
		ControllerState cs = determinedState;
		ControllerState upperLimit = stardard;
		if ( cs.getCpuLeft() < upperLimit.getCpuLeft() || cs.getMemLeft() < upperLimit.getMemLeft() || cs.getNetErrors() >= upperLimit.getNetErrors()
				|| cs.getProcessTime() >= upperLimit.getProcessTime()) {
			return ControllerLocalState.BUSY;
		}
		else if( cs.getPacketIns() < packetin_lower_limit) {
			return ControllerLocalState.IDLE;
		}
		return ControllerLocalState.NORMAL;
	}
	
	// TODO:
	/**
	 * Determine whether the cluster is too busy.
	 * @param isUpper: true: busy, false: idle.
	 * @return true: common, false: busy/idle.
	 */
	private boolean checkClusterLoad(boolean isUpper) {

		return true;
	}

	// TODO: register new controller. important!
	private boolean registerNewController(InetAddress newController) {
		return true;
	}
	

	
	private void migrateFitSwitch(boolean needMigrateAll) {
		// TODO Auto-generated method stub
		// replaces need new ControllerStateInCluster.
		
	}
	
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
