package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
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
 * <i>opendaylight-group-types/group-statistics/duration</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.DurationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.DurationBuilder
 */
public interface Duration
    extends
    ChildOf<GroupStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","duration");;

    Counter32 getSecond();
    
    Counter32 getNanosecond();

}

