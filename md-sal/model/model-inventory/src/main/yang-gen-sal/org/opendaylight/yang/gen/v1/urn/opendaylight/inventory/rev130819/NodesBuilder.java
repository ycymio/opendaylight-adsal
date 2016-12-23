package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes
 */
public class NodesBuilder {

    private List<Node> _node;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentation = new HashMap<>();

    public NodesBuilder() {
    } 

    public NodesBuilder(Nodes base) {
        this._node = base.getNode();
        if (base instanceof NodesImpl) {
            NodesImpl _impl = (NodesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<Node> getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodesBuilder setNode(List<Node> value) {
        this._node = value;
        return this;
    }
    
    public NodesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Nodes build() {
        return new NodesImpl(this);
    }

    private static final class NodesImpl implements Nodes {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes.class;
        }

        private final List<Node> _node;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentation = new HashMap<>();

        private NodesImpl(NodesBuilder base) {
            this._node = base.getNode();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes other = (org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes)obj;
            if (_node == null) {
                if (other.getNode() != null) {
                    return false;
                }
            } else if(!_node.equals(other.getNode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodesImpl otherImpl = (NodesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Nodes [");
            boolean first = true;
        
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
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
