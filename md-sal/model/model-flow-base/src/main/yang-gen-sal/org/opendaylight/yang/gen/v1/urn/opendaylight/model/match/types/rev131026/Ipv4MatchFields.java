package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping ipv4-match-fields {
 *     leaf ipv4-source {
 *         type ipv4-prefix;
 *     }
 *     leaf ipv4-destination {
 *         type ipv4-prefix;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/ipv4-match-fields</i>
 */
public interface Ipv4MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv4-match-fields");;

    /**
     * IPv4 source address.
     */
    Ipv4Prefix getIpv4Source();
    
    /**
     * IPv4 destination address.
     */
    Ipv4Prefix getIpv4Destination();

}

