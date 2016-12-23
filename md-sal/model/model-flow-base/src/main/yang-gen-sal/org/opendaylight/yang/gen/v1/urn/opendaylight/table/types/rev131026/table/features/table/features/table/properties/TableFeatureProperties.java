package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-table-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-table-types.yang</i>):
 * <pre>
 * list table-feature-properties {
 *     key "order"
 *     choice table-feature-prop-type {
 *         case apply-actions {
 *             container apply-actions {
 *                 list action {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice action {
 *                         case controller-action-case {
 *                             container controller-action {
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case copy-ttl-in-case {
 *                             container copy-ttl-in {
 *                             }
 *                         }
 *                         case copy-ttl-out-case {
 *                             container copy-ttl-out {
 *                             }
 *                         }
 *                         case dec-mpls-ttl-case {
 *                             container dec-mpls-ttl {
 *                             }
 *                         }
 *                         case dec-nw-ttl-case {
 *                             container dec-nw-ttl {
 *                             }
 *                         }
 *                         case drop-action-case {
 *                             container drop-action {
 *                             }
 *                         }
 *                         case flood-action-case {
 *                             container flood-action {
 *                             }
 *                         }
 *                         case flood-all-action-case {
 *                             container flood-all-action {
 *                             }
 *                         }
 *                         case group-action-case {
 *                             container group-action {
 *                                 leaf group {
 *                                     type string;
 *                                 }
 *                                 leaf group-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case hw-path-action-case {
 *                             container hw-path-action {
 *                             }
 *                         }
 *                         case loopback-action-case {
 *                             container loopback-action {
 *                             }
 *                         }
 *                         case output-action-case {
 *                             container output-action {
 *                                 leaf output-node-connector {
 *                                     type uri;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-mpls-action-case {
 *                             container pop-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-pbb-action-case {
 *                             container pop-pbb-action {
 *                             }
 *                         }
 *                         case pop-vlan-action-case {
 *                             container pop-vlan-action {
 *                             }
 *                         }
 *                         case push-mpls-action-case {
 *                             container push-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-pbb-action-case {
 *                             container push-pbb-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-vlan-action-case {
 *                             container push-vlan-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                                 leaf tag {
 *                                     type int32;
 *                                 }
 *                                 leaf pcp {
 *                                     type int32;
 *                                 }
 *                                 leaf cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-dst-action-case {
 *                             container set-dl-dst-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-src-action-case {
 *                             container set-dl-src-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-type-action-case {
 *                             container set-dl-type-action {
 *                                 leaf dl-type {
 *                                     type ether-type;
 *                                 }
 *                             }
 *                         }
 *                         case set-field-case {
 *                             container set-field {
 *                                 leaf in-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 leaf in-phy-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 container metadata {
 *                                     leaf metadata {
 *                                         type uint64;
 *                                     }
 *                                     leaf metadata-mask {
 *                                         type uint64;
 *                                     }
 *                                     uses of-metadata;
 *                                 }
 *                                 container tunnel {
 *                                     leaf tunnel-id {
 *                                         type uint64;
 *                                     }
 *                                     leaf tunnel-mask {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 container ethernet-match {
 *                                     container ethernet-source {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-destination {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-type {
 *                                         leaf type {
 *                                             type ether-type;
 *                                         }
 *                                     }
 *                                     uses ethernet-match-fields;
 *                                 }
 *                                 container vlan-match {
 *                                     container vlan-id {
 *                                         leaf vlan-id-present {
 *                                             type boolean;
 *                                         }
 *                                         leaf vlan-id {
 *                                             type vlan-id;
 *                                         }
 *                                     }
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                     uses vlan-match-fields;
 *                                 }
 *                                 container ip-match {
 *                                     leaf ip-protocol {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-dscp {
 *                                         type dscp;
 *                                     }
 *                                     leaf ip-ecn {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-proto {
 *                                         type ip-version;
 *                                     }
 *                                     uses ip-match-fields;
 *                                 }
 *                                 choice layer-3-match {
 *                                     case arp-match {
 *                                         leaf arp-op {
 *                                             type uint16;
 *                                         }
 *                                         leaf arp-source-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf arp-target-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         container arp-source-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                         container arp-target-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                     }
 *                                     case ipv4-match {
 *                                         leaf ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6-match {
 *                                         leaf ipv6-source {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-destination {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-nd-target {
 *                                             type ipv6-address;
 *                                         }
 *                                         container ipv6-label {
 *                                             leaf ipv6-flabel {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                             leaf flabel-mask {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                         }
 *                                         leaf ipv6-nd-sll {
 *                                             type mac-address;
 *                                         }
 *                                         leaf ipv6-nd-tll {
 *                                             type mac-address;
 *                                         }
 *                                         container ipv6-ext-header {
 *                                             leaf ipv6-exthdr {
 *                                                 type uint16;
 *                                             }
 *                                             leaf ipv6-exthdr-mask {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case tunnel-ipv4-match {
 *                                         leaf tunnel-ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf tunnel-ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 choice layer-4-match {
 *                                     case sctp-match {
 *                                         leaf sctp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf sctp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case tcp-match {
 *                                         leaf tcp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf tcp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case udp-match {
 *                                         leaf udp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf udp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                 }
 *                                 container icmpv4-match {
 *                                     leaf icmpv4-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv4-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv4-match-fields;
 *                                 }
 *                                 container icmpv6-match {
 *                                     leaf icmpv6-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv6-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv6-match-fields;
 *                                 }
 *                                 container protocol-match-fields {
 *                                     leaf mpls-label {
 *                                         type uint32;
 *                                     }
 *                                     leaf mpls-tc {
 *                                         type uint8;
 *                                     }
 *                                     leaf mpls-bos {
 *                                         type uint8;
 *                                     }
 *                                     container pbb {
 *                                         leaf pbb-isid {
 *                                             type uint32;
 *                                         }
 *                                         leaf pbb-mask {
 *                                             type uint32;
 *                                         }
 *                                     }
 *                                     uses protocol-match-fields;
 *                                 }
 *                                 container tcp-flag-match {
 *                                     leaf tcp-flag {
 *                                         type uint16;
 *                                     }
 *                                     uses tcp-flag-match-fields;
 *                                 }
 *                                 uses match;
 *                             }
 *                         }
 *                         case set-mpls-ttl-action-case {
 *                             container set-mpls-ttl-action {
 *                                 leaf mpls-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-next-hop-action-case {
 *                             container set-next-hop-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-dst-action-case {
 *                             container set-nw-dst-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-src-action-case {
 *                             container set-nw-src-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-tos-action-case {
 *                             container set-nw-tos-action {
 *                                 leaf tos {
 *                                     type int32;
 *                                 }
 *                             }
 *                         }
 *                         case set-nw-ttl-action-case {
 *                             container set-nw-ttl-action {
 *                                 leaf nw-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-queue-action-case {
 *                             container set-queue-action {
 *                                 leaf queue {
 *                                     type string;
 *                                 }
 *                                 leaf queue-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-dst-action-case {
 *                             container set-tp-dst-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-src-action-case {
 *                             container set-tp-src-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-cfi-action-case {
 *                             container set-vlan-cfi-action {
 *                                 leaf vlan-cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-id-action-case {
 *                             container set-vlan-id-action {
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-pcp-action-case {
 *                             container set-vlan-pcp-action {
 *                                 leaf vlan-pcp {
 *                                     type vlan-pcp;
 *                                 }
 *                             }
 *                         }
 *                         case strip-vlan-action-case {
 *                             container strip-vlan-action {
 *                             }
 *                         }
 *                         case sw-path-action-case {
 *                             container sw-path-action {
 *                             }
 *                         }
 *                     }
 *                     uses action;
 *                     uses ordered;
 *                 }
 *                 uses action-list;
 *             }
 *         }
 *         case apply-actions-miss {
 *             container apply-actions-miss {
 *                 list action {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice action {
 *                         case controller-action-case {
 *                             container controller-action {
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case copy-ttl-in-case {
 *                             container copy-ttl-in {
 *                             }
 *                         }
 *                         case copy-ttl-out-case {
 *                             container copy-ttl-out {
 *                             }
 *                         }
 *                         case dec-mpls-ttl-case {
 *                             container dec-mpls-ttl {
 *                             }
 *                         }
 *                         case dec-nw-ttl-case {
 *                             container dec-nw-ttl {
 *                             }
 *                         }
 *                         case drop-action-case {
 *                             container drop-action {
 *                             }
 *                         }
 *                         case flood-action-case {
 *                             container flood-action {
 *                             }
 *                         }
 *                         case flood-all-action-case {
 *                             container flood-all-action {
 *                             }
 *                         }
 *                         case group-action-case {
 *                             container group-action {
 *                                 leaf group {
 *                                     type string;
 *                                 }
 *                                 leaf group-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case hw-path-action-case {
 *                             container hw-path-action {
 *                             }
 *                         }
 *                         case loopback-action-case {
 *                             container loopback-action {
 *                             }
 *                         }
 *                         case output-action-case {
 *                             container output-action {
 *                                 leaf output-node-connector {
 *                                     type uri;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-mpls-action-case {
 *                             container pop-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-pbb-action-case {
 *                             container pop-pbb-action {
 *                             }
 *                         }
 *                         case pop-vlan-action-case {
 *                             container pop-vlan-action {
 *                             }
 *                         }
 *                         case push-mpls-action-case {
 *                             container push-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-pbb-action-case {
 *                             container push-pbb-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-vlan-action-case {
 *                             container push-vlan-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                                 leaf tag {
 *                                     type int32;
 *                                 }
 *                                 leaf pcp {
 *                                     type int32;
 *                                 }
 *                                 leaf cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-dst-action-case {
 *                             container set-dl-dst-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-src-action-case {
 *                             container set-dl-src-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-type-action-case {
 *                             container set-dl-type-action {
 *                                 leaf dl-type {
 *                                     type ether-type;
 *                                 }
 *                             }
 *                         }
 *                         case set-field-case {
 *                             container set-field {
 *                                 leaf in-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 leaf in-phy-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 container metadata {
 *                                     leaf metadata {
 *                                         type uint64;
 *                                     }
 *                                     leaf metadata-mask {
 *                                         type uint64;
 *                                     }
 *                                     uses of-metadata;
 *                                 }
 *                                 container tunnel {
 *                                     leaf tunnel-id {
 *                                         type uint64;
 *                                     }
 *                                     leaf tunnel-mask {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 container ethernet-match {
 *                                     container ethernet-source {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-destination {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-type {
 *                                         leaf type {
 *                                             type ether-type;
 *                                         }
 *                                     }
 *                                     uses ethernet-match-fields;
 *                                 }
 *                                 container vlan-match {
 *                                     container vlan-id {
 *                                         leaf vlan-id-present {
 *                                             type boolean;
 *                                         }
 *                                         leaf vlan-id {
 *                                             type vlan-id;
 *                                         }
 *                                     }
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                     uses vlan-match-fields;
 *                                 }
 *                                 container ip-match {
 *                                     leaf ip-protocol {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-dscp {
 *                                         type dscp;
 *                                     }
 *                                     leaf ip-ecn {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-proto {
 *                                         type ip-version;
 *                                     }
 *                                     uses ip-match-fields;
 *                                 }
 *                                 choice layer-3-match {
 *                                     case arp-match {
 *                                         leaf arp-op {
 *                                             type uint16;
 *                                         }
 *                                         leaf arp-source-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf arp-target-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         container arp-source-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                         container arp-target-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                     }
 *                                     case ipv4-match {
 *                                         leaf ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6-match {
 *                                         leaf ipv6-source {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-destination {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-nd-target {
 *                                             type ipv6-address;
 *                                         }
 *                                         container ipv6-label {
 *                                             leaf ipv6-flabel {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                             leaf flabel-mask {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                         }
 *                                         leaf ipv6-nd-sll {
 *                                             type mac-address;
 *                                         }
 *                                         leaf ipv6-nd-tll {
 *                                             type mac-address;
 *                                         }
 *                                         container ipv6-ext-header {
 *                                             leaf ipv6-exthdr {
 *                                                 type uint16;
 *                                             }
 *                                             leaf ipv6-exthdr-mask {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case tunnel-ipv4-match {
 *                                         leaf tunnel-ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf tunnel-ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 choice layer-4-match {
 *                                     case sctp-match {
 *                                         leaf sctp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf sctp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case tcp-match {
 *                                         leaf tcp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf tcp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case udp-match {
 *                                         leaf udp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf udp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                 }
 *                                 container icmpv4-match {
 *                                     leaf icmpv4-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv4-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv4-match-fields;
 *                                 }
 *                                 container icmpv6-match {
 *                                     leaf icmpv6-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv6-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv6-match-fields;
 *                                 }
 *                                 container protocol-match-fields {
 *                                     leaf mpls-label {
 *                                         type uint32;
 *                                     }
 *                                     leaf mpls-tc {
 *                                         type uint8;
 *                                     }
 *                                     leaf mpls-bos {
 *                                         type uint8;
 *                                     }
 *                                     container pbb {
 *                                         leaf pbb-isid {
 *                                             type uint32;
 *                                         }
 *                                         leaf pbb-mask {
 *                                             type uint32;
 *                                         }
 *                                     }
 *                                     uses protocol-match-fields;
 *                                 }
 *                                 container tcp-flag-match {
 *                                     leaf tcp-flag {
 *                                         type uint16;
 *                                     }
 *                                     uses tcp-flag-match-fields;
 *                                 }
 *                                 uses match;
 *                             }
 *                         }
 *                         case set-mpls-ttl-action-case {
 *                             container set-mpls-ttl-action {
 *                                 leaf mpls-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-next-hop-action-case {
 *                             container set-next-hop-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-dst-action-case {
 *                             container set-nw-dst-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-src-action-case {
 *                             container set-nw-src-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-tos-action-case {
 *                             container set-nw-tos-action {
 *                                 leaf tos {
 *                                     type int32;
 *                                 }
 *                             }
 *                         }
 *                         case set-nw-ttl-action-case {
 *                             container set-nw-ttl-action {
 *                                 leaf nw-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-queue-action-case {
 *                             container set-queue-action {
 *                                 leaf queue {
 *                                     type string;
 *                                 }
 *                                 leaf queue-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-dst-action-case {
 *                             container set-tp-dst-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-src-action-case {
 *                             container set-tp-src-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-cfi-action-case {
 *                             container set-vlan-cfi-action {
 *                                 leaf vlan-cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-id-action-case {
 *                             container set-vlan-id-action {
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-pcp-action-case {
 *                             container set-vlan-pcp-action {
 *                                 leaf vlan-pcp {
 *                                     type vlan-pcp;
 *                                 }
 *                             }
 *                         }
 *                         case strip-vlan-action-case {
 *                             container strip-vlan-action {
 *                             }
 *                         }
 *                         case sw-path-action-case {
 *                             container sw-path-action {
 *                             }
 *                         }
 *                     }
 *                     uses action;
 *                     uses ordered;
 *                 }
 *                 uses action-list;
 *             }
 *         }
 *         case apply-setfield {
 *             container apply-setfield {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *         case apply-setfield-miss {
 *             container apply-setfield-miss {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *         case instructions {
 *             container instructions {
 *                 list instruction {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice instruction {
 *                         case apply-actions-case {
 *                             container apply-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case clear-actions-case {
 *                             container clear-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case go-to-table-case {
 *                             container go-to-table {
 *                                 leaf table_id {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case meter-case {
 *                             container meter {
 *                                 leaf meter-id {
 *                                     type meter-id;
 *                                 }
 *                             }
 *                         }
 *                         case write-actions-case {
 *                             container write-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case write-metadata-case {
 *                             container write-metadata {
 *                                 leaf metadata {
 *                                     type uint64;
 *                                 }
 *                                 leaf metadata-mask {
 *                                     type uint64;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses instruction;
 *                     uses ordered;
 *                 }
 *                 uses instruction-list;
 *             }
 *         }
 *         case instructions-miss {
 *             container instructions-miss {
 *                 list instruction {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice instruction {
 *                         case apply-actions-case {
 *                             container apply-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case clear-actions-case {
 *                             container clear-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case go-to-table-case {
 *                             container go-to-table {
 *                                 leaf table_id {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case meter-case {
 *                             container meter {
 *                                 leaf meter-id {
 *                                     type meter-id;
 *                                 }
 *                             }
 *                         }
 *                         case write-actions-case {
 *                             container write-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flag-match {
 *                                                     leaf tcp-flag {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flag-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case write-metadata-case {
 *                             container write-metadata {
 *                                 leaf metadata {
 *                                     type uint64;
 *                                 }
 *                                 leaf metadata-mask {
 *                                     type uint64;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses instruction;
 *                     uses ordered;
 *                 }
 *                 uses instruction-list;
 *             }
 *         }
 *         case match {
 *             container match-setfield {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *         case next-table {
 *             container tables {
 *                 leaf-list table-ids {
 *                     type uint8;
 *                 }
 *             }
 *         }
 *         case next-table-miss {
 *             container tables-miss {
 *                 leaf-list table-ids {
 *                     type uint8;
 *                 }
 *             }
 *         }
 *         case wildcards {
 *             container wildcard-setfield {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *         case write-actions {
 *             container write-actions {
 *                 list action {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice action {
 *                         case controller-action-case {
 *                             container controller-action {
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case copy-ttl-in-case {
 *                             container copy-ttl-in {
 *                             }
 *                         }
 *                         case copy-ttl-out-case {
 *                             container copy-ttl-out {
 *                             }
 *                         }
 *                         case dec-mpls-ttl-case {
 *                             container dec-mpls-ttl {
 *                             }
 *                         }
 *                         case dec-nw-ttl-case {
 *                             container dec-nw-ttl {
 *                             }
 *                         }
 *                         case drop-action-case {
 *                             container drop-action {
 *                             }
 *                         }
 *                         case flood-action-case {
 *                             container flood-action {
 *                             }
 *                         }
 *                         case flood-all-action-case {
 *                             container flood-all-action {
 *                             }
 *                         }
 *                         case group-action-case {
 *                             container group-action {
 *                                 leaf group {
 *                                     type string;
 *                                 }
 *                                 leaf group-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case hw-path-action-case {
 *                             container hw-path-action {
 *                             }
 *                         }
 *                         case loopback-action-case {
 *                             container loopback-action {
 *                             }
 *                         }
 *                         case output-action-case {
 *                             container output-action {
 *                                 leaf output-node-connector {
 *                                     type uri;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-mpls-action-case {
 *                             container pop-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-pbb-action-case {
 *                             container pop-pbb-action {
 *                             }
 *                         }
 *                         case pop-vlan-action-case {
 *                             container pop-vlan-action {
 *                             }
 *                         }
 *                         case push-mpls-action-case {
 *                             container push-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-pbb-action-case {
 *                             container push-pbb-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-vlan-action-case {
 *                             container push-vlan-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                                 leaf tag {
 *                                     type int32;
 *                                 }
 *                                 leaf pcp {
 *                                     type int32;
 *                                 }
 *                                 leaf cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-dst-action-case {
 *                             container set-dl-dst-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-src-action-case {
 *                             container set-dl-src-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-type-action-case {
 *                             container set-dl-type-action {
 *                                 leaf dl-type {
 *                                     type ether-type;
 *                                 }
 *                             }
 *                         }
 *                         case set-field-case {
 *                             container set-field {
 *                                 leaf in-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 leaf in-phy-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 container metadata {
 *                                     leaf metadata {
 *                                         type uint64;
 *                                     }
 *                                     leaf metadata-mask {
 *                                         type uint64;
 *                                     }
 *                                     uses of-metadata;
 *                                 }
 *                                 container tunnel {
 *                                     leaf tunnel-id {
 *                                         type uint64;
 *                                     }
 *                                     leaf tunnel-mask {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 container ethernet-match {
 *                                     container ethernet-source {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-destination {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-type {
 *                                         leaf type {
 *                                             type ether-type;
 *                                         }
 *                                     }
 *                                     uses ethernet-match-fields;
 *                                 }
 *                                 container vlan-match {
 *                                     container vlan-id {
 *                                         leaf vlan-id-present {
 *                                             type boolean;
 *                                         }
 *                                         leaf vlan-id {
 *                                             type vlan-id;
 *                                         }
 *                                     }
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                     uses vlan-match-fields;
 *                                 }
 *                                 container ip-match {
 *                                     leaf ip-protocol {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-dscp {
 *                                         type dscp;
 *                                     }
 *                                     leaf ip-ecn {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-proto {
 *                                         type ip-version;
 *                                     }
 *                                     uses ip-match-fields;
 *                                 }
 *                                 choice layer-3-match {
 *                                     case arp-match {
 *                                         leaf arp-op {
 *                                             type uint16;
 *                                         }
 *                                         leaf arp-source-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf arp-target-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         container arp-source-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                         container arp-target-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                     }
 *                                     case ipv4-match {
 *                                         leaf ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6-match {
 *                                         leaf ipv6-source {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-destination {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-nd-target {
 *                                             type ipv6-address;
 *                                         }
 *                                         container ipv6-label {
 *                                             leaf ipv6-flabel {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                             leaf flabel-mask {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                         }
 *                                         leaf ipv6-nd-sll {
 *                                             type mac-address;
 *                                         }
 *                                         leaf ipv6-nd-tll {
 *                                             type mac-address;
 *                                         }
 *                                         container ipv6-ext-header {
 *                                             leaf ipv6-exthdr {
 *                                                 type uint16;
 *                                             }
 *                                             leaf ipv6-exthdr-mask {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case tunnel-ipv4-match {
 *                                         leaf tunnel-ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf tunnel-ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 choice layer-4-match {
 *                                     case sctp-match {
 *                                         leaf sctp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf sctp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case tcp-match {
 *                                         leaf tcp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf tcp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case udp-match {
 *                                         leaf udp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf udp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                 }
 *                                 container icmpv4-match {
 *                                     leaf icmpv4-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv4-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv4-match-fields;
 *                                 }
 *                                 container icmpv6-match {
 *                                     leaf icmpv6-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv6-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv6-match-fields;
 *                                 }
 *                                 container protocol-match-fields {
 *                                     leaf mpls-label {
 *                                         type uint32;
 *                                     }
 *                                     leaf mpls-tc {
 *                                         type uint8;
 *                                     }
 *                                     leaf mpls-bos {
 *                                         type uint8;
 *                                     }
 *                                     container pbb {
 *                                         leaf pbb-isid {
 *                                             type uint32;
 *                                         }
 *                                         leaf pbb-mask {
 *                                             type uint32;
 *                                         }
 *                                     }
 *                                     uses protocol-match-fields;
 *                                 }
 *                                 container tcp-flag-match {
 *                                     leaf tcp-flag {
 *                                         type uint16;
 *                                     }
 *                                     uses tcp-flag-match-fields;
 *                                 }
 *                                 uses match;
 *                             }
 *                         }
 *                         case set-mpls-ttl-action-case {
 *                             container set-mpls-ttl-action {
 *                                 leaf mpls-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-next-hop-action-case {
 *                             container set-next-hop-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-dst-action-case {
 *                             container set-nw-dst-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-src-action-case {
 *                             container set-nw-src-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-tos-action-case {
 *                             container set-nw-tos-action {
 *                                 leaf tos {
 *                                     type int32;
 *                                 }
 *                             }
 *                         }
 *                         case set-nw-ttl-action-case {
 *                             container set-nw-ttl-action {
 *                                 leaf nw-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-queue-action-case {
 *                             container set-queue-action {
 *                                 leaf queue {
 *                                     type string;
 *                                 }
 *                                 leaf queue-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-dst-action-case {
 *                             container set-tp-dst-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-src-action-case {
 *                             container set-tp-src-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-cfi-action-case {
 *                             container set-vlan-cfi-action {
 *                                 leaf vlan-cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-id-action-case {
 *                             container set-vlan-id-action {
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-pcp-action-case {
 *                             container set-vlan-pcp-action {
 *                                 leaf vlan-pcp {
 *                                     type vlan-pcp;
 *                                 }
 *                             }
 *                         }
 *                         case strip-vlan-action-case {
 *                             container strip-vlan-action {
 *                             }
 *                         }
 *                         case sw-path-action-case {
 *                             container sw-path-action {
 *                             }
 *                         }
 *                     }
 *                     uses action;
 *                     uses ordered;
 *                 }
 *                 uses action-list;
 *             }
 *         }
 *         case write-actions-miss {
 *             container write-actions-miss {
 *                 list action {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice action {
 *                         case controller-action-case {
 *                             container controller-action {
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case copy-ttl-in-case {
 *                             container copy-ttl-in {
 *                             }
 *                         }
 *                         case copy-ttl-out-case {
 *                             container copy-ttl-out {
 *                             }
 *                         }
 *                         case dec-mpls-ttl-case {
 *                             container dec-mpls-ttl {
 *                             }
 *                         }
 *                         case dec-nw-ttl-case {
 *                             container dec-nw-ttl {
 *                             }
 *                         }
 *                         case drop-action-case {
 *                             container drop-action {
 *                             }
 *                         }
 *                         case flood-action-case {
 *                             container flood-action {
 *                             }
 *                         }
 *                         case flood-all-action-case {
 *                             container flood-all-action {
 *                             }
 *                         }
 *                         case group-action-case {
 *                             container group-action {
 *                                 leaf group {
 *                                     type string;
 *                                 }
 *                                 leaf group-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case hw-path-action-case {
 *                             container hw-path-action {
 *                             }
 *                         }
 *                         case loopback-action-case {
 *                             container loopback-action {
 *                             }
 *                         }
 *                         case output-action-case {
 *                             container output-action {
 *                                 leaf output-node-connector {
 *                                     type uri;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-mpls-action-case {
 *                             container pop-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case pop-pbb-action-case {
 *                             container pop-pbb-action {
 *                             }
 *                         }
 *                         case pop-vlan-action-case {
 *                             container pop-vlan-action {
 *                             }
 *                         }
 *                         case push-mpls-action-case {
 *                             container push-mpls-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-pbb-action-case {
 *                             container push-pbb-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case push-vlan-action-case {
 *                             container push-vlan-action {
 *                                 leaf ethernet-type {
 *                                     type uint16;
 *                                 }
 *                                 leaf tag {
 *                                     type int32;
 *                                 }
 *                                 leaf pcp {
 *                                     type int32;
 *                                 }
 *                                 leaf cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-dst-action-case {
 *                             container set-dl-dst-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-src-action-case {
 *                             container set-dl-src-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                             }
 *                         }
 *                         case set-dl-type-action-case {
 *                             container set-dl-type-action {
 *                                 leaf dl-type {
 *                                     type ether-type;
 *                                 }
 *                             }
 *                         }
 *                         case set-field-case {
 *                             container set-field {
 *                                 leaf in-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 leaf in-phy-port {
 *                                     type node-connector-id;
 *                                 }
 *                                 container metadata {
 *                                     leaf metadata {
 *                                         type uint64;
 *                                     }
 *                                     leaf metadata-mask {
 *                                         type uint64;
 *                                     }
 *                                     uses of-metadata;
 *                                 }
 *                                 container tunnel {
 *                                     leaf tunnel-id {
 *                                         type uint64;
 *                                     }
 *                                     leaf tunnel-mask {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 container ethernet-match {
 *                                     container ethernet-source {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-destination {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         leaf mask {
 *                                             type mac-address;
 *                                         }
 *                                         uses mac-address-filter;
 *                                     }
 *                                     container ethernet-type {
 *                                         leaf type {
 *                                             type ether-type;
 *                                         }
 *                                     }
 *                                     uses ethernet-match-fields;
 *                                 }
 *                                 container vlan-match {
 *                                     container vlan-id {
 *                                         leaf vlan-id-present {
 *                                             type boolean;
 *                                         }
 *                                         leaf vlan-id {
 *                                             type vlan-id;
 *                                         }
 *                                     }
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                     uses vlan-match-fields;
 *                                 }
 *                                 container ip-match {
 *                                     leaf ip-protocol {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-dscp {
 *                                         type dscp;
 *                                     }
 *                                     leaf ip-ecn {
 *                                         type uint8;
 *                                     }
 *                                     leaf ip-proto {
 *                                         type ip-version;
 *                                     }
 *                                     uses ip-match-fields;
 *                                 }
 *                                 choice layer-3-match {
 *                                     case arp-match {
 *                                         leaf arp-op {
 *                                             type uint16;
 *                                         }
 *                                         leaf arp-source-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf arp-target-transport-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         container arp-source-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                         container arp-target-hardware-address {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                             leaf mask {
 *                                                 type mac-address;
 *                                             }
 *                                             uses mac-address-filter;
 *                                         }
 *                                     }
 *                                     case ipv4-match {
 *                                         leaf ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6-match {
 *                                         leaf ipv6-source {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-destination {
 *                                             type ipv6-prefix;
 *                                         }
 *                                         leaf ipv6-nd-target {
 *                                             type ipv6-address;
 *                                         }
 *                                         container ipv6-label {
 *                                             leaf ipv6-flabel {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                             leaf flabel-mask {
 *                                                 type ipv6-flow-label;
 *                                             }
 *                                         }
 *                                         leaf ipv6-nd-sll {
 *                                             type mac-address;
 *                                         }
 *                                         leaf ipv6-nd-tll {
 *                                             type mac-address;
 *                                         }
 *                                         container ipv6-ext-header {
 *                                             leaf ipv6-exthdr {
 *                                                 type uint16;
 *                                             }
 *                                             leaf ipv6-exthdr-mask {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case tunnel-ipv4-match {
 *                                         leaf tunnel-ipv4-source {
 *                                             type ipv4-prefix;
 *                                         }
 *                                         leaf tunnel-ipv4-destination {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 choice layer-4-match {
 *                                     case sctp-match {
 *                                         leaf sctp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf sctp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case tcp-match {
 *                                         leaf tcp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf tcp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                     case udp-match {
 *                                         leaf udp-source-port {
 *                                             type port-number;
 *                                         }
 *                                         leaf udp-destination-port {
 *                                             type port-number;
 *                                         }
 *                                     }
 *                                 }
 *                                 container icmpv4-match {
 *                                     leaf icmpv4-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv4-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv4-match-fields;
 *                                 }
 *                                 container icmpv6-match {
 *                                     leaf icmpv6-type {
 *                                         type uint8;
 *                                     }
 *                                     leaf icmpv6-code {
 *                                         type uint8;
 *                                     }
 *                                     uses icmpv6-match-fields;
 *                                 }
 *                                 container protocol-match-fields {
 *                                     leaf mpls-label {
 *                                         type uint32;
 *                                     }
 *                                     leaf mpls-tc {
 *                                         type uint8;
 *                                     }
 *                                     leaf mpls-bos {
 *                                         type uint8;
 *                                     }
 *                                     container pbb {
 *                                         leaf pbb-isid {
 *                                             type uint32;
 *                                         }
 *                                         leaf pbb-mask {
 *                                             type uint32;
 *                                         }
 *                                     }
 *                                     uses protocol-match-fields;
 *                                 }
 *                                 container tcp-flag-match {
 *                                     leaf tcp-flag {
 *                                         type uint16;
 *                                     }
 *                                     uses tcp-flag-match-fields;
 *                                 }
 *                                 uses match;
 *                             }
 *                         }
 *                         case set-mpls-ttl-action-case {
 *                             container set-mpls-ttl-action {
 *                                 leaf mpls-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-next-hop-action-case {
 *                             container set-next-hop-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-dst-action-case {
 *                             container set-nw-dst-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-src-action-case {
 *                             container set-nw-src-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses address;
 *                             }
 *                         }
 *                         case set-nw-tos-action-case {
 *                             container set-nw-tos-action {
 *                                 leaf tos {
 *                                     type int32;
 *                                 }
 *                             }
 *                         }
 *                         case set-nw-ttl-action-case {
 *                             container set-nw-ttl-action {
 *                                 leaf nw-ttl {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case set-queue-action-case {
 *                             container set-queue-action {
 *                                 leaf queue {
 *                                     type string;
 *                                 }
 *                                 leaf queue-id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-dst-action-case {
 *                             container set-tp-dst-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-tp-src-action-case {
 *                             container set-tp-src-action {
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-cfi-action-case {
 *                             container set-vlan-cfi-action {
 *                                 leaf vlan-cfi {
 *                                     type vlan-cfi;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-id-action-case {
 *                             container set-vlan-id-action {
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                         }
 *                         case set-vlan-pcp-action-case {
 *                             container set-vlan-pcp-action {
 *                                 leaf vlan-pcp {
 *                                     type vlan-pcp;
 *                                 }
 *                             }
 *                         }
 *                         case strip-vlan-action-case {
 *                             container strip-vlan-action {
 *                             }
 *                         }
 *                         case sw-path-action-case {
 *                             container sw-path-action {
 *                             }
 *                         }
 *                     }
 *                     uses action;
 *                     uses ordered;
 *                 }
 *                 uses action-list;
 *             }
 *         }
 *         case write-setfield {
 *             container write-setfield {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *         case write-setfield-miss {
 *             container write-setfield-miss {
 *                 list set-field-match {
 *                     key "match-type"
 *                     leaf match-type {
 *                         type identityref;
 *                     }
 *                     leaf has-mask {
 *                         type boolean;
 *                     }
 *                 }
 *                 uses set-field-match;
 *             }
 *         }
 *     }
 *     leaf order {
 *         type int32;
 *     }
 *     uses table-feature-prop-type;
 *     uses ordered;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-table-types/table-features/table-features/table-properties/table-feature-properties</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesKey
 */
public interface TableFeatureProperties
    extends
    ChildOf<TableProperties>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>,
    TableFeaturePropType,
    Ordered,
    Identifiable<TableFeaturePropertiesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","table-feature-properties");;

    /**
     * Returns Primary Key of Yang List Type
     */
    TableFeaturePropertiesKey getKey();

}

