package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * choice band-type {
 *     case drop {
 *         leaf drop-rate {
 *             type uint32;
 *         }
 *         leaf drop-burst-size {
 *             type uint32;
 *         }
 *     }
 *     case dscp-remark {
 *         leaf dscp-remark-rate {
 *             type uint32;
 *         }
 *         leaf dscp-remark-burst-size {
 *             type uint32;
 *         }
 *         leaf perc_level {
 *             type uint8;
 *         }
 *     }
 *     case experimenter {
 *         leaf experimenter-rate {
 *             type uint32;
 *         }
 *         leaf experimenter-burst-size {
 *             type uint32;
 *         }
 *         leaf experimenter {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/band-type/band-type</i>
 */
public interface BandType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","band-type");;


}

