package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * case impl-netconf {
 *     container impl-netconf {
 *         leaf created-sessions {
 *             type uint32;
 *         }
 *         container asdf {
 *             leaf simpleInt {
 *                 type uint16;
 *             }
 *             leaf simpleString {
 *                 type string;
 *             }
 *         }
 *         list inner-running-data-additional {
 *             key "simpleString"
 *             leaf simple-int3 {
 *                 type uint16;
 *             }
 *             leaf simpleString {
 *                 type string;
 *             }
 *             container deep4 {
 *                 leaf boool {
 *                     type boolean;
 *                 }
 *             }
 *             anyxml inner-state-bean {
 *                 status CURRENT;
 *             }
 *             anyxml inner-test-rpc {
 *                 status CURRENT;
 *             }
 *         }
 *         list inner-running-data {
 *             key "simple-int3"
 *             leaf simple-int3 {
 *                 type uint16;
 *             }
 *             container deep2 {
 *                 leaf boool {
 *                     type boolean;
 *                 }
 *             }
 *             list inner-inner-running-data {
 *                 key "simple-int3"
 *                 leaf simple-int3 {
 *                     type uint16;
 *                 }
 *                 leaf-list list-of-strings {
 *                     type string;
 *                 }
 *                 list not-state-bean {
 *                     key     leaf element {
 *                         type string;
 *                     }
 *                     list not-state-bean-internal {
 *                         key     leaf element2 {
 *                             type string;
 *                         }
 *                         anyxml inner-state-bean {
 *                             status CURRENT;
 *                         }
 *                     }
 *                 }
 *                 container deep3 {
 *                     leaf boool {
 *                         type boolean;
 *                     }
 *                 }
 *                 anyxml inner-state-bean {
 *                     status CURRENT;
 *                 }
 *                 anyxml inner-inner-test-rpc {
 *                     status CURRENT;
 *                 }
 *                 anyxml complex-output-rpc {
 *                     status CURRENT;
 *                 }
 *             }
 *             anyxml inner-state-bean {
 *                 status CURRENT;
 *             }
 *         }
 *         anyxml test-rpc {
 *             status CURRENT;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf</i>
 */
public interface ImplNetconf
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.ImplNetconf>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","impl-netconf");;

    org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf getImplNetconf();

}

