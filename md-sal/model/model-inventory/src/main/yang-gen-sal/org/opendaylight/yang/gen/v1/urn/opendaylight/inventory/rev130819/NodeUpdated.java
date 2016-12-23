package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * A notification sent by someone who realized there was a modification to a node, 
 * but did not modify the data tree. Describes that something on the node has been 
 * updated (including addition of a new node), but is for whatever reason is not 
 * modifying the data tree. Deprecated: If a process determines that a node was 
 * updated, then that logic should update the node using the DataBroker directly. 
 * Listeners interested update changes should register a data change listener for 
 * notifications on removals.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
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
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-updated</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdatedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdatedBuilder
 */
public interface NodeUpdated
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdated>,
    Node,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-updated");;

    /**
     * A reference to the node which changed.
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNodeRef();

}

