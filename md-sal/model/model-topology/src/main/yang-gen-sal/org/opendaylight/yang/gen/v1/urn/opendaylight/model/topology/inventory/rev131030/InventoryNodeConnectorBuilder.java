package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector
 */
public class InventoryNodeConnectorBuilder {

    private NodeConnectorRef _inventoryNodeConnectorRef;


    public InventoryNodeConnectorBuilder() {
    } 

    public InventoryNodeConnectorBuilder(InventoryNodeConnector base) {
        this._inventoryNodeConnectorRef = base.getInventoryNodeConnectorRef();
    }


    public NodeConnectorRef getInventoryNodeConnectorRef() {
        return _inventoryNodeConnectorRef;
    }

    public InventoryNodeConnectorBuilder setInventoryNodeConnectorRef(NodeConnectorRef value) {
        this._inventoryNodeConnectorRef = value;
        return this;
    }

    public InventoryNodeConnector build() {
        return new InventoryNodeConnectorImpl(this);
    }

    private static final class InventoryNodeConnectorImpl implements InventoryNodeConnector {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector.class;
        }

        private final NodeConnectorRef _inventoryNodeConnectorRef;


        private InventoryNodeConnectorImpl(InventoryNodeConnectorBuilder base) {
            this._inventoryNodeConnectorRef = base.getInventoryNodeConnectorRef();
        }

        @Override
        public NodeConnectorRef getInventoryNodeConnectorRef() {
            return _inventoryNodeConnectorRef;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inventoryNodeConnectorRef == null) ? 0 : _inventoryNodeConnectorRef.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector)obj;
            if (_inventoryNodeConnectorRef == null) {
                if (other.getInventoryNodeConnectorRef() != null) {
                    return false;
                }
            } else if(!_inventoryNodeConnectorRef.equals(other.getInventoryNodeConnectorRef())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InventoryNodeConnector [");
            boolean first = true;
        
            if (_inventoryNodeConnectorRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inventoryNodeConnectorRef=");
                builder.append(_inventoryNodeConnectorRef);
             }
            return builder.append(']').toString();
        }
    }

}
