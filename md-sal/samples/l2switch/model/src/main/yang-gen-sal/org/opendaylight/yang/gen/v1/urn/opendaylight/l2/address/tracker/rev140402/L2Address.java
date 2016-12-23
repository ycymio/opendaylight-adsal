package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>l2-address-tracker</b>
 * <br />(Source path: <i>META-INF\yang\l2-address-tracker.yang</i>):
 * <pre>
 * grouping l2-address {
 *     leaf mac {
 *         type mac-address;
 *     }
 *     leaf node-connector-ref {
 *         type node-connector-ref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>l2-address-tracker/l2-address</i>
 */
public interface L2Address
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-address");;

    /**
     * the mac address of the host.
     */
    MacAddress getMac();
    
    NodeConnectorRef getNodeConnectorRef();

}

