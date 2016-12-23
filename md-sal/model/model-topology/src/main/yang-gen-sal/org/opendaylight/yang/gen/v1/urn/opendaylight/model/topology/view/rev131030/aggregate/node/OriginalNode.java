package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-topology-view</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-topology-view.yang</i>):
 * <pre>
 * list original-node {
 *     key     leaf topology {
 *         type topology-ref;
 *     }
 *     leaf node {
 *         type node-ref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-topology-view/aggregate-node/original-node</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNodeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNodeBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNodeKey
 */
public interface OriginalNode
    extends
    ChildOf<AggregateNode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","original-node");;

    TopologyId getTopology();
    
    NodeId getNode();

}

