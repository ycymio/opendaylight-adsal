package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses;


/**
 * YANG version of the L2 Address Tracker Data Model
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>l2-address-tracker</b>
 * <br />Source path: <i>META-INF\yang\l2-address-tracker.yang</i>):
 * <pre>
 * module l2-address-tracker {
 *     yang-version 1;
 *     namespace "urn:opendaylight:l2-address-tracker";
 *     prefix "l2-address-tracker";
 * 
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     revision 2014-04-02 {
 *         description "YANG version of the L2 Address Tracker Data Model
 *         ";
 *     }
 * 
 *     container l2-addresses {
 *         list l2-address {
 *             key "mac"
 *             leaf mac {
 *                 type mac-address;
 *             }
 *             leaf node-connector-ref {
 *                 type node-connector-ref;
 *             }
 *             uses l2-address;
 *         }
 *     }
 * 
 *     grouping l2-address {
 *         leaf mac {
 *             type mac-address;
 *         }
 *         leaf node-connector-ref {
 *             type node-connector-ref;
 *         }
 *     }
 * }
 * </pre>
 */
public interface L2AddressTrackerData
    extends
    DataRoot
{




    L2Addresses getL2Addresses();

}

