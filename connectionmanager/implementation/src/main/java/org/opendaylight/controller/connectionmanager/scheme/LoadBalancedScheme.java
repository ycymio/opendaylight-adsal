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
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

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
import org.opendaylight.controller.connectionmanager.loadbalanced.ControllerLocalState;
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
	private static final int INTERNAL_THREAD_START_TIME = 30;
	private static final int CONTROLLER_STATE_UPDATE_INTERVAL = 1;
	private static final int CONTROLLER_STATE_CHECK_INTERVAL = 1;
	private static final int MIGRATION_INTERVAL = 120;
	private static final int STATE_HISTORY_SIZE = 10; // >= 2
	
	private static ControllerState state_standard = null;
	
	// TODO: save all the properties in a cluster database.
	private static int packetin_lower_limit = 1;
	private static float cluster_busy_ratio = 0.9f;
	private static float cluster_idle_ratio = 0.9f;
	private static long rtt_upper_limit = 100000;
	
	private static ScheduledExecutorService scheduledService = null;
	private static ScheduledExecutorService scheduledServiceForCheck = null;
	private static ExecutorService updateInClusterService = null;
    private static AbstractScheme myScheme= null;
    private LinkedList<ControllerState> stateHistory;
    private static long maxPacketIns = 300L;
    
    private final String controllerStateCacheName;
    protected static ConcurrentMap<InetAddress, ControllerStateInCluster> controllerState;
//    private final String migrationLockName;
//    protected static ConcurrentMap<InetAddress, Set<Node>> migrationLock;
    private static Map<Node, LinkedList<Integer>> loadMap = null;
    private ControllerState determinedState = null;
    private Sigar sigar = null;

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new LoadBalancedScheme(clusterServices);
        }
        return myScheme;
    }

    protected LoadBalancedScheme(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.LOAD_BALANCED);
        log.info("java.library.path is {}", System.getProperty("java.library.path"));
        controllerStateCacheName = "connectionmanager.load_balanced.controllerstate";
