package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.Top;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * This module contains a collection of YANG definitions used for some test cases.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-list-test</b>
 * <br />Source path: <i>META-INF\yang\opendaylight-mdsal-list-test.yang</i>):
 * <pre>
 * module opendaylight-mdsal-list-test {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list";
 *     prefix "list-test";
 * 
 *     revision 2014-07-01 {
 *         description "This module contains a collection of YANG definitions used for some test cases.
 *         ";
 *     }
 * 
 *     container top {
 *         list top-level-list {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list nested-list {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf type {
 *                     type string;
 *                 }
 *             }
 *             leaf leaf-from-grouping {
 *                 type string;
 *             }
 *             container container-with-uses {
 *                 leaf leaf-from-grouping {
 *                     type string;
 *                 }
 *                 uses leaf-from-grouping;
 *             }
 *             list list-via-uses {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *             }
 *             leaf simple-value {
 *                 type string;
 *             }
 *             leaf second-simple-value {
 *                 type string;
 *             }
 *             augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                 status CURRENT;
 *                 leaf leaf-from-grouping {
 *                     type string;
 *                 }
 *                 uses leaf-from-grouping;
 *             }
 *             augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                 status CURRENT;
 *                 container container-with-uses {
 *                     leaf leaf-from-grouping {
 *                         type string;
 *                     }
 *                     uses leaf-from-grouping;
 *                 }
 *                 list list-via-uses {
 *                     key "name"
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 uses complex-from-grouping;
 *             }
 *             augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                 status CURRENT;
 *                 leaf simple-value {
 *                     type string;
 *                 }
 *             }
 *             augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                 status CURRENT;
 *                 leaf second-simple-value {
 *                     type string;
 *                 }
 *             }
 *         }
 *         uses two-level-list;
 *     }
 * 
 *     grouping two-level-list {
 *         list top-level-list {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list nested-list {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf type {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 * 
 *     rpc put-top {
 *         input {
 *             list top-level-list {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list nested-list {
 *                     key "name"
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type string;
 *                     }
 *                 }
 *                 leaf leaf-from-grouping {
 *                     type string;
 *                 }
 *                 container container-with-uses {
 *                     leaf leaf-from-grouping {
 *                         type string;
 *                     }
 *                     uses leaf-from-grouping;
 *                 }
 *                 list list-via-uses {
 *                     key "name"
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 leaf simple-value {
 *                     type string;
 *                 }
 *                 leaf second-simple-value {
 *                     type string;
 *                 }
 *                 augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                     status CURRENT;
 *                     leaf leaf-from-grouping {
 *                         type string;
 *                     }
 *                     uses leaf-from-grouping;
 *                 }
 *                 augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                     status CURRENT;
 *                     container container-with-uses {
 *                         leaf leaf-from-grouping {
 *                             type string;
 *                         }
 *                         uses leaf-from-grouping;
 *                     }
 *                     list list-via-uses {
 *                         key "name"
 *                         leaf name {
 *                             type string;
 *                         }
 *                     }
 *                     uses complex-from-grouping;
 *                 }
 *                 augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                     status CURRENT;
 *                     leaf simple-value {
 *                         type string;
 *                     }
 *                 }
 *                 augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *                     status CURRENT;
 *                     leaf second-simple-value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *         }
 *         
 *         status CURRENT;
 *     }
 * }
 * </pre>
 */
public interface OpendaylightMdsalListTestData
    extends
    DataRoot
{




    Top getTop();

}

