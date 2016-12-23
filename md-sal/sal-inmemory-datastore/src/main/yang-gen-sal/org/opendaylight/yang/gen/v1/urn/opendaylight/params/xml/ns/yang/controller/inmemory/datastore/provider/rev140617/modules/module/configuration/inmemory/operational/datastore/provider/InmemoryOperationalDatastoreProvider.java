package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.inmemory.operational.datastore.provider.SchemaService;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inmemory-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inmemory-datastore-provider.yang</i>):
 * <pre>
 * container inmemory-operational-datastore-provider {
 *     container schema-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:inmemory-datastore-provider?revision=2014-06-17)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf max-data-change-executor-queue-size {
 *         type uint16;
 *     }
 *     leaf max-data-change-executor-pool-size {
 *         type uint16;
 *     }
 *     leaf max-data-change-listener-queue-size {
 *         type uint16;
 *     }
 *     leaf max-data-store-executor-queue-size {
 *         type uint16;
 *     }
 *     leaf debug-transactions {
 *         type boolean;
 *     }
 *     uses datastore-configuration;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inmemory-datastore-provider/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:inmemory-datastore-provider?revision=2014-06-17)inmemory-operational-datastore-provider/inmemory-operational-datastore-provider</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProviderBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProviderBuilder
 */
public interface InmemoryOperationalDatastoreProvider
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>,
    DatastoreConfiguration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:inmemory-datastore-provider","2014-06-17","inmemory-operational-datastore-provider");;

    SchemaService getSchemaService();

}

