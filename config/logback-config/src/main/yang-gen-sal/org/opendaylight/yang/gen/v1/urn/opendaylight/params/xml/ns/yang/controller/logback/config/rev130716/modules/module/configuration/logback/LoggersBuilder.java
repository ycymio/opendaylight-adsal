package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.LoggersKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers
 */
public class LoggersBuilder {

    private List<java.lang.String> _appenders;
    private LoggersKey _key;
    private java.lang.String _level;
    private java.lang.String _loggerName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> augmentation = new HashMap<>();

    public LoggersBuilder() {
    } 

    public LoggersBuilder(Loggers base) {
        if (base.getKey() == null) {
            this._key = new LoggersKey(
                base.getLoggerName()
            );
            this._loggerName = base.getLoggerName();
        } else {
            this._key = base.getKey();
            this._loggerName = _key.getLoggerName();
        }
        this._appenders = base.getAppenders();
        this._level = base.getLevel();
        if (base instanceof LoggersImpl) {
            LoggersImpl _impl = (LoggersImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<java.lang.String> getAppenders() {
        return _appenders;
    }
    
    public LoggersKey getKey() {
        return _key;
    }
    
    public java.lang.String getLevel() {
        return _level;
    }
    
    public java.lang.String getLoggerName() {
        return _loggerName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public LoggersBuilder setAppenders(List<java.lang.String> value) {
        this._appenders = value;
        return this;
    }
    
    public LoggersBuilder setKey(LoggersKey value) {
        this._key = value;
        return this;
    }
    
    public LoggersBuilder setLevel(java.lang.String value) {
        this._level = value;
        return this;
    }
    
    public LoggersBuilder setLoggerName(java.lang.String value) {
        this._loggerName = value;
        return this;
    }
    
    public LoggersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Loggers build() {
        return new LoggersImpl(this);
    }

    private static final class LoggersImpl implements Loggers {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers.class;
        }

        private final List<java.lang.String> _appenders;
        private final LoggersKey _key;
        private final java.lang.String _level;
        private final java.lang.String _loggerName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> augmentation = new HashMap<>();

        private LoggersImpl(LoggersBuilder base) {
            if (base.getKey() == null) {
                this._key = new LoggersKey(
                    base.getLoggerName()
                );
                this._loggerName = base.getLoggerName();
            } else {
                this._key = base.getKey();
                this._loggerName = _key.getLoggerName();
            }
            this._appenders = base.getAppenders();
            this._level = base.getLevel();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<java.lang.String> getAppenders() {
            return _appenders;
        }
        
        @Override
        public LoggersKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getLevel() {
            return _level;
        }
        
        @Override
        public java.lang.String getLoggerName() {
            return _loggerName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_appenders == null) ? 0 : _appenders.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_level == null) ? 0 : _level.hashCode());
            result = prime * result + ((_loggerName == null) ? 0 : _loggerName.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers)obj;
            if (_appenders == null) {
                if (other.getAppenders() != null) {
                    return false;
                }
            } else if(!_appenders.equals(other.getAppenders())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_level == null) {
                if (other.getLevel() != null) {
                    return false;
                }
            } else if(!_level.equals(other.getLevel())) {
                return false;
            }
            if (_loggerName == null) {
                if (other.getLoggerName() != null) {
                    return false;
                }
            } else if(!_loggerName.equals(other.getLoggerName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LoggersImpl otherImpl = (LoggersImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Loggers [");
            boolean first = true;
        
            if (_appenders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_appenders=");
                builder.append(_appenders);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_level != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_level=");
                builder.append(_level);
             }
            if (_loggerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_loggerName=");
                builder.append(_loggerName);
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
