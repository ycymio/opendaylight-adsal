package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Address;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping ipv6-match-fields {
 *     leaf ipv6-source {
 *         type ipv6-prefix;
 *     }
 *     leaf ipv6-destination {
 *         type ipv6-prefix;
 *     }
 *     leaf ipv6-nd-target {
 *         type ipv6-address;
 *     }
 *     container ipv6-label {
 *         leaf ipv6-flabel {
 *             type ipv6-flow-label;
 *         }
 *         leaf flabel-mask {
 *             type ipv6-flow-label;
 *         }
 *     }
 *     leaf ipv6-nd-sll {
 *         type mac-address;
 *     }
 *     leaf ipv6-nd-tll {
 *         type mac-address;
 *     }
 *     container ipv6-ext-header {
 *         leaf ipv6-exthdr {
 *             type uint16;
 *         }
 *         leaf ipv6-exthdr-mask {
 *             type uint16;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/ipv6-match-fields</i>
 */
public interface Ipv6MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv6-match-fields");;

    /**
     * IPv6 source address.
     */
    Ipv6Prefix getIpv6Source();
    
    /**
     * IPv6 destination address.
     */
    Ipv6Prefix getIpv6Destination();
    
    /**
     * IPv6 target address for neighbour discovery message
     */
    Ipv6Address getIpv6NdTarget();
    
    Ipv6Label getIpv6Label();
    
    /**
     * Link layer source address for neighbour discovery message
     */
    MacAddress getIpv6NdSll();
    
    /**
     * Link layer target address for neighbour discovery message
     */
    MacAddress getIpv6NdTll();
    
    Ipv6ExtHeader getIpv6ExtHeader();

}

