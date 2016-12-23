package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode
 */
public class InventoryNodeBuilder {

    private NodeRef _inventoryNodeRef;


    public InventoryNodeBuilder() {
    } 

    public InventoryNodeBuilder(InventoryNode base) {
        this._inventoryNodeRef = base.getInventoryNodeRef();
    }


    public NodeRef getInventoryNodeRef() {
        return _inventoryNodeRef;
    }

    public InventoryNodeBuilder setInventoryNodeRef(NodeRef value) {
        this._inventoryNodeRef = value;
        return this;
    }

    public InventoryNode build() {
        return new InventoryNodeImpl(this);
    }

    private static final class InventoryNodeImpl implements InventoryNode {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode.class;
        }

        private final NodeRef _inventoryNodeRef;


        private InventoryNodeImpl(InventoryNodeBuilder base) {
            this._inventoryNodeRef = base.getInventoryNodeRef();
        }

        @Override
        public NodeRef getInventoryNodeRef() {
            return _inventoryNodeRef;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inventoryNodeRef == null) ? 0 : _inventoryNodeRef.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode)obj;
            if (_inventoryNodeRef == null) {
                if (other.getInventoryNodeRef() != null) {
                    return false;
                }
            } else if(!_inventoryNodeRef.equals(other.getInventoryNodeRef())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InventoryNode [");
            boolean first = true;
        
            if (_inventoryNodeRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inventoryNodeRef=");
                builder.append(_inventoryNodeRef);
             }
            return builder.append(']').toString();
        }
    }

}
