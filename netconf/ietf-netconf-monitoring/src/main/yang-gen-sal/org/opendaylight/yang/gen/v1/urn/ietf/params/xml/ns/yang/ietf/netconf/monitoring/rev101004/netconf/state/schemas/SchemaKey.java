package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class SchemaKey
 implements Identifier<Schema> {
    private static final long serialVersionUID = 5788646963661818854L;
    final private java.lang.String _identifier;
    final private java.lang.String _version;
    final private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> _format;

    public SchemaKey(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> _format, java.lang.String _identifier, java.lang.String _version) {
    
    
        this._identifier = _identifier;
        this._version = _version;
        this._format = _format;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SchemaKey(SchemaKey source) {
        this._identifier = source._identifier;
        this._version = source._version;
        this._format = source._format;
    }


    public java.lang.String getIdentifier() {
        return _identifier;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> getFormat() {
        return _format;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_identifier == null) ? 0 : _identifier.hashCode());
        result = prime * result + ((_version == null) ? 0 : _version.hashCode());
        result = prime * result + ((_format == null) ? 0 : _format.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SchemaKey other = (SchemaKey) obj;
        if (_identifier == null) {
            if (other._identifier != null) {
                return false;
            }
        } else if(!_identifier.equals(other._identifier)) {
            return false;
        }
        if (_version == null) {
            if (other._version != null) {
                return false;
            }
        } else if(!_version.equals(other._version)) {
            return false;
        }
        if (_format == null) {
            if (other._format != null) {
                return false;
            }
        } else if(!_format.equals(other._format)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_identifier != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_identifier=");
            builder.append(_identifier);
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
        if (_format != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_format=");
            builder.append(_format);
         }
        return builder.append(']').toString();
    }



}
