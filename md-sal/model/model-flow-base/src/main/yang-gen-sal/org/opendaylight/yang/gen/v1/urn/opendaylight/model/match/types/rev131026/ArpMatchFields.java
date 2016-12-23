package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddress;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping arp-match-fields {
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
 * <i>opendaylight-match-types/arp-match-fields</i>
 */
public interface ArpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-match-fields");;

    java.lang.Integer getArpOp();
    
    /**
     * ARP source IPv4 address.
     */
    Ipv4Prefix getArpSourceTransportAddress();
    
    /**
     * ARP target IPv4 address.
     */
    Ipv4Prefix getArpTargetTransportAddress();
    
    /**
     * ARP source hardware address.
     */
    ArpSourceHardwareAddress getArpSourceHardwareAddress();
    
    /**
     * ARP target hardware address.
     */
    ArpTargetHardwareAddress getArpTargetHardwareAddress();

}

