package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.TableFeaturePropType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-table-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-table-types.yang</i>):
 * <pre>
 * case write-setfield-miss {
 *     container write-setfield-miss {
 *         list set-field-match {
 *             key "match-type"
 *             leaf match-type {
 *                 type identityref;
 *             }
 *             leaf has-mask {
 *                 type boolean;
 *             }
 *         }
 *         uses set-field-match;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-table-types/table-feature-prop-type/table-feature-prop-type/write-setfield-miss</i>
 */
public interface WriteSetfieldMiss
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.WriteSetfieldMiss>,
    TableFeaturePropType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","write-setfield-miss");;

    org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.write.setfield.miss.WriteSetfieldMiss getWriteSetfieldMiss();

}

