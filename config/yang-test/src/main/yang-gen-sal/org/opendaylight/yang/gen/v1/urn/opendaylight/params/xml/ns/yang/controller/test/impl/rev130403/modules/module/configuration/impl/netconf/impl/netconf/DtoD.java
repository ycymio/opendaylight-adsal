package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * container dto_d {
 *     leaf simple-int1 {
 *         type uint32;
 *     }
 *     leaf simple-int2 {
 *         type uint32;
 *     }
 *     leaf simple-int3 {
 *         type uint16;
 *     }
 *     leaf-list simple-list {
 *         type uint16;
 *     }
 *     list complex-dto-bInner {
 *         key     leaf-list simple-list {
 *             type uint16;
 *         }
 *         leaf simple-int3 {
 *             type uint16;
 *         }
 *         container deep {
 *             leaf simple-int3 {
 *                 type uint16;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl-netconf/impl-netconf/dto_d</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoDBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoDBuilder
 */
public interface DtoD
    extends
    ChildOf<ImplNetconf>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","dto_d");;

    java.lang.Long getSimpleInt1();
    
    java.lang.Long getSimpleInt2();
    
    java.lang.Integer getSimpleInt3();
    
    List<java.lang.Integer> getSimpleList();
    
    List<ComplexDtoBInner> getComplexDtoBInner();

}

