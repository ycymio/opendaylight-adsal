package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode
 */
public class AggregatedNodeBuilder {

    private List<OriginalNode> _originalNode;


    public AggregatedNodeBuilder() {
    } 
    
    public AggregatedNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode arg) {
        this._originalNode = arg.getOriginalNode();
    }

    public AggregatedNodeBuilder(AggregatedNode base) {
        this._originalNode = base.getOriginalNode();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode) {
            this._originalNode = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode)arg).getOriginalNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode] \n" +
              "but was: " + arg
            );
        }
    }

    public List<OriginalNode> getOriginalNode() {
        return _originalNode;
    }

    public AggregatedNodeBuilder setOriginalNode(List<OriginalNode> value) {
        this._originalNode = value;
        return this;
    }

    public AggregatedNode build() {
        return new AggregatedNodeImpl(this);
    }

    private static final class AggregatedNodeImpl implements AggregatedNode {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode.class;
        }

        private final List<OriginalNode> _originalNode;


        private AggregatedNodeImpl(AggregatedNodeBuilder base) {
            this._originalNode = base.getOriginalNode();
        }

        @Override
        public List<OriginalNode> getOriginalNode() {
            return _originalNode;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_originalNode == null) ? 0 : _originalNode.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedNode)obj;
            if (_originalNode == null) {
                if (other.getOriginalNode() != null) {
                    return false;
                }
            } else if(!_originalNode.equals(other.getOriginalNode())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AggregatedNode [");
            boolean first = true;
        
            if (_originalNode != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalNode=");
                builder.append(_originalNode);
             }
            return builder.append(']').toString();
        }
    }

}
