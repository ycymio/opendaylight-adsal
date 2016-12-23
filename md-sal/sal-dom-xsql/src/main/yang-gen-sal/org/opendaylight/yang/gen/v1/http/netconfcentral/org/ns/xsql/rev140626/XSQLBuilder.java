package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL
 */
public class XSQLBuilder {

    private java.lang.String _port;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> augmentation = new HashMap<>();

    public XSQLBuilder() {
    } 

    public XSQLBuilder(XSQL base) {
        this._port = base.getPort();
        if (base instanceof XSQLImpl) {
            XSQLImpl _impl = (XSQLImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public XSQLBuilder setPort(java.lang.String value) {
        this._port = value;
        return this;
    }
    
    public XSQLBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public XSQL build() {
        return new XSQLImpl(this);
    }

    private static final class XSQLImpl implements XSQL {

        public java.lang.Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL.class;
        }

        private final java.lang.String _port;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> augmentation = new HashMap<>();

        private XSQLImpl(XSQLBuilder base) {
            this._port = base.getPort();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL other = (org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL)obj;
            if (_port == null) {
                if (other.getPort() != null) {
                    return false;
                }
            } else if(!_port.equals(other.getPort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                XSQLImpl otherImpl = (XSQLImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("XSQL [");
            boolean first = true;
        
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
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
