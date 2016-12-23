package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.OpendaylightInventoryData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * The root container of all nodes.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * container nodes {
 *     list node {
 *         key "id"
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
 *         augment \(urn:opendaylight:inventory)nodes\(urn:opendaylight:inventory)node {
 *             status CURRENT;
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
 *             uses netconf-node-fields;
 *         }
 *         uses node;
 *         anyxml node-context {
 *             status CURRENT;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/nodes</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodesBuilder
 */
public interface Nodes
    extends
    ChildOf<OpendaylightInventoryData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","nodes");;

    /**
     * A list of nodes (as defined by the 'grouping node').
     */
    List<Node> getNode();

}

