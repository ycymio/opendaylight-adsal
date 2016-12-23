package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.reconnect.immediately.strategy.factory.ReconnectExecutor;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory
 */
public class ReconnectImmediatelyStrategyFactoryBuilder {

    private ReconnectExecutor _reconnectExecutor;
    private java.lang.Integer _reconnectTimeout;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> augmentation = new HashMap<>();

    public ReconnectImmediatelyStrategyFactoryBuilder() {
    } 
    

    public ReconnectImmediatelyStrategyFactoryBuilder(ReconnectImmediatelyStrategyFactory base) {
        this._reconnectExecutor = base.getReconnectExecutor();
        this._reconnectTimeout = base.getReconnectTimeout();
        if (base instanceof ReconnectImmediatelyStrategyFactoryImpl) {
            ReconnectImmediatelyStrategyFactoryImpl _impl = (ReconnectImmediatelyStrategyFactoryImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public ReconnectExecutor getReconnectExecutor() {
        return _reconnectExecutor;
    }
    
    public java.lang.Integer getReconnectTimeout() {
        return _reconnectTimeout;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ReconnectImmediatelyStrategyFactoryBuilder setReconnectExecutor(ReconnectExecutor value) {
        this._reconnectExecutor = value;
        return this;
    }
    
    public ReconnectImmediatelyStrategyFactoryBuilder setReconnectTimeout(java.lang.Integer value) {
        this._reconnectTimeout = value;
        return this;
    }
    
    public ReconnectImmediatelyStrategyFactoryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ReconnectImmediatelyStrategyFactory build() {
        return new ReconnectImmediatelyStrategyFactoryImpl(this);
    }

    private static final class ReconnectImmediatelyStrategyFactoryImpl implements ReconnectImmediatelyStrategyFactory {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory.class;
        }

        private final ReconnectExecutor _reconnectExecutor;
        private final java.lang.Integer _reconnectTimeout;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> augmentation = new HashMap<>();

        private ReconnectImmediatelyStrategyFactoryImpl(ReconnectImmediatelyStrategyFactoryBuilder base) {
            this._reconnectExecutor = base.getReconnectExecutor();
            this._reconnectTimeout = base.getReconnectTimeout();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public ReconnectExecutor getReconnectExecutor() {
            return _reconnectExecutor;
        }
        
        @Override
        public java.lang.Integer getReconnectTimeout() {
            return _reconnectTimeout;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_reconnectExecutor == null) ? 0 : _reconnectExecutor.hashCode());
            result = prime * result + ((_reconnectTimeout == null) ? 0 : _reconnectTimeout.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory)obj;
            if (_reconnectExecutor == null) {
                if (other.getReconnectExecutor() != null) {
                    return false;
                }
            } else if(!_reconnectExecutor.equals(other.getReconnectExecutor())) {
                return false;
            }
            if (_reconnectTimeout == null) {
                if (other.getReconnectTimeout() != null) {
                    return false;
                }
            } else if(!_reconnectTimeout.equals(other.getReconnectTimeout())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ReconnectImmediatelyStrategyFactoryImpl otherImpl = (ReconnectImmediatelyStrategyFactoryImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ReconnectImmediatelyStrategyFactory [");
            boolean first = true;
        
            if (_reconnectExecutor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reconnectExecutor=");
                builder.append(_reconnectExecutor);
             }
            if (_reconnectTimeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reconnectTimeout=");
                builder.append(_reconnectTimeout);
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
