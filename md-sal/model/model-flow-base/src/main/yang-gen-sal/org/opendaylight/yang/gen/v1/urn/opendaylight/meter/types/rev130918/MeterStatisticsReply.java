package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * grouping meter-statistics-reply {
 *     list meter-stats {
 *         key "meter-id"
 *         leaf meter-id {
 *             type meter-id;
 *         }
 *         leaf flow-count {
 *             type counter32;
 *         }
 *         leaf packet-in-count {
 *             type counter64;
 *         }
 *         leaf byte-in-count {
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
 *         container meter-band-stats {
 *             list band-stat {
 *                 key "band-id"
 *                 leaf band-id {
 *                     type band-id;
 *                 }
 *                 leaf packet-band-count {
 *                     type counter64;
 *                 }
 *                 leaf byte-band-count {
 *                     type counter64;
 *                 }
 *             }
 *         }
 *         uses meter-statistics;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-statistics-reply</i>
 */
public interface MeterStatisticsReply
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-statistics-reply");;

    List<MeterStats> getMeterStats();

}

