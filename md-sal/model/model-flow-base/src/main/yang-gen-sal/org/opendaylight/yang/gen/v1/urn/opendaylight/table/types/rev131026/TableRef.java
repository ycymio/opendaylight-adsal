package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026;
import com.google.common.base.Preconditions;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import java.io.Serializable;
import java.beans.ConstructorProperties;


public class TableRef
 implements Serializable {
    private static final long serialVersionUID = -8986742064711947093L;
    final private InstanceIdentifier<?> _value;

    @ConstructorProperties("value")
    public TableRef(InstanceIdentifier<?> _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TableRef(TableRef source) {
        this._value = source._value;
    }


    public InstanceIdentifier<?> getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
        TableRef other = (TableRef) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableRef.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}
