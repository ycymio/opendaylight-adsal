package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * A helper grouping which contains a reference to a node classified with a 
 * node-context. This allows RPCs in other yang files to refine their input to a 
 * particular node instance.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * grouping node-context-ref {
 *     leaf node {
 *         type node-ref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-context-ref</i>
 */
public interface NodeContextRef
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-context-ref");;

    /**
     * A reference to a particular node.
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNode();

}

