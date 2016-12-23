package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer3Match;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * case ipv6-match {
 *     leaf ipv6-source {
 *         type ipv6-prefix;
 *     }
 *     leaf ipv6-destination {
 *         type ipv6-prefix;
 *     }
 *     leaf ipv6-nd-target {
 *         type ipv6-address;
 *     }
 *     container ipv6-label {
 *         leaf ipv6-flabel {
 *             type ipv6-flow-label;
 *         }
 *         leaf flabel-mask {
 *             type ipv6-flow-label;
 *         }
 *     }
 *     leaf ipv6-nd-sll {
 *         type mac-address;
 *     }
 *     leaf ipv6-nd-tll {
 *         type mac-address;
 *     }
 *     container ipv6-ext-header {
 *         leaf ipv6-exthdr {
 *             type uint16;
 *         }
 *         leaf ipv6-exthdr-mask {
 *             type uint16;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/layer-3-match/ipv6-match</i>
 */
public interface Ipv6Match
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>,
    Ipv6MatchFields,
    Layer3Match
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","ipv6-match");;


}

