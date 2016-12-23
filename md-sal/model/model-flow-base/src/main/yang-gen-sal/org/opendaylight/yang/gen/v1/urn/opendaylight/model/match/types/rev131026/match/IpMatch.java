package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * container ip-match {
 *     leaf ip-protocol {
 *         type uint8;
 *     }
 *     leaf ip-dscp {
 *         type dscp;
 *     }
 *     leaf ip-ecn {
 *         type uint8;
 *     }
 *     leaf ip-proto {
 *         type ip-version;
 *     }
 *     uses ip-match-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/ip-match</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatchBuilder
 */
public interface IpMatch
    extends
    ChildOf<Match>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>,
    IpMatchFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ip-match");;


}

