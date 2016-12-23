package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * container meter-band-headers {
 *     list meter-band-header {
 *         key "band-id"
 *         leaf band-id {
 *             type band-id;
 *         }
 *         container meter-band-types {
 *             leaf flags {
 *                 type meter-band-type;
 *             }
 *         }
 *         leaf band-rate {
 *             type uint32;
 *         }
 *         leaf band-burst-size {
 *             type uint32;
 *         }
 *         choice band-type {
 *             case drop {
 *                 leaf drop-rate {
 *                     type uint32;
 *                 }
 *                 leaf drop-burst-size {
 *                     type uint32;
 *                 }
 *             }
 *             case dscp-remark {
 *                 leaf dscp-remark-rate {
 *                     type uint32;
 *                 }
 *                 leaf dscp-remark-burst-size {
 *                     type uint32;
 *                 }
 *                 leaf perc_level {
 *                     type uint8;
 *                 }
 *             }
 *             case experimenter {
 *                 leaf experimenter-rate {
 *                     type uint32;
 *                 }
 *                 leaf experimenter-burst-size {
 *                     type uint32;
 *                 }
 *                 leaf experimenter {
 *                     type uint32;
 *                 }
 *             }
 *         }
 *         uses band-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter/meter-band-headers</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeadersBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeadersBuilder
 */
public interface MeterBandHeaders
    extends
    ChildOf<Meter>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-band-headers");;

    List<MeterBandHeader> getMeterBandHeader();

}

