package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * grouping meter-statistics {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-statistics</i>
 */
public interface MeterStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-statistics");;

    MeterId getMeterId();
    
    Counter32 getFlowCount();
    
    Counter64 getPacketInCount();
    
    Counter64 getByteInCount();
    
    Duration getDuration();
    
    MeterBandStats getMeterBandStats();

}

