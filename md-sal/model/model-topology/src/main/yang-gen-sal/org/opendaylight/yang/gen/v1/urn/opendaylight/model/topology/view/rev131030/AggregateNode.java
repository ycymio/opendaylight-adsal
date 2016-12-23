package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-topology-view</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-topology-view.yang</i>):
 * <pre>
 * grouping aggregate-node {
 *     list original-node {
 *         key     leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-topology-view/aggregate-node</i>
 */
public interface AggregateNode
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","aggregate-node");;

    List<OriginalNode> getOriginalNode();

}

