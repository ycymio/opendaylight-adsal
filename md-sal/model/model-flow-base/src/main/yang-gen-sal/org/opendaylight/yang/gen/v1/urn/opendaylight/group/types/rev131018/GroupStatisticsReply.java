package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * grouping group-statistics-reply {
 *     list group-stats {
 *         key "group-id"
 *         leaf group-id {
 *             type group-id;
 *         }
 *         leaf ref-count {
 *             type counter32;
 *         }
 *         leaf packet-count {
 *             type counter64;
 *         }
 *         leaf byte-count {
 *             type counter64;
 *         }
 *         container duration {
 *             leaf second {
 *                 type counter32;
 *             }
 *             leaf nanosecond {
 *                 type counter32;
 *             }
 *         }
 *         container buckets {
 *             list bucket-counter {
 *                 key "bucket-id"
 *                 leaf bucket-id {
 *                     type bucket-id;
 *                 }
 *                 leaf packet-count {
 *                     type counter64;
 *                 }
 *                 leaf byte-count {
 *                     type counter64;
 *                 }
 *             }
 *         }
 *         uses group-statistics;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-statistics-reply</i>
 */
public interface GroupStatisticsReply
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-statistics-reply");;

    List<GroupStats> getGroupStats();

}

