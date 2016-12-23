package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalSchemaService;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>distributed-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\distributed-datastore-provider.yang</i>):
 * <pre>
 * case distributed-operational-datastore-provider {
 *     container operational-schema-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider?revision=2014-06-12)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container operational-properties {
 *         leaf max-shard-data-change-executor-queue-size {
 *             type non-zero-uint32-type;
 *         }
 *         leaf max-shard-data-change-executor-pool-size {
 *             type non-zero-uint32-type;
 *         }
 *         leaf max-shard-data-change-listener-queue-size {
 *             type non-zero-uint32-type;
 *         }
 *         leaf max-shard-data-store-executor-queue-size {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-transaction-idle-timeout-in-minutes {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-snapshot-batch-count {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-snapshot-data-threshold-percentage {
 *             type percentage;
 *         }
 *         leaf shard-hearbeat-interval-in-millis {
 *             type heartbeat-interval-type;
 *         }
 *         leaf operation-timeout-in-seconds {
 *             type operation-timeout-type;
 *         }
 *         leaf shard-journal-recovery-log-batch-size {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-transaction-commit-timeout-in-seconds {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-transaction-commit-queue-capacity {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-initialization-timeout-in-seconds {
 *             type non-zero-uint32-type;
 *         }
 *         leaf shard-leader-election-timeout-in-seconds {
 *             type non-zero-uint32-type;
 *         }
 *         leaf enable-metric-capture {
 *             type boolean;
 *         }
 *         leaf bounded-mailbox-capacity {
 *             type non-zero-uint32-type;
 *         }
 *         leaf persistent {
 *             type boolean;
 *         }
 *         leaf shard-isolated-leader-check-interval-in-millis {
 *             type heartbeat-interval-type;
 *         }
 *         uses data-store-properties;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>distributed-datastore-provider/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider?revision=2014-06-12)distributed-operational-datastore-provider</i>
 */
public interface DistributedOperationalDatastoreProvider
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider","2014-06-12","distributed-operational-datastore-provider");;

    OperationalSchemaService getOperationalSchemaService();
    
    OperationalProperties getOperationalProperties();

}

