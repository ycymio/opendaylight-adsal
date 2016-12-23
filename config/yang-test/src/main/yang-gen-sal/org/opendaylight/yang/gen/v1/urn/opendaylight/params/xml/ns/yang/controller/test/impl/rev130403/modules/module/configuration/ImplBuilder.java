package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.DtoA;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.DtoB;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl
 */
public class ImplBuilder {

    private List<java.lang.String> _allowUser;
    private AsNumber _asNumber;
    private static List<Range<BigInteger>> _asNumber_range;
    private DtoA _dtoA;
    private DtoB _dtoB;
    private java.lang.Long _simpleInt;
    private static List<Range<BigInteger>> _simpleInt_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> augmentation = new HashMap<>();

    public ImplBuilder() {
    } 
    

    public ImplBuilder(Impl base) {
        this._allowUser = base.getAllowUser();
        this._asNumber = base.getAsNumber();
        this._dtoA = base.getDtoA();
        this._dtoB = base.getDtoB();
        this._simpleInt = base.getSimpleInt();
        if (base instanceof ImplImpl) {
            ImplImpl _impl = (ImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<java.lang.String> getAllowUser() {
        return _allowUser;
    }
    
    public AsNumber getAsNumber() {
        return _asNumber;
    }
    
    public DtoA getDtoA() {
        return _dtoA;
    }
    
    public DtoB getDtoB() {
        return _dtoB;
    }
    
    public java.lang.Long getSimpleInt() {
        return _simpleInt;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ImplBuilder setAllowUser(List<java.lang.String> value) {
        this._allowUser = value;
        return this;
    }
    
    public ImplBuilder setAsNumber(AsNumber value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _asNumber_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _asNumber_range));
            }
        }
        this._asNumber = value;
        return this;
    }
    public static List<Range<BigInteger>> _asNumber_range() {
        if (_asNumber_range == null) {
            synchronized (ImplBuilder.class) {
                if (_asNumber_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _asNumber_range = builder.build();
                }
            }
        }
        return _asNumber_range;
    }
    
    public ImplBuilder setDtoA(DtoA value) {
        this._dtoA = value;
        return this;
    }
    
    public ImplBuilder setDtoB(DtoB value) {
        this._dtoB = value;
        return this;
    }
    
    public ImplBuilder setSimpleInt(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleInt_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleInt_range));
            }
        }
        this._simpleInt = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleInt_range() {
        if (_simpleInt_range == null) {
            synchronized (ImplBuilder.class) {
                if (_simpleInt_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _simpleInt_range = builder.build();
                }
            }
        }
        return _simpleInt_range;
    }
    
    public ImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Impl build() {
        return new ImplImpl(this);
    }

    private static final class ImplImpl implements Impl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl.class;
        }

        private final List<java.lang.String> _allowUser;
        private final AsNumber _asNumber;
        private final DtoA _dtoA;
        private final DtoB _dtoB;
        private final java.lang.Long _simpleInt;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> augmentation = new HashMap<>();

        private ImplImpl(ImplBuilder base) {
            this._allowUser = base.getAllowUser();
            this._asNumber = base.getAsNumber();
            this._dtoA = base.getDtoA();
            this._dtoB = base.getDtoB();
            this._simpleInt = base.getSimpleInt();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<java.lang.String> getAllowUser() {
            return _allowUser;
        }
        
        @Override
        public AsNumber getAsNumber() {
            return _asNumber;
        }
        
        @Override
        public DtoA getDtoA() {
            return _dtoA;
        }
        
        @Override
        public DtoB getDtoB() {
            return _dtoB;
        }
        
        @Override
        public java.lang.Long getSimpleInt() {
            return _simpleInt;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_allowUser == null) ? 0 : _allowUser.hashCode());
            result = prime * result + ((_asNumber == null) ? 0 : _asNumber.hashCode());
            result = prime * result + ((_dtoA == null) ? 0 : _dtoA.hashCode());
            result = prime * result + ((_dtoB == null) ? 0 : _dtoB.hashCode());
            result = prime * result + ((_simpleInt == null) ? 0 : _simpleInt.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl)obj;
            if (_allowUser == null) {
                if (other.getAllowUser() != null) {
                    return false;
                }
            } else if(!_allowUser.equals(other.getAllowUser())) {
                return false;
            }
            if (_asNumber == null) {
                if (other.getAsNumber() != null) {
                    return false;
                }
            } else if(!_asNumber.equals(other.getAsNumber())) {
                return false;
            }
            if (_dtoA == null) {
                if (other.getDtoA() != null) {
                    return false;
                }
            } else if(!_dtoA.equals(other.getDtoA())) {
                return false;
            }
            if (_dtoB == null) {
                if (other.getDtoB() != null) {
                    return false;
                }
            } else if(!_dtoB.equals(other.getDtoB())) {
                return false;
            }
            if (_simpleInt == null) {
                if (other.getSimpleInt() != null) {
                    return false;
                }
            } else if(!_simpleInt.equals(other.getSimpleInt())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ImplImpl otherImpl = (ImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.Impl>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Impl [");
            boolean first = true;
        
            if (_allowUser != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_allowUser=");
                builder.append(_allowUser);
             }
            if (_asNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_asNumber=");
                builder.append(_asNumber);
             }
            if (_dtoA != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dtoA=");
                builder.append(_dtoA);
             }
            if (_dtoB != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dtoB=");
                builder.append(_dtoB);
             }
            if (_simpleInt != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt=");
                builder.append(_simpleInt);
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
