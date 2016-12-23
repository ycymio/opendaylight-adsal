package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStatKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat
 */
public class BandStatBuilder {

    private BandId _bandId;
    private static List<Range<BigInteger>> _bandId_range;
    private Counter64 _byteBandCount;
    private static List<Range<BigInteger>> _byteBandCount_range;
    private BandStatKey _key;
    private Counter64 _packetBandCount;
    private static List<Range<BigInteger>> _packetBandCount_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentation = new HashMap<>();

    public BandStatBuilder() {
    } 

    public BandStatBuilder(BandStat base) {
        if (base.getKey() == null) {
            this._key = new BandStatKey(
                base.getBandId()
            );
            this._bandId = base.getBandId();
        } else {
            this._key = base.getKey();
            this._bandId = _key.getBandId();
        }
        this._byteBandCount = base.getByteBandCount();
        this._packetBandCount = base.getPacketBandCount();
        if (base instanceof BandStatImpl) {
            BandStatImpl _impl = (BandStatImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public BandId getBandId() {
        return _bandId;
    }
    
    public Counter64 getByteBandCount() {
        return _byteBandCount;
    }
    
    public BandStatKey getKey() {
        return _key;
    }
    
    public Counter64 getPacketBandCount() {
        return _packetBandCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BandStatBuilder setBandId(BandId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _bandId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _bandId_range));
            }
        }
        this._bandId = value;
        return this;
    }
    public static List<Range<BigInteger>> _bandId_range() {
        if (_bandId_range == null) {
            synchronized (BandStatBuilder.class) {
                if (_bandId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bandId_range = builder.build();
                }
            }
        }
        return _bandId_range;
    }
    
    public BandStatBuilder setByteBandCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _byteBandCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _byteBandCount_range));
            }
        }
        this._byteBandCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _byteBandCount_range() {
        if (_byteBandCount_range == null) {
            synchronized (BandStatBuilder.class) {
                if (_byteBandCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _byteBandCount_range = builder.build();
                }
            }
        }
        return _byteBandCount_range;
    }
    
    public BandStatBuilder setKey(BandStatKey value) {
        this._key = value;
        return this;
    }
    
    public BandStatBuilder setPacketBandCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _packetBandCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _packetBandCount_range));
            }
        }
        this._packetBandCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _packetBandCount_range() {
        if (_packetBandCount_range == null) {
            synchronized (BandStatBuilder.class) {
                if (_packetBandCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _packetBandCount_range = builder.build();
                }
            }
        }
        return _packetBandCount_range;
    }
    
    public BandStatBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BandStat build() {
        return new BandStatImpl(this);
    }

    private static final class BandStatImpl implements BandStat {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat.class;
        }

        private final BandId _bandId;
        private final Counter64 _byteBandCount;
        private final BandStatKey _key;
        private final Counter64 _packetBandCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentation = new HashMap<>();

        private BandStatImpl(BandStatBuilder base) {
            if (base.getKey() == null) {
                this._key = new BandStatKey(
                    base.getBandId()
                );
                this._bandId = base.getBandId();
            } else {
                this._key = base.getKey();
                this._bandId = _key.getBandId();
            }
            this._byteBandCount = base.getByteBandCount();
            this._packetBandCount = base.getPacketBandCount();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public BandId getBandId() {
            return _bandId;
        }
        
        @Override
        public Counter64 getByteBandCount() {
            return _byteBandCount;
        }
        
        @Override
        public BandStatKey getKey() {
            return _key;
        }
        
        @Override
        public Counter64 getPacketBandCount() {
            return _packetBandCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bandId == null) ? 0 : _bandId.hashCode());
            result = prime * result + ((_byteBandCount == null) ? 0 : _byteBandCount.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_packetBandCount == null) ? 0 : _packetBandCount.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat)obj;
            if (_bandId == null) {
                if (other.getBandId() != null) {
                    return false;
                }
            } else if(!_bandId.equals(other.getBandId())) {
                return false;
            }
            if (_byteBandCount == null) {
                if (other.getByteBandCount() != null) {
                    return false;
                }
            } else if(!_byteBandCount.equals(other.getByteBandCount())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_packetBandCount == null) {
                if (other.getPacketBandCount() != null) {
                    return false;
                }
            } else if(!_packetBandCount.equals(other.getPacketBandCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BandStatImpl otherImpl = (BandStatImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("BandStat [");
            boolean first = true;
        
            if (_bandId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandId=");
                builder.append(_bandId);
             }
            if (_byteBandCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteBandCount=");
                builder.append(_byteBandCount);
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
            if (_packetBandCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetBandCount=");
                builder.append(_packetBandCount);
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
