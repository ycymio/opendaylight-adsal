package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;


/**
 * A notification sent by someone who realized there was a node was removed, but 
 * did not modify the data tree. Describes that a node has been removed but is for 
 * whatever reason is not modifying the data tree. Deprecated: If a process 
 * determines that a node was removed, then that logic should remove the node from 
 * the DataBroker directly. Listeners interested in changes should register a data 
 * change listener for notifications on removals.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
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
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-removed</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemovedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemovedBuilder
 */
public interface NodeRemoved
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-removed");;

    /**
     * A reference to the node that was removed.
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNodeRef();

}

