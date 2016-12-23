package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.BucketKey;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket
 */
public class BucketBuilder {

    private List<Action> _action;
    private BucketId _bucketId;
    private static List<Range<BigInteger>> _bucketId_range;
    private BucketKey _key;
    private java.lang.Long _watchGroup;
    private static List<Range<BigInteger>> _watchGroup_range;
    private java.lang.Long _watchPort;
    private static List<Range<BigInteger>> _watchPort_range;
    private java.lang.Integer _weight;
    private static List<Range<BigInteger>> _weight_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentation = new HashMap<>();

    public BucketBuilder() {
    } 
    
    public BucketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList arg) {
        this._action = arg.getAction();
    }

    public BucketBuilder(Bucket base) {
        if (base.getKey() == null) {
            this._key = new BucketKey(
                base.getBucketId()
            );
            this._bucketId = base.getBucketId();
        } else {
            this._key = base.getKey();
            this._bucketId = _key.getBucketId();
        }
        this._action = base.getAction();
        this._watchGroup = base.getWatchGroup();
        this._watchPort = base.getWatchPort();
        this._weight = base.getWeight();
        if (base instanceof BucketImpl) {
            BucketImpl _impl = (BucketImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList) {
            this._action = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList)arg).getAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Action> getAction() {
        return _action;
    }
    
    public BucketId getBucketId() {
        return _bucketId;
    }
    
    public BucketKey getKey() {
        return _key;
    }
    
    public java.lang.Long getWatchGroup() {
        return _watchGroup;
    }
    
    public java.lang.Long getWatchPort() {
        return _watchPort;
    }
    
    public java.lang.Integer getWeight() {
        return _weight;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BucketBuilder setAction(List<Action> value) {
        this._action = value;
        return this;
    }
    
    public BucketBuilder setBucketId(BucketId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _bucketId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _bucketId_range));
            }
        }
        this._bucketId = value;
        return this;
    }
    public static List<Range<BigInteger>> _bucketId_range() {
        if (_bucketId_range == null) {
            synchronized (BucketBuilder.class) {
                if (_bucketId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bucketId_range = builder.build();
                }
            }
        }
        return _bucketId_range;
    }
    
    public BucketBuilder setKey(BucketKey value) {
        this._key = value;
        return this;
    }
    
    public BucketBuilder setWatchGroup(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _watchGroup_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _watchGroup_range));
            }
        }
        this._watchGroup = value;
        return this;
    }
    public static List<Range<BigInteger>> _watchGroup_range() {
        if (_watchGroup_range == null) {
            synchronized (BucketBuilder.class) {
                if (_watchGroup_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _watchGroup_range = builder.build();
                }
            }
        }
        return _watchGroup_range;
    }
    
    public BucketBuilder setWatchPort(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _watchPort_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _watchPort_range));
            }
        }
        this._watchPort = value;
        return this;
    }
    public static List<Range<BigInteger>> _watchPort_range() {
        if (_watchPort_range == null) {
            synchronized (BucketBuilder.class) {
                if (_watchPort_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _watchPort_range = builder.build();
                }
            }
        }
        return _watchPort_range;
    }
    
    public BucketBuilder setWeight(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _weight_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _weight_range));
            }
        }
        this._weight = value;
        return this;
    }
    public static List<Range<BigInteger>> _weight_range() {
        if (_weight_range == null) {
            synchronized (BucketBuilder.class) {
                if (_weight_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _weight_range = builder.build();
                }
            }
        }
        return _weight_range;
    }
    
    public BucketBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Bucket build() {
        return new BucketImpl(this);
    }

    private static final class BucketImpl implements Bucket {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket.class;
        }

        private final List<Action> _action;
        private final BucketId _bucketId;
        private final BucketKey _key;
        private final java.lang.Long _watchGroup;
        private final java.lang.Long _watchPort;
        private final java.lang.Integer _weight;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentation = new HashMap<>();

        private BucketImpl(BucketBuilder base) {
            if (base.getKey() == null) {
                this._key = new BucketKey(
                    base.getBucketId()
                );
                this._bucketId = base.getBucketId();
            } else {
                this._key = base.getKey();
                this._bucketId = _key.getBucketId();
            }
            this._action = base.getAction();
            this._watchGroup = base.getWatchGroup();
            this._watchPort = base.getWatchPort();
            this._weight = base.getWeight();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<Action> getAction() {
            return _action;
        }
        
        @Override
        public BucketId getBucketId() {
            return _bucketId;
        }
        
        @Override
        public BucketKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getWatchGroup() {
            return _watchGroup;
        }
        
        @Override
        public java.lang.Long getWatchPort() {
            return _watchPort;
        }
        
        @Override
        public java.lang.Integer getWeight() {
            return _weight;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
            result = prime * result + ((_bucketId == null) ? 0 : _bucketId.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_watchGroup == null) ? 0 : _watchGroup.hashCode());
            result = prime * result + ((_watchPort == null) ? 0 : _watchPort.hashCode());
            result = prime * result + ((_weight == null) ? 0 : _weight.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket other = (org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket)obj;
            if (_action == null) {
                if (other.getAction() != null) {
                    return false;
                }
            } else if(!_action.equals(other.getAction())) {
                return false;
            }
            if (_bucketId == null) {
                if (other.getBucketId() != null) {
                    return false;
                }
            } else if(!_bucketId.equals(other.getBucketId())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_watchGroup == null) {
                if (other.getWatchGroup() != null) {
                    return false;
                }
            } else if(!_watchGroup.equals(other.getWatchGroup())) {
                return false;
            }
            if (_watchPort == null) {
                if (other.getWatchPort() != null) {
                    return false;
                }
            } else if(!_watchPort.equals(other.getWatchPort())) {
                return false;
            }
            if (_weight == null) {
                if (other.getWeight() != null) {
                    return false;
                }
            } else if(!_weight.equals(other.getWeight())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BucketImpl otherImpl = (BucketImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Bucket [");
            boolean first = true;
        
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
             }
            if (_bucketId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bucketId=");
                builder.append(_bucketId);
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
            if (_watchGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_watchGroup=");
                builder.append(_watchGroup);
             }
            if (_watchPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_watchPort=");
                builder.append(_watchPort);
             }
            if (_weight != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_weight=");
                builder.append(_weight);
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
