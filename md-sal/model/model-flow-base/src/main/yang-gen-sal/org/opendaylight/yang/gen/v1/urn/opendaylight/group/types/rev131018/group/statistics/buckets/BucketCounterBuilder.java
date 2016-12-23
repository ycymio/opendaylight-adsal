package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounterKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter
 */
public class BucketCounterBuilder {

    private BucketId _bucketId;
    private static List<Range<BigInteger>> _bucketId_range;
    private Counter64 _byteCount;
    private static List<Range<BigInteger>> _byteCount_range;
    private BucketCounterKey _key;
    private Counter64 _packetCount;
    private static List<Range<BigInteger>> _packetCount_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentation = new HashMap<>();

    public BucketCounterBuilder() {
    } 

    public BucketCounterBuilder(BucketCounter base) {
        if (base.getKey() == null) {
            this._key = new BucketCounterKey(
                base.getBucketId()
            );
            this._bucketId = base.getBucketId();
        } else {
            this._key = base.getKey();
            this._bucketId = _key.getBucketId();
        }
        this._byteCount = base.getByteCount();
        this._packetCount = base.getPacketCount();
        if (base instanceof BucketCounterImpl) {
            BucketCounterImpl _impl = (BucketCounterImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public BucketId getBucketId() {
        return _bucketId;
    }
    
    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public BucketCounterKey getKey() {
        return _key;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BucketCounterBuilder setBucketId(BucketId value) {
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
            synchronized (BucketCounterBuilder.class) {
                if (_bucketId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bucketId_range = builder.build();
                }
            }
        }
        return _bucketId_range;
    }
    
    public BucketCounterBuilder setByteCount(Counter64 value) {
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
            synchronized (BucketCounterBuilder.class) {
                if (_byteCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _byteCount_range = builder.build();
                }
            }
        }
        return _byteCount_range;
    }
    
    public BucketCounterBuilder setKey(BucketCounterKey value) {
        this._key = value;
        return this;
    }
    
    public BucketCounterBuilder setPacketCount(Counter64 value) {
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
            synchronized (BucketCounterBuilder.class) {
                if (_packetCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _packetCount_range = builder.build();
                }
            }
        }
        return _packetCount_range;
    }
    
    public BucketCounterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BucketCounter build() {
        return new BucketCounterImpl(this);
    }

    private static final class BucketCounterImpl implements BucketCounter {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter.class;
        }

        private final BucketId _bucketId;
        private final Counter64 _byteCount;
        private final BucketCounterKey _key;
        private final Counter64 _packetCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentation = new HashMap<>();

        private BucketCounterImpl(BucketCounterBuilder base) {
            if (base.getKey() == null) {
                this._key = new BucketCounterKey(
                    base.getBucketId()
                );
                this._bucketId = base.getBucketId();
            } else {
                this._key = base.getKey();
                this._bucketId = _key.getBucketId();
            }
            this._byteCount = base.getByteCount();
            this._packetCount = base.getPacketCount();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public BucketId getBucketId() {
            return _bucketId;
        }
        
        @Override
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public BucketCounterKey getKey() {
            return _key;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bucketId == null) ? 0 : _bucketId.hashCode());
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter other = (org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter)obj;
            if (_bucketId == null) {
                if (other.getBucketId() != null) {
                    return false;
                }
            } else if(!_bucketId.equals(other.getBucketId())) {
                return false;
            }
            if (_byteCount == null) {
                if (other.getByteCount() != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other.getByteCount())) {
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BucketCounterImpl otherImpl = (BucketCounterImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("BucketCounter [");
            boolean first = true;
        
            if (_bucketId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bucketId=");
                builder.append(_bucketId);
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
