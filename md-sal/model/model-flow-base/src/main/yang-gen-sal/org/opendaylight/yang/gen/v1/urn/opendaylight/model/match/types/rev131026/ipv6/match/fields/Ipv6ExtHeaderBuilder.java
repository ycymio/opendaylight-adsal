package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader
 */
public class Ipv6ExtHeaderBuilder {

    private java.lang.Integer _ipv6Exthdr;
    private static List<Range<BigInteger>> _ipv6Exthdr_range;
    private java.lang.Integer _ipv6ExthdrMask;
    private static List<Range<BigInteger>> _ipv6ExthdrMask_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> augmentation = new HashMap<>();

    public Ipv6ExtHeaderBuilder() {
    } 

    public Ipv6ExtHeaderBuilder(Ipv6ExtHeader base) {
        this._ipv6Exthdr = base.getIpv6Exthdr();
        this._ipv6ExthdrMask = base.getIpv6ExthdrMask();
        if (base instanceof Ipv6ExtHeaderImpl) {
            Ipv6ExtHeaderImpl _impl = (Ipv6ExtHeaderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Integer getIpv6Exthdr() {
        return _ipv6Exthdr;
    }
    
    public java.lang.Integer getIpv6ExthdrMask() {
        return _ipv6ExthdrMask;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv6ExtHeaderBuilder setIpv6Exthdr(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ipv6Exthdr_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ipv6Exthdr_range));
            }
        }
        this._ipv6Exthdr = value;
        return this;
    }
    public static List<Range<BigInteger>> _ipv6Exthdr_range() {
        if (_ipv6Exthdr_range == null) {
            synchronized (Ipv6ExtHeaderBuilder.class) {
                if (_ipv6Exthdr_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _ipv6Exthdr_range = builder.build();
                }
            }
        }
        return _ipv6Exthdr_range;
    }
    
    public Ipv6ExtHeaderBuilder setIpv6ExthdrMask(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ipv6ExthdrMask_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ipv6ExthdrMask_range));
            }
        }
        this._ipv6ExthdrMask = value;
        return this;
    }
    public static List<Range<BigInteger>> _ipv6ExthdrMask_range() {
        if (_ipv6ExthdrMask_range == null) {
            synchronized (Ipv6ExtHeaderBuilder.class) {
                if (_ipv6ExthdrMask_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(512L)));
                    _ipv6ExthdrMask_range = builder.build();
                }
            }
        }
        return _ipv6ExthdrMask_range;
    }
    
    public Ipv6ExtHeaderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv6ExtHeader build() {
        return new Ipv6ExtHeaderImpl(this);
    }

    private static final class Ipv6ExtHeaderImpl implements Ipv6ExtHeader {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader.class;
        }

        private final java.lang.Integer _ipv6Exthdr;
        private final java.lang.Integer _ipv6ExthdrMask;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> augmentation = new HashMap<>();

        private Ipv6ExtHeaderImpl(Ipv6ExtHeaderBuilder base) {
            this._ipv6Exthdr = base.getIpv6Exthdr();
            this._ipv6ExthdrMask = base.getIpv6ExthdrMask();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Integer getIpv6Exthdr() {
            return _ipv6Exthdr;
        }
        
        @Override
        public java.lang.Integer getIpv6ExthdrMask() {
            return _ipv6ExthdrMask;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv6Exthdr == null) ? 0 : _ipv6Exthdr.hashCode());
            result = prime * result + ((_ipv6ExthdrMask == null) ? 0 : _ipv6ExthdrMask.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader)obj;
            if (_ipv6Exthdr == null) {
                if (other.getIpv6Exthdr() != null) {
                    return false;
                }
            } else if(!_ipv6Exthdr.equals(other.getIpv6Exthdr())) {
                return false;
            }
            if (_ipv6ExthdrMask == null) {
                if (other.getIpv6ExthdrMask() != null) {
                    return false;
                }
            } else if(!_ipv6ExthdrMask.equals(other.getIpv6ExthdrMask())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv6ExtHeaderImpl otherImpl = (Ipv6ExtHeaderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv6ExtHeader [");
            boolean first = true;
        
            if (_ipv6Exthdr != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Exthdr=");
                builder.append(_ipv6Exthdr);
             }
            if (_ipv6ExthdrMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6ExthdrMask=");
                builder.append(_ipv6ExthdrMask);
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
