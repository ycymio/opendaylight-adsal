package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4
 */
public class Ipv4Builder {

    private Ipv4Prefix _ipv4Address;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentation = new HashMap<>();

    public Ipv4Builder() {
    } 
    

    public Ipv4Builder(Ipv4 base) {
        this._ipv4Address = base.getIpv4Address();
        if (base instanceof Ipv4Impl) {
            Ipv4Impl _impl = (Ipv4Impl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Ipv4Prefix getIpv4Address() {
        return _ipv4Address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv4Builder setIpv4Address(Ipv4Prefix value) {
        this._ipv4Address = value;
        return this;
    }
    
    public Ipv4Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv4 build() {
        return new Ipv4Impl(this);
    }

    private static final class Ipv4Impl implements Ipv4 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4.class;
        }

        private final Ipv4Prefix _ipv4Address;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentation = new HashMap<>();

        private Ipv4Impl(Ipv4Builder base) {
            this._ipv4Address = base.getIpv4Address();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Ipv4Prefix getIpv4Address() {
            return _ipv4Address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv4Address == null) ? 0 : _ipv4Address.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4 other = (org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4)obj;
            if (_ipv4Address == null) {
                if (other.getIpv4Address() != null) {
                    return false;
                }
            } else if(!_ipv4Address.equals(other.getIpv4Address())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv4Impl otherImpl = (Ipv4Impl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv4 [");
            boolean first = true;
        
            if (_ipv4Address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Address=");
                builder.append(_ipv4Address);
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
