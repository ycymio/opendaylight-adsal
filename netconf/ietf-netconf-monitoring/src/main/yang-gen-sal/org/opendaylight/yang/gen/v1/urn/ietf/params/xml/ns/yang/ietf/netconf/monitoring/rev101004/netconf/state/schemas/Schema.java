package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Schemas;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema.Location.Enumeration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import java.beans.ConstructorProperties;
import java.util.Arrays;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaKey;


/**
 * List of data model schemas supported by the server.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * list schema {
 *     key "identifier" 
 * "version" 
 * "format"
 *     leaf identifier {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     leaf format {
 *         type identityref;
 *     }
 *     leaf namespace {
 *         type uri;
 *     }
 *     leaf-list location {
 *         type union;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/schemas/schema</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaBuilder@see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.SchemaKey
 */
public interface Schema
    extends
    ChildOf<Schemas>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema>,
    Identifiable<SchemaKey>
{

    /**
     * The union built-in type represents a value that corresponds to one of its member types.
     */
    public static final class Location
     {
        /**
         * The enumeration built-in type represents values from a set of assigned names.
         */
        public enum Enumeration {
            NETCONF(0)
            ;
        
        
            int value;
            private static final java.util.Map<java.lang.Integer, Enumeration> VALUE_MAP;
        
            static {
                final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Enumeration> b = com.google.common.collect.ImmutableMap.builder();
                for (Enumeration enumItem : Enumeration.values())
                {
                    b.put(enumItem.value, enumItem);
                }
        
                VALUE_MAP = b.build();
            }
        
            private Enumeration(int value) {
                this.value = value;
            }
            
            /**
             * @return integer value
             */
            public int getIntValue() {
                return value;
            }
        
            /**
             * @param valueArg
             * @return corresponding Enumeration item
             */
            public static Enumeration forValue(int valueArg) {
                return VALUE_MAP.get(valueArg);
            }
        }
        final private Enumeration _enumeration;
        final private Uri _uri;
        final private char[] _value;
    
        public Location(Enumeration _enumeration) {
            super();
            this._enumeration = _enumeration;
            this._uri = null;
            this._value = _enumeration.toString().toCharArray();
        }
        
        public Location(Uri _uri) {
            super();
            this._uri = _uri;
            this._enumeration = null;
            this._value = _uri.getValue().toString().toCharArray();
        }
        
        /**
         * Constructor provided only for using in JMX. Don't use it for
         * construction new object of this union type. 
         */
        @ConstructorProperties("value")
        public Location(char[] _value) {
            java.lang.String defVal = new java.lang.String(_value);
            Location defInst = LocationBuilder.getDefaultInstance(defVal);
            this._enumeration = defInst._enumeration;
            this._uri = defInst._uri;
            this._value = _value;
        }
        /**
         * Creates a copy from Source Object.
         *
         * @param source Source object
         */
        public Location(Location source) {
            this._enumeration = source._enumeration;
            this._uri = source._uri;
            this._value = source._value;
        }
    
    
        public Enumeration getEnumeration() {
            return _enumeration;
        }
        
        public Uri getUri() {
            return _uri;
        }
        
        public char[] getValue() {
            return _value;
        }
    
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_enumeration == null) ? 0 : _enumeration.hashCode());
            result = prime * result + ((_uri == null) ? 0 : _uri.hashCode());
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
            Location other = (Location) obj;
            if (_enumeration == null) {
                if (other._enumeration != null) {
                    return false;
                }
            } else if(!_enumeration.equals(other._enumeration)) {
                return false;
            }
            if (_uri == null) {
                if (other._uri != null) {
                    return false;
                }
            } else if(!_uri.equals(other._uri)) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.schemas.Schema.Location.class.getSimpleName()).append(" [");
            boolean first = true;
        
            if (_enumeration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_enumeration=");
                builder.append(_enumeration);
             }
            if (_uri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_uri=");
                builder.append(_uri);
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
    


    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","schema");;

    /**
     * Identifier to uniquely reference the schema. The identifier is used in the 
     * <get-schema> operation and may be used for other purposes such as file 
     * retrieval. For modeling languages that support or require a data model name 
     * (e.g., YANG module name) the identifier MUST match that name. For YANG data 
     * models, the identifier is the name of the module or submodule. In other cases, 
     * an identifier such as a filename MAY be used instead.
     */
    java.lang.String getIdentifier();
    
    /**
     * Version of the schema supported. Multiple versions MAY be supported 
     * simultaneously by a NETCONF server. Each version MUST be reported individually 
     * in the schema list, i.e., with same identifier, possibly different location, but
     * different version. For YANG data models, version is the value of the most recent
     * YANG 'revision' statement in the module or submodule, or the empty string if no 
     * 'revision' statement is present.
     */
    java.lang.String getVersion();
    
    /**
     * The data modeling language the schema is written in (currently xsd, yang, yin, 
     * rng, or rnc). For YANG data models, 'yang' format MUST be supported and 'yin' 
     * format MAY also be provided.
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> getFormat();
    
    /**
     * The XML namespace defined by the data model. For YANG data models, this is the 
     * module's namespace. If the list entry describes a submodule, this field contains
     * the namespace of the module to which the submodule belongs.
     */
    Uri getNamespace();
    
    /**
     * One or more locations from which the schema can be retrieved. This list SHOULD 
     * contain at least one entry per schema. A schema entry may be located on a remote
     * file system (e.g., reference to file system for ftp retrieval) or retrieved 
     * directly from a server supporting the <get-schema> operation (denoted by the 
     * value 'NETCONF').
     */
    List<Location> getLocation();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    SchemaKey getKey();

}

