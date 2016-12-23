package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * case impl-netconf {
 *     container impl-netconf {
 *         leaf binaryLeaf {
 *             type binary;
 *         }
 *         leaf type {
 *             type string;
 *         }
 *         leaf extended {
 *             type extend-once;
 *         }
 *         leaf extended-twice {
 *             type extend-twice;
 *         }
 *         leaf extended-enum {
 *             type extend-enum;
 *         }
 *         leaf ip {
 *             type ip-address;
 *         }
 *         leaf union-test-attr {
 *             type unionTest;
 *         }
 *         leaf sleep-factor {
 *             type decimal64;
 *         }
 *         container dto-c {
 *             leaf simple-arg {
 *                 type uint32;
 *             }
 *             container dto-a-inner {
 *                 leaf simple-arg {
 *                     type uint32;
 *                 }
 *                 container dto-a-inner-inner {
 *                     leaf simple-arg {
 *                         type uint32;
 *                     }
 *                 }
 *             }
 *         }
 *         leaf simpleInt {
 *             type uint32;
 *         }
 *         leaf simpleBoolean {
 *             type boolean;
 *         }
 *         leaf simple-long {
 *             type int64;
 *         }
 *         leaf simple-long-2 {
 *             type uint32;
 *         }
 *         leaf simple-BigInteger {
 *             type uint64;
 *         }
 *         leaf simple-byte {
 *             type int8;
 *         }
 *         leaf simple-short {
 *             type uint8;
 *         }
 *         leaf simple-test {
 *             type uint16;
 *         }
 *         leaf-list simple-list {
 *             type uint16;
 *         }
 *         container dto_d {
 *             leaf simple-int1 {
 *                 type uint32;
 *             }
 *             leaf simple-int2 {
 *                 type uint32;
 *             }
 *             leaf simple-int3 {
 *                 type uint16;
 *             }
 *             leaf-list simple-list {
 *                 type uint16;
 *             }
 *             list complex-dto-bInner {
 *                 key     leaf-list simple-list {
 *                     type uint16;
 *                 }
 *                 leaf simple-int3 {
 *                     type uint16;
 *                 }
 *                 container deep {
 *                     leaf simple-int3 {
 *                         type uint16;
 *                     }
 *                 }
 *             }
 *         }
 *         list complex-list {
 *             key     list simple-list {
 *                 key     leaf simple-int3 {
 *                     type uint16;
 *                 }
 *             }
 *         }
 *         list peers {
 *             key     leaf port {
 *                 type string;
 *             }
 *             leaf core-size {
 *                 type uint32;
 *             }
 *             leaf simple-int3 {
 *                 type uint16;
 *             }
 *         }
 *         container testing-dep {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)type {
 *                     leaf type {
 *                         type service-type-ref;
 *                     }
 *                 }
 *             }
 *         }
 *         list testing-deps {
 *             key     leaf type {
 *                 type service-type-ref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)type {
 *                     leaf type {
 *                         type service-type-ref;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf</i>
 */
public interface ImplNetconf
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.ImplNetconf>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","impl-netconf");;

    org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf getImplNetconf();

}

