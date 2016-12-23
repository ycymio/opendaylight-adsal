package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.DtoA;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.DtoB;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * case impl {
 *     leaf-list allow-user {
 *         type string;
 *     }
 *     container dto-a {
 *         leaf simple-arg {
 *             type uint32;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *         leaf ip4 {
 *             type ipv4-address;
 *         }
 *     }
 *     leaf as-number {
 *         type as-number;
 *     }
 *     leaf simpleInt {
 *         type uint32;
 *     }
 *     container dto_b {
 *         leaf simple-int1 {
 *             type uint32;
 *         }
 *         leaf simple-int2 {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)impl</i>
 */
public interface Impl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","impl");;

    /**
     * A list of user name patterns to allow
     */
    List<java.lang.String> getAllowUser();
    
    DtoA getDtoA();
    
    AsNumber getAsNumber();
    
    java.lang.Long getSimpleInt();
    
    DtoB getDtoB();

}

