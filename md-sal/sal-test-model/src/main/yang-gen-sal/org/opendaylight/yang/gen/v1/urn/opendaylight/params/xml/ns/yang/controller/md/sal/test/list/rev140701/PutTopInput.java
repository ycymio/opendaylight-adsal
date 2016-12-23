package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.TwoLevelList;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-list-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-list-test.yang</i>):
 * <pre>
 * container input {
 *     list top-level-list {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list nested-list {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type string;
 *             }
 *         }
 *         leaf leaf-from-grouping {
 *             type string;
 *         }
 *         container container-with-uses {
 *             leaf leaf-from-grouping {
 *                 type string;
 *             }
 *             uses leaf-from-grouping;
 *         }
 *         list list-via-uses {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *         leaf simple-value {
 *             type string;
 *         }
 *         leaf second-simple-value {
 *             type string;
 *         }
 *         augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *             status CURRENT;
 *             leaf leaf-from-grouping {
 *                 type string;
 *             }
 *             uses leaf-from-grouping;
 *         }
 *         augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *             status CURRENT;
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
 *             uses complex-from-grouping;
 *         }
 *         augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *             status CURRENT;
 *             leaf simple-value {
 *                 type string;
 *             }
 *         }
 *         augment \(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)put-top\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)input\(urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list)top-level-list {
 *             status CURRENT;
 *             leaf second-simple-value {
 *                 type string;
 *             }
 *         }
 *     }
 *     uses two-level-list;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-list-test/put-top/input</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.PutTopInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.PutTopInputBuilder
 */
public interface PutTopInput
    extends
    TwoLevelList,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.PutTopInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list","2014-07-01","input");;


}

