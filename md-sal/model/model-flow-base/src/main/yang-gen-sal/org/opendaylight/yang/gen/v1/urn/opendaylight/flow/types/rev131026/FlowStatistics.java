package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics.Duration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-flow-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-flow-types.yang</i>):
 * <pre>
 * grouping flow-statistics {
 *     leaf packet-count {
 *         type counter64;
 *     }
 *     leaf byte-count {
 *         type counter64;
 *     }
 *     container duration {
 *         leaf second {
 *             type counter64;
 *         }
 *         leaf nanosecond {
 *             type counter64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-flow-types/flow-statistics</i>
 */
public interface FlowStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","flow-statistics");;

    Counter64 getPacketCount();
    
    Counter64 getByteCount();
    
    Duration getDuration();

}

