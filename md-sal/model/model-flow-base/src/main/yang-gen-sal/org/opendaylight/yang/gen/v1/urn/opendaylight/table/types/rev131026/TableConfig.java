package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026;
import java.io.Serializable;


/**
 * The bits built-in type represents a bit set. That is, a bits value is a set of flags identified by small integer position numbers starting at 0.  Each bit number has an assigned name.
 */
public class TableConfig
 implements Serializable {
    private static final long serialVersionUID = -425092121384571320L;
    final private java.lang.Boolean _dEPRECATEDMASK;

    public TableConfig(java.lang.Boolean _dEPRECATEDMASK) {
    
    
        this._dEPRECATEDMASK = _dEPRECATEDMASK;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TableConfig(TableConfig source) {
        this._dEPRECATEDMASK = source._dEPRECATEDMASK;
    }

    public static TableConfig getDefaultInstance(String defaultValue) {
        return new TableConfig(Boolean.valueOf(defaultValue));
    }

    public java.lang.Boolean isDEPRECATEDMASK() {
        return _dEPRECATEDMASK;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_dEPRECATEDMASK == null) ? 0 : _dEPRECATEDMASK.hashCode());
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
        TableConfig other = (TableConfig) obj;
        if (_dEPRECATEDMASK == null) {
            if (other._dEPRECATEDMASK != null) {
                return false;
            }
        } else if(!_dEPRECATEDMASK.equals(other._dEPRECATEDMASK)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableConfig.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_dEPRECATEDMASK != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_dEPRECATEDMASK=");
            builder.append(_dEPRECATEDMASK);
         }
        return builder.append(']').toString();
    }



}
