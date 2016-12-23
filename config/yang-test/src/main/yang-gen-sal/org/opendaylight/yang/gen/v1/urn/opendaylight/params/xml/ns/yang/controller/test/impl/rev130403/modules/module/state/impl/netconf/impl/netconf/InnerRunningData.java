package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.Deep2;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * list inner-running-data {
 *     key "simple-int3"
 *     leaf simple-int3 {
 *         type uint16;
 *     }
 *     container deep2 {
 *         leaf boool {
 *             type boolean;
 *         }
 *     }
 *     list inner-inner-running-data {
 *         key "simple-int3"
 *         leaf simple-int3 {
 *             type uint16;
 *         }
 *         leaf-list list-of-strings {
 *             type string;
 *         }
 *         list not-state-bean {
 *             key     leaf element {
 *                 type string;
 *             }
 *             list not-state-bean-internal {
 *                 key     leaf element2 {
 *                     type string;
 *                 }
 *                 anyxml inner-state-bean {
 *                     status CURRENT;
 *                 }
 *             }
 *         }
 *         container deep3 {
 *             leaf boool {
 *                 type boolean;
 *             }
 *         }
 *         anyxml inner-state-bean {
 *             status CURRENT;
 *         }
 *         anyxml inner-inner-test-rpc {
 *             status CURRENT;
 *         }
 *         anyxml complex-output-rpc {
 *             status CURRENT;
 *         }
 *     }
 *     anyxml inner-state-bean {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf/impl-netconf/inner-running-data</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataKey
 */
public interface InnerRunningData
    extends
    ChildOf<ImplNetconf>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>,
    Identifiable<InnerRunningDataKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","inner-running-data");;

    java.lang.Integer getSimpleInt3();
    
    Deep2 getDeep2();
    
    List<InnerInnerRunningData> getInnerInnerRunningData();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    InnerRunningDataKey getKey();

}

