package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * ICMP code.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping icmpv4-match-fields {
 *     leaf icmpv4-type {
 *         type uint8;
 *     }
 *     leaf icmpv4-code {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/icmpv4-match-fields</i>
 */
public interface Icmpv4MatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","icmpv4-match-fields");;

    /**
     * ICMP type.
     */
    java.lang.Short getIcmpv4Type();
    
    java.lang.Short getIcmpv4Code();

}

