package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import java.util.Map;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStatsKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats
 */
public class MeterStatsBuilder {

    private Counter64 _byteInCount;
    private static List<Range<BigInteger>> _byteInCount_range;
    private Duration _duration;
    private Counter32 _flowCount;
    private static List<Range<BigInteger>> _flowCount_range;
    private MeterStatsKey _key;
    private MeterBandStats _meterBandStats;
    private MeterId _meterId;
    private static List<Range<BigInteger>> _meterId_range;
    private Counter64 _packetInCount;
    private static List<Range<BigInteger>> _packetInCount_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> augmentation = new HashMap<>();

    public MeterStatsBuilder() {
    } 
    
    public MeterStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics arg) {
        this._meterId = arg.getMeterId();
        this._flowCount = arg.getFlowCount();
        this._packetInCount = arg.getPacketInCount();
        this._byteInCount = arg.getByteInCount();
        this._duration = arg.getDuration();
        this._meterBandStats = arg.getMeterBandStats();
    }

    public MeterStatsBuilder(MeterStats base) {
        if (base.getKey() == null) {
            this._key = new MeterStatsKey(
                base.getMeterId()
            );
            this._meterId = base.getMeterId();
        } else {
            this._key = base.getKey();
            this._meterId = _key.getMeterId();
        }
        this._byteInCount = base.getByteInCount();
        this._duration = base.getDuration();
        this._flowCount = base.getFlowCount();
        this._meterBandStats = base.getMeterBandStats();
        this._packetInCount = base.getPacketInCount();
        if (base instanceof MeterStatsImpl) {
            MeterStatsImpl _impl = (MeterStatsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics) {
            this._meterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getMeterId();
            this._flowCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getFlowCount();
            this._packetInCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getPacketInCount();
            this._byteInCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getByteInCount();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getDuration();
            this._meterBandStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getMeterBandStats();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public Counter64 getByteInCount() {
        return _byteInCount;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public Counter32 getFlowCount() {
        return _flowCount;
    }
    
    public MeterStatsKey getKey() {
        return _key;
    }
    
    public MeterBandStats getMeterBandStats() {
        return _meterBandStats;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    public Counter64 getPacketInCount() {
        return _packetInCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterStatsBuilder setByteInCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _byteInCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _byteInCount_range));
            }
        }
        this._byteInCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _byteInCount_range() {
        if (_byteInCount_range == null) {
            synchronized (MeterStatsBuilder.class) {
                if (_byteInCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _byteInCount_range = builder.build();
                }
            }
        }
        return _byteInCount_range;
    }
    
    public MeterStatsBuilder setDuration(Duration value) {
        this._duration = value;
        return this;
    }
    
    public MeterStatsBuilder setFlowCount(Counter32 value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _flowCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _flowCount_range));
            }
        }
        this._flowCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _flowCount_range() {
        if (_flowCount_range == null) {
            synchronized (MeterStatsBuilder.class) {
                if (_flowCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _flowCount_range = builder.build();
                }
            }
        }
        return _flowCount_range;
    }
    
    public MeterStatsBuilder setKey(MeterStatsKey value) {
        this._key = value;
        return this;
    }
    
    public MeterStatsBuilder setMeterBandStats(MeterBandStats value) {
        this._meterBandStats = value;
        return this;
    }
    
    public MeterStatsBuilder setMeterId(MeterId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _meterId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _meterId_range));
            }
        }
        this._meterId = value;
        return this;
    }
    public static List<Range<BigInteger>> _meterId_range() {
        if (_meterId_range == null) {
            synchronized (MeterStatsBuilder.class) {
                if (_meterId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _meterId_range = builder.build();
                }
            }
        }
        return _meterId_range;
    }
    
    public MeterStatsBuilder setPacketInCount(Counter64 value) {
        if (value != null) {
            BigInteger _constraint = value.getValue();
            boolean isValidRange = false;
            for (Range<BigInteger> r : _packetInCount_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _packetInCount_range));
            }
        }
        this._packetInCount = value;
        return this;
    }
    public static List<Range<BigInteger>> _packetInCount_range() {
        if (_packetInCount_range == null) {
            synchronized (MeterStatsBuilder.class) {
                if (_packetInCount_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _packetInCount_range = builder.build();
                }
            }
        }
        return _packetInCount_range;
    }
    
    public MeterStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterStats build() {
        return new MeterStatsImpl(this);
    }

    private static final class MeterStatsImpl implements MeterStats {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats.class;
        }

        private final Counter64 _byteInCount;
        private final Duration _duration;
        private final Counter32 _flowCount;
        private final MeterStatsKey _key;
        private final MeterBandStats _meterBandStats;
        private final MeterId _meterId;
        private final Counter64 _packetInCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> augmentation = new HashMap<>();

        private MeterStatsImpl(MeterStatsBuilder base) {
            if (base.getKey() == null) {
                this._key = new MeterStatsKey(
                    base.getMeterId()
                );
                this._meterId = base.getMeterId();
            } else {
                this._key = base.getKey();
                this._meterId = _key.getMeterId();
            }
            this._byteInCount = base.getByteInCount();
            this._duration = base.getDuration();
            this._flowCount = base.getFlowCount();
            this._meterBandStats = base.getMeterBandStats();
            this._packetInCount = base.getPacketInCount();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Counter64 getByteInCount() {
            return _byteInCount;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public Counter32 getFlowCount() {
            return _flowCount;
        }
        
        @Override
        public MeterStatsKey getKey() {
            return _key;
        }
        
        @Override
        public MeterBandStats getMeterBandStats() {
            return _meterBandStats;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @Override
        public Counter64 getPacketInCount() {
            return _packetInCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_byteInCount == null) ? 0 : _byteInCount.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
            result = prime * result + ((_flowCount == null) ? 0 : _flowCount.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_meterBandStats == null) ? 0 : _meterBandStats.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((_packetInCount == null) ? 0 : _packetInCount.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats)obj;
            if (_byteInCount == null) {
                if (other.getByteInCount() != null) {
                    return false;
                }
            } else if(!_byteInCount.equals(other.getByteInCount())) {
                return false;
            }
            if (_duration == null) {
                if (other.getDuration() != null) {
                    return false;
                }
            } else if(!_duration.equals(other.getDuration())) {
                return false;
            }
            if (_flowCount == null) {
                if (other.getFlowCount() != null) {
                    return false;
                }
            } else if(!_flowCount.equals(other.getFlowCount())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_meterBandStats == null) {
                if (other.getMeterBandStats() != null) {
                    return false;
                }
            } else if(!_meterBandStats.equals(other.getMeterBandStats())) {
                return false;
            }
            if (_meterId == null) {
                if (other.getMeterId() != null) {
                    return false;
                }
            } else if(!_meterId.equals(other.getMeterId())) {
                return false;
            }
            if (_packetInCount == null) {
                if (other.getPacketInCount() != null) {
                    return false;
                }
            } else if(!_packetInCount.equals(other.getPacketInCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MeterStatsImpl otherImpl = (MeterStatsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MeterStats [");
            boolean first = true;
        
            if (_byteInCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteInCount=");
                builder.append(_byteInCount);
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
            if (_flowCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCount=");
                builder.append(_flowCount);
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
            if (_meterBandStats != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandStats=");
                builder.append(_meterBandStats);
             }
            if (_meterId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterId=");
                builder.append(_meterId);
             }
            if (_packetInCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetInCount=");
                builder.append(_packetInCount);
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
