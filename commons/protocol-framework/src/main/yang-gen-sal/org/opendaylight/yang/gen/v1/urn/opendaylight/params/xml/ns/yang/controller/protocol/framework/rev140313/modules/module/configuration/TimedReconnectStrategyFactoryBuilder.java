package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory.TimedReconnectExecutor;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.math.BigDecimal;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory
 */
public class TimedReconnectStrategyFactoryBuilder {

    private java.lang.Integer _connectTime;
    private java.lang.Long _deadline;
    private java.lang.Long _maxAttempts;
    private java.lang.Long _maxSleep;
    private java.lang.Long _minSleep;
    private BigDecimal _sleepFactor;
    private TimedReconnectExecutor _timedReconnectExecutor;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> augmentation = new HashMap<>();

    public TimedReconnectStrategyFactoryBuilder() {
    } 
    

    public TimedReconnectStrategyFactoryBuilder(TimedReconnectStrategyFactory base) {
        this._connectTime = base.getConnectTime();
        this._deadline = base.getDeadline();
        this._maxAttempts = base.getMaxAttempts();
        this._maxSleep = base.getMaxSleep();
        this._minSleep = base.getMinSleep();
        this._sleepFactor = base.getSleepFactor();
        this._timedReconnectExecutor = base.getTimedReconnectExecutor();
        if (base instanceof TimedReconnectStrategyFactoryImpl) {
            TimedReconnectStrategyFactoryImpl _impl = (TimedReconnectStrategyFactoryImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Integer getConnectTime() {
        return _connectTime;
    }
    
    public java.lang.Long getDeadline() {
        return _deadline;
    }
    
    public java.lang.Long getMaxAttempts() {
        return _maxAttempts;
    }
    
    public java.lang.Long getMaxSleep() {
        return _maxSleep;
    }
    
    public java.lang.Long getMinSleep() {
        return _minSleep;
    }
    
    public BigDecimal getSleepFactor() {
        return _sleepFactor;
    }
    
    public TimedReconnectExecutor getTimedReconnectExecutor() {
        return _timedReconnectExecutor;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TimedReconnectStrategyFactoryBuilder setConnectTime(java.lang.Integer value) {
        this._connectTime = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setDeadline(java.lang.Long value) {
        this._deadline = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setMaxAttempts(java.lang.Long value) {
        this._maxAttempts = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setMaxSleep(java.lang.Long value) {
        this._maxSleep = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setMinSleep(java.lang.Long value) {
        this._minSleep = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setSleepFactor(BigDecimal value) {
        this._sleepFactor = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder setTimedReconnectExecutor(TimedReconnectExecutor value) {
        this._timedReconnectExecutor = value;
        return this;
    }
    
    public TimedReconnectStrategyFactoryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TimedReconnectStrategyFactory build() {
        return new TimedReconnectStrategyFactoryImpl(this);
    }

    private static final class TimedReconnectStrategyFactoryImpl implements TimedReconnectStrategyFactory {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory.class;
        }

        private final java.lang.Integer _connectTime;
        private final java.lang.Long _deadline;
        private final java.lang.Long _maxAttempts;
        private final java.lang.Long _maxSleep;
        private final java.lang.Long _minSleep;
        private final BigDecimal _sleepFactor;
        private final TimedReconnectExecutor _timedReconnectExecutor;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> augmentation = new HashMap<>();

        private TimedReconnectStrategyFactoryImpl(TimedReconnectStrategyFactoryBuilder base) {
            this._connectTime = base.getConnectTime();
            this._deadline = base.getDeadline();
            this._maxAttempts = base.getMaxAttempts();
            this._maxSleep = base.getMaxSleep();
            this._minSleep = base.getMinSleep();
            this._sleepFactor = base.getSleepFactor();
            this._timedReconnectExecutor = base.getTimedReconnectExecutor();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Integer getConnectTime() {
            return _connectTime;
        }
        
        @Override
        public java.lang.Long getDeadline() {
            return _deadline;
        }
        
        @Override
        public java.lang.Long getMaxAttempts() {
            return _maxAttempts;
        }
        
        @Override
        public java.lang.Long getMaxSleep() {
            return _maxSleep;
        }
        
        @Override
        public java.lang.Long getMinSleep() {
            return _minSleep;
        }
        
        @Override
        public BigDecimal getSleepFactor() {
            return _sleepFactor;
        }
        
        @Override
        public TimedReconnectExecutor getTimedReconnectExecutor() {
            return _timedReconnectExecutor;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_connectTime == null) ? 0 : _connectTime.hashCode());
            result = prime * result + ((_deadline == null) ? 0 : _deadline.hashCode());
            result = prime * result + ((_maxAttempts == null) ? 0 : _maxAttempts.hashCode());
            result = prime * result + ((_maxSleep == null) ? 0 : _maxSleep.hashCode());
            result = prime * result + ((_minSleep == null) ? 0 : _minSleep.hashCode());
            result = prime * result + ((_sleepFactor == null) ? 0 : _sleepFactor.hashCode());
            result = prime * result + ((_timedReconnectExecutor == null) ? 0 : _timedReconnectExecutor.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory)obj;
            if (_connectTime == null) {
                if (other.getConnectTime() != null) {
                    return false;
                }
            } else if(!_connectTime.equals(other.getConnectTime())) {
                return false;
            }
            if (_deadline == null) {
                if (other.getDeadline() != null) {
                    return false;
                }
            } else if(!_deadline.equals(other.getDeadline())) {
                return false;
            }
            if (_maxAttempts == null) {
                if (other.getMaxAttempts() != null) {
                    return false;
                }
            } else if(!_maxAttempts.equals(other.getMaxAttempts())) {
                return false;
            }
            if (_maxSleep == null) {
                if (other.getMaxSleep() != null) {
                    return false;
                }
            } else if(!_maxSleep.equals(other.getMaxSleep())) {
                return false;
            }
            if (_minSleep == null) {
                if (other.getMinSleep() != null) {
                    return false;
                }
            } else if(!_minSleep.equals(other.getMinSleep())) {
                return false;
            }
            if (_sleepFactor == null) {
                if (other.getSleepFactor() != null) {
                    return false;
                }
            } else if(!_sleepFactor.equals(other.getSleepFactor())) {
                return false;
            }
            if (_timedReconnectExecutor == null) {
                if (other.getTimedReconnectExecutor() != null) {
                    return false;
                }
            } else if(!_timedReconnectExecutor.equals(other.getTimedReconnectExecutor())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TimedReconnectStrategyFactoryImpl otherImpl = (TimedReconnectStrategyFactoryImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TimedReconnectStrategyFactory [");
            boolean first = true;
        
            if (_connectTime != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectTime=");
                builder.append(_connectTime);
             }
            if (_deadline != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_deadline=");
                builder.append(_deadline);
             }
            if (_maxAttempts != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxAttempts=");
                builder.append(_maxAttempts);
             }
            if (_maxSleep != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxSleep=");
                builder.append(_maxSleep);
             }
            if (_minSleep != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_minSleep=");
                builder.append(_minSleep);
             }
            if (_sleepFactor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sleepFactor=");
                builder.append(_sleepFactor);
             }
            if (_timedReconnectExecutor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_timedReconnectExecutor=");
                builder.append(_timedReconnectExecutor);
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
