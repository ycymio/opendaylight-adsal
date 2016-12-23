package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-meter-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-meter-types.yang</i>):
 * <pre>
 * grouping meter-features-reply {
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
 * <i>opendaylight-meter-types/meter-features-reply</i>
 */
public interface MeterFeaturesReply
    extends
    DataObject,
    MeterFeatures
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-features-reply");;


}

