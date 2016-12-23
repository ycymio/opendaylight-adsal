package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders;
import java.math.BigInteger;
import com.google.common.collect.ImmutableList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStatsKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats
 */
public class MeterConfigStatsBuilder {

    private java.lang.String _containerName;
    private MeterFlags _flags;
    private MeterConfigStatsKey _key;
    private MeterBandHeaders _meterBandHeaders;
    private MeterId _meterId;
    private static List<Range<BigInteger>> _meterId_range;
    private java.lang.String _meterName;
    private java.lang.Boolean _barrier;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> augmentation = new HashMap<>();

    public MeterConfigStatsBuilder() {
    } 
    
    public MeterConfigStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter arg) {
        this._flags = arg.getFlags();
        this._meterId = arg.getMeterId();
        this._barrier = arg.isBarrier();
        this._meterName = arg.getMeterName();
        this._containerName = arg.getContainerName();
        this._meterBandHeaders = arg.getMeterBandHeaders();
    }

    public MeterConfigStatsBuilder(MeterConfigStats base) {
        if (base.getKey() == null) {
            this._key = new MeterConfigStatsKey(
                base.getMeterId()
            );
            this._meterId = base.getMeterId();
        } else {
            this._key = base.getKey();
            this._meterId = _key.getMeterId();
        }
        this._containerName = base.getContainerName();
        this._flags = base.getFlags();
        this._meterBandHeaders = base.getMeterBandHeaders();
        this._meterName = base.getMeterName();
        this._barrier = base.isBarrier();
        if (base instanceof MeterConfigStatsImpl) {
            MeterConfigStatsImpl _impl = (MeterConfigStatsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter) {
            this._flags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getFlags();
            this._meterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterId();
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).isBarrier();
            this._meterName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterName();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getContainerName();
            this._meterBandHeaders = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterBandHeaders();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getContainerName() {
        return _containerName;
    }
    
    public MeterFlags getFlags() {
        return _flags;
    }
    
    public MeterConfigStatsKey getKey() {
        return _key;
    }
    
    public MeterBandHeaders getMeterBandHeaders() {
        return _meterBandHeaders;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    public java.lang.String getMeterName() {
        return _meterName;
    }
    
    public java.lang.Boolean isBarrier() {
        return _barrier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterConfigStatsBuilder setContainerName(java.lang.String value) {
        this._containerName = value;
        return this;
    }
    
    public MeterConfigStatsBuilder setFlags(MeterFlags value) {
        this._flags = value;
        return this;
    }
    
    public MeterConfigStatsBuilder setKey(MeterConfigStatsKey value) {
        this._key = value;
        return this;
    }
    
    public MeterConfigStatsBuilder setMeterBandHeaders(MeterBandHeaders value) {
        this._meterBandHeaders = value;
        return this;
    }
    
    public MeterConfigStatsBuilder setMeterId(MeterId value) {
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
            synchronized (MeterConfigStatsBuilder.class) {
                if (_meterId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _meterId_range = builder.build();
                }
            }
        }
        return _meterId_range;
    }
    
    public MeterConfigStatsBuilder setMeterName(java.lang.String value) {
        this._meterName = value;
        return this;
    }
    
    public MeterConfigStatsBuilder setBarrier(java.lang.Boolean value) {
        this._barrier = value;
        return this;
    }
    
    public MeterConfigStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterConfigStats build() {
        return new MeterConfigStatsImpl(this);
    }

    private static final class MeterConfigStatsImpl implements MeterConfigStats {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats.class;
        }

        private final java.lang.String _containerName;
        private final MeterFlags _flags;
        private final MeterConfigStatsKey _key;
        private final MeterBandHeaders _meterBandHeaders;
        private final MeterId _meterId;
        private final java.lang.String _meterName;
        private final java.lang.Boolean _barrier;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> augmentation = new HashMap<>();

        private MeterConfigStatsImpl(MeterConfigStatsBuilder base) {
            if (base.getKey() == null) {
                this._key = new MeterConfigStatsKey(
                    base.getMeterId()
                );
                this._meterId = base.getMeterId();
            } else {
                this._key = base.getKey();
                this._meterId = _key.getMeterId();
            }
            this._containerName = base.getContainerName();
            this._flags = base.getFlags();
            this._meterBandHeaders = base.getMeterBandHeaders();
            this._meterName = base.getMeterName();
            this._barrier = base.isBarrier();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getContainerName() {
            return _containerName;
        }
        
        @Override
        public MeterFlags getFlags() {
            return _flags;
        }
        
        @Override
        public MeterConfigStatsKey getKey() {
            return _key;
        }
        
        @Override
        public MeterBandHeaders getMeterBandHeaders() {
            return _meterBandHeaders;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @Override
        public java.lang.String getMeterName() {
            return _meterName;
        }
        
        @Override
        public java.lang.Boolean isBarrier() {
            return _barrier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_flags == null) ? 0 : _flags.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_meterBandHeaders == null) ? 0 : _meterBandHeaders.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((_meterName == null) ? 0 : _meterName.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats)obj;
            if (_containerName == null) {
                if (other.getContainerName() != null) {
                    return false;
                }
            } else if(!_containerName.equals(other.getContainerName())) {
                return false;
            }
            if (_flags == null) {
                if (other.getFlags() != null) {
                    return false;
                }
            } else if(!_flags.equals(other.getFlags())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_meterBandHeaders == null) {
                if (other.getMeterBandHeaders() != null) {
                    return false;
                }
            } else if(!_meterBandHeaders.equals(other.getMeterBandHeaders())) {
                return false;
            }
            if (_meterId == null) {
                if (other.getMeterId() != null) {
                    return false;
                }
            } else if(!_meterId.equals(other.getMeterId())) {
                return false;
            }
            if (_meterName == null) {
                if (other.getMeterName() != null) {
                    return false;
                }
            } else if(!_meterName.equals(other.getMeterName())) {
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
                MeterConfigStatsImpl otherImpl = (MeterConfigStatsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.config.stats.reply.MeterConfigStats>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MeterConfigStats [");
            boolean first = true;
        
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
             }
            if (_flags != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flags=");
                builder.append(_flags);
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
            if (_meterBandHeaders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandHeaders=");
                builder.append(_meterBandHeaders);
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
            if (_meterName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterName=");
                builder.append(_meterName);
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