//        migrationLockName = "connectionmanager.load_balanced.migrationlock";
        // some cache operations here
        if ( clusterServices != null ) {
        	allocateCachesInLB();
        	retrieveCachesInLB();
            stateHistory = new LinkedList<ControllerState>();
            
            // TODO: stardard. can modify.
            state_standard = new ControllerState(0.1d, 100L << 20, 1, 0, 600*1000000L, null);
        	startScheduledService();
        }
        sigar = new Sigar();
        loadMap = new HashMap<Node, LinkedList<Integer>>();
    }
    
    private void startScheduledService() {
        final Runnable updateRunnable = new Runnable() {
        	public void run() {
        		try {
            		long startTime = System.nanoTime();
            		updateControllerStateInCluster();
            		long endTime = System.nanoTime();
            		log.debug("[update controller state] Process Time:"+(endTime-startTime)+"ns");        			
        		}
        		catch (Exception e) {
        			e.printStackTrace();
        		}
        	}
        };
        Runnable checkRunnable = new Runnable() {
        	public void run() {
        		try {
            		long startTime = System.nanoTime();
            		checkControllerState();
            		long endTime = System.nanoTime();
            		log.debug("[check controller state] Process Time:"+(endTime-startTime)+"ns");
        		}
        		catch (Exception e) {
        			e.printStackTrace();
        		}
        	}
        };
        updateInClusterService = Executors.newSingleThreadExecutor();
    	// Scheduled Task for Update Load.
        Runnable collectRunnable = new Runnable() {  
            public void run() {  
            	try {
                    // task to run goes here  
                	long startTime = System.nanoTime();
                	if ( controllerState != null) {
                		collectControllerState();
                		updateInClusterService.execute(updateRunnable);
        				Iterator<Map.Entry<InetAddress, ControllerStateInCluster>> entries = controllerState.entrySet().iterator(); 
        		        while (entries.hasNext()) {
        		            Map.Entry<InetAddress, ControllerStateInCluster> entry = entries.next();
                    		log.debug("here: {} - {}", entry.getKey(), entry.getValue());
        		        }
                	}
              	    long endTime=System.nanoTime();
              	    log.debug("[collect controller state] Process Time:"+(endTime-startTime)+"ns");
            	}
            	catch (Exception e) { // can use Callable.
            		e.printStackTrace();
            	}
            }  
        };  
        scheduledService = Executors.newScheduledThreadPool(1); 
        scheduledServiceForCheck = Executors.newScheduledThreadPool(1); 
        scheduledService.scheduleAtFixedRate(collectRunnable, INTERNAL_THREAD_START_TIME, CONTROLLER_STATE_UPDATE_INTERVAL, TimeUnit.SECONDS);  
//        scheduledServiceForCheck = Executors.newSingleThreadScheduledExecutor();
        scheduledServiceForCheck.scheduleAtFixedRate(checkRunnable, INTERNAL_THREAD_START_TIME + 5, CONTROLLER_STATE_CHECK_INTERVAL, TimeUnit.SECONDS);
    }
    
    // Initialize cache.
    private void allocateCachesInLB() {
        if (this.clusterServices == null) {
            log.error("Un-initialized clusterServices, can't create cache");
            return;
        }
        try {
            clusterServices.createCache(controllerStateCacheName, EnumSet.of(IClusterServices.cacheMode.TRANSACTIONAL));
//            clusterServices.createCache(migrationLockName, EnumSet.of(IClusterServices.cacheMode.TRANSACTIONAL));
        } catch (CacheExistException cee) {
            log.debug("\nCache already exists: {} || {}", controllerStateCacheName);
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
//        migrationLock = (ConcurrentMap<InetAddress, Set<Node>>) clusterServices.getCache(migrationLockName);
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

    public void stopScheduledTask() {
    	scheduledService.shutdown();
    }
    
    // TODO: load balance in the beginning.
    @Override
    public boolean isConnectionAllowedInternal(Node node) {
        Set <InetAddress> controllers = nodeConnections.get(node);
        ControllerStateInCluster csic = controllerState.get(clusterServices.getMyAddress());
        if ( csic != null && csic.getState() == ControllerLocalState.HIBERNATE ) {
        	return false;
        }
        if (controllers == null || controllers.size() == 0) return true;
        return (controllers.size() == 1 && controllers.contains(clusterServices.getMyAddress()));
    }
    
    public static void test() {
    	System.out.println(LoadCollection.getNumbersOfPacketIn());
    }

    private void collectControllerState() {
    	try {
    		if( sigar == null ) {
    			log.error("[collect controller state]: cannot read system's properties because sigar is null");
    			return;
    		}
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
//                netRate = ifstat.getRxBytes() + ifstat.getTxBytes() - 
                		
            }
//            int packetIns = 0;
            int packetIns = LoadCollection.getAndClearPacketIn();
            long processTime = LoadCollection.getAndClearProcessTime();
            processTime = ( packetIns == 0 ) ? 0L :processTime/packetIns;
            // load map.
            Map<Node, AtomicInteger> rawLoadMap = LoadCollection.getLoadMap();

			Iterator<Map.Entry<Node, AtomicInteger>> entries = rawLoadMap.entrySet().iterator();    
	        while (entries.hasNext()) {
	        	Map.Entry<Node, AtomicInteger> entry = entries.next();
	        	Node node = entry.getKey();
	        	int load = (int)Math.ceil((double)(entry.getValue().get())/CONTROLLER_STATE_UPDATE_INTERVAL);
	        	LinkedList<Integer> list = loadMap.get(node);
	        	if ( list == null ) {
	        		list = new LinkedList<Integer>();
	        	}
	        	if ( list.size() >= STATE_HISTORY_SIZE) {
	        		list.pollFirst();
	        	}
	        	list.offerLast(load);
        		loadMap.put(node, list);
	        }
            
            // calculate 
//	        long netErrorBefore = (stateHistory.size() > 0) ? stateHistory.peekLast().getNetErrors(): 0L;
            ControllerState cs = new ControllerState(1.0 - cpuUsage, sigar.getMem().getFree(), 
            		netErrors, (double)packetIns/CONTROLLER_STATE_UPDATE_INTERVAL,
            		processTime, LoadCollection.getRtt());
            log.info("Collect: {} {} {} {} {} {}", cpuUsage, sigar.getMem().getTotal(), cs.getNetErrors(), cs.getPacketIns(), processTime);
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
            	if ( oldState.getState() == ControllerLocalState.HIBERNATE && csic.getState() != ControllerLocalState.BUSY ) {
            		csic.setState(ControllerLocalState.HIBERNATE);
            	}
            	else if ( csic.getState() == ControllerLocalState.HIBERNATE ){
            		csic.setState(ControllerLocalState.NORMAL);
            	}
            }
            else {
            	if ( csic.getState() == ControllerLocalState.HIBERNATE && this.getNodes(address) != null ) {
            		csic.setState(ControllerLocalState.NORMAL);
            	}
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
    	long historyError = ( stateHistory.size() > 2 ) ? stateHistory.get(stateHistory.size()-2).getNetErrors(): 0;

    	determinedState = new ControllerState(averageCpuLeft/stateHistory.size(), last.getMemLeft(), last.getNetErrors() - historyError,
    			averagePacketIns/stateHistory.size(), averageProcessTime, last.getRtt());
		// ControllerState upperLimit = stardard;
    	double available = maxPacketIns - averagePacketIns/stateHistory.size();
    	return new ControllerStateInCluster(available, last.getRtt(), checkLocalState());
    }

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
    	ControllerLocalState flag = csic.getState();
    	log.info("[check controller state]: The state of controller is {}", flag.toString());
		if ( flag == ControllerLocalState.HIBERNATE || flag == ControllerLocalState.NORMAL ||  System.currentTimeMillis() - csic.getTimeStamp() < MIGRATION_INTERVAL) {
			log.debug("[check controller state]: {} does not need to change. {}", address, csic);
			return ;
		}
		if ( flag == ControllerLocalState.BUSY ){
			// busy.
			// need to start a new controller?
			if ( !checkClusterLoad(true) ) {
				List<InetAddress> remainedController = new ArrayList<InetAddress>();
				List<String> list = new ArrayList<String>();
				Iterator<Map.Entry<InetAddress, ControllerStateInCluster>> entries = controllerState.entrySet().iterator(); 
		        while (entries.hasNext()) {
		            Map.Entry<InetAddress, ControllerStateInCluster> entry = entries.next();
		            if ( entry.getValue().getState() == ControllerLocalState.HIBERNATE ) {
		            	remainedController.add(entry.getKey());
						list.add(entry.getKey().toString());
		            }
		        }
		        if ( list.size() == 0 ) {
		        	log.warn("[check controller state]: the cluster needs more sleepy or working controllers.");
		        	return ;
		        }
				Collections.sort(list);
				String newControllerName = list.get(0);
				InetAddress newController = null;
				for( InetAddress addr: remainedController ) {
					if ( newControllerName == addr.toString() ) {
						newController = addr;
						break;
					}
				}
				if ( newController == null ) {
					log.error("[check controller state]: something wrong when transforming address");
					return;
				}
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
			migrateFitSwitch(false, 0);
			// migrating.
		}
		else if ( flag == ControllerLocalState.IDLE ){
			if ( controllerState.size() - calculateCountOfState(ControllerLocalState.HIBERNATE) <= 2 ) { // promise there are more than 2 working controllers.
				log.info("[check controller state]: the controller node is less than 3. No need to close controllers");
				return;
			}
			if ( !checkClusterLoad(false)) {
				// register new controller ...
				if (!hibernateCurrentController()) {
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
				migrateFitSwitch(true, 0); // hibernate+migrate failed???
				log.info("[check controller state]: the controller {} is closed", address);
			}
		}
	}

	/**
	 * Determine whether it need migration.
	 * @param cs
	 * @return 0: normal, 1: busy, -1: idle
	 */
	private ControllerLocalState checkLocalState() {
		ControllerState cs = determinedState;
		ControllerState upperLimit = state_standard;
		if ( cs.getCpuLeft() < upperLimit.getCpuLeft() || cs.getMemLeft() < upperLimit.getMemLeft() || cs.getNetErrors() >= upperLimit.getNetErrors()
				|| cs.getProcessTime() >= upperLimit.getProcessTime()) {
			return ControllerLocalState.BUSY;
		}
		else if( cs.getPacketIns() < packetin_lower_limit) {
			return ControllerLocalState.IDLE;
		}

    	int count = 0;
		Iterator<Map.Entry<InetAddress, ControllerStateInCluster>> entries = controllerState.entrySet().iterator();    
        while (entries.hasNext()) {
            Map.Entry<InetAddress, ControllerStateInCluster> entry = entries.next();
            if ( entry.getValue().getState() != ControllerLocalState.HIBERNATE ) {
            	++count;
            }
        }
		if ( count <= 2 ) {
			return ControllerLocalState.NORMAL;
		}
		return ControllerLocalState.HIBERNATE;
	}
	
	private int calculateCountOfState(ControllerLocalState cls) {
		int count = 0;
		Iterator<Map.Entry<InetAddress, ControllerStateInCluster>> entries = controllerState.entrySet().iterator();    
        while (entries.hasNext()) {
            Map.Entry<InetAddress, ControllerStateInCluster> entry = entries.next();
            if ( entry.getValue().getState() == cls ) {
            	++count;
            }
        }
        return count;
	}
	
	/**
	 * Determine whether the cluster is too busy.
	 * @param isUpper: true: busy, false: idle.
	 * @return true: common, false: busy/idle.
	 */
	private boolean checkClusterLoad(boolean isUpper) {
		int countBusy = calculateCountOfState(ControllerLocalState.BUSY);
		if ( isUpper ) {
	        if ( countBusy > (controllerState.size() - calculateCountOfState(ControllerLocalState.HIBERNATE)) * cluster_busy_ratio) {
	        	return false;
	        }
		}
		else {
			int count = calculateCountOfState(ControllerLocalState.IDLE);
	        if ( countBusy == 0 && count >  (controllerState.size() - calculateCountOfState(ControllerLocalState.HIBERNATE)) * cluster_idle_ratio) {
	        	return false;
	        }
		}
		return true;
	}

	private boolean registerNewController(InetAddress newController) {
		Status status = setControllerState(ControllerLocalState.HIBERNATE, ControllerLocalState.NORMAL);
		if ( status.isSuccess()) {
			return true;
		}
		log.warn("[register New Controller]: " + status.getDescription());
		return false;
	}
	

	private boolean hibernateCurrentController() {
		Status status = setControllerState( ControllerLocalState.IDLE, ControllerLocalState.HIBERNATE);
		if ( status.isSuccess()) {
			return true;
		}
		log.warn("[hibernate current Controller]: " +  status.getDescription());
		return false;
	}
	
	private Status setControllerState(ControllerLocalState expectState, ControllerLocalState newState) {
    	if ( clusterServices == null ) {
            log.error("Un-initialized Cluster Services, can't retrieve caches for scheme: load_balance");
    	}
    	InetAddress address = clusterServices.getMyAddress();

        if ( controllerState == null) {
            log.warn("Cluster service unavailable, or controller state info missing.");
        }
        
        ControllerStateInCluster oldState = controllerState.get(address);
        log.debug("set Controller State: old={}, expect={}, new={}", oldState, expectState, newState);
        if ( oldState != null && System.currentTimeMillis() - oldState.getTimeStamp() < MIGRATION_INTERVAL) {
    		return new Status(StatusCode.CONFLICT, "cannot change current controller's state from " + expectState + " to " + newState + " because of concurrency.");
        }
        if ( oldState != null &&  expectState != null && expectState != oldState.getState()) {
    		return new Status(StatusCode.CONFLICT, "cannot change current controller's state from " + expectState + " to " + newState + " because of concurrency.");
        }
        ControllerStateInCluster csic = oldState != null ? 
        		new ControllerStateInCluster(oldState.getPacketInAvailable(), oldState.getRtt(), newState):
        		calculatePacketInAvailable();
    	csic.setTimeStamp(System.currentTimeMillis());
        try {
            clusterServices.tbegin();
            if (controllerState.putIfAbsent(address, csic) != null) {
            	if ( oldState == null || !controllerState.replace(address, oldState, csic)) {
            		clusterServices.trollback();
            		return new Status(StatusCode.CONFLICT, "cannot change current controller's state from " + expectState + " to " + newState + " because of concurrency.");
            	}
            	else {
            		log.trace("Replace successful old={} with new={} for {})", expectState, newState, address);
            	}
            }
            else {
                log.warn("There is no record of {} before.", address.toString());
            }
            clusterServices.tcommit();
        } catch (Exception e) {
            log.error("Excepion in changing Controller state to the controller", e);
            try {
                clusterServices.trollback();
            } catch (Exception e1) {
                log.error("Error Rolling back the controller state Changes ", e);
            }
            return new Status(StatusCode.INTERNALERROR, e.toString());
        }
		return new Status(StatusCode.SUCCESS);
	}

	private void migrateFitSwitch(boolean needMigrateAll, int times) {
		// TODO: replaces need new ControllerStateInCluster.
		// RTT 
		if ( times > 5 ) {
			return ;
		}
		Set<Node> migratingPart =  null;
		Map<Node, Integer> statisticsForLoad = new HashMap<Node, Integer>();
		if ( needMigrateAll ) {
			// migrate all switches.
			migratingPart = getNodes();
			for( Node node: migratingPart) {
				List<Integer> list = loadMap.get(node);
				int number = 0;
				if ( list != null ) {
			    	for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();)
			    	{
			    		int val = iterator.next();
			    		number += val; 
			    	}
			    	number /= list.size();
				}
				statisticsForLoad.put(node, number);
			}
		}
		else {
			int needDecreasing = getDecreasedPart();
			if ( needDecreasing <= 0 ) {
				return ;
			}
			Set<Node> allNodes = getNodes();
			List<StatisticForSort> statistics = new ArrayList<StatisticForSort>();
			for( Node node: allNodes) {
				List<Integer> list = loadMap.get(node);
				int number = 0;
				if ( list != null ) {
			    	for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();)
			    	{
			    		int val = iterator.next();
			    		number += val; 
			    	}
			    	number /= list.size();
				}
				statistics.add(new StatisticForSort(number, node));
				statisticsForLoad.put(node, number);
			}
			Collections.sort(statistics); // decreasing order.
			
			migratingPart = new HashSet<Node>();
			for( int i = 0; i < statistics.size(); ++i) {
				migratingPart.add(statistics.get(i).getNode());
				needDecreasing -= statistics.get(i).getNumber();
				if ( needDecreasing <= 0 ) {
					break;
				}
			}
		}
		List<ControllerForSort> controllerForSort = new ArrayList<ControllerForSort>();
		for(Iterator<Map.Entry<InetAddress, ControllerStateInCluster>> iter = controllerState.entrySet().iterator(); iter.hasNext();) {
			Map.Entry<InetAddress, ControllerStateInCluster> entry = iter.next();
			controllerForSort.add(new ControllerForSort(entry.getValue().getPacketInAvailable(), entry.getKey()));
		}
		Collections.sort(controllerForSort);
		int indexForCFS = 0;
		LinkedList<Node> list = new LinkedList<Node>(migratingPart);
		while ( list.size() > 0 ) {
			ControllerForSort cfs = controllerForSort.get(0);
			double val = cfs.getNumber();
			Node node = list.peek();
			int sfl = statisticsForLoad.get(node);
			if ( needMigrateAll && val < sfl) {
				list.poll();
				log.warn("[migrate Fit Switch]: The current controller cannot sleep right now.");
				return;
			}
			if ( val < sfl) {
				// TODO:
				list.poll();
				log.info("[migrate Fit Switch]: should reselect.");
				continue;
			}

			Set<Node> oneOps = new HashSet<Node>();
			while ( val >=  sfl) {
				Long rtt = controllerState.get(cfs.getAddr()).getRtt().get((Long)(node.getID()));
				if ( node.getType() == "OF" &&  rtt != null && rtt <= rtt_upper_limit) {
					oneOps.add(node);
					val -= sfl;
				}
			}
			Status status = migrateNodeToController(oneOps, cfs.getAddr());
			if ( status.isSuccess() ) {
				list.removeAll(oneOps);
				log.info("[migrate Fit Switch]: successful migrate {} to {}", oneOps, cfs.getAddr());
			}
			else {
				log.info("[migrate Fit Switch]: {}", status.getDescription());
				migrateFitSwitch(needMigrateAll, times+1);
			}
		}
	}

	public Status migrateNodeToController (Set<Node> nodes, InetAddress controller) {
        if (nodes == null || controller == null) {
            return new Status(StatusCode.BADREQUEST, "Invalid Node or Controller Address Specified.");
        }

        if (clusterServices == null || nodeConnections == null) {
            return new Status(StatusCode.SUCCESS);
        }
        log.debug("Trying to Put {} to {}", nodes.toString(), controller.getHostAddress());
		Set<InetAddress> newControllers = new HashSet<InetAddress>();
		if ( newControllers.add(controller)) {
	        try {
	        	clusterServices.tbegin();
	        	for( Node node: nodes) {
	            	Set<InetAddress> oldControllers = nodeConnections.get(node);
		        	if ( oldControllers != null) {
		        		if ( !nodeConnections.replace(node,  oldControllers, newControllers)) {
		        			clusterServices.trollback();
	     					log.info("[migrate node to controller]: conflicts happened when migrating {} to {} ", nodes.toString(), controller.toString());
	                        return new Status(StatusCode.CONFLICT);
		        		}
		        	}
		        	else {
		        		if ( nodeConnections.putIfAbsent(node, newControllers) != null) {
		        			clusterServices.trollback();
	     					log.info("[migrate node to controller]: conflicts happened when migrating {} to {} ", nodes.toString(), controller.toString());
	                        return new Status(StatusCode.CONFLICT);
		        		}
		        	}
	                clusterServices.tcommit();
	        	}
	        }
	        catch (Exception e) {
	        	log.error("[migrate node to controller]: Exception in migrating Node to Controller {}", e);
	        	try {
	        		clusterServices.trollback();
	        	} catch (Exception e1) {
	        		log.error("[migrate node to controller]: Error Rolling back the node Connections Changes ", e);
	        	}
	        	return new Status(StatusCode.INTERNALERROR);
	        }
	        return new Status(StatusCode.SUCCESS);
		}
		log.error("[migrate node to controller]: something wrong when adding new master to the set.");
		return new Status(StatusCode.INTERNALERROR);
    }
	
	
	class StatisticForSort implements Comparable<StatisticForSort>{
		int number;
		Node node;
		
		public int getNumber() {
			return number;
		}
		public Node getNode() {
			return node;
		}
		public StatisticForSort(int num, Node node) {
			this.number = num;
			this.node = node;
		}
	    @Override  
	    public int compareTo(StatisticForSort s) {  
	        int i = s.getNumber() - this.getNumber();
	        return i;  
	    }  
	}
	
	class ControllerForSort implements Comparable<ControllerForSort>{
		double number;
		InetAddress addr;
		
		public double getNumber() {
			return number;
		}
		public InetAddress getAddr() {
			return addr;
		}
		public ControllerForSort(double num, InetAddress addr) {
			this.number = num;
			this.addr = addr;
		}
	    @Override  
	    public int compareTo(ControllerForSort s) {  
	    	double i = s.getNumber() - this.getNumber();
	    	if ( i < 0 ) {
	    		return -1;
	    	}
	    	else if ( i == 0 ){
	    		return 0;
	    	}
	        return 1;  
	    }  
	}
	
	// TODO: get decreased part.
	private int getDecreasedPart() {
		return 0;
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
