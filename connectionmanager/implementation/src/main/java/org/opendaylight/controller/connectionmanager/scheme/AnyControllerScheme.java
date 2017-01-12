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

import org.opendaylight.controller.connectionmanager.IConnectionManager;
import org.opendaylight.controller.sal.utils.ServiceHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import org.opendaylight.controller.clustering.services.IClusterGlobalServices;
import org.opendaylight.controller.connectionmanager.ConnectionMgmtScheme;
import org.opendaylight.controller.sal.core.ConstructionException;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.sal.utils.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import balance.flow.PacketHandler;

class AnyControllerScheme extends AbstractScheme {
	private static AbstractScheme myScheme = null;
	private int updateInterval = 1;
	private int checkInterval = 1;
	private int delay = 10;
	private Timer myUpdateTimer;
	private Timer checkTimer;
	// 四个上下限
	private int totalUpperLimit = 20000;
	private int totalLowerLimit = 2000;
	private int singleUpperLimit = 20000;
	private int singleLowerLimit = 2000;
	Thread checkThread = new checkBurdenThread();
	public static Map<Node, Integer> nodeburdenMap = new HashMap<Node, Integer>();
	private List<Node> migratingNodes = new ArrayList<Node>();

	private static final Logger log = LoggerFactory
			.getLogger(AnyControllerScheme.class);

	protected AnyControllerScheme(IClusterGlobalServices clusterServices) {
		super(clusterServices, ConnectionMgmtScheme.ANY_CONTROLLER_ONE_MASTER);
		Thread updateThread = new updateBurdenThread();
		updateThread.start();
		
		checkThread.start();
	}

