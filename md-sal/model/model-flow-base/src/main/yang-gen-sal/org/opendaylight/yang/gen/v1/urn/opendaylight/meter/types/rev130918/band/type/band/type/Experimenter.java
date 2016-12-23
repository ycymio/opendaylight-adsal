package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * case experimenter {
 *     leaf experimenter-rate {
 *         type uint32;
 *     }
 *     leaf experimenter-burst-size {
 *         type uint32;
 *     }
 *     leaf experimenter {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/band-type/band-type/experimenter</i>
 */
public interface Experimenter
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>,
    BandType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","experimenter");;

    /**
     * Rate for remarking packets
     */
    java.lang.Long getExperimenterRate();
    
    /**
     * Size of bursts
     */
    java.lang.Long getExperimenterBurstSize();
    
    /**
     * Experimenter id
     */
    java.lang.Long getExperimenter();

}

