package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpVersion;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Dscp;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping ip-match-fields {
 *     leaf ip-protocol {
 *         type uint8;
 *     }
 *     leaf ip-dscp {
 *         type dscp;
 *     }
 *     leaf ip-ecn {
 *         type uint8;
 *     }
 *     leaf ip-proto {
 *         type ip-version;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/ip-match-fields</i>
 */
public interface IpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ip-match-fields");;

    /**
     * IP protocol.
     */
    java.lang.Short getIpProtocol();
    
    /**
     * IP DSCP (6 bits in ToS field).
     */
    Dscp getIpDscp();
    
    /**
     * IP ECN (2 bits in ToS field).
     */
    java.lang.Short getIpEcn();
    
    /**
     * IP Proto (IPv4 or IPv6 Protocol Number).
     */
    IpVersion getIpProto();

}

