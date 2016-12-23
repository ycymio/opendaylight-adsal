package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-table-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-table-types.yang</i>):
 * <pre>
 * list set-field-match {
 *     key "match-type"
 *     leaf match-type {
 *         type identityref;
 *     }
 *     leaf has-mask {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-table-types/set-field-match/set-field-match</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchKey
 */
public interface SetFieldMatch
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>,
    Identifiable<SetFieldMatchKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","set-field-match");;

    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> getMatchType();
    
    java.lang.Boolean isHasMask();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    SetFieldMatchKey getKey();

}

