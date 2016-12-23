package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppendersKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders
 */
public class FileAppendersBuilder {

    private java.lang.String _encoderPattern;
    private java.lang.String _fileName;
    private FileAppendersKey _key;
    private java.lang.String _name;
    private java.lang.Boolean _append;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> augmentation = new HashMap<>();

    public FileAppendersBuilder() {
    } 

    public FileAppendersBuilder(FileAppenders base) {
        if (base.getKey() == null) {
            this._key = new FileAppendersKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._encoderPattern = base.getEncoderPattern();
        this._fileName = base.getFileName();
        this._append = base.isAppend();
        if (base instanceof FileAppendersImpl) {
            FileAppendersImpl _impl = (FileAppendersImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getEncoderPattern() {
        return _encoderPattern;
    }
    
    public java.lang.String getFileName() {
        return _fileName;
    }
    
    public FileAppendersKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Boolean isAppend() {
        return _append;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FileAppendersBuilder setEncoderPattern(java.lang.String value) {
        this._encoderPattern = value;
        return this;
    }
    
    public FileAppendersBuilder setFileName(java.lang.String value) {
        this._fileName = value;
        return this;
    }
    
    public FileAppendersBuilder setKey(FileAppendersKey value) {
        this._key = value;
        return this;
    }
    
    public FileAppendersBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public FileAppendersBuilder setAppend(java.lang.Boolean value) {
        this._append = value;
        return this;
    }
    
    public FileAppendersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FileAppenders build() {
        return new FileAppendersImpl(this);
    }

    private static final class FileAppendersImpl implements FileAppenders {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders.class;
        }

        private final java.lang.String _encoderPattern;
        private final java.lang.String _fileName;
        private final FileAppendersKey _key;
        private final java.lang.String _name;
        private final java.lang.Boolean _append;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> augmentation = new HashMap<>();

        private FileAppendersImpl(FileAppendersBuilder base) {
            if (base.getKey() == null) {
                this._key = new FileAppendersKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._encoderPattern = base.getEncoderPattern();
            this._fileName = base.getFileName();
            this._append = base.isAppend();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>singletonMap(e.getKey(), e.getValue());       
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
        public java.lang.String getFileName() {
            return _fileName;
        }
        
        @Override
        public FileAppendersKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Boolean isAppend() {
            return _append;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_fileName == null) ? 0 : _fileName.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_append == null) ? 0 : _append.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders)obj;
            if (_encoderPattern == null) {
                if (other.getEncoderPattern() != null) {
                    return false;
                }
            } else if(!_encoderPattern.equals(other.getEncoderPattern())) {
                return false;
            }
            if (_fileName == null) {
                if (other.getFileName() != null) {
                    return false;
                }
            } else if(!_fileName.equals(other.getFileName())) {
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
            if (_append == null) {
                if (other.isAppend() != null) {
                    return false;
                }
            } else if(!_append.equals(other.isAppend())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FileAppendersImpl otherImpl = (FileAppendersImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FileAppenders [");
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
            if (_fileName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_fileName=");
                builder.append(_fileName);
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
            if (_append != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_append=");
                builder.append(_append);
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
