package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Sessions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Schemas;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Datastores;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Capabilities;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState
 */
public class NetconfStateBuilder {

    private Capabilities _capabilities;
    private Datastores _datastores;
    private Schemas _schemas;
    private Sessions _sessions;
    private Statistics _statistics;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> augmentation = new HashMap<>();

    public NetconfStateBuilder() {
    } 

    public NetconfStateBuilder(NetconfState base) {
        this._capabilities = base.getCapabilities();
        this._datastores = base.getDatastores();
        this._schemas = base.getSchemas();
        this._sessions = base.getSessions();
        this._statistics = base.getStatistics();
        if (base instanceof NetconfStateImpl) {
            NetconfStateImpl _impl = (NetconfStateImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Capabilities getCapabilities() {
        return _capabilities;
    }
    
    public Datastores getDatastores() {
        return _datastores;
    }
    
    public Schemas getSchemas() {
        return _schemas;
    }
    
    public Sessions getSessions() {
        return _sessions;
    }
    
    public Statistics getStatistics() {
        return _statistics;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NetconfStateBuilder setCapabilities(Capabilities value) {
        this._capabilities = value;
        return this;
    }
    
    public NetconfStateBuilder setDatastores(Datastores value) {
        this._datastores = value;
        return this;
    }
    
    public NetconfStateBuilder setSchemas(Schemas value) {
        this._schemas = value;
        return this;
    }
    
    public NetconfStateBuilder setSessions(Sessions value) {
        this._sessions = value;
        return this;
    }
    
    public NetconfStateBuilder setStatistics(Statistics value) {
        this._statistics = value;
        return this;
    }
    
    public NetconfStateBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NetconfState build() {
        return new NetconfStateImpl(this);
    }

    private static final class NetconfStateImpl implements NetconfState {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState.class;
        }

        private final Capabilities _capabilities;
        private final Datastores _datastores;
        private final Schemas _schemas;
        private final Sessions _sessions;
        private final Statistics _statistics;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> augmentation = new HashMap<>();

        private NetconfStateImpl(NetconfStateBuilder base) {
            this._capabilities = base.getCapabilities();
            this._datastores = base.getDatastores();
            this._schemas = base.getSchemas();
            this._sessions = base.getSessions();
            this._statistics = base.getStatistics();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Capabilities getCapabilities() {
            return _capabilities;
        }
        
        @Override
        public Datastores getDatastores() {
            return _datastores;
        }
        
        @Override
        public Schemas getSchemas() {
            return _schemas;
        }
        
        @Override
        public Sessions getSessions() {
            return _sessions;
        }
        
        @Override
        public Statistics getStatistics() {
            return _statistics;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_capabilities == null) ? 0 : _capabilities.hashCode());
            result = prime * result + ((_datastores == null) ? 0 : _datastores.hashCode());
            result = prime * result + ((_schemas == null) ? 0 : _schemas.hashCode());
            result = prime * result + ((_sessions == null) ? 0 : _sessions.hashCode());
            result = prime * result + ((_statistics == null) ? 0 : _statistics.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState)obj;
            if (_capabilities == null) {
                if (other.getCapabilities() != null) {
                    return false;
                }
            } else if(!_capabilities.equals(other.getCapabilities())) {
                return false;
            }
            if (_datastores == null) {
                if (other.getDatastores() != null) {
                    return false;
                }
            } else if(!_datastores.equals(other.getDatastores())) {
                return false;
            }
            if (_schemas == null) {
                if (other.getSchemas() != null) {
                    return false;
                }
            } else if(!_schemas.equals(other.getSchemas())) {
                return false;
            }
            if (_sessions == null) {
                if (other.getSessions() != null) {
                    return false;
                }
            } else if(!_sessions.equals(other.getSessions())) {
                return false;
            }
            if (_statistics == null) {
                if (other.getStatistics() != null) {
                    return false;
                }
            } else if(!_statistics.equals(other.getStatistics())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetconfStateImpl otherImpl = (NetconfStateImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NetconfState [");
            boolean first = true;
        
            if (_capabilities != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_capabilities=");
                builder.append(_capabilities);
             }
            if (_datastores != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_datastores=");
                builder.append(_datastores);
             }
            if (_schemas != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_schemas=");
                builder.append(_schemas);
             }
            if (_sessions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sessions=");
                builder.append(_sessions);
             }
            if (_statistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_statistics=");
                builder.append(_statistics);
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
