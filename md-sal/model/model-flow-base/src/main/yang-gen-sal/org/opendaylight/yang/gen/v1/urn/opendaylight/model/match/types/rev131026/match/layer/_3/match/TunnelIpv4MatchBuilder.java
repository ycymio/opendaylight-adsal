package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match
 */
public class TunnelIpv4MatchBuilder {

    private Ipv4Prefix _tunnelIpv4Destination;
    private Ipv4Prefix _tunnelIpv4Source;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> augmentation = new HashMap<>();

    public TunnelIpv4MatchBuilder() {
    } 
    
    public TunnelIpv4MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields arg) {
        this._tunnelIpv4Source = arg.getTunnelIpv4Source();
        this._tunnelIpv4Destination = arg.getTunnelIpv4Destination();
    }
    

    public TunnelIpv4MatchBuilder(TunnelIpv4Match base) {
        this._tunnelIpv4Destination = base.getTunnelIpv4Destination();
        this._tunnelIpv4Source = base.getTunnelIpv4Source();
        if (base instanceof TunnelIpv4MatchImpl) {
            TunnelIpv4MatchImpl _impl = (TunnelIpv4MatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields) {
            this._tunnelIpv4Source = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields)arg).getTunnelIpv4Source();
            this._tunnelIpv4Destination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields)arg).getTunnelIpv4Destination();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TunnelIpv4MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Ipv4Prefix getTunnelIpv4Destination() {
        return _tunnelIpv4Destination;
    }
    
    public Ipv4Prefix getTunnelIpv4Source() {
        return _tunnelIpv4Source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TunnelIpv4MatchBuilder setTunnelIpv4Destination(Ipv4Prefix value) {
        this._tunnelIpv4Destination = value;
        return this;
    }
    
    public TunnelIpv4MatchBuilder setTunnelIpv4Source(Ipv4Prefix value) {
        this._tunnelIpv4Source = value;
        return this;
    }
    
    public TunnelIpv4MatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TunnelIpv4Match build() {
        return new TunnelIpv4MatchImpl(this);
    }

    private static final class TunnelIpv4MatchImpl implements TunnelIpv4Match {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match.class;
        }

        private final Ipv4Prefix _tunnelIpv4Destination;
        private final Ipv4Prefix _tunnelIpv4Source;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> augmentation = new HashMap<>();

        private TunnelIpv4MatchImpl(TunnelIpv4MatchBuilder base) {
            this._tunnelIpv4Destination = base.getTunnelIpv4Destination();
            this._tunnelIpv4Source = base.getTunnelIpv4Source();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Ipv4Prefix getTunnelIpv4Destination() {
            return _tunnelIpv4Destination;
        }
        
        @Override
        public Ipv4Prefix getTunnelIpv4Source() {
            return _tunnelIpv4Source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tunnelIpv4Destination == null) ? 0 : _tunnelIpv4Destination.hashCode());
            result = prime * result + ((_tunnelIpv4Source == null) ? 0 : _tunnelIpv4Source.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match)obj;
            if (_tunnelIpv4Destination == null) {
                if (other.getTunnelIpv4Destination() != null) {
                    return false;
                }
            } else if(!_tunnelIpv4Destination.equals(other.getTunnelIpv4Destination())) {
                return false;
            }
            if (_tunnelIpv4Source == null) {
                if (other.getTunnelIpv4Source() != null) {
                    return false;
                }
            } else if(!_tunnelIpv4Source.equals(other.getTunnelIpv4Source())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TunnelIpv4MatchImpl otherImpl = (TunnelIpv4MatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.TunnelIpv4Match>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TunnelIpv4Match [");
            boolean first = true;
        
            if (_tunnelIpv4Destination != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnelIpv4Destination=");
                builder.append(_tunnelIpv4Destination);
             }
            if (_tunnelIpv4Source != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnelIpv4Source=");
                builder.append(_tunnelIpv4Source);
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
