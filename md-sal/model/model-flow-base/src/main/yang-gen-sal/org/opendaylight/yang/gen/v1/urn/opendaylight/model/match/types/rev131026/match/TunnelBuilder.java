package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel
 */
public class TunnelBuilder {

    private BigInteger _tunnelId;
    private static List<Range<BigInteger>> _tunnelId_range;
    private BigInteger _tunnelMask;
    private static List<Range<BigInteger>> _tunnelMask_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> augmentation = new HashMap<>();

    public TunnelBuilder() {
    } 

    public TunnelBuilder(Tunnel base) {
        this._tunnelId = base.getTunnelId();
        this._tunnelMask = base.getTunnelMask();
        if (base instanceof TunnelImpl) {
            TunnelImpl _impl = (TunnelImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public BigInteger getTunnelId() {
        return _tunnelId;
    }
    
    public BigInteger getTunnelMask() {
        return _tunnelMask;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TunnelBuilder setTunnelId(BigInteger value) {
        if (value != null) {
            BigInteger _constraint = value;
            boolean isValidRange = false;
            for (Range<BigInteger> r : _tunnelId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _tunnelId_range));
            }
        }
        this._tunnelId = value;
        return this;
    }
    public static List<Range<BigInteger>> _tunnelId_range() {
        if (_tunnelId_range == null) {
            synchronized (TunnelBuilder.class) {
                if (_tunnelId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _tunnelId_range = builder.build();
                }
            }
        }
        return _tunnelId_range;
    }
    
    public TunnelBuilder setTunnelMask(BigInteger value) {
        if (value != null) {
            BigInteger _constraint = value;
            boolean isValidRange = false;
            for (Range<BigInteger> r : _tunnelMask_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _tunnelMask_range));
            }
        }
        this._tunnelMask = value;
        return this;
    }
    public static List<Range<BigInteger>> _tunnelMask_range() {
        if (_tunnelMask_range == null) {
            synchronized (TunnelBuilder.class) {
                if (_tunnelMask_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _tunnelMask_range = builder.build();
                }
            }
        }
        return _tunnelMask_range;
    }
    
    public TunnelBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Tunnel build() {
        return new TunnelImpl(this);
    }

    private static final class TunnelImpl implements Tunnel {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel.class;
        }

        private final BigInteger _tunnelId;
        private final BigInteger _tunnelMask;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> augmentation = new HashMap<>();

        private TunnelImpl(TunnelBuilder base) {
            this._tunnelId = base.getTunnelId();
            this._tunnelMask = base.getTunnelMask();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public BigInteger getTunnelId() {
            return _tunnelId;
        }
        
        @Override
        public BigInteger getTunnelMask() {
            return _tunnelMask;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tunnelId == null) ? 0 : _tunnelId.hashCode());
            result = prime * result + ((_tunnelMask == null) ? 0 : _tunnelMask.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel)obj;
            if (_tunnelId == null) {
                if (other.getTunnelId() != null) {
                    return false;
                }
            } else if(!_tunnelId.equals(other.getTunnelId())) {
                return false;
            }
            if (_tunnelMask == null) {
                if (other.getTunnelMask() != null) {
                    return false;
                }
            } else if(!_tunnelMask.equals(other.getTunnelMask())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TunnelImpl otherImpl = (TunnelImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Tunnel [");
            boolean first = true;
        
            if (_tunnelId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnelId=");
                builder.append(_tunnelId);
             }
            if (_tunnelMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnelMask=");
                builder.append(_tunnelMask);
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
