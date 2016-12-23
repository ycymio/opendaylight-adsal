package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddress;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch
 */
public class ArpMatchBuilder {

    private java.lang.Integer _arpOp;
    private static List<Range<BigInteger>> _arpOp_range;
    private ArpSourceHardwareAddress _arpSourceHardwareAddress;
    private Ipv4Prefix _arpSourceTransportAddress;
    private ArpTargetHardwareAddress _arpTargetHardwareAddress;
    private Ipv4Prefix _arpTargetTransportAddress;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentation = new HashMap<>();

    public ArpMatchBuilder() {
    } 
    
    public ArpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields arg) {
        this._arpOp = arg.getArpOp();
        this._arpSourceTransportAddress = arg.getArpSourceTransportAddress();
        this._arpTargetTransportAddress = arg.getArpTargetTransportAddress();
        this._arpSourceHardwareAddress = arg.getArpSourceHardwareAddress();
        this._arpTargetHardwareAddress = arg.getArpTargetHardwareAddress();
    }
    

    public ArpMatchBuilder(ArpMatch base) {
        this._arpOp = base.getArpOp();
        this._arpSourceHardwareAddress = base.getArpSourceHardwareAddress();
        this._arpSourceTransportAddress = base.getArpSourceTransportAddress();
        this._arpTargetHardwareAddress = base.getArpTargetHardwareAddress();
        this._arpTargetTransportAddress = base.getArpTargetTransportAddress();
        if (base instanceof ArpMatchImpl) {
            ArpMatchImpl _impl = (ArpMatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields) {
            this._arpOp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpOp();
            this._arpSourceTransportAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpSourceTransportAddress();
            this._arpTargetTransportAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpTargetTransportAddress();
            this._arpSourceHardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpSourceHardwareAddress();
            this._arpTargetHardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpTargetHardwareAddress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getArpOp() {
        return _arpOp;
    }
    
    public ArpSourceHardwareAddress getArpSourceHardwareAddress() {
        return _arpSourceHardwareAddress;
    }
    
    public Ipv4Prefix getArpSourceTransportAddress() {
        return _arpSourceTransportAddress;
    }
    
    public ArpTargetHardwareAddress getArpTargetHardwareAddress() {
        return _arpTargetHardwareAddress;
    }
    
    public Ipv4Prefix getArpTargetTransportAddress() {
        return _arpTargetTransportAddress;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ArpMatchBuilder setArpOp(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _arpOp_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _arpOp_range));
            }
        }
        this._arpOp = value;
        return this;
    }
    public static List<Range<BigInteger>> _arpOp_range() {
        if (_arpOp_range == null) {
            synchronized (ArpMatchBuilder.class) {
                if (_arpOp_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _arpOp_range = builder.build();
                }
            }
        }
        return _arpOp_range;
    }
    
    public ArpMatchBuilder setArpSourceHardwareAddress(ArpSourceHardwareAddress value) {
        this._arpSourceHardwareAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpSourceTransportAddress(Ipv4Prefix value) {
        this._arpSourceTransportAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpTargetHardwareAddress(ArpTargetHardwareAddress value) {
        this._arpTargetHardwareAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpTargetTransportAddress(Ipv4Prefix value) {
        this._arpTargetTransportAddress = value;
        return this;
    }
    
    public ArpMatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ArpMatch build() {
        return new ArpMatchImpl(this);
    }

    private static final class ArpMatchImpl implements ArpMatch {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch.class;
        }

        private final java.lang.Integer _arpOp;
        private final ArpSourceHardwareAddress _arpSourceHardwareAddress;
        private final Ipv4Prefix _arpSourceTransportAddress;
        private final ArpTargetHardwareAddress _arpTargetHardwareAddress;
        private final Ipv4Prefix _arpTargetTransportAddress;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentation = new HashMap<>();

        private ArpMatchImpl(ArpMatchBuilder base) {
            this._arpOp = base.getArpOp();
            this._arpSourceHardwareAddress = base.getArpSourceHardwareAddress();
            this._arpSourceTransportAddress = base.getArpSourceTransportAddress();
            this._arpTargetHardwareAddress = base.getArpTargetHardwareAddress();
            this._arpTargetTransportAddress = base.getArpTargetTransportAddress();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Integer getArpOp() {
            return _arpOp;
        }
        
        @Override
        public ArpSourceHardwareAddress getArpSourceHardwareAddress() {
            return _arpSourceHardwareAddress;
        }
        
        @Override
        public Ipv4Prefix getArpSourceTransportAddress() {
            return _arpSourceTransportAddress;
        }
        
        @Override
        public ArpTargetHardwareAddress getArpTargetHardwareAddress() {
            return _arpTargetHardwareAddress;
        }
        
        @Override
        public Ipv4Prefix getArpTargetTransportAddress() {
            return _arpTargetTransportAddress;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_arpOp == null) ? 0 : _arpOp.hashCode());
            result = prime * result + ((_arpSourceHardwareAddress == null) ? 0 : _arpSourceHardwareAddress.hashCode());
            result = prime * result + ((_arpSourceTransportAddress == null) ? 0 : _arpSourceTransportAddress.hashCode());
            result = prime * result + ((_arpTargetHardwareAddress == null) ? 0 : _arpTargetHardwareAddress.hashCode());
            result = prime * result + ((_arpTargetTransportAddress == null) ? 0 : _arpTargetTransportAddress.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch)obj;
            if (_arpOp == null) {
                if (other.getArpOp() != null) {
                    return false;
                }
            } else if(!_arpOp.equals(other.getArpOp())) {
                return false;
            }
            if (_arpSourceHardwareAddress == null) {
                if (other.getArpSourceHardwareAddress() != null) {
                    return false;
                }
            } else if(!_arpSourceHardwareAddress.equals(other.getArpSourceHardwareAddress())) {
                return false;
            }
            if (_arpSourceTransportAddress == null) {
                if (other.getArpSourceTransportAddress() != null) {
                    return false;
                }
            } else if(!_arpSourceTransportAddress.equals(other.getArpSourceTransportAddress())) {
                return false;
            }
            if (_arpTargetHardwareAddress == null) {
                if (other.getArpTargetHardwareAddress() != null) {
                    return false;
                }
            } else if(!_arpTargetHardwareAddress.equals(other.getArpTargetHardwareAddress())) {
                return false;
            }
            if (_arpTargetTransportAddress == null) {
                if (other.getArpTargetTransportAddress() != null) {
                    return false;
                }
            } else if(!_arpTargetTransportAddress.equals(other.getArpTargetTransportAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ArpMatchImpl otherImpl = (ArpMatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ArpMatch [");
            boolean first = true;
        
            if (_arpOp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpOp=");
                builder.append(_arpOp);
             }
            if (_arpSourceHardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpSourceHardwareAddress=");
                builder.append(_arpSourceHardwareAddress);
             }
            if (_arpSourceTransportAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpSourceTransportAddress=");
                builder.append(_arpSourceTransportAddress);
             }
            if (_arpTargetHardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpTargetHardwareAddress=");
                builder.append(_arpTargetHardwareAddress);
             }
            if (_arpTargetTransportAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpTargetTransportAddress=");
                builder.append(_arpTargetTransportAddress);
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
