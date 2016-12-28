/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.connectionmanager.scheme;

import java.net.InetAddress;

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
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.sal.utils.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import balance.flow.PacketHandler;

class AnyControllerScheme extends AbstractScheme {
	private static AbstractScheme myScheme = null;
	private int updateInterval = 5;
	private int checkInterval = 5;
	private Timer myUpdateTimer;
	private Timer checkTimer;

	// 四个上下限
	private int totalUpperLimit = 100;
	private int totalLowerLimit = 0;
	private int singleUpperLimit = 20;
	private int singleLowerLimit = 0;

	public static Map<Node, Integer> nodeburdenMap = new HashMap<Node, Integer>();
	private List<Node> migratingNodes = new ArrayList<Node>();

	private static final Logger log = LoggerFactory
			.getLogger(AnyControllerScheme.class);

	protected AnyControllerScheme(IClusterGlobalServices clusterServices) {
		super(clusterServices, ConnectionMgmtScheme.ANY_CONTROLLER_ONE_MASTER);
		// 定时 更新速率
		myUpdateTimer = new Timer("my UpdateTimer");
		myUpdateTimer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				// 同步负载
				if (myControllerBurden != null) {
					updateControllerBurden();
				}
			}
		}, updateInterval * 1000L, (long) (1 * 2000L));

		// 定时 检查负载
		checkTimer = new Timer("my CheckTimer");
		checkTimer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				if (myControllerBurden != null) {
					checkBurden();
				}
			}
		}, checkInterval * 1000L, (long) (1 * 2000L));
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
		return (controllers.size() == 1 && controllers.contains(clusterServices
				.getMyAddress()));
	}

	private void updateControllerBurden() {
		// 更新控制器接受paccketIn的速率
		int avg = PacketHandler.packet_in_number / updateInterval;// 5秒内平均每秒的packet-in速度
		if (myControllerBurden.putIfAbsent(clusterServices.getMyAddress(), avg) != null) {
			myControllerBurden
					.replace(clusterServices.getMyAddress(), myControllerBurden
							.get(clusterServices.getMyAddress()), avg);
		}
		// 更新本控制器连接交换机的消息上报速率。
		PacketHandler.packet_in_number = 0;// 重新计数

		IConnectionManager connectionManager = (IConnectionManager) ServiceHelper
				.getGlobalInstance(IConnectionManager.class, this);
		Set<Node> localNodes = connectionManager.getLocalNodes();
		for (Node localNode : localNodes) {
			if (PacketHandler.burden.containsKey(localNode)) {
				int speed = PacketHandler.burden.get(localNode)
						/ updateInterval;
				System.out.println("遍历到交换机：" + localNode.toString()
						+ "它的packetin计数为：" + speed + " -ptt");
				nodeburdenMap.put(localNode, speed);// 更新这interval秒内的交换机的上报速率；
				Integer tmp_value = 0;// 重新计数
				PacketHandler.burden.put(localNode, tmp_value);
			}
		}
	}

	private void checkBurden() {
		IConnectionManager connectionManager = (IConnectionManager) ServiceHelper
				.getGlobalInstance(IConnectionManager.class, this);
		Set<Node> localNodes = connectionManager.getLocalNodes();

		// 检查当前控制器的负载情况以及总体负载情况，并判断是否需要进行迁移。
		int myBurden = myControllerBurden.get(clusterServices.getMyAddress());
		int totalBurden = getTotalLoad();
		if (myBurden < singleUpperLimit && myBurden > singleLowerLimit)
			return;
		migratingNodes.clear();
		if (myBurden >= singleUpperLimit) {// 本控制器负载超限
			// 判断是否开启新机器
			List<InetAddress> tmpControllerList = getWorkingControllers();
			if (totalBurden > totalUpperLimit) {
				tmpControllerList = getNewWorkingControllers();
			}
			// 逻辑上随机移除交换机，使得本控制器的负载回落到合理的范围内。
			int tempBurden = myBurden;
			for (Iterator<Node> iterator = localNodes.iterator(); iterator
					.hasNext();) {
				Node node = (Node) iterator.next();
				int nodeBurden = nodeburdenMap.get(node);
				// 假设移除了该节点，判断控制器负载是不是落到了正常范围
				tempBurden -= nodeBurden;
				migratingNodes.add(node);
				if (tempBurden < singleUpperLimit) {
					break;
				}
			}
			removeToFit(tmpControllerList);
		} else {// 本控制器负载低于下限
			if (totalBurden < totalLowerLimit) {
				for (Node localNode : localNodes) {
					migratingNodes.add(localNode);
				}
				removeToFit(getWorkingControllers());
			}
		}
	}

	// 将待移除交换机列表中的交换机全部移除，每一次移除都选择集群中负载最轻的控制器。
	private void removeToFit(List<InetAddress> controllerList) {
		for (Node node : migratingNodes) {
			// 将这些交换机全部移交给别的控制器
			InetAddress targetControllerIP = findLowestController(controllerList);
			updateNodeWithoutConstraint(node, targetControllerIP);
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
		InetAddress LowestLoadcontroller = null;
		int lowestBurdern = 9999999;
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
		List<InetAddress> tmpControllerList = getWorkingControllers();
		List<InetAddress> allControllersList = clusterServices
				.getClusteredControllers();
		List<InetAddress> workingList = getWorkingControllers();
		for (InetAddress availableController : allControllersList) {
			if (!workingList.contains(availableController)) {
				// 找到一个在clusterNodes中但是不在workingNodes中的节点
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
