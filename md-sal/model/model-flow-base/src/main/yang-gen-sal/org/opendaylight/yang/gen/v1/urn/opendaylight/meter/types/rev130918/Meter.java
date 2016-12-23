package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * grouping meter {
 *     leaf flags {
 *         type meter-flags;
 *     }
 *     leaf meter-id {
 *         type meter-id;
 *     }
 *     leaf barrier {
 *         type boolean;
 *     }
 *     leaf meter-name {
 *         type string;
 *     }
 *     leaf container-name {
 *         type string;
 *     }
 *     container meter-band-headers {
 *         list meter-band-header {
 *             key "band-id"
 *             leaf band-id {
 *                 type band-id;
 *             }
 *             container meter-band-types {
 *                 leaf flags {
 *                     type meter-band-type;
 *                 }
 *             }
 *             leaf band-rate {
 *                 type uint32;
 *             }
 *             leaf band-burst-size {
 *                 type uint32;
 *             }
 *             choice band-type {
 *                 case drop {
 *                     leaf drop-rate {
 *                         type uint32;
 *                     }
 *                     leaf drop-burst-size {
 *                         type uint32;
 *                     }
 *                 }
 *                 case dscp-remark {
 *                     leaf dscp-remark-rate {
 *                         type uint32;
 *                     }
 *                     leaf dscp-remark-burst-size {
 *                         type uint32;
 *                     }
 *                     leaf perc_level {
 *                         type uint8;
 *                     }
 *                 }
 *                 case experimenter {
 *                     leaf experimenter-rate {
 *                         type uint32;
 *                     }
 *                     leaf experimenter-burst-size {
 *                         type uint32;
 *                     }
 *                     leaf experimenter {
 *                         type uint32;
 *                     }
 *                 }
 *             }
 *             uses band-type;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter</i>
 */
public interface Meter
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter");;

    /**
     * Meter configuration flags
     */
    MeterFlags getFlags();
    
    /**
     * Meter instance
     */
    MeterId getMeterId();
    
    /**
     * If true, barrier message is sent
     */
    java.lang.Boolean isBarrier();
    
    /**
     * Name of meter instance
     */
    java.lang.String getMeterName();
    
    /**
     * Name of container
     */
    java.lang.String getContainerName();
    
    MeterBandHeaders getMeterBandHeaders();

}

