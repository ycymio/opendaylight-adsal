package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved;
import org.opendaylight.yangtools.yang.binding.NotificationListener;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdated;


/**
 * Interface for receiving the following YANG notifications defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * notification node-connector-removed {
 *     description
 *         "A notification sent by someone who realized there was a node-connector was removed, but did not modify the data tree.
 *                             Describes that a node-connector has been removed but is for
 *                             whatever reason is not modifying the data tree.
 *         
 *                             Deprecated: If a process determines that a node-connector was removed, then that
 *                             logic should remove the node-connector from the DataBroker directly. Listeners interested
 *                             in changes should register a data change listener for notifications on removals.";
 *     leaf node-connector-ref {
 *         type node-connector-ref;
 *     }
 *     status DEPRECATED;
 * }
 * notification node-connector-updated {
 *     description
 *         "A notification sent by someone who realized there was a modification to a node-connector, but did not modify the data tree.
 *                             Describes that something on the node-connector has been updated (including addition of a new node-connector), but is for
 *                             whatever reason is not modifying the data tree.
 *         
 *                             Deprecated: If a process determines that a node-connector was updated, then that
 *                             logic should update the node-connector using the DataBroker directly. Listeners interested
 *                             update changes should register a data change listener for notifications on removals.";
 *     leaf node-connector-ref {
 *         type node-connector-ref;
 *     }
 *     leaf id {
 *         type node-connector-id;
 *     }
 *     uses node-connector;
 *     status DEPRECATED;
 * }
 * notification node-removed {
 *     description
 *         "A notification sent by someone who realized there was a node was removed, but did not modify the data tree.
 *                             Describes that a node has been removed but is for
 *                             whatever reason is not modifying the data tree.
 *         
 *                             Deprecated: If a process determines that a node was removed, then that
 *                             logic should remove the node from the DataBroker directly. Listeners interested
 *                             in changes should register a data change listener for notifications on removals.";
 *     leaf node-ref {
 *         type node-ref;
 *     }
 *     status DEPRECATED;
 * }
 * notification node-updated {
 *     description
 *         "A notification sent by someone who realized there was a modification to a node, but did not modify the data tree.
 *                             Describes that something on the node has been updated (including addition of a new node), but is for
 *                             whatever reason is not modifying the data tree.
 *         
 *                             Deprecated: If a process determines that a node was updated, then that
 *                             logic should update the node using the DataBroker directly. Listeners interested
 *                             update changes should register a data change listener for notifications on removals.";
 *     leaf node-ref {
 *         type node-ref;
 *     }
 *     leaf id {
 *         type node-id;
 *     }
 *     list node-connector {
 *         key "id"
 *         leaf id {
 *             type node-connector-id;
 *         }
 *         uses node-connector;
 *         anyxml node-connector-context {
 *             status CURRENT;
 *         }
 *     }
 *     uses node;
 *     status DEPRECATED;
 * }
 * </pre>
 */
public interface OpendaylightInventoryListener
    extends
    NotificationListener
{




    /**
     * A notification sent by someone who realized there was a node-connector was 
     * removed, but did not modify the data tree. Describes that a node-connector has 
     * been removed but is for whatever reason is not modifying the data tree. 
     * Deprecated: If a process determines that a node-connector was removed, then that
     * logic should remove the node-connector from the DataBroker directly. Listeners 
     * interested in changes should register a data change listener for notifications 
     * on removals.
     */
    void onNodeConnectorRemoved(NodeConnectorRemoved notification);
    
    /**
     * A notification sent by someone who realized there was a modification to a 
     * node-connector, but did not modify the data tree. Describes that something on 
     * the node-connector has been updated (including addition of a new 
     * node-connector), but is for whatever reason is not modifying the data tree. 
     * Deprecated: If a process determines that a node-connector was updated, then that
     * logic should update the node-connector using the DataBroker directly. Listeners 
     * interested update changes should register a data change listener for 
     * notifications on removals.
     */
    void onNodeConnectorUpdated(NodeConnectorUpdated notification);
    
    /**
     * A notification sent by someone who realized there was a node was removed, but 
     * did not modify the data tree. Describes that a node has been removed but is for 
     * whatever reason is not modifying the data tree. Deprecated: If a process 
     * determines that a node was removed, then that logic should remove the node from 
     * the DataBroker directly. Listeners interested in changes should register a data 
     * change listener for notifications on removals.
     */
    void onNodeRemoved(NodeRemoved notification);
    
    /**
     * A notification sent by someone who realized there was a modification to a node, 
     * but did not modify the data tree. Describes that something on the node has been 
     * updated (including addition of a new node), but is for whatever reason is not 
     * modifying the data tree. Deprecated: If a process determines that a node was 
     * updated, then that logic should update the node using the DataBroker directly. 
     * Listeners interested update changes should register a data change listener for 
     * notifications on removals.
     */
    void onNodeUpdated(NodeUpdated notification);

}

