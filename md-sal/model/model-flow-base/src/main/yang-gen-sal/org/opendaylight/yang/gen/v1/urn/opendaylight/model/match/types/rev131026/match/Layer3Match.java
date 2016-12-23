package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * choice layer-3-match {
 *     case arp-match {
 *         leaf arp-op {
 *             type uint16;
 *         }
 *         leaf arp-source-transport-address {
 *             type ipv4-prefix;
 *         }
 *         leaf arp-target-transport-address {
 *             type ipv4-prefix;
 *         }
 *         container arp-source-hardware-address {
 *             leaf address {
 *                 type mac-address;
 *             }
 *             leaf mask {
 *                 type mac-address;
 *             }
 *             uses mac-address-filter;
 *         }
 *         container arp-target-hardware-address {
 *             leaf address {
 *                 type mac-address;
 *             }
 *             leaf mask {
 *                 type mac-address;
 *             }
 *             uses mac-address-filter;
 *         }
 *     }
 *     case ipv4-match {
 *         leaf ipv4-source {
 *             type ipv4-prefix;
 *         }
 *         leaf ipv4-destination {
 *             type ipv4-prefix;
 *         }
 *     }
 *     case ipv6-match {
 *         leaf ipv6-source {
 *             type ipv6-prefix;
 *         }
 *         leaf ipv6-destination {
 *             type ipv6-prefix;
 *         }
 *         leaf ipv6-nd-target {
 *             type ipv6-address;
 *         }
 *         container ipv6-label {
 *             leaf ipv6-flabel {
 *                 type ipv6-flow-label;
 *             }
 *             leaf flabel-mask {
 *                 type ipv6-flow-label;
 *             }
 *         }
 *         leaf ipv6-nd-sll {
 *             type mac-address;
 *         }
 *         leaf ipv6-nd-tll {
 *             type mac-address;
 *         }
 *         container ipv6-ext-header {
 *             leaf ipv6-exthdr {
 *                 type uint16;
 *             }
 *             leaf ipv6-exthdr-mask {
 *                 type uint16;
 *             }
 *         }
 *     }
 *     case tunnel-ipv4-match {
 *         leaf tunnel-ipv4-source {
 *             type ipv4-prefix;
 *         }
 *         leaf tunnel-ipv4-destination {
 *             type ipv4-prefix;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/layer-3-match</i>
 */
public interface Layer3Match
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","layer-3-match");;


}

