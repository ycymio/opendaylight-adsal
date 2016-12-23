package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>distributed-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\distributed-datastore-provider.yang</i>):
 * <pre>
 * container operational-schema-service {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider?revision=2014-06-12)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>distributed-datastore-provider/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider?revision=2014-06-12)distributed-operational-datastore-provider/operational-schema-service</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalSchemaServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalSchemaServiceBuilder
 */
public interface OperationalSchemaService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalSchemaService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider","2014-06-12","operational-schema-service");;


}

