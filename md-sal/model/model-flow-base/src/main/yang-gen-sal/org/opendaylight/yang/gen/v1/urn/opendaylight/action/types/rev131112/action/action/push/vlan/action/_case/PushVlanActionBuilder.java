package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.VlanCfi;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction
 */
public class PushVlanActionBuilder {

    private VlanCfi _cfi;
    private static List<Range<BigInteger>> _cfi_range;
    private java.lang.Integer _ethernetType;
    private static List<Range<BigInteger>> _ethernetType_range;
    private java.lang.Integer _pcp;
    private java.lang.Integer _tag;
    private VlanId _vlanId;
    private static List<Range<BigInteger>> _vlanId_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentation = new HashMap<>();

    public PushVlanActionBuilder() {
    } 

    public PushVlanActionBuilder(PushVlanAction base) {
        this._cfi = base.getCfi();
        this._ethernetType = base.getEthernetType();
        this._pcp = base.getPcp();
        this._tag = base.getTag();
        this._vlanId = base.getVlanId();
        if (base instanceof PushVlanActionImpl) {
            PushVlanActionImpl _impl = (PushVlanActionImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public VlanCfi getCfi() {
        return _cfi;
    }
    
    public java.lang.Integer getEthernetType() {
        return _ethernetType;
    }
    
    public java.lang.Integer getPcp() {
        return _pcp;
    }
    
    public java.lang.Integer getTag() {
        return _tag;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PushVlanActionBuilder setCfi(VlanCfi value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _cfi_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _cfi_range));
            }
        }
        this._cfi = value;
        return this;
    }
    public static List<Range<BigInteger>> _cfi_range() {
        if (_cfi_range == null) {
            synchronized (PushVlanActionBuilder.class) {
                if (_cfi_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.valueOf(-2147483648L), BigInteger.valueOf(2147483647L)));
                    _cfi_range = builder.build();
                }
            }
        }
        return _cfi_range;
    }
    
    public PushVlanActionBuilder setEthernetType(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _ethernetType_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _ethernetType_range));
            }
        }
        this._ethernetType = value;
        return this;
    }
    public static List<Range<BigInteger>> _ethernetType_range() {
        if (_ethernetType_range == null) {
            synchronized (PushVlanActionBuilder.class) {
                if (_ethernetType_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _ethernetType_range = builder.build();
                }
            }
        }
        return _ethernetType_range;
    }
    
    public PushVlanActionBuilder setPcp(java.lang.Integer value) {
        this._pcp = value;
        return this;
    }
    
    public PushVlanActionBuilder setTag(java.lang.Integer value) {
        this._tag = value;
        return this;
    }
    
    public PushVlanActionBuilder setVlanId(VlanId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _vlanId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _vlanId_range));
            }
        }
        this._vlanId = value;
        return this;
    }
    public static List<Range<BigInteger>> _vlanId_range() {
        if (_vlanId_range == null) {
            synchronized (PushVlanActionBuilder.class) {
                if (_vlanId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4095L)));
                    _vlanId_range = builder.build();
                }
            }
        }
        return _vlanId_range;
    }
    
    public PushVlanActionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PushVlanAction build() {
        return new PushVlanActionImpl(this);
    }

    private static final class PushVlanActionImpl implements PushVlanAction {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction.class;
        }

        private final VlanCfi _cfi;
        private final java.lang.Integer _ethernetType;
        private final java.lang.Integer _pcp;
        private final java.lang.Integer _tag;
        private final VlanId _vlanId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentation = new HashMap<>();

        private PushVlanActionImpl(PushVlanActionBuilder base) {
            this._cfi = base.getCfi();
            this._ethernetType = base.getEthernetType();
            this._pcp = base.getPcp();
            this._tag = base.getTag();
            this._vlanId = base.getVlanId();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public VlanCfi getCfi() {
            return _cfi;
        }
        
        @Override
        public java.lang.Integer getEthernetType() {
            return _ethernetType;
        }
        
        @Override
        public java.lang.Integer getPcp() {
            return _pcp;
        }
        
        @Override
        public java.lang.Integer getTag() {
            return _tag;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_cfi == null) ? 0 : _cfi.hashCode());
            result = prime * result + ((_ethernetType == null) ? 0 : _ethernetType.hashCode());
            result = prime * result + ((_pcp == null) ? 0 : _pcp.hashCode());
            result = prime * result + ((_tag == null) ? 0 : _tag.hashCode());
            result = prime * result + ((_vlanId == null) ? 0 : _vlanId.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction other = (org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction)obj;
            if (_cfi == null) {
                if (other.getCfi() != null) {
                    return false;
                }
            } else if(!_cfi.equals(other.getCfi())) {
                return false;
            }
            if (_ethernetType == null) {
                if (other.getEthernetType() != null) {
                    return false;
                }
            } else if(!_ethernetType.equals(other.getEthernetType())) {
                return false;
            }
            if (_pcp == null) {
                if (other.getPcp() != null) {
                    return false;
                }
            } else if(!_pcp.equals(other.getPcp())) {
                return false;
            }
            if (_tag == null) {
                if (other.getTag() != null) {
                    return false;
                }
            } else if(!_tag.equals(other.getTag())) {
                return false;
            }
            if (_vlanId == null) {
                if (other.getVlanId() != null) {
                    return false;
                }
            } else if(!_vlanId.equals(other.getVlanId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PushVlanActionImpl otherImpl = (PushVlanActionImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("PushVlanAction [");
            boolean first = true;
        
            if (_cfi != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_cfi=");
                builder.append(_cfi);
             }
            if (_ethernetType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetType=");
                builder.append(_ethernetType);
             }
            if (_pcp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pcp=");
                builder.append(_pcp);
             }
            if (_tag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tag=");
                builder.append(_tag);
             }
            if (_vlanId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanId=");
                builder.append(_vlanId);
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
