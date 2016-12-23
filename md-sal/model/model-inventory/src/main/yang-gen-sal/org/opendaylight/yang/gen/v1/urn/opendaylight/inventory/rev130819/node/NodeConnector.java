package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;


/**
 * A list of node connectors that belong this node.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * list node-connector {
 *     key "id"
 *     leaf id {
 *         type node-connector-id;
 *     }
 *     uses node-connector;
 *     anyxml node-connector-context {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node/node-connector</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey
 */
public interface NodeConnector
    extends
    ChildOf<Node>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector,
    Identifiable<NodeConnectorKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-connector");;

    /**
     * Returns Primary Key of Yang List Type
     */
    NodeConnectorKey getKey();

}

