package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class PortKey
 implements Identifier<Port> {
    private static final long serialVersionUID = 6067197648919635836L;
    final private java.lang.Long _portModOrder;

    public PortKey(java.lang.Long _portModOrder) {
    
    
        this._portModOrder = _portModOrder;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortKey(PortKey source) {
        this._portModOrder = source._portModOrder;
    }


    public java.lang.Long getPortModOrder() {
        return _portModOrder;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_portModOrder == null) ? 0 : _portModOrder.hashCode());
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
        PortKey other = (PortKey) obj;
        if (_portModOrder == null) {
            if (other._portModOrder != null) {
                return false;
            }
        } else if(!_portModOrder.equals(other._portModOrder)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_portModOrder != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_portModOrder=");
            builder.append(_portModOrder);
         }
        return builder.append(']').toString();
    }



}
