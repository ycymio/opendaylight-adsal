package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupTypes;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStatsKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats
 */
public class GroupDescStatsBuilder {

    private Buckets _buckets;
    private java.lang.String _containerName;
    private GroupId _groupId;
    private static List<Range<BigInteger>> _groupId_range;
    private java.lang.String _groupName;
    private GroupTypes _groupType;
    private GroupDescStatsKey _key;
    private java.lang.Boolean _barrier;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> augmentation = new HashMap<>();

    public GroupDescStatsBuilder() {
    } 
    
    public GroupDescStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group arg) {
        this._groupType = arg.getGroupType();
        this._groupId = arg.getGroupId();
        this._groupName = arg.getGroupName();
        this._containerName = arg.getContainerName();
        this._barrier = arg.isBarrier();
        this._buckets = arg.getBuckets();
    }

    public GroupDescStatsBuilder(GroupDescStats base) {
        if (base.getKey() == null) {
            this._key = new GroupDescStatsKey(
                base.getGroupId()
            );
            this._groupId = base.getGroupId();
        } else {
            this._key = base.getKey();
            this._groupId = _key.getGroupId();
        }
        this._buckets = base.getBuckets();
        this._containerName = base.getContainerName();
        this._groupName = base.getGroupName();
        this._groupType = base.getGroupType();
        this._barrier = base.isBarrier();
        if (base instanceof GroupDescStatsImpl) {
            GroupDescStatsImpl _impl = (GroupDescStatsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group) {
            this._groupType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupType();
            this._groupId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupId();
            this._groupName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupName();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getContainerName();
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).isBarrier();
            this._buckets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getBuckets();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group] \n" +
              "but was: " + arg
            );
        }
    }

    public Buckets getBuckets() {
        return _buckets;
    }
    
    public java.lang.String getContainerName() {
        return _containerName;
    }
    
    public GroupId getGroupId() {
        return _groupId;
    }
    
    public java.lang.String getGroupName() {
        return _groupName;
    }
    
    public GroupTypes getGroupType() {
        return _groupType;
    }
    
    public GroupDescStatsKey getKey() {
        return _key;
    }
    
    public java.lang.Boolean isBarrier() {
        return _barrier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupDescStatsBuilder setBuckets(Buckets value) {
        this._buckets = value;
        return this;
    }
    
    public GroupDescStatsBuilder setContainerName(java.lang.String value) {
        this._containerName = value;
        return this;
    }
    
    public GroupDescStatsBuilder setGroupId(GroupId value) {
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
            synchronized (GroupDescStatsBuilder.class) {
                if (_groupId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _groupId_range = builder.build();
                }
            }
        }
        return _groupId_range;
    }
    
    public GroupDescStatsBuilder setGroupName(java.lang.String value) {
        this._groupName = value;
        return this;
    }
    
    public GroupDescStatsBuilder setGroupType(GroupTypes value) {
        this._groupType = value;
        return this;
    }
    
    public GroupDescStatsBuilder setKey(GroupDescStatsKey value) {
        this._key = value;
        return this;
    }
    
    public GroupDescStatsBuilder setBarrier(java.lang.Boolean value) {
        this._barrier = value;
        return this;
    }
    
    public GroupDescStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupDescStats build() {
        return new GroupDescStatsImpl(this);
    }

    private static final class GroupDescStatsImpl implements GroupDescStats {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats.class;
        }

        private final Buckets _buckets;
        private final java.lang.String _containerName;
        private final GroupId _groupId;
        private final java.lang.String _groupName;
        private final GroupTypes _groupType;
        private final GroupDescStatsKey _key;
        private final java.lang.Boolean _barrier;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> augmentation = new HashMap<>();

        private GroupDescStatsImpl(GroupDescStatsBuilder base) {
            if (base.getKey() == null) {
                this._key = new GroupDescStatsKey(
                    base.getGroupId()
                );
                this._groupId = base.getGroupId();
            } else {
                this._key = base.getKey();
                this._groupId = _key.getGroupId();
            }
            this._buckets = base.getBuckets();
            this._containerName = base.getContainerName();
            this._groupName = base.getGroupName();
            this._groupType = base.getGroupType();
            this._barrier = base.isBarrier();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>singletonMap(e.getKey(), e.getValue());       
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
        public java.lang.String getContainerName() {
            return _containerName;
        }
        
        @Override
        public GroupId getGroupId() {
            return _groupId;
        }
        
        @Override
        public java.lang.String getGroupName() {
            return _groupName;
        }
        
        @Override
        public GroupTypes getGroupType() {
            return _groupType;
        }
        
        @Override
        public GroupDescStatsKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Boolean isBarrier() {
            return _barrier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_groupName == null) ? 0 : _groupName.hashCode());
            result = prime * result + ((_groupType == null) ? 0 : _groupType.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats)obj;
            if (_buckets == null) {
                if (other.getBuckets() != null) {
                    return false;
                }
            } else if(!_buckets.equals(other.getBuckets())) {
                return false;
            }
            if (_containerName == null) {
                if (other.getContainerName() != null) {
                    return false;
                }
            } else if(!_containerName.equals(other.getContainerName())) {
                return false;
            }
            if (_groupId == null) {
                if (other.getGroupId() != null) {
                    return false;
                }
            } else if(!_groupId.equals(other.getGroupId())) {
                return false;
            }
            if (_groupName == null) {
                if (other.getGroupName() != null) {
                    return false;
                }
            } else if(!_groupName.equals(other.getGroupName())) {
                return false;
            }
            if (_groupType == null) {
                if (other.getGroupType() != null) {
                    return false;
                }
            } else if(!_groupType.equals(other.getGroupType())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_barrier == null) {
                if (other.isBarrier() != null) {
                    return false;
                }
            } else if(!_barrier.equals(other.isBarrier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GroupDescStatsImpl otherImpl = (GroupDescStatsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("GroupDescStats [");
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
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
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
            if (_groupName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupName=");
                builder.append(_groupName);
             }
            if (_groupType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupType=");
                builder.append(_groupType);
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
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
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
