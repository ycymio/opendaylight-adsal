package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.operational.Get;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational
 */
public class OperationalBuilder {

    private Get _get;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> augmentation = new HashMap<>();

    public OperationalBuilder() {
    } 

    public OperationalBuilder(Operational base) {
        this._get = base.getGet();
        if (base instanceof OperationalImpl) {
            OperationalImpl _impl = (OperationalImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Get getGet() {
        return _get;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OperationalBuilder setGet(Get value) {
        this._get = value;
        return this;
    }
    
    public OperationalBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Operational build() {
        return new OperationalImpl(this);
    }

    private static final class OperationalImpl implements Operational {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational.class;
        }

        private final Get _get;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> augmentation = new HashMap<>();

        private OperationalImpl(OperationalBuilder base) {
            this._get = base.getGet();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Get getGet() {
            return _get;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_get == null) ? 0 : _get.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational)obj;
            if (_get == null) {
                if (other.getGet() != null) {
                    return false;
                }
            } else if(!_get.equals(other.getGet())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OperationalImpl otherImpl = (OperationalImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Operational [");
            boolean first = true;
        
            if (_get != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_get=");
                builder.append(_get);
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
