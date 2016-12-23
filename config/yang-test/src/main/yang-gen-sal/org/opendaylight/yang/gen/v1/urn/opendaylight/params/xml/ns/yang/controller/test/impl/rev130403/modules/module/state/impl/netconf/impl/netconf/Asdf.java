package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * container asdf {
 *     leaf simpleInt {
 *         type uint16;
 *     }
 *     leaf simpleString {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf/impl-netconf/asdf</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.AsdfBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.AsdfBuilder
 */
public interface Asdf
    extends
    ChildOf<ImplNetconf>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.Asdf>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","asdf");;

    java.lang.Integer getSimpleInt();
    
    java.lang.String getSimpleString();

}

