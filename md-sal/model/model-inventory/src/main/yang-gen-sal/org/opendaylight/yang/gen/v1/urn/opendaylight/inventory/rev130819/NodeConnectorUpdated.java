package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * A notification sent by someone who realized there was a modification to a 
 * node-connector, but did not modify the data tree. Describes that something on 
 * the node-connector has been updated (including addition of a new 
 * node-connector), but is for whatever reason is not modifying the data tree. 
 * Deprecated: If a process determines that a node-connector was updated, then that
 * logic should update the node-connector using the DataBroker directly. Listeners 
 * interested update changes should register a data change listener for 
 * notifications on removals.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
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
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-connector-updated</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdatedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdatedBuilder
 */
public interface NodeConnectorUpdated
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdated>,
    NodeConnector,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-connector-updated");;

    /**
     * A reference to the node-connector which changed.
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorContext.class
    )
    NodeConnectorRef getNodeConnectorRef();

}

