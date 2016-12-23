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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter
 */
public class ExperimenterBuilder {

    private java.lang.Long _experimenter;
    private static List<Range<BigInteger>> _experimenter_range;
    private java.lang.Long _experimenterBurstSize;
    private static List<Range<BigInteger>> _experimenterBurstSize_range;
    private java.lang.Long _experimenterRate;
    private static List<Range<BigInteger>> _experimenterRate_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentation = new HashMap<>();

    public ExperimenterBuilder() {
    } 
    

    public ExperimenterBuilder(Experimenter base) {
        this._experimenter = base.getExperimenter();
        this._experimenterBurstSize = base.getExperimenterBurstSize();
        this._experimenterRate = base.getExperimenterRate();
        if (base instanceof ExperimenterImpl) {
            ExperimenterImpl _impl = (ExperimenterImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getExperimenter() {
        return _experimenter;
    }
    
    public java.lang.Long getExperimenterBurstSize() {
        return _experimenterBurstSize;
    }
    
    public java.lang.Long getExperimenterRate() {
        return _experimenterRate;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ExperimenterBuilder setExperimenter(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _experimenter_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _experimenter_range));
            }
        }
        this._experimenter = value;
        return this;
    }
    public static List<Range<BigInteger>> _experimenter_range() {
        if (_experimenter_range == null) {
            synchronized (ExperimenterBuilder.class) {
                if (_experimenter_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _experimenter_range = builder.build();
                }
            }
        }
        return _experimenter_range;
    }
    
    public ExperimenterBuilder setExperimenterBurstSize(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _experimenterBurstSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _experimenterBurstSize_range));
            }
        }
        this._experimenterBurstSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _experimenterBurstSize_range() {
        if (_experimenterBurstSize_range == null) {
            synchronized (ExperimenterBuilder.class) {
                if (_experimenterBurstSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _experimenterBurstSize_range = builder.build();
                }
            }
        }
        return _experimenterBurstSize_range;
    }
    
    public ExperimenterBuilder setExperimenterRate(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _experimenterRate_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _experimenterRate_range));
            }
        }
        this._experimenterRate = value;
        return this;
    }
    public static List<Range<BigInteger>> _experimenterRate_range() {
        if (_experimenterRate_range == null) {
            synchronized (ExperimenterBuilder.class) {
                if (_experimenterRate_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _experimenterRate_range = builder.build();
                }
            }
        }
        return _experimenterRate_range;
    }
    
    public ExperimenterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Experimenter build() {
        return new ExperimenterImpl(this);
    }

    private static final class ExperimenterImpl implements Experimenter {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter.class;
        }

        private final java.lang.Long _experimenter;
        private final java.lang.Long _experimenterBurstSize;
        private final java.lang.Long _experimenterRate;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentation = new HashMap<>();

        private ExperimenterImpl(ExperimenterBuilder base) {
            this._experimenter = base.getExperimenter();
            this._experimenterBurstSize = base.getExperimenterBurstSize();
            this._experimenterRate = base.getExperimenterRate();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getExperimenter() {
            return _experimenter;
        }
        
        @Override
        public java.lang.Long getExperimenterBurstSize() {
            return _experimenterBurstSize;
        }
        
        @Override
        public java.lang.Long getExperimenterRate() {
            return _experimenterRate;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_experimenter == null) ? 0 : _experimenter.hashCode());
            result = prime * result + ((_experimenterBurstSize == null) ? 0 : _experimenterBurstSize.hashCode());
            result = prime * result + ((_experimenterRate == null) ? 0 : _experimenterRate.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter)obj;
            if (_experimenter == null) {
                if (other.getExperimenter() != null) {
                    return false;
                }
            } else if(!_experimenter.equals(other.getExperimenter())) {
                return false;
            }
            if (_experimenterBurstSize == null) {
                if (other.getExperimenterBurstSize() != null) {
                    return false;
                }
            } else if(!_experimenterBurstSize.equals(other.getExperimenterBurstSize())) {
                return false;
            }
            if (_experimenterRate == null) {
                if (other.getExperimenterRate() != null) {
                    return false;
                }
            } else if(!_experimenterRate.equals(other.getExperimenterRate())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExperimenterImpl otherImpl = (ExperimenterImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Experimenter [");
            boolean first = true;
        
            if (_experimenter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenter=");
                builder.append(_experimenter);
             }
            if (_experimenterBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenterBurstSize=");
                builder.append(_experimenterBurstSize);
             }
            if (_experimenterRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenterRate=");
                builder.append(_experimenterRate);
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
