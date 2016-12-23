package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * A notification sent by someone who realized there was a node-connector was 
 * removed, but did not modify the data tree. Describes that a node-connector has 
 * been removed but is for whatever reason is not modifying the data tree. 
 * Deprecated: If a process determines that a node-connector was removed, then that
 * logic should remove the node-connector from the DataBroker directly. Listeners 
 * interested in changes should register a data change listener for notifications 
 * on removals.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
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
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-connector-removed</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemovedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemovedBuilder
 */
public interface NodeConnectorRemoved
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-connector-removed");;

    /**
     * A reference to the node-connector that was removed.
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorContext.class
    )
    NodeConnectorRef getNodeConnectorRef();

}

