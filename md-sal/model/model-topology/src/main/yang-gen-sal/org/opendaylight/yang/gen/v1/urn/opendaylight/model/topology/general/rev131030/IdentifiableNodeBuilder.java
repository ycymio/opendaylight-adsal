package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode
 */
public class IdentifiableNodeBuilder {

    private List<NodeIdentifier> _nodeIdentifier;


    public IdentifiableNodeBuilder() {
    } 
    
    public IdentifiableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers arg) {
        this._nodeIdentifier = arg.getNodeIdentifier();
    }

    public IdentifiableNodeBuilder(IdentifiableNode base) {
        this._nodeIdentifier = base.getNodeIdentifier();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers) {
            this._nodeIdentifier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers)arg).getNodeIdentifier();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers] \n" +
              "but was: " + arg
            );
        }
    }

    public List<NodeIdentifier> getNodeIdentifier() {
        return _nodeIdentifier;
    }

    public IdentifiableNodeBuilder setNodeIdentifier(List<NodeIdentifier> value) {
        this._nodeIdentifier = value;
        return this;
    }

    public IdentifiableNode build() {
        return new IdentifiableNodeImpl(this);
    }

    private static final class IdentifiableNodeImpl implements IdentifiableNode {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode.class;
        }

        private final List<NodeIdentifier> _nodeIdentifier;


        private IdentifiableNodeImpl(IdentifiableNodeBuilder base) {
            this._nodeIdentifier = base.getNodeIdentifier();
        }

        @Override
        public List<NodeIdentifier> getNodeIdentifier() {
            return _nodeIdentifier;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_nodeIdentifier == null) ? 0 : _nodeIdentifier.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode)obj;
            if (_nodeIdentifier == null) {
                if (other.getNodeIdentifier() != null) {
                    return false;
                }
            } else if(!_nodeIdentifier.equals(other.getNodeIdentifier())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("IdentifiableNode [");
            boolean first = true;
        
            if (_nodeIdentifier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeIdentifier=");
                builder.append(_nodeIdentifier);
             }
            return builder.append(']').toString();
        }
    }

}
