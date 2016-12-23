package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.vlan.match.fields.VlanId;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping vlan-match-fields {
 *     container vlan-id {
 *         leaf vlan-id-present {
 *             type boolean;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *     }
 *     leaf vlan-pcp {
 *         type vlan-pcp;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/vlan-match-fields</i>
 */
public interface VlanMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","vlan-match-fields");;

    /**
     * VLAN id.
     */
    VlanId getVlanId();
    
    /**
     * VLAN priority.
     */
    VlanPcp getVlanPcp();

}

