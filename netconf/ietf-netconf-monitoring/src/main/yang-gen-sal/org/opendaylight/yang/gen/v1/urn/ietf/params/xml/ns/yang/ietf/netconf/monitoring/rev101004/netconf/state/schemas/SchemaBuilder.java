package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema.Location;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaKey;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema
 */
public class SchemaBuilder {

    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> _format;
    private java.lang.String _identifier;
    private SchemaKey _key;
    private List<Location> _location;
    private Uri _namespace;
    private java.lang.String _version;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> augmentation = new HashMap<>();

    public SchemaBuilder() {
    } 

    public SchemaBuilder(Schema base) {
        if (base.getKey() == null) {
            this._key = new SchemaKey(
                base.getFormat(), 
                base.getIdentifier(), 
                base.getVersion()
            );
            this._format = base.getFormat();
            this._identifier = base.getIdentifier();
            this._version = base.getVersion();
        } else {
            this._key = base.getKey();
            this._format = _key.getFormat();
            this._identifier = _key.getIdentifier();
            this._version = _key.getVersion();
        }
        this._location = base.getLocation();
        this._namespace = base.getNamespace();
        if (base instanceof SchemaImpl) {
            SchemaImpl _impl = (SchemaImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> getFormat() {
        return _format;
    }
    
    public java.lang.String getIdentifier() {
        return _identifier;
    }
    
    public SchemaKey getKey() {
        return _key;
    }
    
    public List<Location> getLocation() {
        return _location;
    }
    
    public Uri getNamespace() {
        return _namespace;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SchemaBuilder setFormat(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> value) {
        this._format = value;
        return this;
    }
    
    public SchemaBuilder setIdentifier(java.lang.String value) {
        this._identifier = value;
        return this;
    }
    
    public SchemaBuilder setKey(SchemaKey value) {
        this._key = value;
        return this;
    }
    
    public SchemaBuilder setLocation(List<Location> value) {
        this._location = value;
        return this;
    }
    
    public SchemaBuilder setNamespace(Uri value) {
        this._namespace = value;
        return this;
    }
    
    public SchemaBuilder setVersion(java.lang.String value) {
        this._version = value;
        return this;
    }
    
    public SchemaBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Schema build() {
        return new SchemaImpl(this);
    }

    private static final class SchemaImpl implements Schema {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema.class;
        }

        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> _format;
        private final java.lang.String _identifier;
        private final SchemaKey _key;
        private final List<Location> _location;
        private final Uri _namespace;
        private final java.lang.String _version;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> augmentation = new HashMap<>();

        private SchemaImpl(SchemaBuilder base) {
            if (base.getKey() == null) {
                this._key = new SchemaKey(
                    base.getFormat(), 
                    base.getIdentifier(), 
                    base.getVersion()
                );
                this._format = base.getFormat();
                this._identifier = base.getIdentifier();
                this._version = base.getVersion();
            } else {
                this._key = base.getKey();
                this._format = _key.getFormat();
                this._identifier = _key.getIdentifier();
                this._version = _key.getVersion();
            }
            this._location = base.getLocation();
            this._namespace = base.getNamespace();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> getFormat() {
            return _format;
        }
        
        @Override
        public java.lang.String getIdentifier() {
            return _identifier;
        }
        
        @Override
        public SchemaKey getKey() {
            return _key;
        }
        
        @Override
        public List<Location> getLocation() {
            return _location;
        }
        
        @Override
        public Uri getNamespace() {
            return _namespace;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_format == null) ? 0 : _format.hashCode());
            result = prime * result + ((_identifier == null) ? 0 : _identifier.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_location == null) ? 0 : _location.hashCode());
            result = prime * result + ((_namespace == null) ? 0 : _namespace.hashCode());
            result = prime * result + ((_version == null) ? 0 : _version.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema)obj;
            if (_format == null) {
                if (other.getFormat() != null) {
                    return false;
                }
            } else if(!_format.equals(other.getFormat())) {
                return false;
            }
            if (_identifier == null) {
                if (other.getIdentifier() != null) {
                    return false;
                }
            } else if(!_identifier.equals(other.getIdentifier())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_location == null) {
                if (other.getLocation() != null) {
                    return false;
                }
            } else if(!_location.equals(other.getLocation())) {
                return false;
            }
            if (_namespace == null) {
                if (other.getNamespace() != null) {
                    return false;
                }
            } else if(!_namespace.equals(other.getNamespace())) {
                return false;
            }
            if (_version == null) {
                if (other.getVersion() != null) {
                    return false;
                }
            } else if(!_version.equals(other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SchemaImpl otherImpl = (SchemaImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Schema [");
            boolean first = true;
        
            if (_format != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_format=");
                builder.append(_format);
             }
            if (_identifier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_identifier=");
                builder.append(_identifier);
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
            if (_location != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_location=");
                builder.append(_location);
             }
            if (_namespace != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_namespace=");
                builder.append(_namespace);
             }
            if (_version != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_version=");
                builder.append(_version);
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
