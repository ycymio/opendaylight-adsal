package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-flow-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-flow-types.yang</i>):
 * <pre>
 * grouping flow-table-statistics {
 *     leaf active {
 *         type counter64;
 *     }
 *     leaf lookup {
 *         type counter64;
 *     }
 *     leaf matched {
 *         type counter64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-flow-types/flow-table-statistics</i>
 */
public interface FlowTableStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","flow-table-statistics");;

    Counter64 getActive();
    
    Counter64 getLookup();
    
    Counter64 getMatched();

}

