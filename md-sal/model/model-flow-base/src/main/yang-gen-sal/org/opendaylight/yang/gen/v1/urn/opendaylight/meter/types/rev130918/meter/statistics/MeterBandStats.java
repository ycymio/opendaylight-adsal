package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * container meter-band-stats {
 *     list band-stat {
 *         key "band-id"
 *         leaf band-id {
 *             type band-id;
 *         }
 *         leaf packet-band-count {
 *             type counter64;
 *         }
 *         leaf byte-band-count {
 *             type counter64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-statistics/meter-band-stats</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStatsBuilder
 */
public interface MeterBandStats
    extends
    ChildOf<MeterStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-band-stats");;

    List<BandStat> getBandStat();

}

