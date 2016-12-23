package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>distributed-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\distributed-datastore-provider.yang</i>):
 * <pre>
 * container operational-properties {
 *     leaf max-shard-data-change-executor-queue-size {
 *         type non-zero-uint32-type;
 *     }
 *     leaf max-shard-data-change-executor-pool-size {
 *         type non-zero-uint32-type;
 *     }
 *     leaf max-shard-data-change-listener-queue-size {
 *         type non-zero-uint32-type;
 *     }
 *     leaf max-shard-data-store-executor-queue-size {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-transaction-idle-timeout-in-minutes {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-snapshot-batch-count {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-snapshot-data-threshold-percentage {
 *         type percentage;
 *     }
 *     leaf shard-hearbeat-interval-in-millis {
 *         type heartbeat-interval-type;
 *     }
 *     leaf operation-timeout-in-seconds {
 *         type operation-timeout-type;
 *     }
 *     leaf shard-journal-recovery-log-batch-size {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-transaction-commit-timeout-in-seconds {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-transaction-commit-queue-capacity {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-initialization-timeout-in-seconds {
 *         type non-zero-uint32-type;
 *     }
 *     leaf shard-leader-election-timeout-in-seconds {
 *         type non-zero-uint32-type;
 *     }
 *     leaf enable-metric-capture {
 *         type boolean;
 *     }
 *     leaf bounded-mailbox-capacity {
 *         type non-zero-uint32-type;
 *     }
 *     leaf persistent {
 *         type boolean;
 *     }
 *     leaf shard-isolated-leader-check-interval-in-millis {
 *         type heartbeat-interval-type;
 *     }
 *     uses data-store-properties;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>distributed-datastore-provider/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider?revision=2014-06-12)distributed-operational-datastore-provider/operational-properties</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalPropertiesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalPropertiesBuilder
 */
public interface OperationalProperties
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>,
    DataStoreProperties
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider","2014-06-12","operational-properties");;


}

