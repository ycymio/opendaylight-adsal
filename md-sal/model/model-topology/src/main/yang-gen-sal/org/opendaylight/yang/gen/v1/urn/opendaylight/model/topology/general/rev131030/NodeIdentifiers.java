package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-topology</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-topology.yang</i>):
 * <pre>
 * grouping node-identifiers {
 *     list node-identifier {
 *         key "type" 
 *     "identifier"
 *         leaf type {
 *             type node-type-ref;
 *         }
 *         leaf identifier {
 *             type uri;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-topology/node-identifiers</i>
 */
public interface NodeIdentifiers
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:general","2013-10-30","node-identifiers");;

    List<NodeIdentifier> getNodeIdentifier();

}

