package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer3Match;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * case arp-match {
 *     leaf arp-op {
 *         type uint16;
 *     }
 *     leaf arp-source-transport-address {
 *         type ipv4-prefix;
 *     }
 *     leaf arp-target-transport-address {
 *         type ipv4-prefix;
 *     }
 *     container arp-source-hardware-address {
 *         leaf address {
 *             type mac-address;
 *         }
 *         leaf mask {
 *             type mac-address;
 *         }
 *         uses mac-address-filter;
 *     }
 *     container arp-target-hardware-address {
 *         leaf address {
 *             type mac-address;
 *         }
 *         leaf mask {
 *             type mac-address;
 *         }
 *         uses mac-address-filter;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/layer-3-match/arp-match</i>
 */
public interface ArpMatch
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>,
    ArpMatchFields,
    Layer3Match
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-match");;


}

