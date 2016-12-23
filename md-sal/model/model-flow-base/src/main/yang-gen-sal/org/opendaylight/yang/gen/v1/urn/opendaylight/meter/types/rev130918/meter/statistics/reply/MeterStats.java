package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStatsKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * list meter-stats {
 *     key "meter-id"
 *     leaf meter-id {
 *         type meter-id;
 *     }
 *     leaf flow-count {
 *         type counter32;
 *     }
 *     leaf packet-in-count {
 *         type counter64;
 *     }
 *     leaf byte-in-count {
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
 *     container meter-band-stats {
 *         list band-stat {
 *             key "band-id"
 *             leaf band-id {
 *                 type band-id;
 *             }
 *             leaf packet-band-count {
 *                 type counter64;
 *             }
 *             leaf byte-band-count {
 *                 type counter64;
 *             }
 *         }
 *     }
 *     uses meter-statistics;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-statistics-reply/meter-stats</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStatsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStatsKey
 */
public interface MeterStats
    extends
    ChildOf<MeterStatisticsReply>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>,
    MeterStatistics,
    Identifiable<MeterStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-stats");;

    /**
     * Returns Primary Key of Yang List Type
     */
    MeterStatsKey getKey();

}

