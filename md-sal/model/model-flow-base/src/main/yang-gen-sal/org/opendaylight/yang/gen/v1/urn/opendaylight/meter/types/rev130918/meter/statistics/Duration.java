package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * container duration {
 *     leaf second {
 *         type counter32;
 *     }
 *     leaf nanosecond {
 *         type counter32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-statistics/duration</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.DurationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.DurationBuilder
 */
public interface Duration
    extends
    ChildOf<MeterStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","duration");;

    Counter32 getSecond();
    
    Counter32 getNanosecond();

}

