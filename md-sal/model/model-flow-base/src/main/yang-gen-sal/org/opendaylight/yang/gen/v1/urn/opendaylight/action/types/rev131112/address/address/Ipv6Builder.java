package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6
 */
public class Ipv6Builder {

    private Ipv6Prefix _ipv6Address;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentation = new HashMap<>();

    public Ipv6Builder() {
    } 
    

    public Ipv6Builder(Ipv6 base) {
        this._ipv6Address = base.getIpv6Address();
        if (base instanceof Ipv6Impl) {
            Ipv6Impl _impl = (Ipv6Impl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Ipv6Prefix getIpv6Address() {
        return _ipv6Address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv6Builder setIpv6Address(Ipv6Prefix value) {
        this._ipv6Address = value;
        return this;
    }
    
    public Ipv6Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv6 build() {
        return new Ipv6Impl(this);
    }

    private static final class Ipv6Impl implements Ipv6 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6.class;
        }

        private final Ipv6Prefix _ipv6Address;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentation = new HashMap<>();

        private Ipv6Impl(Ipv6Builder base) {
            this._ipv6Address = base.getIpv6Address();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Ipv6Prefix getIpv6Address() {
            return _ipv6Address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv6Address == null) ? 0 : _ipv6Address.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6 other = (org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6)obj;
            if (_ipv6Address == null) {
                if (other.getIpv6Address() != null) {
                    return false;
                }
            } else if(!_ipv6Address.equals(other.getIpv6Address())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Ipv6Impl otherImpl = (Ipv6Impl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Ipv6 [");
            boolean first = true;
        
            if (_ipv6Address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Address=");
                builder.append(_ipv6Address);
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
