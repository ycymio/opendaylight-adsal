package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.broker.impl.RootSchemaService;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.broker.impl.DataStore;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.broker.impl.AsyncDataBroker;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl
 */
public class DomBrokerImplBuilder {

    private AsyncDataBroker _asyncDataBroker;
    private DataStore _dataStore;
    private RootSchemaService _rootSchemaService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentation = new HashMap<>();

    public DomBrokerImplBuilder() {
    } 
    

    public DomBrokerImplBuilder(DomBrokerImpl base) {
        this._asyncDataBroker = base.getAsyncDataBroker();
        this._dataStore = base.getDataStore();
        this._rootSchemaService = base.getRootSchemaService();
        if (base instanceof DomBrokerImplImpl) {
            DomBrokerImplImpl _impl = (DomBrokerImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public AsyncDataBroker getAsyncDataBroker() {
        return _asyncDataBroker;
    }
    
    public DataStore getDataStore() {
        return _dataStore;
    }
    
    public RootSchemaService getRootSchemaService() {
        return _rootSchemaService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomBrokerImplBuilder setAsyncDataBroker(AsyncDataBroker value) {
        this._asyncDataBroker = value;
        return this;
    }
    
    public DomBrokerImplBuilder setDataStore(DataStore value) {
        this._dataStore = value;
        return this;
    }
    
    public DomBrokerImplBuilder setRootSchemaService(RootSchemaService value) {
        this._rootSchemaService = value;
        return this;
    }
    
    public DomBrokerImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DomBrokerImpl build() {
        return new DomBrokerImplImpl(this);
    }

    private static final class DomBrokerImplImpl implements DomBrokerImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl.class;
        }

        private final AsyncDataBroker _asyncDataBroker;
        private final DataStore _dataStore;
        private final RootSchemaService _rootSchemaService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentation = new HashMap<>();

        private DomBrokerImplImpl(DomBrokerImplBuilder base) {
            this._asyncDataBroker = base.getAsyncDataBroker();
            this._dataStore = base.getDataStore();
            this._rootSchemaService = base.getRootSchemaService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public AsyncDataBroker getAsyncDataBroker() {
            return _asyncDataBroker;
        }
        
        @Override
        public DataStore getDataStore() {
            return _dataStore;
        }
        
        @Override
        public RootSchemaService getRootSchemaService() {
            return _rootSchemaService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_asyncDataBroker == null) ? 0 : _asyncDataBroker.hashCode());
            result = prime * result + ((_dataStore == null) ? 0 : _dataStore.hashCode());
            result = prime * result + ((_rootSchemaService == null) ? 0 : _rootSchemaService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl)obj;
            if (_asyncDataBroker == null) {
                if (other.getAsyncDataBroker() != null) {
                    return false;
                }
            } else if(!_asyncDataBroker.equals(other.getAsyncDataBroker())) {
                return false;
            }
            if (_dataStore == null) {
                if (other.getDataStore() != null) {
                    return false;
                }
            } else if(!_dataStore.equals(other.getDataStore())) {
                return false;
            }
            if (_rootSchemaService == null) {
                if (other.getRootSchemaService() != null) {
                    return false;
                }
            } else if(!_rootSchemaService.equals(other.getRootSchemaService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DomBrokerImplImpl otherImpl = (DomBrokerImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DomBrokerImpl [");
            boolean first = true;
        
            if (_asyncDataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_asyncDataBroker=");
                builder.append(_asyncDataBroker);
             }
            if (_dataStore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataStore=");
                builder.append(_dataStore);
             }
            if (_rootSchemaService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rootSchemaService=");
                builder.append(_rootSchemaService);
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
