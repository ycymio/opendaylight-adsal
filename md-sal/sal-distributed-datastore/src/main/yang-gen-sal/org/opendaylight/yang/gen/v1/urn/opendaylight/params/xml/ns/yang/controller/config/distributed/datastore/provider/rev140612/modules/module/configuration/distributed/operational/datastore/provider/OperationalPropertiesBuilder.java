package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties
 */
public class OperationalPropertiesBuilder {

    private NonZeroUint32Type _boundedMailboxCapacity;
    private static List<Range<BigInteger>> _boundedMailboxCapacity_range;
    private NonZeroUint32Type _maxShardDataChangeExecutorPoolSize;
    private static List<Range<BigInteger>> _maxShardDataChangeExecutorPoolSize_range;
    private NonZeroUint32Type _maxShardDataChangeExecutorQueueSize;
    private static List<Range<BigInteger>> _maxShardDataChangeExecutorQueueSize_range;
    private NonZeroUint32Type _maxShardDataChangeListenerQueueSize;
    private static List<Range<BigInteger>> _maxShardDataChangeListenerQueueSize_range;
    private NonZeroUint32Type _maxShardDataStoreExecutorQueueSize;
    private static List<Range<BigInteger>> _maxShardDataStoreExecutorQueueSize_range;
    private OperationTimeoutType _operationTimeoutInSeconds;
    private static List<Range<BigInteger>> _operationTimeoutInSeconds_range;
    private HeartbeatIntervalType _shardHearbeatIntervalInMillis;
    private static List<Range<BigInteger>> _shardHearbeatIntervalInMillis_range;
    private NonZeroUint32Type _shardInitializationTimeoutInSeconds;
    private static List<Range<BigInteger>> _shardInitializationTimeoutInSeconds_range;
    private HeartbeatIntervalType _shardIsolatedLeaderCheckIntervalInMillis;
    private static List<Range<BigInteger>> _shardIsolatedLeaderCheckIntervalInMillis_range;
    private NonZeroUint32Type _shardJournalRecoveryLogBatchSize;
    private static List<Range<BigInteger>> _shardJournalRecoveryLogBatchSize_range;
    private NonZeroUint32Type _shardLeaderElectionTimeoutInSeconds;
    private static List<Range<BigInteger>> _shardLeaderElectionTimeoutInSeconds_range;
    private NonZeroUint32Type _shardSnapshotBatchCount;
    private static List<Range<BigInteger>> _shardSnapshotBatchCount_range;
    private Percentage _shardSnapshotDataThresholdPercentage;
    private static List<Range<BigInteger>> _shardSnapshotDataThresholdPercentage_range;
    private NonZeroUint32Type _shardTransactionCommitQueueCapacity;
    private static List<Range<BigInteger>> _shardTransactionCommitQueueCapacity_range;
    private NonZeroUint32Type _shardTransactionCommitTimeoutInSeconds;
    private static List<Range<BigInteger>> _shardTransactionCommitTimeoutInSeconds_range;
    private NonZeroUint32Type _shardTransactionIdleTimeoutInMinutes;
    private static List<Range<BigInteger>> _shardTransactionIdleTimeoutInMinutes_range;
    private java.lang.Boolean _enableMetricCapture;
    private java.lang.Boolean _persistent;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> augmentation = new HashMap<>();

    public OperationalPropertiesBuilder() {
    } 
    
