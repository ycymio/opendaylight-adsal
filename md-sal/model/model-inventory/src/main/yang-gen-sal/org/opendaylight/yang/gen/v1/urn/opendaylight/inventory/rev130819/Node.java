package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import java.util.List;


/**
 * Describes the contents of a generic node - essentially an ID and a list of 
 * node-connectors. Acts as an augmentation point where other yang files can add 
 * additional information.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * grouping node {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node</i>
 */
public interface Node
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node");;

    /**
     * The unique identifier for the node.
     */
    NodeId getId();
    
    /**
     * A list of node connectors that belong this node.
     */
    List<NodeConnector> getNodeConnector();

}

