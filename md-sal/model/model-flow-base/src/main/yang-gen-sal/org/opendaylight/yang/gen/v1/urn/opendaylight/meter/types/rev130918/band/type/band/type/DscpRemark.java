package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * case dscp-remark {
 *     leaf dscp-remark-rate {
 *         type uint32;
 *     }
 *     leaf dscp-remark-burst-size {
 *         type uint32;
 *     }
 *     leaf perc_level {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/band-type/band-type/dscp-remark</i>
 */
public interface DscpRemark
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>,
    BandType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","dscp-remark");;

    /**
     * Rate for remarking packets
     */
    java.lang.Long getDscpRemarkRate();
    
    /**
     * Size of bursts
     */
    java.lang.Long getDscpRemarkBurstSize();
    
    /**
     * Number of drop precedence level to add
     */
    java.lang.Short getPercLevel();

}

