package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * module opendaylight-inventory {
 *     yang-version 1;
 *     namespace "urn:opendaylight:inventory";
 *     prefix "inv";
 * 
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import yang-ext { prefix "ext"; }
 *     revision 2013-08-19 {
 *         description "";
 *     }
 * 
 *     container nodes {
 *         list node {
 *             key "id"
 *             leaf id {
 *                 type node-id;
 *             }
 *             list node-connector {
 *                 key "id"
 *                 leaf id {
 *                     type node-connector-id;
 *                 }
 *                 uses node-connector;
 *                 anyxml node-connector-context {
 *                     status CURRENT;
 *                 }
 *             }
 *             leaf connected {
 *                 type boolean;
 *             }
 *             leaf-list initial-capability {
 *                 type string;
 *             }
 *             leaf-list current-capability {
 *                 type string;
 *             }
 *             container pass-through {
 *             }
 *             augment \(urn:opendaylight:inventory)nodes\(urn:opendaylight:inventory)node {
 *                 status CURRENT;
 *                 leaf connected {
 *                     type boolean;
 *                 }
 *                 leaf-list initial-capability {
 *                     type string;
 *                 }
 *                 leaf-list current-capability {
 *                     type string;
 *                 }
 *                 container pass-through {
 *                 }
 *                 uses netconf-node-fields;
 *             }
 *             uses node;
 *             anyxml node-context {
 *                 status CURRENT;
 *             }
 *         }
 *     }
 * 
 *     grouping node {
 *         leaf id {
 *             type node-id;
 *         }
 *         list node-connector {
 *             key "id"
 *             leaf id {
 *                 type node-connector-id;
 *             }
 *             uses node-connector;
 *             anyxml node-connector-context {
 *                 status CURRENT;
 *             }
 *         }
 *     }
 *     grouping node-connector {
 *         leaf id {
 *             type node-connector-id;
 *         }
 *     }
 *     grouping node-context-ref {
 *         leaf node {
 *             type node-ref;
 *         }
 *     }
 * 
 *     identity node-connector-context {
 *         description
 *             "A node-connector-context is a classifier for node-connector elements which allows an RPC to provide a service on behalf of a particular element in the data tree.";
 *         status CURRENT;
 *     }
 *     identity node-connector-type {
 *         description
 *             "A base identity definition which represents a generic node connector type and can be extended in other yang files.";
 *         status CURRENT;
 *     }
 *     identity node-context {
 *         description
 *             "A node-context is a classifier for node elements which allows an RPC to provide a service on behalf of a particular element in the data tree.";
 *         status CURRENT;
 *     }
 *     identity node-type {
 *         description
 *             "A base identity definition which represents a generic node type and can be extended in other yang files.";
 *         status CURRENT;
 *     }
 * 
 *     notification node-connector-removed {
 *         description
 *             "A notification sent by someone who realized there was a node-connector was removed, but did not modify the data tree.
 *                                 Describes that a node-connector has been removed but is for
 *                                 whatever reason is not modifying the data tree.
 *             
 *                                 Deprecated: If a process determines that a node-connector was removed, then that
 *                                 logic should remove the node-connector from the DataBroker directly. Listeners interested
 *                                 in changes should register a data change listener for notifications on removals.";
 *         leaf node-connector-ref {
 *             type node-connector-ref;
 *         }
 *         status DEPRECATED;
 *     }
 *     notification node-connector-updated {
 *         description
 *             "A notification sent by someone who realized there was a modification to a node-connector, but did not modify the data tree.
 *                                 Describes that something on the node-connector has been updated (including addition of a new node-connector), but is for
 *                                 whatever reason is not modifying the data tree.
 *             
 *                                 Deprecated: If a process determines that a node-connector was updated, then that
 *                                 logic should update the node-connector using the DataBroker directly. Listeners interested
 *                                 update changes should register a data change listener for notifications on removals.";
 *         leaf node-connector-ref {
 *             type node-connector-ref;
 *         }
 *         leaf id {
 *             type node-connector-id;
 *         }
 *         uses node-connector;
 *         status DEPRECATED;
 *     }
 *     notification node-removed {
 *         description
 *             "A notification sent by someone who realized there was a node was removed, but did not modify the data tree.
 *                                 Describes that a node has been removed but is for
 *                                 whatever reason is not modifying the data tree.
 *             
 *                                 Deprecated: If a process determines that a node was removed, then that
 *                                 logic should remove the node from the DataBroker directly. Listeners interested
 *                                 in changes should register a data change listener for notifications on removals.";
 *         leaf node-ref {
 *             type node-ref;
 *         }
 *         status DEPRECATED;
 *     }
 *     notification node-updated {
 *         description
 *             "A notification sent by someone who realized there was a modification to a node, but did not modify the data tree.
 *                                 Describes that something on the node has been updated (including addition of a new node), but is for
 *                                 whatever reason is not modifying the data tree.
 *             
 *                                 Deprecated: If a process determines that a node was updated, then that
 *                                 logic should update the node using the DataBroker directly. Listeners interested
 *                                 update changes should register a data change listener for notifications on removals.";
 *         leaf node-ref {
 *             type node-ref;
 *         }
 *         leaf id {
 *             type node-id;
 *         }
 *         list node-connector {
 *             key "id"
 *             leaf id {
 *                 type node-connector-id;
 *             }
 *             uses node-connector;
 *             anyxml node-connector-context {
 *                 status CURRENT;
 *             }
 *         }
 *         uses node;
 *         status DEPRECATED;
 *     }
 * }
 * </pre>
 */
public interface OpendaylightInventoryData
    extends
    DataRoot
{




    /**
     * The root container of all nodes.
     */
    Nodes getNodes();

}

