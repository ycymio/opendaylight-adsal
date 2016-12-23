package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class NodeIdentifierKey
 implements Identifier<NodeIdentifier> {
    private static final long serialVersionUID = -1144261877878297422L;
    final private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> _type;
    final private Uri _identifier;

    public NodeIdentifierKey(Uri _identifier, java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> _type) {
    
    
        this._type = _type;
        this._identifier = _identifier;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeIdentifierKey(NodeIdentifierKey source) {
        this._type = source._type;
        this._identifier = source._identifier;
    }


    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> getType() {
        return _type;
    }
    
    public Uri getIdentifier() {
        return _identifier;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_type == null) ? 0 : _type.hashCode());
        result = prime * result + ((_identifier == null) ? 0 : _identifier.hashCode());
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
        NodeIdentifierKey other = (NodeIdentifierKey) obj;
        if (_type == null) {
            if (other._type != null) {
                return false;
            }
        } else if(!_type.equals(other._type)) {
            return false;
        }
        if (_identifier == null) {
            if (other._identifier != null) {
                return false;
            }
        } else if(!_identifier.equals(other._identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_type != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_type=");
            builder.append(_type);
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
        return builder.append(']').toString();
    }



}
