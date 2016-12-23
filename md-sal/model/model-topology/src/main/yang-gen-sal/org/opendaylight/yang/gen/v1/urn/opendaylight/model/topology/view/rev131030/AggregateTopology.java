package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-topology-view</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-topology-view.yang</i>):
 * <pre>
 * grouping aggregate-topology {
 *     leaf-list original-topology {
 *         type topology-ref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-topology-view/aggregate-topology</i>
 */
public interface AggregateTopology
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","aggregate-topology");;

    List<TopologyId> getOriginalTopology();

}

