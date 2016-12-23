package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatisticsReply;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * list group-stats {
 *     key "group-id"
 *     leaf group-id {
 *         type group-id;
 *     }
 *     leaf ref-count {
 *         type counter32;
 *     }
 *     leaf packet-count {
 *         type counter64;
 *     }
 *     leaf byte-count {
 *         type counter64;
 *     }
 *     container duration {
 *         leaf second {
 *             type counter32;
 *         }
 *         leaf nanosecond {
 *             type counter32;
 *         }
 *     }
 *     container buckets {
 *         list bucket-counter {
 *             key "bucket-id"
 *             leaf bucket-id {
 *                 type bucket-id;
 *             }
 *             leaf packet-count {
 *                 type counter64;
 *             }
 *             leaf byte-count {
 *                 type counter64;
 *             }
 *         }
 *     }
 *     uses group-statistics;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-statistics-reply/group-stats</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsKey
 */
public interface GroupStats
    extends
    ChildOf<GroupStatisticsReply>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>,
    GroupStatistics,
    Identifiable<GroupStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-stats");;

    /**
     * Returns Primary Key of Yang List Type
     */
    GroupStatsKey getKey();

}

