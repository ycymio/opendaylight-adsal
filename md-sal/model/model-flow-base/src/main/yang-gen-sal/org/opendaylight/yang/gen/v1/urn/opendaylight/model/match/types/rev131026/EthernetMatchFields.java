package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetSource;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping ethernet-match-fields {
 *     container ethernet-source {
 *         leaf address {
 *             type mac-address;
 *         }
 *         leaf mask {
 *             type mac-address;
 *         }
 *         uses mac-address-filter;
 *     }
 *     container ethernet-destination {
 *         leaf address {
 *             type mac-address;
 *         }
 *         leaf mask {
 *             type mac-address;
 *         }
 *         uses mac-address-filter;
 *     }
 *     container ethernet-type {
 *         leaf type {
 *             type ether-type;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/ethernet-match-fields</i>
 */
public interface EthernetMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ethernet-match-fields");;

    /**
     * Ethernet source address.
     */
    EthernetSource getEthernetSource();
    
    /**
     * Ethernet destination address.
     */
    EthernetDestination getEthernetDestination();
    
    /**
     * Ethernet frame type.
     */
    EthernetType getEthernetType();

}

