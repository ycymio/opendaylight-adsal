/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.connectionmanager.scheme;

import java.net.InetAddress;
import java.util.HashSet;
import java.util.Set;

import org.opendaylight.controller.clustering.services.IClusterGlobalServices;
import org.opendaylight.controller.connectionmanager.ConnectionMgmtScheme;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.sal.utils.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AnyControllerScheme extends AbstractScheme {
    private static AbstractScheme myScheme= null;

    protected AnyControllerScheme(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.ANY_CONTROLLER_ONE_MASTER);
    }

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new AnyControllerScheme(clusterServices);
        }
        return myScheme;
    }

    @Override
    public boolean isConnectionAllowedInternal(Node node) {
        Set <InetAddress> controllers = nodeConnections.get(node);
        if (controllers == null || controllers.size() == 0) return true;
        return (controllers.size() == 1 && controllers.contains(clusterServices.getMyAddress()));
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
