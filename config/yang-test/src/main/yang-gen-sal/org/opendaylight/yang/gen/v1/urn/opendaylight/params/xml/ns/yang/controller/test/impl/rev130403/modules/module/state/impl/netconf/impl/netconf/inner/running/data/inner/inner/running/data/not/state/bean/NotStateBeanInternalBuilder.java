package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal
 */
public class NotStateBeanInternalBuilder {

    private java.lang.String _element2;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> augmentation = new HashMap<>();

    public NotStateBeanInternalBuilder() {
    } 

    public NotStateBeanInternalBuilder(NotStateBeanInternal base) {
        this._element2 = base.getElement2();
        if (base instanceof NotStateBeanInternalImpl) {
            NotStateBeanInternalImpl _impl = (NotStateBeanInternalImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getElement2() {
        return _element2;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NotStateBeanInternalBuilder setElement2(java.lang.String value) {
        this._element2 = value;
        return this;
    }
    
    public NotStateBeanInternalBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NotStateBeanInternal build() {
        return new NotStateBeanInternalImpl(this);
    }

    private static final class NotStateBeanInternalImpl implements NotStateBeanInternal {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal.class;
        }

        private final java.lang.String _element2;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> augmentation = new HashMap<>();

        private NotStateBeanInternalImpl(NotStateBeanInternalBuilder base) {
            this._element2 = base.getElement2();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getElement2() {
            return _element2;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_element2 == null) ? 0 : _element2.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal)obj;
            if (_element2 == null) {
                if (other.getElement2() != null) {
                    return false;
                }
            } else if(!_element2.equals(other.getElement2())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NotStateBeanInternalImpl otherImpl = (NotStateBeanInternalImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.not.state.bean.NotStateBeanInternal>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NotStateBeanInternal [");
            boolean first = true;
        
            if (_element2 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_element2=");
                builder.append(_element2);
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
