package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowStatistics;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-flow-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-flow-types.yang</i>):
 * <pre>
 * container duration {
 *     leaf second {
 *         type counter64;
 *     }
 *     leaf nanosecond {
 *         type counter64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-flow-types/flow-statistics/duration</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics.DurationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics.DurationBuilder
 */
public interface Duration
    extends
    ChildOf<FlowStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","duration");;

    Counter64 getSecond();
    
    Counter64 getNanosecond();

}

