package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-table-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-table-types.yang</i>):
 * <pre>
 * grouping set-field-match {
 *     list set-field-match {
 *         key "match-type"
 *         leaf match-type {
 *             type identityref;
 *         }
 *         leaf has-mask {
 *             type boolean;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-table-types/set-field-match</i>
 */
public interface SetFieldMatch
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","set-field-match");;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch> getSetFieldMatch();

}

