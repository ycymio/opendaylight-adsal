package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * ARP source hardware address.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * container arp-source-hardware-address {
 *     leaf address {
 *         type mac-address;
 *     }
 *     leaf mask {
 *         type mac-address;
 *     }
 *     uses mac-address-filter;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/arp-match-fields/arp-source-hardware-address</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddressBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddressBuilder
 */
public interface ArpSourceHardwareAddress
    extends
    ChildOf<ArpMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress>,
    MacAddressFilter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-source-hardware-address");;


}

