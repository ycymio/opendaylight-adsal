package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.SchemaService;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.ConfigDataStore;
import com.google.common.collect.ImmutableList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.OperationalDataStore;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker
 */
public class DomInmemoryDataBrokerBuilder {

    private ConfigDataStore _configDataStore;
    private java.lang.Integer _maxDataBrokerCommitQueueSize;
    private static List<Range<BigInteger>> _maxDataBrokerCommitQueueSize_range;
    private java.lang.Integer _maxDataBrokerFutureCallbackPoolSize;
    private static List<Range<BigInteger>> _maxDataBrokerFutureCallbackPoolSize_range;
    private java.lang.Integer _maxDataBrokerFutureCallbackQueueSize;
    private static List<Range<BigInteger>> _maxDataBrokerFutureCallbackQueueSize_range;
    private OperationalDataStore _operationalDataStore;
    private SchemaService _schemaService;
    private java.lang.Boolean _allowConcurrentCommits;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentation = new HashMap<>();

    public DomInmemoryDataBrokerBuilder() {
    } 
    

    public DomInmemoryDataBrokerBuilder(DomInmemoryDataBroker base) {
        this._configDataStore = base.getConfigDataStore();
        this._maxDataBrokerCommitQueueSize = base.getMaxDataBrokerCommitQueueSize();
        this._maxDataBrokerFutureCallbackPoolSize = base.getMaxDataBrokerFutureCallbackPoolSize();
        this._maxDataBrokerFutureCallbackQueueSize = base.getMaxDataBrokerFutureCallbackQueueSize();
        this._operationalDataStore = base.getOperationalDataStore();
        this._schemaService = base.getSchemaService();
        this._allowConcurrentCommits = base.isAllowConcurrentCommits();
        if (base instanceof DomInmemoryDataBrokerImpl) {
            DomInmemoryDataBrokerImpl _impl = (DomInmemoryDataBrokerImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public ConfigDataStore getConfigDataStore() {
        return _configDataStore;
    }
    
    public java.lang.Integer getMaxDataBrokerCommitQueueSize() {
        return _maxDataBrokerCommitQueueSize;
    }
    
    public java.lang.Integer getMaxDataBrokerFutureCallbackPoolSize() {
        return _maxDataBrokerFutureCallbackPoolSize;
    }
    
    public java.lang.Integer getMaxDataBrokerFutureCallbackQueueSize() {
        return _maxDataBrokerFutureCallbackQueueSize;
    }
    
    public OperationalDataStore getOperationalDataStore() {
        return _operationalDataStore;
    }
    
    public SchemaService getSchemaService() {
        return _schemaService;
    }
    
    public java.lang.Boolean isAllowConcurrentCommits() {
        return _allowConcurrentCommits;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomInmemoryDataBrokerBuilder setConfigDataStore(ConfigDataStore value) {
        this._configDataStore = value;
        return this;
    }
    
    public DomInmemoryDataBrokerBuilder setMaxDataBrokerCommitQueueSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataBrokerCommitQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataBrokerCommitQueueSize_range));
            }
        }
        this._maxDataBrokerCommitQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataBrokerCommitQueueSize_range() {
        if (_maxDataBrokerCommitQueueSize_range == null) {
            synchronized (DomInmemoryDataBrokerBuilder.class) {
                if (_maxDataBrokerCommitQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataBrokerCommitQueueSize_range = builder.build();
                }
            }
        }
        return _maxDataBrokerCommitQueueSize_range;
    }
    
