package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-action-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-action-types.yang</i>):
 * <pre>
 * grouping address {
 *     choice address {
 *         case ipv4 {
 *             leaf ipv4-address {
 *                 type ipv4-prefix;
 *             }
 *         }
 *         case ipv6 {
 *             leaf ipv6-address {
 *                 type ipv6-prefix;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-action-types/address</i>
 */
public interface Address
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","address");;

    org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.Address getAddress();

}

