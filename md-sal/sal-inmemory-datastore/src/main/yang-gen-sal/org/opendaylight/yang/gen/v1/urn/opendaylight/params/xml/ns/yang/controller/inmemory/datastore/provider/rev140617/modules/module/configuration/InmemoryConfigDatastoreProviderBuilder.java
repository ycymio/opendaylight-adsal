package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider
 */
public class InmemoryConfigDatastoreProviderBuilder {

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.config.datastore.provider.InmemoryConfigDatastoreProvider _inmemoryConfigDatastoreProvider;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> augmentation = new HashMap<>();

    public InmemoryConfigDatastoreProviderBuilder() {
    } 
    

    public InmemoryConfigDatastoreProviderBuilder(InmemoryConfigDatastoreProvider base) {
        this._inmemoryConfigDatastoreProvider = base.getInmemoryConfigDatastoreProvider();
        if (base instanceof InmemoryConfigDatastoreProviderImpl) {
            InmemoryConfigDatastoreProviderImpl _impl = (InmemoryConfigDatastoreProviderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.config.datastore.provider.InmemoryConfigDatastoreProvider getInmemoryConfigDatastoreProvider() {
        return _inmemoryConfigDatastoreProvider;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InmemoryConfigDatastoreProviderBuilder setInmemoryConfigDatastoreProvider(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.config.datastore.provider.InmemoryConfigDatastoreProvider value) {
        this._inmemoryConfigDatastoreProvider = value;
        return this;
    }
    
    public InmemoryConfigDatastoreProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InmemoryConfigDatastoreProvider build() {
        return new InmemoryConfigDatastoreProviderImpl(this);
    }

    private static final class InmemoryConfigDatastoreProviderImpl implements InmemoryConfigDatastoreProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider.class;
        }

        private final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.config.datastore.provider.InmemoryConfigDatastoreProvider _inmemoryConfigDatastoreProvider;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> augmentation = new HashMap<>();

        private InmemoryConfigDatastoreProviderImpl(InmemoryConfigDatastoreProviderBuilder base) {
            this._inmemoryConfigDatastoreProvider = base.getInmemoryConfigDatastoreProvider();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.config.datastore.provider.InmemoryConfigDatastoreProvider getInmemoryConfigDatastoreProvider() {
            return _inmemoryConfigDatastoreProvider;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inmemoryConfigDatastoreProvider == null) ? 0 : _inmemoryConfigDatastoreProvider.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider)obj;
            if (_inmemoryConfigDatastoreProvider == null) {
                if (other.getInmemoryConfigDatastoreProvider() != null) {
                    return false;
                }
            } else if(!_inmemoryConfigDatastoreProvider.equals(other.getInmemoryConfigDatastoreProvider())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InmemoryConfigDatastoreProviderImpl otherImpl = (InmemoryConfigDatastoreProviderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.InmemoryConfigDatastoreProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InmemoryConfigDatastoreProvider [");
            boolean first = true;
        
            if (_inmemoryConfigDatastoreProvider != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inmemoryConfigDatastoreProvider=");
                builder.append(_inmemoryConfigDatastoreProvider);
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
