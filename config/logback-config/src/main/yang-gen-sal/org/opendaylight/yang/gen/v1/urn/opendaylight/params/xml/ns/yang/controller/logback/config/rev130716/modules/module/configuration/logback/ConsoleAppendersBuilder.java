package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppendersKey;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders
 */
public class ConsoleAppendersBuilder {

    private java.lang.String _encoderPattern;
    private ConsoleAppendersKey _key;
    private java.lang.String _name;
    private java.lang.String _thresholdFilter;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> augmentation = new HashMap<>();

    public ConsoleAppendersBuilder() {
    } 

    public ConsoleAppendersBuilder(ConsoleAppenders base) {
        if (base.getKey() == null) {
            this._key = new ConsoleAppendersKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._encoderPattern = base.getEncoderPattern();
        this._thresholdFilter = base.getThresholdFilter();
        if (base instanceof ConsoleAppendersImpl) {
            ConsoleAppendersImpl _impl = (ConsoleAppendersImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getEncoderPattern() {
        return _encoderPattern;
    }
    
    public ConsoleAppendersKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getThresholdFilter() {
        return _thresholdFilter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ConsoleAppendersBuilder setEncoderPattern(java.lang.String value) {
        this._encoderPattern = value;
        return this;
    }
    
    public ConsoleAppendersBuilder setKey(ConsoleAppendersKey value) {
        this._key = value;
        return this;
    }
    
    public ConsoleAppendersBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public ConsoleAppendersBuilder setThresholdFilter(java.lang.String value) {
        this._thresholdFilter = value;
        return this;
    }
    
    public ConsoleAppendersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ConsoleAppenders build() {
        return new ConsoleAppendersImpl(this);
    }

    private static final class ConsoleAppendersImpl implements ConsoleAppenders {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders.class;
        }

        private final java.lang.String _encoderPattern;
        private final ConsoleAppendersKey _key;
        private final java.lang.String _name;
        private final java.lang.String _thresholdFilter;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> augmentation = new HashMap<>();

        private ConsoleAppendersImpl(ConsoleAppendersBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConsoleAppendersKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._encoderPattern = base.getEncoderPattern();
            this._thresholdFilter = base.getThresholdFilter();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getEncoderPattern() {
            return _encoderPattern;
        }
        
        @Override
        public ConsoleAppendersKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getThresholdFilter() {
            return _thresholdFilter;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_encoderPattern == null) ? 0 : _encoderPattern.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_thresholdFilter == null) ? 0 : _thresholdFilter.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders)obj;
            if (_encoderPattern == null) {
                if (other.getEncoderPattern() != null) {
                    return false;
                }
            } else if(!_encoderPattern.equals(other.getEncoderPattern())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_thresholdFilter == null) {
                if (other.getThresholdFilter() != null) {
                    return false;
                }
            } else if(!_thresholdFilter.equals(other.getThresholdFilter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConsoleAppendersImpl otherImpl = (ConsoleAppendersImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ConsoleAppenders [");
            boolean first = true;
        
            if (_encoderPattern != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_encoderPattern=");
                builder.append(_encoderPattern);
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
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_thresholdFilter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_thresholdFilter=");
                builder.append(_thresholdFilter);
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