    public DomInmemoryDataBrokerBuilder setMaxDataBrokerFutureCallbackPoolSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataBrokerFutureCallbackPoolSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataBrokerFutureCallbackPoolSize_range));
            }
        }
        this._maxDataBrokerFutureCallbackPoolSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataBrokerFutureCallbackPoolSize_range() {
        if (_maxDataBrokerFutureCallbackPoolSize_range == null) {
            synchronized (DomInmemoryDataBrokerBuilder.class) {
                if (_maxDataBrokerFutureCallbackPoolSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataBrokerFutureCallbackPoolSize_range = builder.build();
                }
            }
        }
        return _maxDataBrokerFutureCallbackPoolSize_range;
    }
    
    public DomInmemoryDataBrokerBuilder setMaxDataBrokerFutureCallbackQueueSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataBrokerFutureCallbackQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataBrokerFutureCallbackQueueSize_range));
            }
        }
        this._maxDataBrokerFutureCallbackQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataBrokerFutureCallbackQueueSize_range() {
        if (_maxDataBrokerFutureCallbackQueueSize_range == null) {
            synchronized (DomInmemoryDataBrokerBuilder.class) {
                if (_maxDataBrokerFutureCallbackQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataBrokerFutureCallbackQueueSize_range = builder.build();
                }
            }
        }
        return _maxDataBrokerFutureCallbackQueueSize_range;
    }
    
    public DomInmemoryDataBrokerBuilder setOperationalDataStore(OperationalDataStore value) {
        this._operationalDataStore = value;
        return this;
    }
    
    public DomInmemoryDataBrokerBuilder setSchemaService(SchemaService value) {
        this._schemaService = value;
        return this;
    }
    
    public DomInmemoryDataBrokerBuilder setAllowConcurrentCommits(java.lang.Boolean value) {
        this._allowConcurrentCommits = value;
        return this;
    }
    
    public DomInmemoryDataBrokerBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DomInmemoryDataBroker build() {
        return new DomInmemoryDataBrokerImpl(this);
    }

    private static final class DomInmemoryDataBrokerImpl implements DomInmemoryDataBroker {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker.class;
        }

        private final ConfigDataStore _configDataStore;
        private final java.lang.Integer _maxDataBrokerCommitQueueSize;
        private final java.lang.Integer _maxDataBrokerFutureCallbackPoolSize;
        private final java.lang.Integer _maxDataBrokerFutureCallbackQueueSize;
        private final OperationalDataStore _operationalDataStore;
        private final SchemaService _schemaService;
        private final java.lang.Boolean _allowConcurrentCommits;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentation = new HashMap<>();

        private DomInmemoryDataBrokerImpl(DomInmemoryDataBrokerBuilder base) {
            this._configDataStore = base.getConfigDataStore();
            this._maxDataBrokerCommitQueueSize = base.getMaxDataBrokerCommitQueueSize();
            this._maxDataBrokerFutureCallbackPoolSize = base.getMaxDataBrokerFutureCallbackPoolSize();
            this._maxDataBrokerFutureCallbackQueueSize = base.getMaxDataBrokerFutureCallbackQueueSize();
            this._operationalDataStore = base.getOperationalDataStore();
            this._schemaService = base.getSchemaService();
            this._allowConcurrentCommits = base.isAllowConcurrentCommits();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public ConfigDataStore getConfigDataStore() {
            return _configDataStore;
        }
        
        @Override
        public java.lang.Integer getMaxDataBrokerCommitQueueSize() {
            return _maxDataBrokerCommitQueueSize;
        }
        
        @Override
        public java.lang.Integer getMaxDataBrokerFutureCallbackPoolSize() {
            return _maxDataBrokerFutureCallbackPoolSize;
        }
        
        @Override
        public java.lang.Integer getMaxDataBrokerFutureCallbackQueueSize() {
            return _maxDataBrokerFutureCallbackQueueSize;
        }
        
        @Override
        public OperationalDataStore getOperationalDataStore() {
            return _operationalDataStore;
        }
        
        @Override
        public SchemaService getSchemaService() {
            return _schemaService;
        }
        
        @Override
        public java.lang.Boolean isAllowConcurrentCommits() {
            return _allowConcurrentCommits;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_configDataStore == null) ? 0 : _configDataStore.hashCode());
            result = prime * result + ((_maxDataBrokerCommitQueueSize == null) ? 0 : _maxDataBrokerCommitQueueSize.hashCode());
            result = prime * result + ((_maxDataBrokerFutureCallbackPoolSize == null) ? 0 : _maxDataBrokerFutureCallbackPoolSize.hashCode());
            result = prime * result + ((_maxDataBrokerFutureCallbackQueueSize == null) ? 0 : _maxDataBrokerFutureCallbackQueueSize.hashCode());
            result = prime * result + ((_operationalDataStore == null) ? 0 : _operationalDataStore.hashCode());
            result = prime * result + ((_schemaService == null) ? 0 : _schemaService.hashCode());
            result = prime * result + ((_allowConcurrentCommits == null) ? 0 : _allowConcurrentCommits.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker)obj;
            if (_configDataStore == null) {
                if (other.getConfigDataStore() != null) {
                    return false;
                }
            } else if(!_configDataStore.equals(other.getConfigDataStore())) {
                return false;
            }
            if (_maxDataBrokerCommitQueueSize == null) {
                if (other.getMaxDataBrokerCommitQueueSize() != null) {
                    return false;
                }
            } else if(!_maxDataBrokerCommitQueueSize.equals(other.getMaxDataBrokerCommitQueueSize())) {
                return false;
            }
            if (_maxDataBrokerFutureCallbackPoolSize == null) {
                if (other.getMaxDataBrokerFutureCallbackPoolSize() != null) {
                    return false;
                }
            } else if(!_maxDataBrokerFutureCallbackPoolSize.equals(other.getMaxDataBrokerFutureCallbackPoolSize())) {
                return false;
            }
            if (_maxDataBrokerFutureCallbackQueueSize == null) {
                if (other.getMaxDataBrokerFutureCallbackQueueSize() != null) {
                    return false;
                }
            } else if(!_maxDataBrokerFutureCallbackQueueSize.equals(other.getMaxDataBrokerFutureCallbackQueueSize())) {
                return false;
            }
            if (_operationalDataStore == null) {
                if (other.getOperationalDataStore() != null) {
                    return false;
                }
            } else if(!_operationalDataStore.equals(other.getOperationalDataStore())) {
                return false;
            }
            if (_schemaService == null) {
                if (other.getSchemaService() != null) {
                    return false;
                }
            } else if(!_schemaService.equals(other.getSchemaService())) {
                return false;
            }
            if (_allowConcurrentCommits == null) {
                if (other.isAllowConcurrentCommits() != null) {
                    return false;
                }
            } else if(!_allowConcurrentCommits.equals(other.isAllowConcurrentCommits())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DomInmemoryDataBrokerImpl otherImpl = (DomInmemoryDataBrokerImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DomInmemoryDataBroker [");
            boolean first = true;
        
            if (_configDataStore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configDataStore=");
                builder.append(_configDataStore);
             }
            if (_maxDataBrokerCommitQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataBrokerCommitQueueSize=");
                builder.append(_maxDataBrokerCommitQueueSize);
             }
            if (_maxDataBrokerFutureCallbackPoolSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataBrokerFutureCallbackPoolSize=");
                builder.append(_maxDataBrokerFutureCallbackPoolSize);
             }
            if (_maxDataBrokerFutureCallbackQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataBrokerFutureCallbackQueueSize=");
                builder.append(_maxDataBrokerFutureCallbackQueueSize);
             }
            if (_operationalDataStore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_operationalDataStore=");
                builder.append(_operationalDataStore);
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
            if (_allowConcurrentCommits != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_allowConcurrentCommits=");
                builder.append(_allowConcurrentCommits);
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
