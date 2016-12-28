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

import java.util.HashMap;
import java.util.HashSet;
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
    private int interval = 5;
    private Timer myUpdateTimer;
    //四个上下限
    private int totalUpperLimit;
    private int totalLowerLimit;
    private int singleUpperLimit;
    private int singleLowerLimit;
    private String myAddress = new String(clusterServices.getMyAddress().toString());
    public static Map<Node, Integer> nodeburdenMap = new HashMap<Node, Integer>();
    
    protected AnyControllerScheme(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.ANY_CONTROLLER_ONE_MASTER);
        myUpdateTimer = new Timer("my UpdateTimer");
        // 在这里做定时检查负载。
        myUpdateTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // 同步负载
                if (myControllerBurden != null) {
                    updateControllerBurden();
                    checkBurden();
                }
            }
        }, interval * 1000L, (long) (1 * 2000L));
    }

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new AnyControllerScheme(clusterServices);
        }
        return myScheme;
    }

    @Override
    public boolean isConnectionAllowedInternal(Node node) {
        updateControllerBurden();
        int lowestBurden = 99999;
        String lazyController = new String("");
        boolean everyoneIsLazy = true;
        if (myControllerBurden != null) {
            // 遍历集群中的所有控制器负载情况,找出集群中负载最小的Controller IP
            for (InetAddress controller : myControllerBurden.keySet()) {
                Integer burden = myControllerBurden.get(controller);
                System.out.println(controller.toString() + " burden: " + burden);
                if (burden > 0)
                    everyoneIsLazy = false;
                if (burden < lowestBurden) {
                    lowestBurden = burden;
                    lazyController = controller.toString();
                }
            }
        }
        // 如果我不是集群中负载最小的控制器则不会接管该控制器，否则按照ODL原先的规则去接管，当我是空闲的，且该交换机还没有master的话就接管。
        if (!everyoneIsLazy && myAddress.compareTo(lazyController) != 0) {
            System.out.println(myAddress + ": I am not lazy! I won't take care of this switch!");
            return false;
        }
        Set<InetAddress> controllers = nodeConnections.get(node);
        if (controllers == null || controllers.size() == 0)
            return true;
        return (controllers.size() == 1 && controllers.contains(clusterServices.getMyAddress()));
    }
    
    
    private void updateControllerBurden() {
    //更新控制器接受paccketIn的速率
        int avg = PacketHandler.packet_in_number/interval;//5秒内平均每秒的packet——in速度
        if (myControllerBurden.putIfAbsent(clusterServices.getMyAddress(), avg) != null) {
            myControllerBurden.replace(clusterServices.getMyAddress(),
                    myControllerBurden.get(clusterServices.getMyAddress()), avg);
        }
        //更新本控制器连接交换机的消息上报速率。
      IConnectionManager connectionManager = (IConnectionManager) ServiceHelper.getGlobalInstance(IConnectionManager.class, this);
        PacketHandler.packet_in_number = 0;//重新计数
        Set<Node>localNodes = connectionManager.getLocalNodes();
        for (Node localNode : localNodes) {
          if (PacketHandler.burden.containsKey(localNode)) {
              int speed = PacketHandler.burden.get(localNode)/interval;
              System.out.println("遍历到交换机：" + localNode.toString()+"它的packetin计数为："+speed+" -ptt");
              nodeburdenMap.put(localNode, speed);//更新这interval秒内的交换机的上报速率；
              Integer tmp_value = 0;
              PacketHandler.burden.put(localNode, tmp_value);
          }
      }
    }
    
    private void checkBurden() {
        //检查当前控制器的负载情况，并判断是否需要进行迁移。
    }
    private void removeAll() {
        ;
    }
    private void removeToFit() {
        ;
    }
    /*******************************************************
     *               modified by ycy                       *
     *******************************************************/
    private static final Logger log = LoggerFactory.getLogger(AnyControllerScheme.class);

    @Override
    public Status updateNodeWithoutConstraint (Node node, InetAddress controller) {
        if (node == null || controller == null) {
            return new Status(StatusCode.BADREQUEST, "Invalid Node or Controller Address Specified.");
        }

        if (clusterServices == null || nodeConnections == null) {
            return new Status(StatusCode.SUCCESS);
        }
        log.debug("Trying to Put {} to {}", controller.getHostAddress(), node.toString());

        Set<InetAddress> oldControllers = nodeConnections.get(node);
        if( oldControllers.size() > 1 ){
            log.error("The size of master nodes is not correct.");
            return new Status(StatusCode.INTERNALERROR);
        }
        Set<InetAddress> newControllers = new HashSet<InetAddress>();
        newControllers.add(controller);
        try {
            clusterServices.tbegin();
            if (nodeConnections.putIfAbsent(node, newControllers) != null) {
                log.debug("PutIfAbsent failed {} to {}", controller.getHostAddress(), node.toString());
                if (oldControllers == null || !nodeConnections.replace(node, oldControllers, newControllers)) {
                    clusterServices.trollback();
                    try {
                        Thread.sleep(100);
                    } catch ( InterruptedException e) {}
                    log.debug("Retrying ... {} with {}", controller.getHostAddress(), node.toString());
                    return updateNodeWithoutConstraint(node, controller);
                }
                else {
                    log.debug("Replace successful old={} with new={} for {} to {}", oldControllers.toString(),
                            newControllers.toString(),controller.getHostAddress(), node.toString());
                }
            } else {
                log.debug("Added {} to {}", controller.getHostAddress(), node.toString());
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
        log.debug("Succeed in removing node {} from the controller {}", node.toString(), controller.getHostAddress());
        return new Status(StatusCode.SUCCESS);
    }
    /*******************************************************
     *               modified by ycy                       *
     *******************************************************/
}
