package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStatsKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats
 */
public class GroupStatsBuilder {

    private Buckets _buckets;
    private Counter64 _byteCount;
    private static List<Range<BigInteger>> _byteCount_range;
    private Duration _duration;
    private GroupId _groupId;
    private static List<Range<BigInteger>> _groupId_range;
    private GroupStatsKey _key;
    private Counter64 _packetCount;
    private static List<Range<BigInteger>> _packetCount_range;
    private Counter32 _refCount;
    private static List<Range<BigInteger>> _refCount_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> augmentation = new HashMap<>();

    public GroupStatsBuilder() {
    } 
    
    public GroupStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics arg) {
        this._groupId = arg.getGroupId();
        this._refCount = arg.getRefCount();
        this._packetCount = arg.getPacketCount();
        this._byteCount = arg.getByteCount();
        this._duration = arg.getDuration();
        this._buckets = arg.getBuckets();
    }

    public GroupStatsBuilder(GroupStats base) {
        if (base.getKey() == null) {
            this._key = new GroupStatsKey(
                base.getGroupId()
            );
            this._groupId = base.getGroupId();
        } else {
            this._key = base.getKey();
            this._groupId = _key.getGroupId();
        }
        this._buckets = base.getBuckets();
        this._byteCount = base.getByteCount();
        this._duration = base.getDuration();
        this._packetCount = base.getPacketCount();
        this._refCount = base.getRefCount();
        if (base instanceof GroupStatsImpl) {
            GroupStatsImpl _impl = (GroupStatsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics) {
            this._groupId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getGroupId();
            this._refCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getRefCount();
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getPacketCount();
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getByteCount();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getDuration();
            this._buckets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getBuckets();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public Buckets getBuckets() {
        return _buckets;
    }
    
    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public GroupId getGroupId() {
        return _groupId;
    }
    
    public GroupStatsKey getKey() {
        return _key;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    public Counter32 getRefCount() {
        return _refCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupStatsBuilder setBuckets(Buckets value) {
        this._buckets = value;
        return this;
    }
    
    public GroupStatsBuilder setByteCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _byteCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _byteCount_range));
            }
        }
        this._byteCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _byteCount_range() {
        if (_byteCount_range == null) {
            synchronized (GroupStatsBuilder.class) {
                if (_byteCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _byteCount_range = builder.build();
                }
            }
        }
        return _byteCount_range;
    }
    
    public GroupStatsBuilder setDuration(Duration value) {
        this._duration = value;
        return this;
    }
    
    public GroupStatsBuilder setGroupId(GroupId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _groupId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _groupId_range));
            }
        }
        this._groupId = value;
        return this;
    }
    public static List<Range<BigInteger>> _groupId_range() {
        if (_groupId_range == null) {
            synchronized (GroupStatsBuilder.class) {
                if (_groupId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _groupId_range = builder.build();
                }
            }
        }
        return _groupId_range;
    }
    
    public GroupStatsBuilder setKey(GroupStatsKey value) {
        this._key = value;
        return this;
    }
    
    public GroupStatsBuilder setPacketCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _packetCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _packetCount_range));
            }
        }
        this._packetCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _packetCount_range() {
        if (_packetCount_range == null) {
            synchronized (GroupStatsBuilder.class) {
                if (_packetCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _packetCount_range = builder.build();
                }
            }
        }
        return _packetCount_range;
    }
    
    public GroupStatsBuilder setRefCount(Counter32 value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _refCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _refCount_range));
            }
        }
        this._refCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _refCount_range() {
        if (_refCount_range == null) {
            synchronized (GroupStatsBuilder.class) {
                if (_refCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _refCount_range = builder.build();
                }
            }
        }
        return _refCount_range;
    }
    
    public GroupStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupStats build() {
        return new GroupStatsImpl(this);
    }

    private static final class GroupStatsImpl implements GroupStats {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats.class;
        }

        private final Buckets _buckets;
        private final Counter64 _byteCount;
        private final Duration _duration;
        private final GroupId _groupId;
        private final GroupStatsKey _key;
        private final Counter64 _packetCount;
        private final Counter32 _refCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> augmentation = new HashMap<>();

        private GroupStatsImpl(GroupStatsBuilder base) {
            if (base.getKey() == null) {
                this._key = new GroupStatsKey(
                    base.getGroupId()
                );
                this._groupId = base.getGroupId();
            } else {
                this._key = base.getKey();
                this._groupId = _key.getGroupId();
            }
            this._buckets = base.getBuckets();
            this._byteCount = base.getByteCount();
            this._duration = base.getDuration();
            this._packetCount = base.getPacketCount();
            this._refCount = base.getRefCount();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Buckets getBuckets() {
            return _buckets;
        }
        
        @Override
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public GroupId getGroupId() {
            return _groupId;
        }
        
        @Override
        public GroupStatsKey getKey() {
            return _key;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public Counter32 getRefCount() {
            return _refCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_buckets == null) ? 0 : _buckets.hashCode());
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
            result = prime * result + ((_refCount == null) ? 0 : _refCount.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats)obj;
            if (_buckets == null) {
                if (other.getBuckets() != null) {
                    return false;
                }
            } else if(!_buckets.equals(other.getBuckets())) {
                return false;
            }
            if (_byteCount == null) {
                if (other.getByteCount() != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other.getByteCount())) {
                return false;
            }
            if (_duration == null) {
                if (other.getDuration() != null) {
                    return false;
                }
            } else if(!_duration.equals(other.getDuration())) {
                return false;
            }
            if (_groupId == null) {
                if (other.getGroupId() != null) {
                    return false;
                }
            } else if(!_groupId.equals(other.getGroupId())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_packetCount == null) {
                if (other.getPacketCount() != null) {
                    return false;
                }
            } else if(!_packetCount.equals(other.getPacketCount())) {
                return false;
            }
            if (_refCount == null) {
                if (other.getRefCount() != null) {
                    return false;
                }
            } else if(!_refCount.equals(other.getRefCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GroupStatsImpl otherImpl = (GroupStatsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.reply.GroupStats>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("GroupStats [");
            boolean first = true;
        
            if (_buckets != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_buckets=");
                builder.append(_buckets);
             }
            if (_byteCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteCount=");
                builder.append(_byteCount);
             }
            if (_duration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_duration=");
                builder.append(_duration);
             }
            if (_groupId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupId=");
                builder.append(_groupId);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_packetCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetCount=");
                builder.append(_packetCount);
             }
            if (_refCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_refCount=");
                builder.append(_refCount);
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
