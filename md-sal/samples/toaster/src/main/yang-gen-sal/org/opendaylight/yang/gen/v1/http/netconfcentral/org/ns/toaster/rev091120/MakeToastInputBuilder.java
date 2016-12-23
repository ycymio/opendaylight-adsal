package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput
 */
public class MakeToastInputBuilder {

    private java.lang.Long _toasterDoneness;
    private static List<Range<BigInteger>> _toasterDoneness_range;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> _toasterToastType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentation = new HashMap<>();

    public MakeToastInputBuilder() {
    } 

    public MakeToastInputBuilder(MakeToastInput base) {
        this._toasterDoneness = base.getToasterDoneness();
        this._toasterToastType = base.getToasterToastType();
        if (base instanceof MakeToastInputImpl) {
            MakeToastInputImpl _impl = (MakeToastInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getToasterDoneness() {
        return _toasterDoneness;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType() {
        return _toasterToastType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MakeToastInputBuilder setToasterDoneness(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _toasterDoneness_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _toasterDoneness_range));
            }
        }
        this._toasterDoneness = value;
        return this;
    }
    public static List<Range<BigInteger>> _toasterDoneness_range() {
        if (_toasterDoneness_range == null) {
            synchronized (MakeToastInputBuilder.class) {
                if (_toasterDoneness_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.TEN));
                    _toasterDoneness_range = builder.build();
                }
            }
        }
        return _toasterDoneness_range;
    }
    
    public MakeToastInputBuilder setToasterToastType(java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> value) {
        this._toasterToastType = value;
        return this;
    }
    
    public MakeToastInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MakeToastInput build() {
        return new MakeToastInputImpl(this);
    }

    private static final class MakeToastInputImpl implements MakeToastInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput.class;
        }

        private final java.lang.Long _toasterDoneness;
        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> _toasterToastType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentation = new HashMap<>();

        private MakeToastInputImpl(MakeToastInputBuilder base) {
            this._toasterDoneness = base.getToasterDoneness();
            this._toasterToastType = base.getToasterToastType();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getToasterDoneness() {
            return _toasterDoneness;
        }
        
        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType() {
            return _toasterToastType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_toasterDoneness == null) ? 0 : _toasterDoneness.hashCode());
            result = prime * result + ((_toasterToastType == null) ? 0 : _toasterToastType.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput other = (org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput)obj;
            if (_toasterDoneness == null) {
                if (other.getToasterDoneness() != null) {
                    return false;
                }
            } else if(!_toasterDoneness.equals(other.getToasterDoneness())) {
                return false;
            }
            if (_toasterToastType == null) {
                if (other.getToasterToastType() != null) {
                    return false;
                }
            } else if(!_toasterToastType.equals(other.getToasterToastType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MakeToastInputImpl otherImpl = (MakeToastInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MakeToastInput [");
            boolean first = true;
        
            if (_toasterDoneness != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterDoneness=");
                builder.append(_toasterDoneness);
             }
            if (_toasterToastType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterToastType=");
                builder.append(_toasterToastType);
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
