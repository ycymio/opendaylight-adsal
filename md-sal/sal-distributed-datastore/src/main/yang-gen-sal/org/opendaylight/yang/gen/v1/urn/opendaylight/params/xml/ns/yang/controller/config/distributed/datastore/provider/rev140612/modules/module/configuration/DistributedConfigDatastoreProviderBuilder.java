package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.config.datastore.provider.ConfigSchemaService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.distributed.config.datastore.provider.ConfigProperties;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider
 */
public class DistributedConfigDatastoreProviderBuilder {

    private ConfigProperties _configProperties;
    private ConfigSchemaService _configSchemaService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> augmentation = new HashMap<>();

    public DistributedConfigDatastoreProviderBuilder() {
    } 
    

    public DistributedConfigDatastoreProviderBuilder(DistributedConfigDatastoreProvider base) {
        this._configProperties = base.getConfigProperties();
        this._configSchemaService = base.getConfigSchemaService();
        if (base instanceof DistributedConfigDatastoreProviderImpl) {
            DistributedConfigDatastoreProviderImpl _impl = (DistributedConfigDatastoreProviderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public ConfigProperties getConfigProperties() {
        return _configProperties;
    }
    
    public ConfigSchemaService getConfigSchemaService() {
        return _configSchemaService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DistributedConfigDatastoreProviderBuilder setConfigProperties(ConfigProperties value) {
        this._configProperties = value;
        return this;
    }
    
    public DistributedConfigDatastoreProviderBuilder setConfigSchemaService(ConfigSchemaService value) {
        this._configSchemaService = value;
        return this;
    }
    
    public DistributedConfigDatastoreProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DistributedConfigDatastoreProvider build() {
        return new DistributedConfigDatastoreProviderImpl(this);
    }

    private static final class DistributedConfigDatastoreProviderImpl implements DistributedConfigDatastoreProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider.class;
        }

        private final ConfigProperties _configProperties;
        private final ConfigSchemaService _configSchemaService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> augmentation = new HashMap<>();

        private DistributedConfigDatastoreProviderImpl(DistributedConfigDatastoreProviderBuilder base) {
            this._configProperties = base.getConfigProperties();
            this._configSchemaService = base.getConfigSchemaService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public ConfigProperties getConfigProperties() {
            return _configProperties;
        }
        
        @Override
        public ConfigSchemaService getConfigSchemaService() {
            return _configSchemaService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_configProperties == null) ? 0 : _configProperties.hashCode());
            result = prime * result + ((_configSchemaService == null) ? 0 : _configSchemaService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider)obj;
            if (_configProperties == null) {
                if (other.getConfigProperties() != null) {
                    return false;
                }
            } else if(!_configProperties.equals(other.getConfigProperties())) {
                return false;
            }
            if (_configSchemaService == null) {
                if (other.getConfigSchemaService() != null) {
                    return false;
                }
            } else if(!_configSchemaService.equals(other.getConfigSchemaService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DistributedConfigDatastoreProviderImpl otherImpl = (DistributedConfigDatastoreProviderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.modules.module.configuration.DistributedConfigDatastoreProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DistributedConfigDatastoreProvider [");
            boolean first = true;
        
            if (_configProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configProperties=");
                builder.append(_configProperties);
             }
            if (_configSchemaService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configSchemaService=");
                builder.append(_configSchemaService);
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
