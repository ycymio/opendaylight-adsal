package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>l2-address-tracker</b>
 * <br />(Source path: <i>META-INF\yang\l2-address-tracker.yang</i>):
 * <pre>
 * list l2-address {
 *     key "mac"
 *     leaf mac {
 *         type mac-address;
 *     }
 *     leaf node-connector-ref {
 *         type node-connector-ref;
 *     }
 *     uses l2-address;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>l2-address-tracker/l2-addresses/l2-address</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressKey
 */
public interface L2Address
    extends
    ChildOf<L2Addresses>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address,
    Identifiable<L2AddressKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-address");;

    /**
     * Returns Primary Key of Yang List Type
     */
    L2AddressKey getKey();

}