	class updateBurdenThread extends Thread {
		@Override
		public void run() {
			myUpdateTimer = new Timer("my UpdateTimer");
			myUpdateTimer.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					if (myControllerBurden != null) {
						try {
							updateControllerBurden();
						} catch (Exception e) {
							System.out.println("updater exception");
							e.printStackTrace();
						}
					}
				}
			}, updateInterval * 1000L, (long) (delay * 2000L));
		}
	}

	class checkBurdenThread extends Thread {
		@Override
		public void run() {
			checkTimer = new Timer("my checker");
			checkTimer.scheduleAtFixedRate(new TimerTask() {
				public void run() {
					try {
						if (myControllerBurden != null) {
							checkBurden();
						}
					} catch (Exception e) {
						System.out.println("checker exception");
						e.printStackTrace();
					}
				}
			}, checkInterval * 1000L, (long) (delay * 2000L));
		}
	}

	public static AbstractScheme getScheme(
			IClusterGlobalServices clusterServices) {
		if (myScheme == null) {
			myScheme = new AnyControllerScheme(clusterServices);
		}
		return myScheme;
	}

	@Override
	public boolean isConnectionAllowedInternal(Node node) {
		Set<InetAddress> controllers = nodeConnections.get(node);
		if (controllers == null || controllers.size() == 0)
			return true;
		for (InetAddress controllerIP : controllers) {
			if (controllerIP.equals(clusterServices.getMyAddress())) {
				return true;
			}
		}
		// FixedMapping怎么实现
		return (controllers.size() == 1 && controllers.contains(clusterServices
				.getMyAddress()));
	}

	private void updateControllerBurden() {
		IConnectionManager connectionManager = (IConnectionManager) ServiceHelper
				.getGlobalInstance(IConnectionManager.class, this);
		Set<Node> localNodes = connectionManager.getLocalNodes();

		// 更新控制器接受paccketIn的速率
		int avg = PacketHandler.packet_in_number / updateInterval;// updateInterval秒内平均每秒的packet-in速度
		System.out.println("updater::" + clusterServices.getMyAddress() + " : "
				+ avg + " p/s");
		if (myControllerBurden.putIfAbsent(clusterServices.getMyAddress(), avg) != null) {
			myControllerBurden
					.replace(clusterServices.getMyAddress(), myControllerBurden
							.get(clusterServices.getMyAddress()), avg);
		}
		PacketHandler.packet_in_number = 0;// 重新计数

		// 更新本控制器连接交换机的消息上报速率。
		if (localNodes == null) {
			return;
		}
		for (Node localNode : localNodes) {
			if (PacketHandler.burden.containsKey(localNode)) {
				int speed = PacketHandler.burden.get(localNode)
						/ updateInterval;
				nodeburdenMap.put(localNode, speed);// 更新这interval秒内的交换机的上报速率；
				System.out.println("updater:: s" + localNode.getID() + " : "
						+ nodeburdenMap.get(localNode) + " p/s");
				Integer tmp_value = 0;// 重新计数
				PacketHandler.burden.put(localNode, tmp_value);
			}
		}
		updateTotalLimits();
	}

	private void checkerPrinter(int myBurden, int totalBurden) {
		System.out.println("checker::single window:( " + singleLowerLimit + ","
				+ singleUpperLimit + " )" + "  total window:( "
				+ totalLowerLimit + "," + totalUpperLimit + " )");
		System.out.println("checker::" + clusterServices.getMyAddress() + " : "
				+ myBurden + " p/s  total: " + totalBurden + " p/s");
	}

	private void checkBurden() {
		IConnectionManager connectionManager = (IConnectionManager) ServiceHelper
				.getGlobalInstance(IConnectionManager.class, this);
		Set<Node> localNodes = connectionManager.getLocalNodes();

		// 检查当前控制器的负载情况以及总体负载情况，并判断是否需要进行迁移。
		int myBurden = myControllerBurden.get(clusterServices.getMyAddress());
		int totalBurden = getTotalLoad();
		checkerPrinter(myBurden, totalBurden);

		if (myBurden < singleUpperLimit && myBurden > singleLowerLimit) {
			System.out.println("checker::全部正常");
			return;
		}
		migratingNodes.clear();
		if (myBurden >= singleUpperLimit) {// 本控制器负载超限
			// 判断是否开启新机器
			List<InetAddress> tmpControllerList = getWorkingControllers();
			if (totalBurden > totalUpperLimit) {
				System.out
						.println("checker::"
								+ clusterServices.getMyAddress().toString()
								+ "超限,整体超限");
				tmpControllerList = getNewWorkingControllers();
			} else {
				System.out.println("checker::"
						+ clusterServices.getMyAddress().toString()
						+ "超限，整体不超限");
			}
			// 逻辑上随机移除交换机，使得本控制器的负载回落到合理的范围内。
			if (localNodes == null) {
				System.out.println("checker::localNodes为空");
				return;
			}
			int tempBurden = myBurden;
			while (tempBurden > singleUpperLimit) {
				Node node = getHighLoadNode();
				if (node != null) {
					tempBurden -= nodeburdenMap.get(node);
					migratingNodes.add(node);
				}
			}
			System.out.println("checker::migrationNodes Computation Complete!");
			System.out.println("checker::将移除" + migratingNodes.size() + "个节点");
			removeToFit(tmpControllerList);
			updateTotalLimits();
		} else {// 本控制器负载低于下限
			System.out.println("checker::" + clusterServices.getMyAddress()
					+ " : " + myBurden + " p/s 资源利用率低");
			if (getWorkingControllers().size() <= 2) {// 保证至少有三个节点在工作
				System.out.println("checker::节点数量少，不实施节能");
				return;
			}
			// 如果集群中有多于三个节点在工作的话，判断总体是不是利用率低下，是的话，休眠自己。
			if (totalBurden < totalLowerLimit) {
				migratingNodes = new ArrayList<Node>(localNodes);
				removeToFit(getWorkingControllers());
				System.out.println("checker::节能策略：关闭:"
						+ clusterServices.getMyAddress().toString());
				// 更新总上限，下限
				updateTotalLimits();
			}
		}
	}

	// 获得localNodes中贡献最大的sw
	private Node getHighLoadNode() {
		IConnectionManager connectionManager = (IConnectionManager) ServiceHelper
				.getGlobalInstance(IConnectionManager.class, this);
		Set<Node> localNodes = connectionManager.getLocalNodes();
		int highLoad = 0;
		Node node = null;
		for (Node localNode : localNodes) {
			if (nodeburdenMap.containsKey(localNode)) {
				if (highLoad < nodeburdenMap.get(localNode)
						&& (!migratingNodes.contains(localNode))) {
					highLoad = nodeburdenMap.get(localNode);
					node = localNode;
				}
			}
		}
		if (node != null) {
			System.out.println("highLoadNode Selected: s" + node.getID());
		}
		return node;
	}

	// 更新总的负载上下限
	private void updateTotalLimits() {
		totalLowerLimit = singleLowerLimit * (getWorkingControllers().size());
		totalUpperLimit = singleUpperLimit * (getWorkingControllers().size());
	}

	// 将待移除交换机列表中的交换机全部移除，每一次移除都选择集群中负载最轻的控制器。
	private void removeToFit(List<InetAddress> controllerList) {
		if (migratingNodes == null) {
			System.out.println("removeToFit::migrationNodes为空");
		}
		for (Node node : migratingNodes) {
			InetAddress targetControllerIP = findLowestController(controllerList);
			updateNodeWithoutConstraint(node, targetControllerIP);
			System.out.println("removeToFit::"
					+ clusterServices.getMyAddress().toString() + " 移除：s"
					+ node.getID() + "给 " + targetControllerIP);
		}
		migratingNodes.clear();
	}

	// 返回集群中所有控制器的工作负载总和
	private int getTotalLoad() {
		int totalBurden = 0;
		if (myControllerBurden != null) {
			for (InetAddress controller : myControllerBurden.keySet()) {
				totalBurden += myControllerBurden.get(controller);
			}
		}
		return totalBurden;
	}

	// 寻找到可用控制器中(除了自己以外的)负载最小的controllerIP
	private InetAddress findLowestController(List<InetAddress> Controllers) {
		InetAddress LowestLoadcontroller = clusterServices.getMyAddress();
		int lowestBurdern = 99999999;
		for (InetAddress controllerIP : Controllers) {
			if (controllerIP.equals(clusterServices.getMyAddress()))
				continue;
			int tempBurden = myControllerBurden.get(controllerIP);
			if (tempBurden < lowestBurdern) {
				lowestBurdern = tempBurden;
				LowestLoadcontroller = controllerIP;
			}
		}
		return LowestLoadcontroller;
	}

	// 逻辑上开启一台新的机器
	private List<InetAddress> getNewWorkingControllers() {
		List<InetAddress> tmpControllerList = new ArrayList<InetAddress>(
				getWorkingControllers());
		List<InetAddress> allControllersList = clusterServices
				.getClusteredControllers();
		List<InetAddress> workingList = getWorkingControllers();
		if (allControllersList == null || tmpControllerList == null
				|| workingList == null) {
			return tmpControllerList;
		}
		for (InetAddress availableController : allControllersList) {
			if (!workingList.contains(availableController)) {
				// 找到一个在clusterNodes中但是不在workingNodes中的节点
				System.out.println("getNewWorkingControllers::新开启控制器："
						+ availableController);
				tmpControllerList.add(availableController);
				break;
			}
		}
		return tmpControllerList;
	}

	/*******************************************************
	 * modified by ycy *
	 *******************************************************/

	@Override
	public Status updateNodeWithoutConstraint(Node node, InetAddress controller) {
		if (node == null || controller == null) {
			return new Status(StatusCode.BADREQUEST,
					"Invalid Node or Controller Address Specified.");
		}

		if (clusterServices == null || nodeConnections == null) {
			return new Status(StatusCode.SUCCESS);
		}
		log.debug("Trying to Put {} to {}", controller.getHostAddress(),

		node.toString());

		Set<InetAddress> oldControllers = nodeConnections.get(node);
		if (oldControllers.size() > 1) {
			log.error("The size of master nodes is not correct.");
			return new Status(StatusCode.INTERNALERROR);
		}
		Set<InetAddress> newControllers = new HashSet<InetAddress>();
		newControllers.add(controller);
		try {
			clusterServices.tbegin();
			if (nodeConnections.putIfAbsent(node, newControllers) != null) {
				log.debug("PutIfAbsent failed {} to {}",
						controller.getHostAddress(), node.toString());
				if (oldControllers == null
						|| !nodeConnections.replace(node, oldControllers,
								newControllers)) {
					clusterServices.trollback();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
					log.debug("Retrying ... {} with {}",
							controller.getHostAddress(), node.toString());
					return updateNodeWithoutConstraint(node, controller);
				} else {
					log.debug(
							"Replace successful old={} with new={} for {} to {}",
							oldControllers.toString(),
							newControllers.toString(),
							controller.getHostAddress(), node.toString());
				}
			} else {
				log.debug("Added {} to {}", controller.getHostAddress(),
						node.toString());
			}
			clusterServices.tcommit();
		} catch (Exception e) {
			log.error("Excepion in adding Controller to a Node", e);
			try {
				clusterServices.trollback();
			} catch (Exception e1) {
				log.error("Error Rolling back the node Connections Changes ", e);
			}
			return new Status(StatusCode.INTERNALERROR);
		}
		log.debug("Succeed in removing node {} from the controller {}",
				node.toString(), controller.getHostAddress());
		return new Status(StatusCode.SUCCESS);
	}
	/*******************************************************
	 * modified by ycy *
	 *******************************************************/
}
