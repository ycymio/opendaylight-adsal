package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * container buckets {
 *     list bucket-counter {
 *         key "bucket-id"
 *         leaf bucket-id {
 *             type bucket-id;
 *         }
 *         leaf packet-count {
 *             type counter64;
 *         }
 *         leaf byte-count {
 *             type counter64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-statistics/buckets</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.BucketsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.BucketsBuilder
 */
public interface Buckets
    extends
    ChildOf<GroupStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","buckets");;

    List<BucketCounter> getBucketCounter();

}

