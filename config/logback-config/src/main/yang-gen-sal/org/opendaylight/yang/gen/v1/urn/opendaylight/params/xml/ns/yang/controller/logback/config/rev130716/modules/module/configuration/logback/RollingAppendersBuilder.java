package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppendersKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders
 */
public class RollingAppendersBuilder {

    private java.lang.String _encoderPattern;
    private java.lang.String _fileName;
    private java.lang.String _fileNamePattern;
    private RollingAppendersKey _key;
    private java.lang.String _maxFileSize;
    private java.lang.Integer _maxHistory;
    private java.lang.Integer _maxIndex;
    private java.lang.Integer _minIndex;
    private java.lang.String _name;
    private java.lang.String _rollingPolicyType;
    private java.lang.Boolean _append;
    private java.lang.Boolean _cleanHistoryOnStart;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> augmentation = new HashMap<>();

    public RollingAppendersBuilder() {
    } 

    public RollingAppendersBuilder(RollingAppenders base) {
        if (base.getKey() == null) {
            this._key = new RollingAppendersKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._encoderPattern = base.getEncoderPattern();
        this._fileName = base.getFileName();
        this._fileNamePattern = base.getFileNamePattern();
        this._maxFileSize = base.getMaxFileSize();
        this._maxHistory = base.getMaxHistory();
        this._maxIndex = base.getMaxIndex();
        this._minIndex = base.getMinIndex();
        this._rollingPolicyType = base.getRollingPolicyType();
        this._append = base.isAppend();
        this._cleanHistoryOnStart = base.isCleanHistoryOnStart();
        if (base instanceof RollingAppendersImpl) {
            RollingAppendersImpl _impl = (RollingAppendersImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getEncoderPattern() {
        return _encoderPattern;
    }
    
    public java.lang.String getFileName() {
        return _fileName;
    }
    
    public java.lang.String getFileNamePattern() {
        return _fileNamePattern;
    }
    
    public RollingAppendersKey getKey() {
        return _key;
    }
    
    public java.lang.String getMaxFileSize() {
        return _maxFileSize;
    }
    
    public java.lang.Integer getMaxHistory() {
        return _maxHistory;
    }
    
    public java.lang.Integer getMaxIndex() {
        return _maxIndex;
    }
    
    public java.lang.Integer getMinIndex() {
        return _minIndex;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getRollingPolicyType() {
        return _rollingPolicyType;
    }
    
    public java.lang.Boolean isAppend() {
        return _append;
    }
    
    public java.lang.Boolean isCleanHistoryOnStart() {
        return _cleanHistoryOnStart;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RollingAppendersBuilder setEncoderPattern(java.lang.String value) {
        this._encoderPattern = value;
        return this;
    }
    
    public RollingAppendersBuilder setFileName(java.lang.String value) {
        this._fileName = value;
        return this;
    }
    
    public RollingAppendersBuilder setFileNamePattern(java.lang.String value) {
        this._fileNamePattern = value;
        return this;
    }
    
    public RollingAppendersBuilder setKey(RollingAppendersKey value) {
        this._key = value;
        return this;
    }
    
    public RollingAppendersBuilder setMaxFileSize(java.lang.String value) {
        this._maxFileSize = value;
        return this;
    }
    
    public RollingAppendersBuilder setMaxHistory(java.lang.Integer value) {
        this._maxHistory = value;
        return this;
    }
    
    public RollingAppendersBuilder setMaxIndex(java.lang.Integer value) {
        this._maxIndex = value;
        return this;
    }
    
    public RollingAppendersBuilder setMinIndex(java.lang.Integer value) {
        this._minIndex = value;
        return this;
    }
    
    public RollingAppendersBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public RollingAppendersBuilder setRollingPolicyType(java.lang.String value) {
        this._rollingPolicyType = value;
        return this;
    }
    
    public RollingAppendersBuilder setAppend(java.lang.Boolean value) {
        this._append = value;
        return this;
    }
    
    public RollingAppendersBuilder setCleanHistoryOnStart(java.lang.Boolean value) {
        this._cleanHistoryOnStart = value;
        return this;
    }
    
    public RollingAppendersBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RollingAppenders build() {
        return new RollingAppendersImpl(this);
    }

    private static final class RollingAppendersImpl implements RollingAppenders {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders.class;
        }

        private final java.lang.String _encoderPattern;
        private final java.lang.String _fileName;
        private final java.lang.String _fileNamePattern;
        private final RollingAppendersKey _key;
        private final java.lang.String _maxFileSize;
        private final java.lang.Integer _maxHistory;
        private final java.lang.Integer _maxIndex;
        private final java.lang.Integer _minIndex;
        private final java.lang.String _name;
        private final java.lang.String _rollingPolicyType;
        private final java.lang.Boolean _append;
        private final java.lang.Boolean _cleanHistoryOnStart;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> augmentation = new HashMap<>();

        private RollingAppendersImpl(RollingAppendersBuilder base) {
            if (base.getKey() == null) {
                this._key = new RollingAppendersKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._encoderPattern = base.getEncoderPattern();
            this._fileName = base.getFileName();
            this._fileNamePattern = base.getFileNamePattern();
            this._maxFileSize = base.getMaxFileSize();
            this._maxHistory = base.getMaxHistory();
            this._maxIndex = base.getMaxIndex();
            this._minIndex = base.getMinIndex();
            this._rollingPolicyType = base.getRollingPolicyType();
            this._append = base.isAppend();
            this._cleanHistoryOnStart = base.isCleanHistoryOnStart();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>singletonMap(e.getKey(), e.getValue());       
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
        public java.lang.String getFileNamePattern() {
            return _fileNamePattern;
        }
        
        @Override
        public RollingAppendersKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMaxFileSize() {
            return _maxFileSize;
        }
        
        @Override
        public java.lang.Integer getMaxHistory() {
            return _maxHistory;
        }
        
        @Override
        public java.lang.Integer getMaxIndex() {
            return _maxIndex;
        }
        
        @Override
        public java.lang.Integer getMinIndex() {
            return _minIndex;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getRollingPolicyType() {
            return _rollingPolicyType;
        }
        
        @Override
        public java.lang.Boolean isAppend() {
            return _append;
        }
        
        @Override
        public java.lang.Boolean isCleanHistoryOnStart() {
            return _cleanHistoryOnStart;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_fileNamePattern == null) ? 0 : _fileNamePattern.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_maxFileSize == null) ? 0 : _maxFileSize.hashCode());
            result = prime * result + ((_maxHistory == null) ? 0 : _maxHistory.hashCode());
            result = prime * result + ((_maxIndex == null) ? 0 : _maxIndex.hashCode());
            result = prime * result + ((_minIndex == null) ? 0 : _minIndex.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_rollingPolicyType == null) ? 0 : _rollingPolicyType.hashCode());
            result = prime * result + ((_append == null) ? 0 : _append.hashCode());
            result = prime * result + ((_cleanHistoryOnStart == null) ? 0 : _cleanHistoryOnStart.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders)obj;
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
            if (_fileNamePattern == null) {
                if (other.getFileNamePattern() != null) {
                    return false;
                }
            } else if(!_fileNamePattern.equals(other.getFileNamePattern())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_maxFileSize == null) {
                if (other.getMaxFileSize() != null) {
                    return false;
                }
            } else if(!_maxFileSize.equals(other.getMaxFileSize())) {
                return false;
            }
            if (_maxHistory == null) {
                if (other.getMaxHistory() != null) {
                    return false;
                }
            } else if(!_maxHistory.equals(other.getMaxHistory())) {
                return false;
            }
            if (_maxIndex == null) {
                if (other.getMaxIndex() != null) {
                    return false;
                }
            } else if(!_maxIndex.equals(other.getMaxIndex())) {
                return false;
            }
            if (_minIndex == null) {
                if (other.getMinIndex() != null) {
                    return false;
                }
            } else if(!_minIndex.equals(other.getMinIndex())) {
                return false;
            }
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_rollingPolicyType == null) {
                if (other.getRollingPolicyType() != null) {
                    return false;
                }
            } else if(!_rollingPolicyType.equals(other.getRollingPolicyType())) {
                return false;
            }
            if (_append == null) {
                if (other.isAppend() != null) {
                    return false;
                }
            } else if(!_append.equals(other.isAppend())) {
                return false;
            }
            if (_cleanHistoryOnStart == null) {
                if (other.isCleanHistoryOnStart() != null) {
                    return false;
                }
            } else if(!_cleanHistoryOnStart.equals(other.isCleanHistoryOnStart())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RollingAppendersImpl otherImpl = (RollingAppendersImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RollingAppenders [");
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
            if (_fileNamePattern != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_fileNamePattern=");
                builder.append(_fileNamePattern);
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
            if (_maxFileSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxFileSize=");
                builder.append(_maxFileSize);
             }
            if (_maxHistory != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxHistory=");
                builder.append(_maxHistory);
             }
            if (_maxIndex != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxIndex=");
                builder.append(_maxIndex);
             }
            if (_minIndex != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_minIndex=");
                builder.append(_minIndex);
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
            if (_rollingPolicyType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rollingPolicyType=");
                builder.append(_rollingPolicyType);
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
            if (_cleanHistoryOnStart != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_cleanHistoryOnStart=");
                builder.append(_cleanHistoryOnStart);
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
