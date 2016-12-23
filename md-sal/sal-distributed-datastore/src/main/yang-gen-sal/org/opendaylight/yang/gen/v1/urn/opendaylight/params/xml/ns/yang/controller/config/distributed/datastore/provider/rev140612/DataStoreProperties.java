package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>distributed-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\distributed-datastore-provider.yang</i>):
 * <pre>
 * grouping data-store-properties {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>distributed-datastore-provider/data-store-properties</i>
 */
public interface DataStoreProperties
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:distributed-datastore-provider","2014-06-12","data-store-properties");;

    /**
     * The maximum queue size for each shard's data store data change notification 
     * executor.
     */
    NonZeroUint32Type getMaxShardDataChangeExecutorQueueSize();
    
    /**
     * The maximum thread pool size for each shard's data store data change 
     * notification executor.
     */
    NonZeroUint32Type getMaxShardDataChangeExecutorPoolSize();
    
    /**
     * The maximum queue size for each shard's data store data change listener.
     */
    NonZeroUint32Type getMaxShardDataChangeListenerQueueSize();
    
    /**
     * The maximum queue size for each shard's data store executor.
     */
    NonZeroUint32Type getMaxShardDataStoreExecutorQueueSize();
    
    /**
     * The maximum amount of time a shard transaction can be idle without receiving any
     * messages before it self-destructs.
     */
    NonZeroUint32Type getShardTransactionIdleTimeoutInMinutes();
    
    /**
     * The minimum number of entries to be present in the in-memory journal log before 
     * a snapshot is to be taken.
     */
    NonZeroUint32Type getShardSnapshotBatchCount();
    
    /**
     * The percentage of Runtime.totalMemory() used by the in-memory journal log before
     * a snapshot is to be taken
     */
    Percentage getShardSnapshotDataThresholdPercentage();
    
    /**
     * The interval at which a shard will send a heart beat message to its remote 
     * shard.
     */
    HeartbeatIntervalType getShardHearbeatIntervalInMillis();
    
    /**
     * The maximum amount of time for akka operations (remote or local) to complete 
     * before failing.
     */
    OperationTimeoutType getOperationTimeoutInSeconds();
    
    /**
     * The maximum number of journal log entries to batch on recovery for a shard 
     * before committing to the data store.
     */
    NonZeroUint32Type getShardJournalRecoveryLogBatchSize();
    
    /**
     * The maximum amount of time a shard transaction three-phase commit can be idle 
     * without receiving the next messages before it aborts the transaction
     */
    NonZeroUint32Type getShardTransactionCommitTimeoutInSeconds();
    
    /**
     * The maximum allowed capacity for each shard's transaction commit queue.
     */
    NonZeroUint32Type getShardTransactionCommitQueueCapacity();
    
    /**
     * The maximum amount of time to wait for a shard to initialize from persistence on
     * startup before failing an operation (eg transaction create and change listener 
     * registration).
     */
    NonZeroUint32Type getShardInitializationTimeoutInSeconds();
    
    /**
     * The maximum amount of time to wait for a shard to elect a leader before failing 
     * an operation (eg transaction create).
     */
    NonZeroUint32Type getShardLeaderElectionTimeoutInSeconds();
    
    /**
     * Enable or disable metric capture.
     */
    java.lang.Boolean isEnableMetricCapture();
    
    /**
     * Max queue size that an actor's mailbox can reach
     */
    NonZeroUint32Type getBoundedMailboxCapacity();
    
    /**
     * Enable or disable data persistence
     */
    java.lang.Boolean isPersistent();
    
    /**
     * The interval at which the leader of the shard will check if its majority 
     * followers are active and term itself as isolated
     */
    HeartbeatIntervalType getShardIsolatedLeaderCheckIntervalInMillis();

}

