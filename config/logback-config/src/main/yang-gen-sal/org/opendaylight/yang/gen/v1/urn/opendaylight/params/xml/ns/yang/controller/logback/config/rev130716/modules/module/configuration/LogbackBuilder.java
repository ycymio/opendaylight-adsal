package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback
 */
public class LogbackBuilder {

    private List<ConsoleAppenders> _consoleAppenders;
    private List<FileAppenders> _fileAppenders;
    private List<Loggers> _loggers;
    private List<RollingAppenders> _rollingAppenders;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> augmentation = new HashMap<>();

    public LogbackBuilder() {
    } 
    

    public LogbackBuilder(Logback base) {
        this._consoleAppenders = base.getConsoleAppenders();
        this._fileAppenders = base.getFileAppenders();
        this._loggers = base.getLoggers();
        this._rollingAppenders = base.getRollingAppenders();
        if (base instanceof LogbackImpl) {
            LogbackImpl _impl = (LogbackImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<ConsoleAppenders> getConsoleAppenders() {
        return _consoleAppenders;
    }
    
    public List<FileAppenders> getFileAppenders() {
        return _fileAppenders;
    }
    
    public List<Loggers> getLoggers() {
        return _loggers;
    }
    
    public List<RollingAppenders> getRollingAppenders() {
        return _rollingAppenders;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public LogbackBuilder setConsoleAppenders(List<ConsoleAppenders> value) {
        this._consoleAppenders = value;
        return this;
    }
    
    public LogbackBuilder setFileAppenders(List<FileAppenders> value) {
        this._fileAppenders = value;
        return this;
    }
    
    public LogbackBuilder setLoggers(List<Loggers> value) {
        this._loggers = value;
        return this;
    }
    
    public LogbackBuilder setRollingAppenders(List<RollingAppenders> value) {
        this._rollingAppenders = value;
        return this;
    }
    
    public LogbackBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Logback build() {
        return new LogbackImpl(this);
    }

    private static final class LogbackImpl implements Logback {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback.class;
        }

        private final List<ConsoleAppenders> _consoleAppenders;
        private final List<FileAppenders> _fileAppenders;
        private final List<Loggers> _loggers;
        private final List<RollingAppenders> _rollingAppenders;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> augmentation = new HashMap<>();

        private LogbackImpl(LogbackBuilder base) {
            this._consoleAppenders = base.getConsoleAppenders();
            this._fileAppenders = base.getFileAppenders();
            this._loggers = base.getLoggers();
            this._rollingAppenders = base.getRollingAppenders();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<ConsoleAppenders> getConsoleAppenders() {
            return _consoleAppenders;
        }
        
        @Override
        public List<FileAppenders> getFileAppenders() {
            return _fileAppenders;
        }
        
        @Override
        public List<Loggers> getLoggers() {
            return _loggers;
        }
        
        @Override
        public List<RollingAppenders> getRollingAppenders() {
            return _rollingAppenders;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_consoleAppenders == null) ? 0 : _consoleAppenders.hashCode());
            result = prime * result + ((_fileAppenders == null) ? 0 : _fileAppenders.hashCode());
            result = prime * result + ((_loggers == null) ? 0 : _loggers.hashCode());
            result = prime * result + ((_rollingAppenders == null) ? 0 : _rollingAppenders.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback)obj;
            if (_consoleAppenders == null) {
                if (other.getConsoleAppenders() != null) {
                    return false;
                }
            } else if(!_consoleAppenders.equals(other.getConsoleAppenders())) {
                return false;
            }
            if (_fileAppenders == null) {
                if (other.getFileAppenders() != null) {
                    return false;
                }
            } else if(!_fileAppenders.equals(other.getFileAppenders())) {
                return false;
            }
            if (_loggers == null) {
                if (other.getLoggers() != null) {
                    return false;
                }
            } else if(!_loggers.equals(other.getLoggers())) {
                return false;
            }
            if (_rollingAppenders == null) {
                if (other.getRollingAppenders() != null) {
                    return false;
                }
            } else if(!_rollingAppenders.equals(other.getRollingAppenders())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LogbackImpl otherImpl = (LogbackImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Logback [");
            boolean first = true;
        
            if (_consoleAppenders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_consoleAppenders=");
                builder.append(_consoleAppenders);
             }
            if (_fileAppenders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_fileAppenders=");
                builder.append(_fileAppenders);
             }
            if (_loggers != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_loggers=");
                builder.append(_loggers);
             }
            if (_rollingAppenders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rollingAppenders=");
                builder.append(_rollingAppenders);
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
