package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpVersion;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Dscp;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch
 */
public class IpMatchBuilder {

    private Dscp _ipDscp;
    private static List<Range<BigInteger>> _ipDscp_range;
    private java.lang.Short _ipEcn;
    private static List<Range<BigInteger>> _ipEcn_range;
    private IpVersion _ipProto;
    private java.lang.Short _ipProtocol;
    private static List<Range<BigInteger>> _ipProtocol_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentation = new HashMap<>();

    public IpMatchBuilder() {
    } 
    
    public IpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields arg) {
        this._ipProtocol = arg.getIpProtocol();
        this._ipDscp = arg.getIpDscp();
        this._ipEcn = arg.getIpEcn();
        this._ipProto = arg.getIpProto();
    }

    public IpMatchBuilder(IpMatch base) {
        this._ipDscp = base.getIpDscp();
        this._ipEcn = base.getIpEcn();
        this._ipProto = base.getIpProto();
        this._ipProtocol = base.getIpProtocol();
        if (base instanceof IpMatchImpl) {
            IpMatchImpl _impl = (IpMatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields) {
            this._ipProtocol = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpProtocol();
            this._ipDscp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpDscp();
            this._ipEcn = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpEcn();
            this._ipProto = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpProto();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Dscp getIpDscp() {
        return _ipDscp;
    }
    
    public java.lang.Short getIpEcn() {
        return _ipEcn;
    }
    
    public IpVersion getIpProto() {
        return _ipProto;
    }
    
    public java.lang.Short getIpProtocol() {
        return _ipProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public IpMatchBuilder setIpDscp(Dscp value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ipDscp_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ipDscp_range));
            }
        }
        this._ipDscp = value;
        return this;
    }
    public static List<Range<BigInteger>> _ipDscp_range() {
        if (_ipDscp_range == null) {
            synchronized (IpMatchBuilder.class) {
                if (_ipDscp_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(63L)));
                    _ipDscp_range = builder.build();
                }
            }
        }
        return _ipDscp_range;
    }
    
    public IpMatchBuilder setIpEcn(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ipEcn_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ipEcn_range));
            }
        }
        this._ipEcn = value;
        return this;
    }
    public static List<Range<BigInteger>> _ipEcn_range() {
        if (_ipEcn_range == null) {
            synchronized (IpMatchBuilder.class) {
                if (_ipEcn_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _ipEcn_range = builder.build();
                }
            }
        }
        return _ipEcn_range;
    }
    
    public IpMatchBuilder setIpProto(IpVersion value) {
        this._ipProto = value;
        return this;
    }
    
    public IpMatchBuilder setIpProtocol(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ipProtocol_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ipProtocol_range));
            }
        }
        this._ipProtocol = value;
        return this;
    }
    public static List<Range<BigInteger>> _ipProtocol_range() {
        if (_ipProtocol_range == null) {
            synchronized (IpMatchBuilder.class) {
                if (_ipProtocol_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _ipProtocol_range = builder.build();
                }
            }
        }
        return _ipProtocol_range;
    }
    
    public IpMatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public IpMatch build() {
        return new IpMatchImpl(this);
    }

    private static final class IpMatchImpl implements IpMatch {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch.class;
        }

        private final Dscp _ipDscp;
        private final java.lang.Short _ipEcn;
        private final IpVersion _ipProto;
        private final java.lang.Short _ipProtocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentation = new HashMap<>();

        private IpMatchImpl(IpMatchBuilder base) {
            this._ipDscp = base.getIpDscp();
            this._ipEcn = base.getIpEcn();
            this._ipProto = base.getIpProto();
            this._ipProtocol = base.getIpProtocol();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Dscp getIpDscp() {
            return _ipDscp;
        }
        
        @Override
        public java.lang.Short getIpEcn() {
            return _ipEcn;
        }
        
        @Override
        public IpVersion getIpProto() {
            return _ipProto;
        }
        
        @Override
        public java.lang.Short getIpProtocol() {
            return _ipProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipDscp == null) ? 0 : _ipDscp.hashCode());
            result = prime * result + ((_ipEcn == null) ? 0 : _ipEcn.hashCode());
            result = prime * result + ((_ipProto == null) ? 0 : _ipProto.hashCode());
            result = prime * result + ((_ipProtocol == null) ? 0 : _ipProtocol.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch)obj;
            if (_ipDscp == null) {
                if (other.getIpDscp() != null) {
                    return false;
                }
            } else if(!_ipDscp.equals(other.getIpDscp())) {
                return false;
            }
            if (_ipEcn == null) {
                if (other.getIpEcn() != null) {
                    return false;
                }
            } else if(!_ipEcn.equals(other.getIpEcn())) {
                return false;
            }
            if (_ipProto == null) {
                if (other.getIpProto() != null) {
                    return false;
                }
            } else if(!_ipProto.equals(other.getIpProto())) {
                return false;
            }
            if (_ipProtocol == null) {
                if (other.getIpProtocol() != null) {
                    return false;
                }
            } else if(!_ipProtocol.equals(other.getIpProtocol())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpMatchImpl otherImpl = (IpMatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("IpMatch [");
            boolean first = true;
        
            if (_ipDscp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipDscp=");
                builder.append(_ipDscp);
             }
            if (_ipEcn != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipEcn=");
                builder.append(_ipEcn);
             }
            if (_ipProto != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipProto=");
                builder.append(_ipProto);
             }
            if (_ipProtocol != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipProtocol=");
                builder.append(_ipProtocol);
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
