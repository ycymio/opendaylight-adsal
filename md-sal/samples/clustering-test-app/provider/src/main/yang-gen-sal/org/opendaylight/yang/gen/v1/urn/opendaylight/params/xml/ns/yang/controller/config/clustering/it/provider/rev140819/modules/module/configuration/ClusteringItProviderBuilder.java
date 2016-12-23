package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.clustering.it.provider.RpcRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.clustering.it.provider.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.clustering.it.provider.NotificationService;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider
 */
public class ClusteringItProviderBuilder {

    private DataBroker _dataBroker;
    private NotificationService _notificationService;
    private RpcRegistry _rpcRegistry;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> augmentation = new HashMap<>();

    public ClusteringItProviderBuilder() {
    } 
    

    public ClusteringItProviderBuilder(ClusteringItProvider base) {
        this._dataBroker = base.getDataBroker();
        this._notificationService = base.getNotificationService();
        this._rpcRegistry = base.getRpcRegistry();
        if (base instanceof ClusteringItProviderImpl) {
            ClusteringItProviderImpl _impl = (ClusteringItProviderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public DataBroker getDataBroker() {
        return _dataBroker;
    }
    
    public NotificationService getNotificationService() {
        return _notificationService;
    }
    
    public RpcRegistry getRpcRegistry() {
        return _rpcRegistry;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ClusteringItProviderBuilder setDataBroker(DataBroker value) {
        this._dataBroker = value;
        return this;
    }
    
    public ClusteringItProviderBuilder setNotificationService(NotificationService value) {
        this._notificationService = value;
        return this;
    }
    
    public ClusteringItProviderBuilder setRpcRegistry(RpcRegistry value) {
        this._rpcRegistry = value;
        return this;
    }
    
    public ClusteringItProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ClusteringItProvider build() {
        return new ClusteringItProviderImpl(this);
    }

    private static final class ClusteringItProviderImpl implements ClusteringItProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider.class;
        }

        private final DataBroker _dataBroker;
        private final NotificationService _notificationService;
        private final RpcRegistry _rpcRegistry;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> augmentation = new HashMap<>();

        private ClusteringItProviderImpl(ClusteringItProviderBuilder base) {
            this._dataBroker = base.getDataBroker();
            this._notificationService = base.getNotificationService();
            this._rpcRegistry = base.getRpcRegistry();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public DataBroker getDataBroker() {
            return _dataBroker;
        }
        
        @Override
        public NotificationService getNotificationService() {
            return _notificationService;
        }
        
        @Override
        public RpcRegistry getRpcRegistry() {
            return _rpcRegistry;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dataBroker == null) ? 0 : _dataBroker.hashCode());
            result = prime * result + ((_notificationService == null) ? 0 : _notificationService.hashCode());
            result = prime * result + ((_rpcRegistry == null) ? 0 : _rpcRegistry.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider)obj;
            if (_dataBroker == null) {
                if (other.getDataBroker() != null) {
                    return false;
                }
            } else if(!_dataBroker.equals(other.getDataBroker())) {
                return false;
            }
            if (_notificationService == null) {
                if (other.getNotificationService() != null) {
                    return false;
                }
            } else if(!_notificationService.equals(other.getNotificationService())) {
                return false;
            }
            if (_rpcRegistry == null) {
                if (other.getRpcRegistry() != null) {
                    return false;
                }
            } else if(!_rpcRegistry.equals(other.getRpcRegistry())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClusteringItProviderImpl otherImpl = (ClusteringItProviderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.clustering.it.provider.rev140819.modules.module.configuration.ClusteringItProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ClusteringItProvider [");
            boolean first = true;
        
            if (_dataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataBroker=");
                builder.append(_dataBroker);
             }
            if (_notificationService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notificationService=");
                builder.append(_notificationService);
             }
            if (_rpcRegistry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rpcRegistry=");
                builder.append(_rpcRegistry);
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
