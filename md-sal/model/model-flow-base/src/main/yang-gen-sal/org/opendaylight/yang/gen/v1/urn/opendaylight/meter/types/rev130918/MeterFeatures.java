package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * grouping meter-features {
 *     leaf max_meter {
 *         type counter32;
 *     }
 *     leaf-list meter-band-supported {
 *         type identityref;
 *     }
 *     leaf-list meter-capabilities-supported {
 *         type identityref;
 *     }
 *     leaf max_bands {
 *         type uint8;
 *     }
 *     leaf max_color {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-meter-types/meter-features</i>
 */
public interface MeterFeatures
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-features");;

    Counter32 getMaxMeter();
    
    List<java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> getMeterBandSupported();
    
    List<java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> getMeterCapabilitiesSupported();
    
    java.lang.Short getMaxBands();
    
    java.lang.Short getMaxColor();

}

