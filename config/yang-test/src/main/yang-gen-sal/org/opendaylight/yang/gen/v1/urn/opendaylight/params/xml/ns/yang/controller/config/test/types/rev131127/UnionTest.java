package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.ExtendTwice;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * The union built-in type represents a value that corresponds to one of its member types.
 */
public class UnionTest
 implements Serializable {
    private static final long serialVersionUID = 2459544860997715341L;
    final private java.lang.String _string;
    final private java.lang.Long _uint32;
    final private ExtendTwice _extendTwice;
    final private char[] _value;

    public UnionTest(java.lang.String _string) {
        super();
        this._string = _string;
        this._uint32 = null;
        this._extendTwice = null;
        this._value = _string.toCharArray();
    }
    
    public UnionTest(java.lang.Long _uint32) {
        super();
        this._uint32 = _uint32;
        this._string = null;
        this._extendTwice = null;
        this._value = _uint32.toString().toCharArray();
    }
    
    public UnionTest(ExtendTwice _extendTwice) {
        super();
        this._extendTwice = _extendTwice;
        this._string = null;
        this._uint32 = null;
        this._value = _extendTwice.getValue().toString().toCharArray();
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type. 
     */
    @ConstructorProperties("value")
    public UnionTest(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        UnionTest defInst = UnionTestBuilder.getDefaultInstance(defVal);
        this._string = defInst._string;
        this._uint32 = defInst._uint32;
        this._extendTwice = defInst._extendTwice;
        this._value = _value;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UnionTest(UnionTest source) {
        this._string = source._string;
        this._uint32 = source._uint32;
        this._extendTwice = source._extendTwice;
        this._value = source._value;
    }


    public java.lang.String getString() {
        return _string;
    }
    
    public java.lang.Long getUint32() {
        return _uint32;
    }
    
    public ExtendTwice getExtendTwice() {
        return _extendTwice;
    }
    
    public char[] getValue() {
        return _value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_string == null) ? 0 : _string.hashCode());
        result = prime * result + ((_uint32 == null) ? 0 : _uint32.hashCode());
        result = prime * result + ((_extendTwice == null) ? 0 : _extendTwice.hashCode());
        result = prime * result + ((_value == null) ? 0 : Arrays.hashCode(_value));
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
        UnionTest other = (UnionTest) obj;
        if (_string == null) {
            if (other._string != null) {
                return false;
            }
        } else if(!_string.equals(other._string)) {
            return false;
        }
        if (_uint32 == null) {
            if (other._uint32 != null) {
                return false;
            }
        } else if(!_uint32.equals(other._uint32)) {
            return false;
        }
        if (_extendTwice == null) {
            if (other._extendTwice != null) {
                return false;
            }
        } else if(!_extendTwice.equals(other._extendTwice)) {
            return false;
        }
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!Arrays.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.UnionTest.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_string != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_string=");
            builder.append(_string);
         }
        if (_uint32 != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uint32=");
            builder.append(_uint32);
         }
        if (_extendTwice != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_extendTwice=");
            builder.append(_extendTwice);
         }
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(Arrays.toString(_value));
         }
        return builder.append(']').toString();
    }



}
