package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.beans.ConstructorProperties;
import java.util.Arrays;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping common-port {
 *     leaf port-number {
 *         type union;
 *     }
 *     leaf hardware-address {
 *         type mac-address;
 *     }
 *     leaf configuration {
 *         type port-config;
 *     }
 *     leaf advertised-features {
 *         type port-features;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/common-port</i>
 */
public interface CommonPort
    extends
    DataObject
{

    /**
     * The union built-in type represents a value that corresponds to one of its member types.
     */
    public static final class PortNumber
     {
        final private java.lang.Long _uint32;
        final private java.lang.String _string;
        final private char[] _value;
    
        public PortNumber(java.lang.Long _uint32) {
            super();
            this._uint32 = _uint32;
            this._string = null;
            this._value = _uint32.toString().toCharArray();
        }
        
        public PortNumber(java.lang.String _string) {
            super();
            this._string = _string;
            this._uint32 = null;
            this._value = _string.toCharArray();
        }
        
        /**
         * Constructor provided only for using in JMX. Don't use it for
         * construction new object of this union type. 
         */
        @ConstructorProperties("value")
        public PortNumber(char[] _value) {
            java.lang.String defVal = new java.lang.String(_value);
            PortNumber defInst = PortNumberBuilder.getDefaultInstance(defVal);
            this._uint32 = defInst._uint32;
            this._string = defInst._string;
            this._value = _value;
        }
        /**
         * Creates a copy from Source Object.
         *
         * @param source Source object
         */
        public PortNumber(PortNumber source) {
            this._uint32 = source._uint32;
            this._string = source._string;
            this._value = source._value;
        }
    
    
        public java.lang.Long getUint32() {
            return _uint32;
        }
        
        public java.lang.String getString() {
            return _string;
        }
        
        public char[] getValue() {
            return _value;
        }
    
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_uint32 == null) ? 0 : _uint32.hashCode());
            result = prime * result + ((_string == null) ? 0 : _string.hashCode());
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
            PortNumber other = (PortNumber) obj;
            if (_uint32 == null) {
                if (other._uint32 != null) {
                    return false;
                }
            } else if(!_uint32.equals(other._uint32)) {
                return false;
            }
            if (_string == null) {
                if (other._string != null) {
                    return false;
                }
            } else if(!_string.equals(other._string)) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort.PortNumber.class.getSimpleName()).append(" [");
            boolean first = true;
        
            if (_uint32 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_uint32=");
                builder.append(_uint32);
             }
            if (_string != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_string=");
                builder.append(_string);
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
    


    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","common-port");;

    PortNumber getPortNumber();
    
    /**
     * MAC Address of the port
     */
    MacAddress getHardwareAddress();
    
    /**
     * Bit map of OFPPC-* flags
     */
    PortConfig getConfiguration();
    
    /**
     * Features being advertised by the port
     */
    PortFeatures getAdvertisedFeatures();

}

