package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * grouping group-features {
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
 * <i>opendaylight-group-types/group-features</i>
 */
public interface GroupFeatures
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-features");;

    List<java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> getGroupTypesSupported();
    
    List<java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> getGroupCapabilitiesSupported();
    
    /**
     * Maximum number of groups for each type
     */
    List<java.lang.Long> getMaxGroups();
    
    /**
     * Bitmap number OFPAT_* that are supported
     */
    List<java.lang.Long> getActions();

}

