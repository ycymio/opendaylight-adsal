package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import java.io.Serializable;
import java.util.List;
import com.google.common.collect.Lists;


/**
 * The bits built-in type represents a bit set. That is, a bits value is a set of flags identified by small integer position numbers starting at 0.  Each bit number has an assigned name.
 */
public class PortConfig
 implements Serializable {
    private static final long serialVersionUID = 1409163542856240170L;
    final private java.lang.Boolean _pORTDOWN;
    final private java.lang.Boolean _nORECV;
    final private java.lang.Boolean _nOFWD;
    final private java.lang.Boolean _nOPACKETIN;

    public PortConfig(java.lang.Boolean _nOFWD, java.lang.Boolean _nOPACKETIN, java.lang.Boolean _nORECV, java.lang.Boolean _pORTDOWN) {
    
    
        this._pORTDOWN = _pORTDOWN;
        this._nORECV = _nORECV;
        this._nOFWD = _nOFWD;
        this._nOPACKETIN = _nOPACKETIN;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortConfig(PortConfig source) {
        this._pORTDOWN = source._pORTDOWN;
        this._nORECV = source._nORECV;
        this._nOFWD = source._nOFWD;
        this._nOPACKETIN = source._nOPACKETIN;
    }

    public static PortConfig getDefaultInstance(String defaultValue) {
        List<java.lang.String> properties = Lists.newArrayList("nOFWD",
        "nOPACKETIN",
        "nORECV",
        "pORTDOWN"
        );
        if (!properties.contains(defaultValue)) {
            throw new java.lang.IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new PortConfig(
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null
        );
    }

    public java.lang.Boolean isPORTDOWN() {
        return _pORTDOWN;
    }
    
    public java.lang.Boolean isNORECV() {
        return _nORECV;
    }
    
    public java.lang.Boolean isNOFWD() {
        return _nOFWD;
    }
    
    public java.lang.Boolean isNOPACKETIN() {
        return _nOPACKETIN;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_pORTDOWN == null) ? 0 : _pORTDOWN.hashCode());
        result = prime * result + ((_nORECV == null) ? 0 : _nORECV.hashCode());
        result = prime * result + ((_nOFWD == null) ? 0 : _nOFWD.hashCode());
        result = prime * result + ((_nOPACKETIN == null) ? 0 : _nOPACKETIN.hashCode());
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
        PortConfig other = (PortConfig) obj;
        if (_pORTDOWN == null) {
            if (other._pORTDOWN != null) {
                return false;
            }
        } else if(!_pORTDOWN.equals(other._pORTDOWN)) {
            return false;
        }
        if (_nORECV == null) {
            if (other._nORECV != null) {
                return false;
            }
        } else if(!_nORECV.equals(other._nORECV)) {
            return false;
        }
        if (_nOFWD == null) {
            if (other._nOFWD != null) {
                return false;
            }
        } else if(!_nOFWD.equals(other._nOFWD)) {
            return false;
        }
        if (_nOPACKETIN == null) {
            if (other._nOPACKETIN != null) {
                return false;
            }
        } else if(!_nOPACKETIN.equals(other._nOPACKETIN)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_pORTDOWN != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_pORTDOWN=");
            builder.append(_pORTDOWN);
         }
        if (_nORECV != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nORECV=");
            builder.append(_nORECV);
         }
        if (_nOFWD != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nOFWD=");
            builder.append(_nOFWD);
         }
        if (_nOPACKETIN != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nOPACKETIN=");
            builder.append(_nOPACKETIN);
         }
        return builder.append(']').toString();
    }



}
