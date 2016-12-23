package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * ICMP code.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping icmpv6-match-fields {
 *     leaf icmpv6-type {
 *         type uint8;
 *     }
 *     leaf icmpv6-code {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/icmpv6-match-fields</i>
 */
public interface Icmpv6MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","icmpv6-match-fields");;

    /**
     * ICMP type.
     */
    java.lang.Short getIcmpv6Type();
    
    java.lang.Short getIcmpv6Code();

}

