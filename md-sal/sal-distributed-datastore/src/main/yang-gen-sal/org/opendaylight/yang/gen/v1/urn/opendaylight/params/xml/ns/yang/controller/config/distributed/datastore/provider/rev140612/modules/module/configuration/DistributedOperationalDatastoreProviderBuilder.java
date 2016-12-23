package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalProperties;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.operational.datastore.provider.OperationalSchemaService;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider
 */
public class DistributedOperationalDatastoreProviderBuilder {

    private OperationalProperties _operationalProperties;
    private OperationalSchemaService _operationalSchemaService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> augmentation = new HashMap<>();

    public DistributedOperationalDatastoreProviderBuilder() {
    } 
    

    public DistributedOperationalDatastoreProviderBuilder(DistributedOperationalDatastoreProvider base) {
        this._operationalProperties = base.getOperationalProperties();
        this._operationalSchemaService = base.getOperationalSchemaService();
        if (base instanceof DistributedOperationalDatastoreProviderImpl) {
            DistributedOperationalDatastoreProviderImpl _impl = (DistributedOperationalDatastoreProviderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public OperationalProperties getOperationalProperties() {
        return _operationalProperties;
    }
    
    public OperationalSchemaService getOperationalSchemaService() {
        return _operationalSchemaService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DistributedOperationalDatastoreProviderBuilder setOperationalProperties(OperationalProperties value) {
        this._operationalProperties = value;
        return this;
    }
    
    public DistributedOperationalDatastoreProviderBuilder setOperationalSchemaService(OperationalSchemaService value) {
        this._operationalSchemaService = value;
        return this;
    }
    
    public DistributedOperationalDatastoreProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DistributedOperationalDatastoreProvider build() {
        return new DistributedOperationalDatastoreProviderImpl(this);
    }

    private static final class DistributedOperationalDatastoreProviderImpl implements DistributedOperationalDatastoreProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider.class;
        }

        private final OperationalProperties _operationalProperties;
        private final OperationalSchemaService _operationalSchemaService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> augmentation = new HashMap<>();

        private DistributedOperationalDatastoreProviderImpl(DistributedOperationalDatastoreProviderBuilder base) {
            this._operationalProperties = base.getOperationalProperties();
            this._operationalSchemaService = base.getOperationalSchemaService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public OperationalProperties getOperationalProperties() {
            return _operationalProperties;
        }
        
        @Override
        public OperationalSchemaService getOperationalSchemaService() {
            return _operationalSchemaService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_operationalProperties == null) ? 0 : _operationalProperties.hashCode());
            result = prime * result + ((_operationalSchemaService == null) ? 0 : _operationalSchemaService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider)obj;
            if (_operationalProperties == null) {
                if (other.getOperationalProperties() != null) {
                    return false;
                }
            } else if(!_operationalProperties.equals(other.getOperationalProperties())) {
                return false;
            }
            if (_operationalSchemaService == null) {
                if (other.getOperationalSchemaService() != null) {
                    return false;
                }
            } else if(!_operationalSchemaService.equals(other.getOperationalSchemaService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DistributedOperationalDatastoreProviderImpl otherImpl = (DistributedOperationalDatastoreProviderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedOperationalDatastoreProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DistributedOperationalDatastoreProvider [");
            boolean first = true;
        
            if (_operationalProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_operationalProperties=");
                builder.append(_operationalProperties);
             }
            if (_operationalSchemaService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_operationalSchemaService=");
                builder.append(_operationalSchemaService);
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
