package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark
 */
public class DscpRemarkBuilder {

    private java.lang.Long _dscpRemarkBurstSize;
    private static List<Range<BigInteger>> _dscpRemarkBurstSize_range;
    private java.lang.Long _dscpRemarkRate;
    private static List<Range<BigInteger>> _dscpRemarkRate_range;
    private java.lang.Short _percLevel;
    private static List<Range<BigInteger>> _percLevel_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentation = new HashMap<>();

    public DscpRemarkBuilder() {
    } 
    

    public DscpRemarkBuilder(DscpRemark base) {
        this._dscpRemarkBurstSize = base.getDscpRemarkBurstSize();
        this._dscpRemarkRate = base.getDscpRemarkRate();
        this._percLevel = base.getPercLevel();
        if (base instanceof DscpRemarkImpl) {
            DscpRemarkImpl _impl = (DscpRemarkImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getDscpRemarkBurstSize() {
        return _dscpRemarkBurstSize;
    }
    
    public java.lang.Long getDscpRemarkRate() {
        return _dscpRemarkRate;
    }
    
    public java.lang.Short getPercLevel() {
        return _percLevel;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DscpRemarkBuilder setDscpRemarkBurstSize(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _dscpRemarkBurstSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _dscpRemarkBurstSize_range));
            }
        }
        this._dscpRemarkBurstSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _dscpRemarkBurstSize_range() {
        if (_dscpRemarkBurstSize_range == null) {
            synchronized (DscpRemarkBuilder.class) {
                if (_dscpRemarkBurstSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _dscpRemarkBurstSize_range = builder.build();
                }
            }
        }
        return _dscpRemarkBurstSize_range;
    }
    
    public DscpRemarkBuilder setDscpRemarkRate(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _dscpRemarkRate_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _dscpRemarkRate_range));
            }
        }
        this._dscpRemarkRate = value;
        return this;
    }
    public static List<Range<BigInteger>> _dscpRemarkRate_range() {
        if (_dscpRemarkRate_range == null) {
            synchronized (DscpRemarkBuilder.class) {
                if (_dscpRemarkRate_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _dscpRemarkRate_range = builder.build();
                }
            }
        }
        return _dscpRemarkRate_range;
    }
    
    public DscpRemarkBuilder setPercLevel(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _percLevel_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _percLevel_range));
            }
        }
        this._percLevel = value;
        return this;
    }
    public static List<Range<BigInteger>> _percLevel_range() {
        if (_percLevel_range == null) {
            synchronized (DscpRemarkBuilder.class) {
                if (_percLevel_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _percLevel_range = builder.build();
                }
            }
        }
        return _percLevel_range;
    }
    
    public DscpRemarkBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DscpRemark build() {
        return new DscpRemarkImpl(this);
    }

    private static final class DscpRemarkImpl implements DscpRemark {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark.class;
        }

        private final java.lang.Long _dscpRemarkBurstSize;
        private final java.lang.Long _dscpRemarkRate;
        private final java.lang.Short _percLevel;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentation = new HashMap<>();

        private DscpRemarkImpl(DscpRemarkBuilder base) {
            this._dscpRemarkBurstSize = base.getDscpRemarkBurstSize();
            this._dscpRemarkRate = base.getDscpRemarkRate();
            this._percLevel = base.getPercLevel();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getDscpRemarkBurstSize() {
            return _dscpRemarkBurstSize;
        }
        
        @Override
        public java.lang.Long getDscpRemarkRate() {
            return _dscpRemarkRate;
        }
        
        @Override
        public java.lang.Short getPercLevel() {
            return _percLevel;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dscpRemarkBurstSize == null) ? 0 : _dscpRemarkBurstSize.hashCode());
            result = prime * result + ((_dscpRemarkRate == null) ? 0 : _dscpRemarkRate.hashCode());
            result = prime * result + ((_percLevel == null) ? 0 : _percLevel.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark)obj;
            if (_dscpRemarkBurstSize == null) {
                if (other.getDscpRemarkBurstSize() != null) {
                    return false;
                }
            } else if(!_dscpRemarkBurstSize.equals(other.getDscpRemarkBurstSize())) {
                return false;
            }
            if (_dscpRemarkRate == null) {
                if (other.getDscpRemarkRate() != null) {
                    return false;
                }
            } else if(!_dscpRemarkRate.equals(other.getDscpRemarkRate())) {
                return false;
            }
            if (_percLevel == null) {
                if (other.getPercLevel() != null) {
                    return false;
                }
            } else if(!_percLevel.equals(other.getPercLevel())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DscpRemarkImpl otherImpl = (DscpRemarkImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DscpRemark [");
            boolean first = true;
        
            if (_dscpRemarkBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dscpRemarkBurstSize=");
                builder.append(_dscpRemarkBurstSize);
             }
            if (_dscpRemarkRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dscpRemarkRate=");
                builder.append(_dscpRemarkRate);
             }
            if (_percLevel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_percLevel=");
                builder.append(_percLevel);
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
