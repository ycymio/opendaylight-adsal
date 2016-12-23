package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.SchemaService;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.AsyncDataBroker;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL
 */
public class XSQLBuilder {

    private AsyncDataBroker _asyncDataBroker;
    private DataBroker _dataBroker;
    private SchemaService _schemaService;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> augmentation = new HashMap<>();

    public XSQLBuilder() {
    } 
    

    public XSQLBuilder(XSQL base) {
        this._asyncDataBroker = base.getAsyncDataBroker();
        this._dataBroker = base.getDataBroker();
        this._schemaService = base.getSchemaService();
        if (base instanceof XSQLImpl) {
            XSQLImpl _impl = (XSQLImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public AsyncDataBroker getAsyncDataBroker() {
        return _asyncDataBroker;
    }
    
    public DataBroker getDataBroker() {
        return _dataBroker;
    }
    
    public SchemaService getSchemaService() {
        return _schemaService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public XSQLBuilder setAsyncDataBroker(AsyncDataBroker value) {
        this._asyncDataBroker = value;
        return this;
    }
    
    public XSQLBuilder setDataBroker(DataBroker value) {
        this._dataBroker = value;
        return this;
    }
    
    public XSQLBuilder setSchemaService(SchemaService value) {
        this._schemaService = value;
        return this;
    }
    
    public XSQLBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public XSQL build() {
        return new XSQLImpl(this);
    }

    private static final class XSQLImpl implements XSQL {

        public java.lang.Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL.class;
        }

        private final AsyncDataBroker _asyncDataBroker;
        private final DataBroker _dataBroker;
        private final SchemaService _schemaService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> augmentation = new HashMap<>();

        private XSQLImpl(XSQLBuilder base) {
            this._asyncDataBroker = base.getAsyncDataBroker();
            this._dataBroker = base.getDataBroker();
            this._schemaService = base.getSchemaService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public AsyncDataBroker getAsyncDataBroker() {
            return _asyncDataBroker;
        }
        
        @Override
        public DataBroker getDataBroker() {
            return _dataBroker;
        }
        
        @Override
        public SchemaService getSchemaService() {
            return _schemaService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_asyncDataBroker == null) ? 0 : _asyncDataBroker.hashCode());
            result = prime * result + ((_dataBroker == null) ? 0 : _dataBroker.hashCode());
            result = prime * result + ((_schemaService == null) ? 0 : _schemaService.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL other = (org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL)obj;
            if (_asyncDataBroker == null) {
                if (other.getAsyncDataBroker() != null) {
                    return false;
                }
            } else if(!_asyncDataBroker.equals(other.getAsyncDataBroker())) {
                return false;
            }
            if (_dataBroker == null) {
                if (other.getDataBroker() != null) {
                    return false;
                }
            } else if(!_dataBroker.equals(other.getDataBroker())) {
                return false;
            }
            if (_schemaService == null) {
                if (other.getSchemaService() != null) {
                    return false;
                }
            } else if(!_schemaService.equals(other.getSchemaService())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.XSQL>> e : augmentation.entrySet()) {
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
        
            if (_asyncDataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_asyncDataBroker=");
                builder.append(_asyncDataBroker);
             }
            if (_dataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataBroker=");
                builder.append(_dataBroker);
             }
            if (_schemaService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_schemaService=");
                builder.append(_schemaService);
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
