package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.never.reconnect.strategy.factory.Executor;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory
 */
public class NeverReconnectStrategyFactoryBuilder {

    private Executor _executor;
    private java.lang.Integer _timeout;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> augmentation = new HashMap<>();

    public NeverReconnectStrategyFactoryBuilder() {
    } 
    

    public NeverReconnectStrategyFactoryBuilder(NeverReconnectStrategyFactory base) {
        this._executor = base.getExecutor();
        this._timeout = base.getTimeout();
        if (base instanceof NeverReconnectStrategyFactoryImpl) {
            NeverReconnectStrategyFactoryImpl _impl = (NeverReconnectStrategyFactoryImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Executor getExecutor() {
        return _executor;
    }
    
    public java.lang.Integer getTimeout() {
        return _timeout;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NeverReconnectStrategyFactoryBuilder setExecutor(Executor value) {
        this._executor = value;
        return this;
    }
    
    public NeverReconnectStrategyFactoryBuilder setTimeout(java.lang.Integer value) {
        this._timeout = value;
        return this;
    }
    
    public NeverReconnectStrategyFactoryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NeverReconnectStrategyFactory build() {
        return new NeverReconnectStrategyFactoryImpl(this);
    }

    private static final class NeverReconnectStrategyFactoryImpl implements NeverReconnectStrategyFactory {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory.class;
        }

        private final Executor _executor;
        private final java.lang.Integer _timeout;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> augmentation = new HashMap<>();

        private NeverReconnectStrategyFactoryImpl(NeverReconnectStrategyFactoryBuilder base) {
            this._executor = base.getExecutor();
            this._timeout = base.getTimeout();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Executor getExecutor() {
            return _executor;
        }
        
        @Override
        public java.lang.Integer getTimeout() {
            return _timeout;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_executor == null) ? 0 : _executor.hashCode());
            result = prime * result + ((_timeout == null) ? 0 : _timeout.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory)obj;
            if (_executor == null) {
                if (other.getExecutor() != null) {
                    return false;
                }
            } else if(!_executor.equals(other.getExecutor())) {
                return false;
            }
            if (_timeout == null) {
                if (other.getTimeout() != null) {
                    return false;
                }
            } else if(!_timeout.equals(other.getTimeout())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NeverReconnectStrategyFactoryImpl otherImpl = (NeverReconnectStrategyFactoryImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.NeverReconnectStrategyFactory>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NeverReconnectStrategyFactory [");
            boolean first = true;
        
            if (_executor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_executor=");
                builder.append(_executor);
             }
            if (_timeout != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_timeout=");
                builder.append(_timeout);
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