    public OperationalPropertiesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties arg) {
        this._maxShardDataChangeExecutorQueueSize = arg.getMaxShardDataChangeExecutorQueueSize();
        this._maxShardDataChangeExecutorPoolSize = arg.getMaxShardDataChangeExecutorPoolSize();
        this._maxShardDataChangeListenerQueueSize = arg.getMaxShardDataChangeListenerQueueSize();
        this._maxShardDataStoreExecutorQueueSize = arg.getMaxShardDataStoreExecutorQueueSize();
        this._shardTransactionIdleTimeoutInMinutes = arg.getShardTransactionIdleTimeoutInMinutes();
        this._shardSnapshotBatchCount = arg.getShardSnapshotBatchCount();
        this._shardSnapshotDataThresholdPercentage = arg.getShardSnapshotDataThresholdPercentage();
        this._shardHearbeatIntervalInMillis = arg.getShardHearbeatIntervalInMillis();
        this._operationTimeoutInSeconds = arg.getOperationTimeoutInSeconds();
        this._shardJournalRecoveryLogBatchSize = arg.getShardJournalRecoveryLogBatchSize();
        this._shardTransactionCommitTimeoutInSeconds = arg.getShardTransactionCommitTimeoutInSeconds();
        this._shardTransactionCommitQueueCapacity = arg.getShardTransactionCommitQueueCapacity();
        this._shardInitializationTimeoutInSeconds = arg.getShardInitializationTimeoutInSeconds();
        this._shardLeaderElectionTimeoutInSeconds = arg.getShardLeaderElectionTimeoutInSeconds();
        this._enableMetricCapture = arg.isEnableMetricCapture();
        this._boundedMailboxCapacity = arg.getBoundedMailboxCapacity();
        this._persistent = arg.isPersistent();
        this._shardIsolatedLeaderCheckIntervalInMillis = arg.getShardIsolatedLeaderCheckIntervalInMillis();
    }

    public OperationalPropertiesBuilder(OperationalProperties base) {
        this._boundedMailboxCapacity = base.getBoundedMailboxCapacity();
        this._maxShardDataChangeExecutorPoolSize = base.getMaxShardDataChangeExecutorPoolSize();
        this._maxShardDataChangeExecutorQueueSize = base.getMaxShardDataChangeExecutorQueueSize();
        this._maxShardDataChangeListenerQueueSize = base.getMaxShardDataChangeListenerQueueSize();
        this._maxShardDataStoreExecutorQueueSize = base.getMaxShardDataStoreExecutorQueueSize();
        this._operationTimeoutInSeconds = base.getOperationTimeoutInSeconds();
        this._shardHearbeatIntervalInMillis = base.getShardHearbeatIntervalInMillis();
        this._shardInitializationTimeoutInSeconds = base.getShardInitializationTimeoutInSeconds();
        this._shardIsolatedLeaderCheckIntervalInMillis = base.getShardIsolatedLeaderCheckIntervalInMillis();
        this._shardJournalRecoveryLogBatchSize = base.getShardJournalRecoveryLogBatchSize();
        this._shardLeaderElectionTimeoutInSeconds = base.getShardLeaderElectionTimeoutInSeconds();
        this._shardSnapshotBatchCount = base.getShardSnapshotBatchCount();
        this._shardSnapshotDataThresholdPercentage = base.getShardSnapshotDataThresholdPercentage();
        this._shardTransactionCommitQueueCapacity = base.getShardTransactionCommitQueueCapacity();
        this._shardTransactionCommitTimeoutInSeconds = base.getShardTransactionCommitTimeoutInSeconds();
        this._shardTransactionIdleTimeoutInMinutes = base.getShardTransactionIdleTimeoutInMinutes();
        this._enableMetricCapture = base.isEnableMetricCapture();
        this._persistent = base.isPersistent();
        if (base instanceof OperationalPropertiesImpl) {
            OperationalPropertiesImpl _impl = (OperationalPropertiesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties) {
            this._maxShardDataChangeExecutorQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getMaxShardDataChangeExecutorQueueSize();
            this._maxShardDataChangeExecutorPoolSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getMaxShardDataChangeExecutorPoolSize();
            this._maxShardDataChangeListenerQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getMaxShardDataChangeListenerQueueSize();
            this._maxShardDataStoreExecutorQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getMaxShardDataStoreExecutorQueueSize();
            this._shardTransactionIdleTimeoutInMinutes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardTransactionIdleTimeoutInMinutes();
            this._shardSnapshotBatchCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardSnapshotBatchCount();
            this._shardSnapshotDataThresholdPercentage = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardSnapshotDataThresholdPercentage();
            this._shardHearbeatIntervalInMillis = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardHearbeatIntervalInMillis();
            this._operationTimeoutInSeconds = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getOperationTimeoutInSeconds();
            this._shardJournalRecoveryLogBatchSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardJournalRecoveryLogBatchSize();
            this._shardTransactionCommitTimeoutInSeconds = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardTransactionCommitTimeoutInSeconds();
            this._shardTransactionCommitQueueCapacity = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardTransactionCommitQueueCapacity();
            this._shardInitializationTimeoutInSeconds = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardInitializationTimeoutInSeconds();
            this._shardLeaderElectionTimeoutInSeconds = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardLeaderElectionTimeoutInSeconds();
            this._enableMetricCapture = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).isEnableMetricCapture();
            this._boundedMailboxCapacity = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getBoundedMailboxCapacity();
            this._persistent = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).isPersistent();
            this._shardIsolatedLeaderCheckIntervalInMillis = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties)arg).getShardIsolatedLeaderCheckIntervalInMillis();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.DataStoreProperties] \n" +
              "but was: " + arg
            );
        }
    }

    public NonZeroUint32Type getBoundedMailboxCapacity() {
        return _boundedMailboxCapacity;
    }
    
    public NonZeroUint32Type getMaxShardDataChangeExecutorPoolSize() {
        return _maxShardDataChangeExecutorPoolSize;
    }
    
    public NonZeroUint32Type getMaxShardDataChangeExecutorQueueSize() {
        return _maxShardDataChangeExecutorQueueSize;
    }
    
    public NonZeroUint32Type getMaxShardDataChangeListenerQueueSize() {
        return _maxShardDataChangeListenerQueueSize;
    }
    
    public NonZeroUint32Type getMaxShardDataStoreExecutorQueueSize() {
        return _maxShardDataStoreExecutorQueueSize;
    }
    
    public OperationTimeoutType getOperationTimeoutInSeconds() {
        return _operationTimeoutInSeconds;
    }
    
    public HeartbeatIntervalType getShardHearbeatIntervalInMillis() {
        return _shardHearbeatIntervalInMillis;
    }
    
    public NonZeroUint32Type getShardInitializationTimeoutInSeconds() {
        return _shardInitializationTimeoutInSeconds;
    }
    
    public HeartbeatIntervalType getShardIsolatedLeaderCheckIntervalInMillis() {
        return _shardIsolatedLeaderCheckIntervalInMillis;
    }
    
    public NonZeroUint32Type getShardJournalRecoveryLogBatchSize() {
        return _shardJournalRecoveryLogBatchSize;
    }
    
    public NonZeroUint32Type getShardLeaderElectionTimeoutInSeconds() {
        return _shardLeaderElectionTimeoutInSeconds;
    }
    
    public NonZeroUint32Type getShardSnapshotBatchCount() {
        return _shardSnapshotBatchCount;
    }
    
    public Percentage getShardSnapshotDataThresholdPercentage() {
        return _shardSnapshotDataThresholdPercentage;
    }
    
    public NonZeroUint32Type getShardTransactionCommitQueueCapacity() {
        return _shardTransactionCommitQueueCapacity;
    }
    
    public NonZeroUint32Type getShardTransactionCommitTimeoutInSeconds() {
        return _shardTransactionCommitTimeoutInSeconds;
    }
    
    public NonZeroUint32Type getShardTransactionIdleTimeoutInMinutes() {
        return _shardTransactionIdleTimeoutInMinutes;
    }
    
    public java.lang.Boolean isEnableMetricCapture() {
        return _enableMetricCapture;
    }
    
    public java.lang.Boolean isPersistent() {
        return _persistent;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OperationalPropertiesBuilder setBoundedMailboxCapacity(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _boundedMailboxCapacity_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _boundedMailboxCapacity_range));
            }
        }
        this._boundedMailboxCapacity = value;
        return this;
    }
    public static List<Range<BigInteger>> _boundedMailboxCapacity_range() {
        if (_boundedMailboxCapacity_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_boundedMailboxCapacity_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _boundedMailboxCapacity_range = builder.build();
                }
            }
        }
        return _boundedMailboxCapacity_range;
    }
    
    public OperationalPropertiesBuilder setMaxShardDataChangeExecutorPoolSize(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxShardDataChangeExecutorPoolSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxShardDataChangeExecutorPoolSize_range));
            }
        }
        this._maxShardDataChangeExecutorPoolSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxShardDataChangeExecutorPoolSize_range() {
        if (_maxShardDataChangeExecutorPoolSize_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_maxShardDataChangeExecutorPoolSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _maxShardDataChangeExecutorPoolSize_range = builder.build();
                }
            }
        }
        return _maxShardDataChangeExecutorPoolSize_range;
    }
    
    public OperationalPropertiesBuilder setMaxShardDataChangeExecutorQueueSize(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxShardDataChangeExecutorQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxShardDataChangeExecutorQueueSize_range));
            }
        }
        this._maxShardDataChangeExecutorQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxShardDataChangeExecutorQueueSize_range() {
        if (_maxShardDataChangeExecutorQueueSize_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_maxShardDataChangeExecutorQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _maxShardDataChangeExecutorQueueSize_range = builder.build();
                }
            }
        }
        return _maxShardDataChangeExecutorQueueSize_range;
    }
    
    public OperationalPropertiesBuilder setMaxShardDataChangeListenerQueueSize(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxShardDataChangeListenerQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxShardDataChangeListenerQueueSize_range));
            }
        }
        this._maxShardDataChangeListenerQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxShardDataChangeListenerQueueSize_range() {
        if (_maxShardDataChangeListenerQueueSize_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_maxShardDataChangeListenerQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _maxShardDataChangeListenerQueueSize_range = builder.build();
                }
            }
        }
        return _maxShardDataChangeListenerQueueSize_range;
    }
    
    public OperationalPropertiesBuilder setMaxShardDataStoreExecutorQueueSize(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxShardDataStoreExecutorQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxShardDataStoreExecutorQueueSize_range));
            }
        }
        this._maxShardDataStoreExecutorQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxShardDataStoreExecutorQueueSize_range() {
        if (_maxShardDataStoreExecutorQueueSize_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_maxShardDataStoreExecutorQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _maxShardDataStoreExecutorQueueSize_range = builder.build();
                }
            }
        }
        return _maxShardDataStoreExecutorQueueSize_range;
    }
    
    public OperationalPropertiesBuilder setOperationTimeoutInSeconds(OperationTimeoutType value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _operationTimeoutInSeconds_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _operationTimeoutInSeconds_range));
            }
        }
        this._operationTimeoutInSeconds = value;
        return this;
    }
    public static List<Range<BigInteger>> _operationTimeoutInSeconds_range() {
        if (_operationTimeoutInSeconds_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_operationTimeoutInSeconds_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.valueOf(5L), BigInteger.valueOf(65535L)));
                    _operationTimeoutInSeconds_range = builder.build();
                }
            }
        }
        return _operationTimeoutInSeconds_range;
    }
    
    public OperationalPropertiesBuilder setShardHearbeatIntervalInMillis(HeartbeatIntervalType value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardHearbeatIntervalInMillis_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardHearbeatIntervalInMillis_range));
            }
        }
        this._shardHearbeatIntervalInMillis = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardHearbeatIntervalInMillis_range() {
        if (_shardHearbeatIntervalInMillis_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardHearbeatIntervalInMillis_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.valueOf(100L), BigInteger.valueOf(65535L)));
                    _shardHearbeatIntervalInMillis_range = builder.build();
                }
            }
        }
        return _shardHearbeatIntervalInMillis_range;
    }
    
    public OperationalPropertiesBuilder setShardInitializationTimeoutInSeconds(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardInitializationTimeoutInSeconds_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardInitializationTimeoutInSeconds_range));
            }
        }
        this._shardInitializationTimeoutInSeconds = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardInitializationTimeoutInSeconds_range() {
        if (_shardInitializationTimeoutInSeconds_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardInitializationTimeoutInSeconds_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardInitializationTimeoutInSeconds_range = builder.build();
                }
            }
        }
        return _shardInitializationTimeoutInSeconds_range;
    }
    
    public OperationalPropertiesBuilder setShardIsolatedLeaderCheckIntervalInMillis(HeartbeatIntervalType value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardIsolatedLeaderCheckIntervalInMillis_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardIsolatedLeaderCheckIntervalInMillis_range));
            }
        }
        this._shardIsolatedLeaderCheckIntervalInMillis = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardIsolatedLeaderCheckIntervalInMillis_range() {
        if (_shardIsolatedLeaderCheckIntervalInMillis_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardIsolatedLeaderCheckIntervalInMillis_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.valueOf(100L), BigInteger.valueOf(65535L)));
                    _shardIsolatedLeaderCheckIntervalInMillis_range = builder.build();
                }
            }
        }
        return _shardIsolatedLeaderCheckIntervalInMillis_range;
    }
    
    public OperationalPropertiesBuilder setShardJournalRecoveryLogBatchSize(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardJournalRecoveryLogBatchSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardJournalRecoveryLogBatchSize_range));
            }
        }
        this._shardJournalRecoveryLogBatchSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardJournalRecoveryLogBatchSize_range() {
        if (_shardJournalRecoveryLogBatchSize_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardJournalRecoveryLogBatchSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardJournalRecoveryLogBatchSize_range = builder.build();
                }
            }
        }
        return _shardJournalRecoveryLogBatchSize_range;
    }
    
    public OperationalPropertiesBuilder setShardLeaderElectionTimeoutInSeconds(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardLeaderElectionTimeoutInSeconds_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardLeaderElectionTimeoutInSeconds_range));
            }
        }
        this._shardLeaderElectionTimeoutInSeconds = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardLeaderElectionTimeoutInSeconds_range() {
        if (_shardLeaderElectionTimeoutInSeconds_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardLeaderElectionTimeoutInSeconds_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardLeaderElectionTimeoutInSeconds_range = builder.build();
                }
            }
        }
        return _shardLeaderElectionTimeoutInSeconds_range;
    }
    
    public OperationalPropertiesBuilder setShardSnapshotBatchCount(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardSnapshotBatchCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardSnapshotBatchCount_range));
            }
        }
        this._shardSnapshotBatchCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardSnapshotBatchCount_range() {
        if (_shardSnapshotBatchCount_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardSnapshotBatchCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardSnapshotBatchCount_range = builder.build();
                }
            }
        }
        return _shardSnapshotBatchCount_range;
    }
    
    public OperationalPropertiesBuilder setShardSnapshotDataThresholdPercentage(Percentage value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardSnapshotDataThresholdPercentage_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardSnapshotDataThresholdPercentage_range));
            }
        }
        this._shardSnapshotDataThresholdPercentage = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardSnapshotDataThresholdPercentage_range() {
        if (_shardSnapshotDataThresholdPercentage_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardSnapshotDataThresholdPercentage_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(100L)));
                    _shardSnapshotDataThresholdPercentage_range = builder.build();
                }
            }
        }
        return _shardSnapshotDataThresholdPercentage_range;
    }
    
    public OperationalPropertiesBuilder setShardTransactionCommitQueueCapacity(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardTransactionCommitQueueCapacity_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardTransactionCommitQueueCapacity_range));
            }
        }
        this._shardTransactionCommitQueueCapacity = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardTransactionCommitQueueCapacity_range() {
        if (_shardTransactionCommitQueueCapacity_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardTransactionCommitQueueCapacity_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardTransactionCommitQueueCapacity_range = builder.build();
                }
            }
        }
        return _shardTransactionCommitQueueCapacity_range;
    }
    
    public OperationalPropertiesBuilder setShardTransactionCommitTimeoutInSeconds(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardTransactionCommitTimeoutInSeconds_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardTransactionCommitTimeoutInSeconds_range));
            }
        }
        this._shardTransactionCommitTimeoutInSeconds = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardTransactionCommitTimeoutInSeconds_range() {
        if (_shardTransactionCommitTimeoutInSeconds_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardTransactionCommitTimeoutInSeconds_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardTransactionCommitTimeoutInSeconds_range = builder.build();
                }
            }
        }
        return _shardTransactionCommitTimeoutInSeconds_range;
    }
    
    public OperationalPropertiesBuilder setShardTransactionIdleTimeoutInMinutes(NonZeroUint32Type value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _shardTransactionIdleTimeoutInMinutes_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _shardTransactionIdleTimeoutInMinutes_range));
            }
        }
        this._shardTransactionIdleTimeoutInMinutes = value;
        return this;
    }
    public static List<Range<BigInteger>> _shardTransactionIdleTimeoutInMinutes_range() {
        if (_shardTransactionIdleTimeoutInMinutes_range == null) {
            synchronized (OperationalPropertiesBuilder.class) {
                if (_shardTransactionIdleTimeoutInMinutes_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _shardTransactionIdleTimeoutInMinutes_range = builder.build();
                }
            }
        }
        return _shardTransactionIdleTimeoutInMinutes_range;
    }
    
    public OperationalPropertiesBuilder setEnableMetricCapture(java.lang.Boolean value) {
        this._enableMetricCapture = value;
        return this;
    }
    
    public OperationalPropertiesBuilder setPersistent(java.lang.Boolean value) {
        this._persistent = value;
        return this;
    }
    
    public OperationalPropertiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OperationalProperties build() {
        return new OperationalPropertiesImpl(this);
    }

    private static final class OperationalPropertiesImpl implements OperationalProperties {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties.class;
        }

        private final NonZeroUint32Type _boundedMailboxCapacity;
        private final NonZeroUint32Type _maxShardDataChangeExecutorPoolSize;
        private final NonZeroUint32Type _maxShardDataChangeExecutorQueueSize;
        private final NonZeroUint32Type _maxShardDataChangeListenerQueueSize;
        private final NonZeroUint32Type _maxShardDataStoreExecutorQueueSize;
        private final OperationTimeoutType _operationTimeoutInSeconds;
        private final HeartbeatIntervalType _shardHearbeatIntervalInMillis;
        private final NonZeroUint32Type _shardInitializationTimeoutInSeconds;
        private final HeartbeatIntervalType _shardIsolatedLeaderCheckIntervalInMillis;
        private final NonZeroUint32Type _shardJournalRecoveryLogBatchSize;
        private final NonZeroUint32Type _shardLeaderElectionTimeoutInSeconds;
        private final NonZeroUint32Type _shardSnapshotBatchCount;
        private final Percentage _shardSnapshotDataThresholdPercentage;
        private final NonZeroUint32Type _shardTransactionCommitQueueCapacity;
        private final NonZeroUint32Type _shardTransactionCommitTimeoutInSeconds;
        private final NonZeroUint32Type _shardTransactionIdleTimeoutInMinutes;
        private final java.lang.Boolean _enableMetricCapture;
        private final java.lang.Boolean _persistent;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> augmentation = new HashMap<>();

        private OperationalPropertiesImpl(OperationalPropertiesBuilder base) {
            this._boundedMailboxCapacity = base.getBoundedMailboxCapacity();
            this._maxShardDataChangeExecutorPoolSize = base.getMaxShardDataChangeExecutorPoolSize();
            this._maxShardDataChangeExecutorQueueSize = base.getMaxShardDataChangeExecutorQueueSize();
            this._maxShardDataChangeListenerQueueSize = base.getMaxShardDataChangeListenerQueueSize();
            this._maxShardDataStoreExecutorQueueSize = base.getMaxShardDataStoreExecutorQueueSize();
            this._operationTimeoutInSeconds = base.getOperationTimeoutInSeconds();
            this._shardHearbeatIntervalInMillis = base.getShardHearbeatIntervalInMillis();
            this._shardInitializationTimeoutInSeconds = base.getShardInitializationTimeoutInSeconds();
            this._shardIsolatedLeaderCheckIntervalInMillis = base.getShardIsolatedLeaderCheckIntervalInMillis();
            this._shardJournalRecoveryLogBatchSize = base.getShardJournalRecoveryLogBatchSize();
            this._shardLeaderElectionTimeoutInSeconds = base.getShardLeaderElectionTimeoutInSeconds();
            this._shardSnapshotBatchCount = base.getShardSnapshotBatchCount();
            this._shardSnapshotDataThresholdPercentage = base.getShardSnapshotDataThresholdPercentage();
            this._shardTransactionCommitQueueCapacity = base.getShardTransactionCommitQueueCapacity();
            this._shardTransactionCommitTimeoutInSeconds = base.getShardTransactionCommitTimeoutInSeconds();
            this._shardTransactionIdleTimeoutInMinutes = base.getShardTransactionIdleTimeoutInMinutes();
            this._enableMetricCapture = base.isEnableMetricCapture();
            this._persistent = base.isPersistent();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public NonZeroUint32Type getBoundedMailboxCapacity() {
            return _boundedMailboxCapacity;
        }
        
        @Override
        public NonZeroUint32Type getMaxShardDataChangeExecutorPoolSize() {
            return _maxShardDataChangeExecutorPoolSize;
        }
        
        @Override
        public NonZeroUint32Type getMaxShardDataChangeExecutorQueueSize() {
            return _maxShardDataChangeExecutorQueueSize;
        }
        
        @Override
        public NonZeroUint32Type getMaxShardDataChangeListenerQueueSize() {
            return _maxShardDataChangeListenerQueueSize;
        }
        
        @Override
        public NonZeroUint32Type getMaxShardDataStoreExecutorQueueSize() {
            return _maxShardDataStoreExecutorQueueSize;
        }
        
        @Override
        public OperationTimeoutType getOperationTimeoutInSeconds() {
            return _operationTimeoutInSeconds;
        }
        
        @Override
        public HeartbeatIntervalType getShardHearbeatIntervalInMillis() {
            return _shardHearbeatIntervalInMillis;
        }
        
        @Override
        public NonZeroUint32Type getShardInitializationTimeoutInSeconds() {
            return _shardInitializationTimeoutInSeconds;
        }
        
        @Override
        public HeartbeatIntervalType getShardIsolatedLeaderCheckIntervalInMillis() {
            return _shardIsolatedLeaderCheckIntervalInMillis;
        }
        
        @Override
        public NonZeroUint32Type getShardJournalRecoveryLogBatchSize() {
            return _shardJournalRecoveryLogBatchSize;
        }
        
        @Override
        public NonZeroUint32Type getShardLeaderElectionTimeoutInSeconds() {
            return _shardLeaderElectionTimeoutInSeconds;
        }
        
        @Override
        public NonZeroUint32Type getShardSnapshotBatchCount() {
            return _shardSnapshotBatchCount;
        }
        
        @Override
        public Percentage getShardSnapshotDataThresholdPercentage() {
            return _shardSnapshotDataThresholdPercentage;
        }
        
        @Override
        public NonZeroUint32Type getShardTransactionCommitQueueCapacity() {
            return _shardTransactionCommitQueueCapacity;
        }
        
        @Override
        public NonZeroUint32Type getShardTransactionCommitTimeoutInSeconds() {
            return _shardTransactionCommitTimeoutInSeconds;
        }
        
        @Override
        public NonZeroUint32Type getShardTransactionIdleTimeoutInMinutes() {
            return _shardTransactionIdleTimeoutInMinutes;
        }
        
        @Override
        public java.lang.Boolean isEnableMetricCapture() {
            return _enableMetricCapture;
        }
        
        @Override
        public java.lang.Boolean isPersistent() {
            return _persistent;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_boundedMailboxCapacity == null) ? 0 : _boundedMailboxCapacity.hashCode());
            result = prime * result + ((_maxShardDataChangeExecutorPoolSize == null) ? 0 : _maxShardDataChangeExecutorPoolSize.hashCode());
            result = prime * result + ((_maxShardDataChangeExecutorQueueSize == null) ? 0 : _maxShardDataChangeExecutorQueueSize.hashCode());
            result = prime * result + ((_maxShardDataChangeListenerQueueSize == null) ? 0 : _maxShardDataChangeListenerQueueSize.hashCode());
            result = prime * result + ((_maxShardDataStoreExecutorQueueSize == null) ? 0 : _maxShardDataStoreExecutorQueueSize.hashCode());
            result = prime * result + ((_operationTimeoutInSeconds == null) ? 0 : _operationTimeoutInSeconds.hashCode());
            result = prime * result + ((_shardHearbeatIntervalInMillis == null) ? 0 : _shardHearbeatIntervalInMillis.hashCode());
            result = prime * result + ((_shardInitializationTimeoutInSeconds == null) ? 0 : _shardInitializationTimeoutInSeconds.hashCode());
            result = prime * result + ((_shardIsolatedLeaderCheckIntervalInMillis == null) ? 0 : _shardIsolatedLeaderCheckIntervalInMillis.hashCode());
            result = prime * result + ((_shardJournalRecoveryLogBatchSize == null) ? 0 : _shardJournalRecoveryLogBatchSize.hashCode());
            result = prime * result + ((_shardLeaderElectionTimeoutInSeconds == null) ? 0 : _shardLeaderElectionTimeoutInSeconds.hashCode());
            result = prime * result + ((_shardSnapshotBatchCount == null) ? 0 : _shardSnapshotBatchCount.hashCode());
            result = prime * result + ((_shardSnapshotDataThresholdPercentage == null) ? 0 : _shardSnapshotDataThresholdPercentage.hashCode());
            result = prime * result + ((_shardTransactionCommitQueueCapacity == null) ? 0 : _shardTransactionCommitQueueCapacity.hashCode());
            result = prime * result + ((_shardTransactionCommitTimeoutInSeconds == null) ? 0 : _shardTransactionCommitTimeoutInSeconds.hashCode());
            result = prime * result + ((_shardTransactionIdleTimeoutInMinutes == null) ? 0 : _shardTransactionIdleTimeoutInMinutes.hashCode());
            result = prime * result + ((_enableMetricCapture == null) ? 0 : _enableMetricCapture.hashCode());
            result = prime * result + ((_persistent == null) ? 0 : _persistent.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties)obj;
            if (_boundedMailboxCapacity == null) {
                if (other.getBoundedMailboxCapacity() != null) {
                    return false;
                }
            } else if(!_boundedMailboxCapacity.equals(other.getBoundedMailboxCapacity())) {
                return false;
            }
            if (_maxShardDataChangeExecutorPoolSize == null) {
                if (other.getMaxShardDataChangeExecutorPoolSize() != null) {
                    return false;
                }
            } else if(!_maxShardDataChangeExecutorPoolSize.equals(other.getMaxShardDataChangeExecutorPoolSize())) {
                return false;
            }
            if (_maxShardDataChangeExecutorQueueSize == null) {
                if (other.getMaxShardDataChangeExecutorQueueSize() != null) {
                    return false;
                }
            } else if(!_maxShardDataChangeExecutorQueueSize.equals(other.getMaxShardDataChangeExecutorQueueSize())) {
                return false;
            }
            if (_maxShardDataChangeListenerQueueSize == null) {
                if (other.getMaxShardDataChangeListenerQueueSize() != null) {
                    return false;
                }
            } else if(!_maxShardDataChangeListenerQueueSize.equals(other.getMaxShardDataChangeListenerQueueSize())) {
                return false;
            }
            if (_maxShardDataStoreExecutorQueueSize == null) {
                if (other.getMaxShardDataStoreExecutorQueueSize() != null) {
                    return false;
                }
            } else if(!_maxShardDataStoreExecutorQueueSize.equals(other.getMaxShardDataStoreExecutorQueueSize())) {
                return false;
            }
            if (_operationTimeoutInSeconds == null) {
                if (other.getOperationTimeoutInSeconds() != null) {
                    return false;
                }
            } else if(!_operationTimeoutInSeconds.equals(other.getOperationTimeoutInSeconds())) {
                return false;
            }
            if (_shardHearbeatIntervalInMillis == null) {
                if (other.getShardHearbeatIntervalInMillis() != null) {
                    return false;
                }
            } else if(!_shardHearbeatIntervalInMillis.equals(other.getShardHearbeatIntervalInMillis())) {
                return false;
            }
            if (_shardInitializationTimeoutInSeconds == null) {
                if (other.getShardInitializationTimeoutInSeconds() != null) {
                    return false;
                }
            } else if(!_shardInitializationTimeoutInSeconds.equals(other.getShardInitializationTimeoutInSeconds())) {
                return false;
            }
            if (_shardIsolatedLeaderCheckIntervalInMillis == null) {
                if (other.getShardIsolatedLeaderCheckIntervalInMillis() != null) {
                    return false;
                }
            } else if(!_shardIsolatedLeaderCheckIntervalInMillis.equals(other.getShardIsolatedLeaderCheckIntervalInMillis())) {
                return false;
            }
            if (_shardJournalRecoveryLogBatchSize == null) {
                if (other.getShardJournalRecoveryLogBatchSize() != null) {
                    return false;
                }
            } else if(!_shardJournalRecoveryLogBatchSize.equals(other.getShardJournalRecoveryLogBatchSize())) {
                return false;
            }
            if (_shardLeaderElectionTimeoutInSeconds == null) {
                if (other.getShardLeaderElectionTimeoutInSeconds() != null) {
                    return false;
                }
            } else if(!_shardLeaderElectionTimeoutInSeconds.equals(other.getShardLeaderElectionTimeoutInSeconds())) {
                return false;
            }
            if (_shardSnapshotBatchCount == null) {
                if (other.getShardSnapshotBatchCount() != null) {
                    return false;
                }
            } else if(!_shardSnapshotBatchCount.equals(other.getShardSnapshotBatchCount())) {
                return false;
            }
            if (_shardSnapshotDataThresholdPercentage == null) {
                if (other.getShardSnapshotDataThresholdPercentage() != null) {
                    return false;
                }
            } else if(!_shardSnapshotDataThresholdPercentage.equals(other.getShardSnapshotDataThresholdPercentage())) {
                return false;
            }
            if (_shardTransactionCommitQueueCapacity == null) {
                if (other.getShardTransactionCommitQueueCapacity() != null) {
                    return false;
                }
            } else if(!_shardTransactionCommitQueueCapacity.equals(other.getShardTransactionCommitQueueCapacity())) {
                return false;
            }
            if (_shardTransactionCommitTimeoutInSeconds == null) {
                if (other.getShardTransactionCommitTimeoutInSeconds() != null) {
                    return false;
                }
            } else if(!_shardTransactionCommitTimeoutInSeconds.equals(other.getShardTransactionCommitTimeoutInSeconds())) {
                return false;
            }
            if (_shardTransactionIdleTimeoutInMinutes == null) {
                if (other.getShardTransactionIdleTimeoutInMinutes() != null) {
                    return false;
                }
            } else if(!_shardTransactionIdleTimeoutInMinutes.equals(other.getShardTransactionIdleTimeoutInMinutes())) {
                return false;
            }
            if (_enableMetricCapture == null) {
                if (other.isEnableMetricCapture() != null) {
                    return false;
                }
            } else if(!_enableMetricCapture.equals(other.isEnableMetricCapture())) {
                return false;
            }
            if (_persistent == null) {
                if (other.isPersistent() != null) {
                    return false;
                }
            } else if(!_persistent.equals(other.isPersistent())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OperationalPropertiesImpl otherImpl = (OperationalPropertiesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("OperationalProperties [");
            boolean first = true;
        
            if (_boundedMailboxCapacity != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_boundedMailboxCapacity=");
                builder.append(_boundedMailboxCapacity);
             }
            if (_maxShardDataChangeExecutorPoolSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxShardDataChangeExecutorPoolSize=");
                builder.append(_maxShardDataChangeExecutorPoolSize);
             }
            if (_maxShardDataChangeExecutorQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxShardDataChangeExecutorQueueSize=");
                builder.append(_maxShardDataChangeExecutorQueueSize);
             }
            if (_maxShardDataChangeListenerQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxShardDataChangeListenerQueueSize=");
                builder.append(_maxShardDataChangeListenerQueueSize);
             }
            if (_maxShardDataStoreExecutorQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxShardDataStoreExecutorQueueSize=");
                builder.append(_maxShardDataStoreExecutorQueueSize);
             }
            if (_operationTimeoutInSeconds != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_operationTimeoutInSeconds=");
                builder.append(_operationTimeoutInSeconds);
             }
            if (_shardHearbeatIntervalInMillis != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardHearbeatIntervalInMillis=");
                builder.append(_shardHearbeatIntervalInMillis);
             }
            if (_shardInitializationTimeoutInSeconds != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardInitializationTimeoutInSeconds=");
                builder.append(_shardInitializationTimeoutInSeconds);
             }
            if (_shardIsolatedLeaderCheckIntervalInMillis != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardIsolatedLeaderCheckIntervalInMillis=");
                builder.append(_shardIsolatedLeaderCheckIntervalInMillis);
             }
            if (_shardJournalRecoveryLogBatchSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardJournalRecoveryLogBatchSize=");
                builder.append(_shardJournalRecoveryLogBatchSize);
             }
            if (_shardLeaderElectionTimeoutInSeconds != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardLeaderElectionTimeoutInSeconds=");
                builder.append(_shardLeaderElectionTimeoutInSeconds);
             }
            if (_shardSnapshotBatchCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardSnapshotBatchCount=");
                builder.append(_shardSnapshotBatchCount);
             }
            if (_shardSnapshotDataThresholdPercentage != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardSnapshotDataThresholdPercentage=");
                builder.append(_shardSnapshotDataThresholdPercentage);
             }
            if (_shardTransactionCommitQueueCapacity != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardTransactionCommitQueueCapacity=");
                builder.append(_shardTransactionCommitQueueCapacity);
             }
            if (_shardTransactionCommitTimeoutInSeconds != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardTransactionCommitTimeoutInSeconds=");
                builder.append(_shardTransactionCommitTimeoutInSeconds);
             }
            if (_shardTransactionIdleTimeoutInMinutes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_shardTransactionIdleTimeoutInMinutes=");
                builder.append(_shardTransactionIdleTimeoutInMinutes);
             }
            if (_enableMetricCapture != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_enableMetricCapture=");
                builder.append(_enableMetricCapture);
             }
            if (_persistent != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_persistent=");
                builder.append(_persistent);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
