package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.field._case.SetField;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-action-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-action-types.yang</i>):
 * <pre>
 * case set-field-case {
 *     container set-field {
 *         leaf in-port {
 *             type node-connector-id;
 *         }
 *         leaf in-phy-port {
 *             type node-connector-id;
 *         }
 *         container metadata {
 *             leaf metadata {
 *                 type uint64;
 *             }
 *             leaf metadata-mask {
 *                 type uint64;
 *             }
 *             uses of-metadata;
 *         }
 *         container tunnel {
 *             leaf tunnel-id {
 *                 type uint64;
 *             }
 *             leaf tunnel-mask {
 *                 type uint64;
 *             }
 *         }
 *         container ethernet-match {
 *             container ethernet-source {
 *                 leaf address {
 *                     type mac-address;
 *                 }
 *                 leaf mask {
 *                     type mac-address;
 *                 }
 *                 uses mac-address-filter;
 *             }
 *             container ethernet-destination {
 *                 leaf address {
 *                     type mac-address;
 *                 }
 *                 leaf mask {
 *                     type mac-address;
 *                 }
 *                 uses mac-address-filter;
 *             }
 *             container ethernet-type {
 *                 leaf type {
 *                     type ether-type;
 *                 }
 *             }
 *             uses ethernet-match-fields;
 *         }
 *         container vlan-match {
 *             container vlan-id {
 *                 leaf vlan-id-present {
 *                     type boolean;
 *                 }
 *                 leaf vlan-id {
 *                     type vlan-id;
 *                 }
 *             }
 *             leaf vlan-pcp {
 *                 type vlan-pcp;
 *             }
 *             uses vlan-match-fields;
 *         }
 *         container ip-match {
 *             leaf ip-protocol {
 *                 type uint8;
 *             }
 *             leaf ip-dscp {
 *                 type dscp;
 *             }
 *             leaf ip-ecn {
 *                 type uint8;
 *             }
 *             leaf ip-proto {
 *                 type ip-version;
 *             }
 *             uses ip-match-fields;
 *         }
 *         choice layer-3-match {
 *             case arp-match {
 *                 leaf arp-op {
 *                     type uint16;
 *                 }
 *                 leaf arp-source-transport-address {
 *                     type ipv4-prefix;
 *                 }
 *                 leaf arp-target-transport-address {
 *                     type ipv4-prefix;
 *                 }
 *                 container arp-source-hardware-address {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     leaf mask {
 *                         type mac-address;
 *                     }
 *                     uses mac-address-filter;
 *                 }
 *                 container arp-target-hardware-address {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     leaf mask {
 *                         type mac-address;
 *                     }
 *                     uses mac-address-filter;
 *                 }
 *             }
 *             case ipv4-match {
 *                 leaf ipv4-source {
 *                     type ipv4-prefix;
 *                 }
 *                 leaf ipv4-destination {
 *                     type ipv4-prefix;
 *                 }
 *             }
 *             case ipv6-match {
 *                 leaf ipv6-source {
 *                     type ipv6-prefix;
 *                 }
 *                 leaf ipv6-destination {
 *                     type ipv6-prefix;
 *                 }
 *                 leaf ipv6-nd-target {
 *                     type ipv6-address;
 *                 }
 *                 container ipv6-label {
 *                     leaf ipv6-flabel {
 *                         type ipv6-flow-label;
 *                     }
 *                     leaf flabel-mask {
 *                         type ipv6-flow-label;
 *                     }
 *                 }
 *                 leaf ipv6-nd-sll {
 *                     type mac-address;
 *                 }
 *                 leaf ipv6-nd-tll {
 *                     type mac-address;
 *                 }
 *                 container ipv6-ext-header {
 *                     leaf ipv6-exthdr {
 *                         type uint16;
 *                     }
 *                     leaf ipv6-exthdr-mask {
 *                         type uint16;
 *                     }
 *                 }
 *             }
 *             case tunnel-ipv4-match {
 *                 leaf tunnel-ipv4-source {
 *                     type ipv4-prefix;
 *                 }
 *                 leaf tunnel-ipv4-destination {
 *                     type ipv4-prefix;
 *                 }
 *             }
 *         }
 *         choice layer-4-match {
 *             case sctp-match {
 *                 leaf sctp-source-port {
 *                     type port-number;
 *                 }
 *                 leaf sctp-destination-port {
 *                     type port-number;
 *                 }
 *             }
 *             case tcp-match {
 *                 leaf tcp-source-port {
 *                     type port-number;
 *                 }
 *                 leaf tcp-destination-port {
 *                     type port-number;
 *                 }
 *             }
 *             case udp-match {
 *                 leaf udp-source-port {
 *                     type port-number;
 *                 }
 *                 leaf udp-destination-port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *         container icmpv4-match {
 *             leaf icmpv4-type {
 *                 type uint8;
 *             }
 *             leaf icmpv4-code {
 *                 type uint8;
 *             }
 *             uses icmpv4-match-fields;
 *         }
 *         container icmpv6-match {
 *             leaf icmpv6-type {
 *                 type uint8;
 *             }
 *             leaf icmpv6-code {
 *                 type uint8;
 *             }
 *             uses icmpv6-match-fields;
 *         }
 *         container protocol-match-fields {
 *             leaf mpls-label {
 *                 type uint32;
 *             }
 *             leaf mpls-tc {
 *                 type uint8;
 *             }
 *             leaf mpls-bos {
 *                 type uint8;
 *             }
 *             container pbb {
 *                 leaf pbb-isid {
 *                     type uint32;
 *                 }
 *                 leaf pbb-mask {
 *                     type uint32;
 *                 }
 *             }
 *             uses protocol-match-fields;
 *         }
 *         container tcp-flag-match {
 *             leaf tcp-flag {
 *                 type uint16;
 *             }
 *             uses tcp-flag-match-fields;
 *         }
 *         uses match;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-action-types/action/action/set-field-case</i>
 */
public interface SetFieldCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetFieldCase>,
    Action
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","set-field-case");;

    SetField getSetField();

}

