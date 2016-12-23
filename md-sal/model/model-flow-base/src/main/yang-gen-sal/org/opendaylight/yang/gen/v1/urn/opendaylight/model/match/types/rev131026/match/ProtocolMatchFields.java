package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * container protocol-match-fields {
 *     leaf mpls-label {
 *         type uint32;
 *     }
 *     leaf mpls-tc {
 *         type uint8;
 *     }
 *     leaf mpls-bos {
 *         type uint8;
 *     }
 *     container pbb {
 *         leaf pbb-isid {
 *             type uint32;
 *         }
 *         leaf pbb-mask {
 *             type uint32;
 *         }
 *     }
 *     uses protocol-match-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/protocol-match-fields</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFieldsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFieldsBuilder
 */
public interface ProtocolMatchFields
    extends
    ChildOf<Match>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","protocol-match-fields");;


}

