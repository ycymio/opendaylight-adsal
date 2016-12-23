package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector.DomBroker;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector
 */
public class RemoteRpcConnectorBuilder {

    private java.lang.String _actorSystemName;
    private java.lang.Integer _boundedMailboxCapacity;
    private static List<Range<BigInteger>> _boundedMailboxCapacity_range;
    private DomBroker _domBroker;
    private java.lang.Boolean _enableMetricCapture;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> augmentation = new HashMap<>();

    public RemoteRpcConnectorBuilder() {
    } 
    

    public RemoteRpcConnectorBuilder(RemoteRpcConnector base) {
        this._actorSystemName = base.getActorSystemName();
        this._boundedMailboxCapacity = base.getBoundedMailboxCapacity();
        this._domBroker = base.getDomBroker();
        this._enableMetricCapture = base.isEnableMetricCapture();
        if (base instanceof RemoteRpcConnectorImpl) {
            RemoteRpcConnectorImpl _impl = (RemoteRpcConnectorImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.String getActorSystemName() {
        return _actorSystemName;
    }
    
    public java.lang.Integer getBoundedMailboxCapacity() {
        return _boundedMailboxCapacity;
    }
    
    public DomBroker getDomBroker() {
        return _domBroker;
    }
    
    public java.lang.Boolean isEnableMetricCapture() {
        return _enableMetricCapture;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RemoteRpcConnectorBuilder setActorSystemName(java.lang.String value) {
        this._actorSystemName = value;
        return this;
    }
    
    public RemoteRpcConnectorBuilder setBoundedMailboxCapacity(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _boundedMailboxCapacity_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _boundedMailboxCapacity_range));
            }
        }
        this._boundedMailboxCapacity = value;
        return this;
    }
    public static List<Range<BigInteger>> _boundedMailboxCapacity_range() {
        if (_boundedMailboxCapacity_range == null) {
            synchronized (RemoteRpcConnectorBuilder.class) {
                if (_boundedMailboxCapacity_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _boundedMailboxCapacity_range = builder.build();
                }
            }
        }
        return _boundedMailboxCapacity_range;
    }
    
    public RemoteRpcConnectorBuilder setDomBroker(DomBroker value) {
        this._domBroker = value;
        return this;
    }
    
    public RemoteRpcConnectorBuilder setEnableMetricCapture(java.lang.Boolean value) {
        this._enableMetricCapture = value;
        return this;
    }
    
    public RemoteRpcConnectorBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RemoteRpcConnector build() {
        return new RemoteRpcConnectorImpl(this);
    }

    private static final class RemoteRpcConnectorImpl implements RemoteRpcConnector {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector.class;
        }

        private final java.lang.String _actorSystemName;
        private final java.lang.Integer _boundedMailboxCapacity;
        private final DomBroker _domBroker;
        private final java.lang.Boolean _enableMetricCapture;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> augmentation = new HashMap<>();

        private RemoteRpcConnectorImpl(RemoteRpcConnectorBuilder base) {
            this._actorSystemName = base.getActorSystemName();
            this._boundedMailboxCapacity = base.getBoundedMailboxCapacity();
            this._domBroker = base.getDomBroker();
            this._enableMetricCapture = base.isEnableMetricCapture();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.String getActorSystemName() {
            return _actorSystemName;
        }
        
        @Override
        public java.lang.Integer getBoundedMailboxCapacity() {
            return _boundedMailboxCapacity;
        }
        
        @Override
        public DomBroker getDomBroker() {
            return _domBroker;
        }
        
        @Override
        public java.lang.Boolean isEnableMetricCapture() {
            return _enableMetricCapture;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_actorSystemName == null) ? 0 : _actorSystemName.hashCode());
            result = prime * result + ((_boundedMailboxCapacity == null) ? 0 : _boundedMailboxCapacity.hashCode());
            result = prime * result + ((_domBroker == null) ? 0 : _domBroker.hashCode());
            result = prime * result + ((_enableMetricCapture == null) ? 0 : _enableMetricCapture.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector)obj;
            if (_actorSystemName == null) {
                if (other.getActorSystemName() != null) {
                    return false;
                }
            } else if(!_actorSystemName.equals(other.getActorSystemName())) {
                return false;
            }
            if (_boundedMailboxCapacity == null) {
                if (other.getBoundedMailboxCapacity() != null) {
                    return false;
                }
            } else if(!_boundedMailboxCapacity.equals(other.getBoundedMailboxCapacity())) {
                return false;
            }
            if (_domBroker == null) {
                if (other.getDomBroker() != null) {
                    return false;
                }
            } else if(!_domBroker.equals(other.getDomBroker())) {
                return false;
            }
            if (_enableMetricCapture == null) {
                if (other.isEnableMetricCapture() != null) {
                    return false;
                }
            } else if(!_enableMetricCapture.equals(other.isEnableMetricCapture())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoteRpcConnectorImpl otherImpl = (RemoteRpcConnectorImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RemoteRpcConnector [");
            boolean first = true;
        
            if (_actorSystemName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_actorSystemName=");
                builder.append(_actorSystemName);
             }
            if (_boundedMailboxCapacity != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_boundedMailboxCapacity=");
                builder.append(_boundedMailboxCapacity);
             }
            if (_domBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domBroker=");
                builder.append(_domBroker);
             }
            if (_enableMetricCapture != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_enableMetricCapture=");
                builder.append(_enableMetricCapture);
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
