package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * grouping group-features-reply {
 *     leaf-list group-types-supported {
 *         type identityref;
 *     }
 *     leaf-list group-capabilities-supported {
 *         type identityref;
 *     }
 *     leaf-list max-groups {
 *         type uint32;
 *     }
 *     leaf-list actions {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-features-reply</i>
 */
public interface GroupFeaturesReply
    extends
    DataObject,
    GroupFeatures
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-features-reply");;


}

