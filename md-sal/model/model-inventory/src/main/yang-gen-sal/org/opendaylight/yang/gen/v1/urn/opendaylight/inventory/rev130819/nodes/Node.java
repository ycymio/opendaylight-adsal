package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;


/**
 * A list of nodes (as defined by the 'grouping node').
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * list node {
 *     key "id"
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
 *     leaf connected {
 *         type boolean;
 *     }
 *     leaf-list initial-capability {
 *         type string;
 *     }
 *     leaf-list current-capability {
 *         type string;
 *     }
 *     container pass-through {
 *     }
 *     augment \(urn:opendaylight:inventory)nodes\(urn:opendaylight:inventory)node {
 *         status CURRENT;
 *         leaf connected {
 *             type boolean;
 *         }
 *         leaf-list initial-capability {
 *             type string;
 *         }
 *         leaf-list current-capability {
 *             type string;
 *         }
 *         container pass-through {
 *         }
 *         uses netconf-node-fields;
 *     }
 *     uses node;
 *     anyxml node-context {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/nodes/node</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey
 */
public interface Node
    extends
    ChildOf<Nodes>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node,
    Identifiable<NodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node");;

    /**
     * Returns Primary Key of Yang List Type
     */
    NodeKey getKey();

}

