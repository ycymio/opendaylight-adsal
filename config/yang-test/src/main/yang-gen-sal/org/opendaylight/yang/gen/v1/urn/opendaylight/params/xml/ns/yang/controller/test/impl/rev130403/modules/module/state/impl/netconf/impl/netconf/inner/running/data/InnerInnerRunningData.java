package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.Deep3;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.NotStateBean;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * list inner-inner-running-data {
 *     key "simple-int3"
 *     leaf simple-int3 {
 *         type uint16;
 *     }
 *     leaf-list list-of-strings {
 *         type string;
 *     }
 *     list not-state-bean {
 *         key     leaf element {
 *             type string;
 *         }
 *         list not-state-bean-internal {
 *             key     leaf element2 {
 *                 type string;
 *             }
 *             anyxml inner-state-bean {
 *                 status CURRENT;
 *             }
 *         }
 *     }
 *     container deep3 {
 *         leaf boool {
 *             type boolean;
 *         }
 *     }
 *     anyxml inner-state-bean {
 *         status CURRENT;
 *     }
 *     anyxml inner-inner-test-rpc {
 *         status CURRENT;
 *     }
 *     anyxml complex-output-rpc {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf/impl-netconf/inner-running-data/inner-inner-running-data</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataKey
 */
public interface InnerInnerRunningData
    extends
    ChildOf<InnerRunningData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>,
    Identifiable<InnerInnerRunningDataKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","inner-inner-running-data");;

    java.lang.Integer getSimpleInt3();
    
    List<java.lang.String> getListOfStrings();
    
    List<NotStateBean> getNotStateBean();
    
    Deep3 getDeep3();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    InnerInnerRunningDataKey getKey();

}

