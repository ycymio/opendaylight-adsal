package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields.Pbb;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields
 */
public class ProtocolMatchFieldsBuilder {

    private java.lang.Short _mplsBos;
    private static List<Range<BigInteger>> _mplsBos_range;
    private java.lang.Long _mplsLabel;
    private static List<Range<BigInteger>> _mplsLabel_range;
    private java.lang.Short _mplsTc;
    private static List<Range<BigInteger>> _mplsTc_range;
    private Pbb _pbb;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentation = new HashMap<>();

    public ProtocolMatchFieldsBuilder() {
    } 
    
    public ProtocolMatchFieldsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields arg) {
        this._mplsLabel = arg.getMplsLabel();
        this._mplsTc = arg.getMplsTc();
        this._mplsBos = arg.getMplsBos();
        this._pbb = arg.getPbb();
    }

    public ProtocolMatchFieldsBuilder(ProtocolMatchFields base) {
        this._mplsBos = base.getMplsBos();
        this._mplsLabel = base.getMplsLabel();
        this._mplsTc = base.getMplsTc();
        this._pbb = base.getPbb();
        if (base instanceof ProtocolMatchFieldsImpl) {
            ProtocolMatchFieldsImpl _impl = (ProtocolMatchFieldsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields) {
            this._mplsLabel = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsLabel();
            this._mplsTc = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsTc();
            this._mplsBos = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsBos();
            this._pbb = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getPbb();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getMplsBos() {
        return _mplsBos;
    }
    
    public java.lang.Long getMplsLabel() {
        return _mplsLabel;
    }
    
    public java.lang.Short getMplsTc() {
        return _mplsTc;
    }
    
    public Pbb getPbb() {
        return _pbb;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ProtocolMatchFieldsBuilder setMplsBos(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _mplsBos_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _mplsBos_range));
            }
        }
        this._mplsBos = value;
        return this;
    }
    public static List<Range<BigInteger>> _mplsBos_range() {
        if (_mplsBos_range == null) {
            synchronized (ProtocolMatchFieldsBuilder.class) {
                if (_mplsBos_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _mplsBos_range = builder.build();
                }
            }
        }
        return _mplsBos_range;
    }
    
    public ProtocolMatchFieldsBuilder setMplsLabel(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _mplsLabel_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _mplsLabel_range));
            }
        }
        this._mplsLabel = value;
        return this;
    }
    public static List<Range<BigInteger>> _mplsLabel_range() {
        if (_mplsLabel_range == null) {
            synchronized (ProtocolMatchFieldsBuilder.class) {
                if (_mplsLabel_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _mplsLabel_range = builder.build();
                }
            }
        }
        return _mplsLabel_range;
    }
    
    public ProtocolMatchFieldsBuilder setMplsTc(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _mplsTc_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _mplsTc_range));
            }
        }
        this._mplsTc = value;
        return this;
    }
    public static List<Range<BigInteger>> _mplsTc_range() {
        if (_mplsTc_range == null) {
            synchronized (ProtocolMatchFieldsBuilder.class) {
                if (_mplsTc_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _mplsTc_range = builder.build();
                }
            }
        }
        return _mplsTc_range;
    }
    
    public ProtocolMatchFieldsBuilder setPbb(Pbb value) {
        this._pbb = value;
        return this;
    }
    
    public ProtocolMatchFieldsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ProtocolMatchFields build() {
        return new ProtocolMatchFieldsImpl(this);
    }

    private static final class ProtocolMatchFieldsImpl implements ProtocolMatchFields {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields.class;
        }

        private final java.lang.Short _mplsBos;
        private final java.lang.Long _mplsLabel;
        private final java.lang.Short _mplsTc;
        private final Pbb _pbb;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentation = new HashMap<>();

        private ProtocolMatchFieldsImpl(ProtocolMatchFieldsBuilder base) {
            this._mplsBos = base.getMplsBos();
            this._mplsLabel = base.getMplsLabel();
            this._mplsTc = base.getMplsTc();
            this._pbb = base.getPbb();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Short getMplsBos() {
            return _mplsBos;
        }
        
        @Override
        public java.lang.Long getMplsLabel() {
            return _mplsLabel;
        }
        
        @Override
        public java.lang.Short getMplsTc() {
            return _mplsTc;
        }
        
        @Override
        public Pbb getPbb() {
            return _pbb;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_mplsBos == null) ? 0 : _mplsBos.hashCode());
            result = prime * result + ((_mplsLabel == null) ? 0 : _mplsLabel.hashCode());
            result = prime * result + ((_mplsTc == null) ? 0 : _mplsTc.hashCode());
            result = prime * result + ((_pbb == null) ? 0 : _pbb.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields)obj;
            if (_mplsBos == null) {
                if (other.getMplsBos() != null) {
                    return false;
                }
            } else if(!_mplsBos.equals(other.getMplsBos())) {
                return false;
            }
            if (_mplsLabel == null) {
                if (other.getMplsLabel() != null) {
                    return false;
                }
            } else if(!_mplsLabel.equals(other.getMplsLabel())) {
                return false;
            }
            if (_mplsTc == null) {
                if (other.getMplsTc() != null) {
                    return false;
                }
            } else if(!_mplsTc.equals(other.getMplsTc())) {
                return false;
            }
            if (_pbb == null) {
                if (other.getPbb() != null) {
                    return false;
                }
            } else if(!_pbb.equals(other.getPbb())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProtocolMatchFieldsImpl otherImpl = (ProtocolMatchFieldsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ProtocolMatchFields [");
            boolean first = true;
        
            if (_mplsBos != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsBos=");
                builder.append(_mplsBos);
             }
            if (_mplsLabel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsLabel=");
                builder.append(_mplsLabel);
             }
            if (_mplsTc != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsTc=");
                builder.append(_mplsTc);
             }
            if (_pbb != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pbb=");
                builder.append(_pbb);
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
