package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.meter.band.header.MeterBandTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeaderKey;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader
 */
public class MeterBandHeaderBuilder {

    private java.lang.Long _bandBurstSize;
    private static List<Range<BigInteger>> _bandBurstSize_range;
    private BandId _bandId;
    private static List<Range<BigInteger>> _bandId_range;
    private java.lang.Long _bandRate;
    private static List<Range<BigInteger>> _bandRate_range;
    private BandType _bandType;
    private MeterBandHeaderKey _key;
    private MeterBandTypes _meterBandTypes;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentation = new HashMap<>();

    public MeterBandHeaderBuilder() {
    } 
    
    public MeterBandHeaderBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType arg) {
        this._bandType = arg.getBandType();
    }

    public MeterBandHeaderBuilder(MeterBandHeader base) {
        if (base.getKey() == null) {
            this._key = new MeterBandHeaderKey(
                base.getBandId()
            );
            this._bandId = base.getBandId();
        } else {
            this._key = base.getKey();
            this._bandId = _key.getBandId();
        }
        this._bandBurstSize = base.getBandBurstSize();
        this._bandRate = base.getBandRate();
        this._bandType = base.getBandType();
        this._meterBandTypes = base.getMeterBandTypes();
        if (base instanceof MeterBandHeaderImpl) {
            MeterBandHeaderImpl _impl = (MeterBandHeaderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType) {
            this._bandType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType)arg).getBandType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getBandBurstSize() {
        return _bandBurstSize;
    }
    
    public BandId getBandId() {
        return _bandId;
    }
    
    public java.lang.Long getBandRate() {
        return _bandRate;
    }
    
    public BandType getBandType() {
        return _bandType;
    }
    
    public MeterBandHeaderKey getKey() {
        return _key;
    }
    
    public MeterBandTypes getMeterBandTypes() {
        return _meterBandTypes;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterBandHeaderBuilder setBandBurstSize(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _bandBurstSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _bandBurstSize_range));
            }
        }
        this._bandBurstSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _bandBurstSize_range() {
        if (_bandBurstSize_range == null) {
            synchronized (MeterBandHeaderBuilder.class) {
                if (_bandBurstSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bandBurstSize_range = builder.build();
                }
            }
        }
        return _bandBurstSize_range;
    }
    
    public MeterBandHeaderBuilder setBandId(BandId value) {
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
            synchronized (MeterBandHeaderBuilder.class) {
                if (_bandId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bandId_range = builder.build();
                }
            }
        }
        return _bandId_range;
    }
    
    public MeterBandHeaderBuilder setBandRate(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _bandRate_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _bandRate_range));
            }
        }
        this._bandRate = value;
        return this;
    }
    public static List<Range<BigInteger>> _bandRate_range() {
        if (_bandRate_range == null) {
            synchronized (MeterBandHeaderBuilder.class) {
                if (_bandRate_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _bandRate_range = builder.build();
                }
            }
        }
        return _bandRate_range;
    }
    
    public MeterBandHeaderBuilder setBandType(BandType value) {
        this._bandType = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setKey(MeterBandHeaderKey value) {
        this._key = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setMeterBandTypes(MeterBandTypes value) {
        this._meterBandTypes = value;
        return this;
    }
    
    public MeterBandHeaderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterBandHeader build() {
        return new MeterBandHeaderImpl(this);
    }

    private static final class MeterBandHeaderImpl implements MeterBandHeader {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader.class;
        }

        private final java.lang.Long _bandBurstSize;
        private final BandId _bandId;
        private final java.lang.Long _bandRate;
        private final BandType _bandType;
        private final MeterBandHeaderKey _key;
        private final MeterBandTypes _meterBandTypes;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentation = new HashMap<>();

        private MeterBandHeaderImpl(MeterBandHeaderBuilder base) {
            if (base.getKey() == null) {
                this._key = new MeterBandHeaderKey(
                    base.getBandId()
                );
                this._bandId = base.getBandId();
            } else {
                this._key = base.getKey();
                this._bandId = _key.getBandId();
            }
            this._bandBurstSize = base.getBandBurstSize();
            this._bandRate = base.getBandRate();
            this._bandType = base.getBandType();
            this._meterBandTypes = base.getMeterBandTypes();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getBandBurstSize() {
            return _bandBurstSize;
        }
        
        @Override
        public BandId getBandId() {
            return _bandId;
        }
        
        @Override
        public java.lang.Long getBandRate() {
            return _bandRate;
        }
        
        @Override
        public BandType getBandType() {
            return _bandType;
        }
        
        @Override
        public MeterBandHeaderKey getKey() {
            return _key;
        }
        
        @Override
        public MeterBandTypes getMeterBandTypes() {
            return _meterBandTypes;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bandBurstSize == null) ? 0 : _bandBurstSize.hashCode());
            result = prime * result + ((_bandId == null) ? 0 : _bandId.hashCode());
            result = prime * result + ((_bandRate == null) ? 0 : _bandRate.hashCode());
            result = prime * result + ((_bandType == null) ? 0 : _bandType.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_meterBandTypes == null) ? 0 : _meterBandTypes.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader)obj;
            if (_bandBurstSize == null) {
                if (other.getBandBurstSize() != null) {
                    return false;
                }
            } else if(!_bandBurstSize.equals(other.getBandBurstSize())) {
                return false;
            }
            if (_bandId == null) {
                if (other.getBandId() != null) {
                    return false;
                }
            } else if(!_bandId.equals(other.getBandId())) {
                return false;
            }
            if (_bandRate == null) {
                if (other.getBandRate() != null) {
                    return false;
                }
            } else if(!_bandRate.equals(other.getBandRate())) {
                return false;
            }
            if (_bandType == null) {
                if (other.getBandType() != null) {
                    return false;
                }
            } else if(!_bandType.equals(other.getBandType())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_meterBandTypes == null) {
                if (other.getMeterBandTypes() != null) {
                    return false;
                }
            } else if(!_meterBandTypes.equals(other.getMeterBandTypes())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MeterBandHeaderImpl otherImpl = (MeterBandHeaderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MeterBandHeader [");
            boolean first = true;
        
            if (_bandBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandBurstSize=");
                builder.append(_bandBurstSize);
             }
            if (_bandId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandId=");
                builder.append(_bandId);
             }
            if (_bandRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandRate=");
                builder.append(_bandRate);
             }
            if (_bandType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandType=");
                builder.append(_bandType);
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
            if (_meterBandTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandTypes=");
                builder.append(_meterBandTypes);
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
