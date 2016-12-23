package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2AddressTrackerData;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>l2-address-tracker</b>
 * <br />(Source path: <i>META-INF\yang\l2-address-tracker.yang</i>):
 * <pre>
 * container l2-addresses {
 *     list l2-address {
 *         key "mac"
 *         leaf mac {
 *             type mac-address;
 *         }
 *         leaf node-connector-ref {
 *             type node-connector-ref;
 *         }
 *         uses l2-address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>l2-address-tracker/l2-addresses</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2AddressesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2AddressesBuilder
 */
public interface L2Addresses
    extends
    ChildOf<L2AddressTrackerData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-addresses");;

    List<L2Address> getL2Address();

}

