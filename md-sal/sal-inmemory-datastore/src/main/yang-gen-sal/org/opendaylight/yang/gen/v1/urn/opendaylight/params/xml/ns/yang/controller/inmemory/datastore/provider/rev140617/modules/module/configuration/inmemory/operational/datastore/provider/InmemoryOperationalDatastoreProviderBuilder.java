package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.inmemory.operational.datastore.provider.SchemaService;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider
 */
public class InmemoryOperationalDatastoreProviderBuilder {

    private java.lang.Integer _maxDataChangeExecutorPoolSize;
    private static List<Range<BigInteger>> _maxDataChangeExecutorPoolSize_range;
    private java.lang.Integer _maxDataChangeExecutorQueueSize;
    private static List<Range<BigInteger>> _maxDataChangeExecutorQueueSize_range;
    private java.lang.Integer _maxDataChangeListenerQueueSize;
    private static List<Range<BigInteger>> _maxDataChangeListenerQueueSize_range;
    private java.lang.Integer _maxDataStoreExecutorQueueSize;
    private static List<Range<BigInteger>> _maxDataStoreExecutorQueueSize_range;
    private SchemaService _schemaService;
    private java.lang.Boolean _debugTransactions;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> augmentation = new HashMap<>();

    public InmemoryOperationalDatastoreProviderBuilder() {
    } 
    
    public InmemoryOperationalDatastoreProviderBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration arg) {
        this._maxDataChangeExecutorQueueSize = arg.getMaxDataChangeExecutorQueueSize();
        this._maxDataChangeExecutorPoolSize = arg.getMaxDataChangeExecutorPoolSize();
        this._maxDataChangeListenerQueueSize = arg.getMaxDataChangeListenerQueueSize();
        this._maxDataStoreExecutorQueueSize = arg.getMaxDataStoreExecutorQueueSize();
        this._debugTransactions = arg.isDebugTransactions();
    }

    public InmemoryOperationalDatastoreProviderBuilder(InmemoryOperationalDatastoreProvider base) {
        this._maxDataChangeExecutorPoolSize = base.getMaxDataChangeExecutorPoolSize();
        this._maxDataChangeExecutorQueueSize = base.getMaxDataChangeExecutorQueueSize();
        this._maxDataChangeListenerQueueSize = base.getMaxDataChangeListenerQueueSize();
        this._maxDataStoreExecutorQueueSize = base.getMaxDataStoreExecutorQueueSize();
        this._schemaService = base.getSchemaService();
        this._debugTransactions = base.isDebugTransactions();
        if (base instanceof InmemoryOperationalDatastoreProviderImpl) {
            InmemoryOperationalDatastoreProviderImpl _impl = (InmemoryOperationalDatastoreProviderImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration) {
            this._maxDataChangeExecutorQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration)arg).getMaxDataChangeExecutorQueueSize();
            this._maxDataChangeExecutorPoolSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration)arg).getMaxDataChangeExecutorPoolSize();
            this._maxDataChangeListenerQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration)arg).getMaxDataChangeListenerQueueSize();
            this._maxDataStoreExecutorQueueSize = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration)arg).getMaxDataStoreExecutorQueueSize();
            this._debugTransactions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration)arg).isDebugTransactions();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.DatastoreConfiguration] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getMaxDataChangeExecutorPoolSize() {
        return _maxDataChangeExecutorPoolSize;
    }
    
    public java.lang.Integer getMaxDataChangeExecutorQueueSize() {
        return _maxDataChangeExecutorQueueSize;
    }
    
    public java.lang.Integer getMaxDataChangeListenerQueueSize() {
        return _maxDataChangeListenerQueueSize;
    }
    
    public java.lang.Integer getMaxDataStoreExecutorQueueSize() {
        return _maxDataStoreExecutorQueueSize;
    }
    
    public SchemaService getSchemaService() {
        return _schemaService;
    }
    
    public java.lang.Boolean isDebugTransactions() {
        return _debugTransactions;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InmemoryOperationalDatastoreProviderBuilder setMaxDataChangeExecutorPoolSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataChangeExecutorPoolSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataChangeExecutorPoolSize_range));
            }
        }
        this._maxDataChangeExecutorPoolSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataChangeExecutorPoolSize_range() {
        if (_maxDataChangeExecutorPoolSize_range == null) {
            synchronized (InmemoryOperationalDatastoreProviderBuilder.class) {
                if (_maxDataChangeExecutorPoolSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataChangeExecutorPoolSize_range = builder.build();
                }
            }
        }
        return _maxDataChangeExecutorPoolSize_range;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder setMaxDataChangeExecutorQueueSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataChangeExecutorQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataChangeExecutorQueueSize_range));
            }
        }
        this._maxDataChangeExecutorQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataChangeExecutorQueueSize_range() {
        if (_maxDataChangeExecutorQueueSize_range == null) {
            synchronized (InmemoryOperationalDatastoreProviderBuilder.class) {
                if (_maxDataChangeExecutorQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataChangeExecutorQueueSize_range = builder.build();
                }
            }
        }
        return _maxDataChangeExecutorQueueSize_range;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder setMaxDataChangeListenerQueueSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataChangeListenerQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataChangeListenerQueueSize_range));
            }
        }
        this._maxDataChangeListenerQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataChangeListenerQueueSize_range() {
        if (_maxDataChangeListenerQueueSize_range == null) {
            synchronized (InmemoryOperationalDatastoreProviderBuilder.class) {
                if (_maxDataChangeListenerQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataChangeListenerQueueSize_range = builder.build();
                }
            }
        }
        return _maxDataChangeListenerQueueSize_range;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder setMaxDataStoreExecutorQueueSize(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxDataStoreExecutorQueueSize_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxDataStoreExecutorQueueSize_range));
            }
        }
        this._maxDataStoreExecutorQueueSize = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxDataStoreExecutorQueueSize_range() {
        if (_maxDataStoreExecutorQueueSize_range == null) {
            synchronized (InmemoryOperationalDatastoreProviderBuilder.class) {
                if (_maxDataStoreExecutorQueueSize_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _maxDataStoreExecutorQueueSize_range = builder.build();
                }
            }
        }
        return _maxDataStoreExecutorQueueSize_range;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder setSchemaService(SchemaService value) {
        this._schemaService = value;
        return this;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder setDebugTransactions(java.lang.Boolean value) {
        this._debugTransactions = value;
        return this;
    }
    
    public InmemoryOperationalDatastoreProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InmemoryOperationalDatastoreProvider build() {
        return new InmemoryOperationalDatastoreProviderImpl(this);
    }

    private static final class InmemoryOperationalDatastoreProviderImpl implements InmemoryOperationalDatastoreProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider.class;
        }

        private final java.lang.Integer _maxDataChangeExecutorPoolSize;
        private final java.lang.Integer _maxDataChangeExecutorQueueSize;
        private final java.lang.Integer _maxDataChangeListenerQueueSize;
        private final java.lang.Integer _maxDataStoreExecutorQueueSize;
        private final SchemaService _schemaService;
        private final java.lang.Boolean _debugTransactions;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> augmentation = new HashMap<>();

        private InmemoryOperationalDatastoreProviderImpl(InmemoryOperationalDatastoreProviderBuilder base) {
            this._maxDataChangeExecutorPoolSize = base.getMaxDataChangeExecutorPoolSize();
            this._maxDataChangeExecutorQueueSize = base.getMaxDataChangeExecutorQueueSize();
            this._maxDataChangeListenerQueueSize = base.getMaxDataChangeListenerQueueSize();
            this._maxDataStoreExecutorQueueSize = base.getMaxDataStoreExecutorQueueSize();
            this._schemaService = base.getSchemaService();
            this._debugTransactions = base.isDebugTransactions();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Integer getMaxDataChangeExecutorPoolSize() {
            return _maxDataChangeExecutorPoolSize;
        }
        
        @Override
        public java.lang.Integer getMaxDataChangeExecutorQueueSize() {
            return _maxDataChangeExecutorQueueSize;
        }
        
        @Override
        public java.lang.Integer getMaxDataChangeListenerQueueSize() {
            return _maxDataChangeListenerQueueSize;
        }
        
        @Override
        public java.lang.Integer getMaxDataStoreExecutorQueueSize() {
            return _maxDataStoreExecutorQueueSize;
        }
        
        @Override
        public SchemaService getSchemaService() {
            return _schemaService;
        }
        
        @Override
        public java.lang.Boolean isDebugTransactions() {
            return _debugTransactions;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_maxDataChangeExecutorPoolSize == null) ? 0 : _maxDataChangeExecutorPoolSize.hashCode());
            result = prime * result + ((_maxDataChangeExecutorQueueSize == null) ? 0 : _maxDataChangeExecutorQueueSize.hashCode());
            result = prime * result + ((_maxDataChangeListenerQueueSize == null) ? 0 : _maxDataChangeListenerQueueSize.hashCode());
            result = prime * result + ((_maxDataStoreExecutorQueueSize == null) ? 0 : _maxDataStoreExecutorQueueSize.hashCode());
            result = prime * result + ((_schemaService == null) ? 0 : _schemaService.hashCode());
            result = prime * result + ((_debugTransactions == null) ? 0 : _debugTransactions.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider)obj;
            if (_maxDataChangeExecutorPoolSize == null) {
                if (other.getMaxDataChangeExecutorPoolSize() != null) {
                    return false;
                }
            } else if(!_maxDataChangeExecutorPoolSize.equals(other.getMaxDataChangeExecutorPoolSize())) {
                return false;
            }
            if (_maxDataChangeExecutorQueueSize == null) {
                if (other.getMaxDataChangeExecutorQueueSize() != null) {
                    return false;
                }
            } else if(!_maxDataChangeExecutorQueueSize.equals(other.getMaxDataChangeExecutorQueueSize())) {
                return false;
            }
            if (_maxDataChangeListenerQueueSize == null) {
                if (other.getMaxDataChangeListenerQueueSize() != null) {
                    return false;
                }
            } else if(!_maxDataChangeListenerQueueSize.equals(other.getMaxDataChangeListenerQueueSize())) {
                return false;
            }
            if (_maxDataStoreExecutorQueueSize == null) {
                if (other.getMaxDataStoreExecutorQueueSize() != null) {
                    return false;
                }
            } else if(!_maxDataStoreExecutorQueueSize.equals(other.getMaxDataStoreExecutorQueueSize())) {
                return false;
            }
            if (_schemaService == null) {
                if (other.getSchemaService() != null) {
                    return false;
                }
            } else if(!_schemaService.equals(other.getSchemaService())) {
                return false;
            }
            if (_debugTransactions == null) {
                if (other.isDebugTransactions() != null) {
                    return false;
                }
            } else if(!_debugTransactions.equals(other.isDebugTransactions())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InmemoryOperationalDatastoreProviderImpl otherImpl = (InmemoryOperationalDatastoreProviderImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617.modules.module.configuration.inmemory.operational.datastore.provider.InmemoryOperationalDatastoreProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InmemoryOperationalDatastoreProvider [");
            boolean first = true;
        
            if (_maxDataChangeExecutorPoolSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataChangeExecutorPoolSize=");
                builder.append(_maxDataChangeExecutorPoolSize);
             }
            if (_maxDataChangeExecutorQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataChangeExecutorQueueSize=");
                builder.append(_maxDataChangeExecutorQueueSize);
             }
            if (_maxDataChangeListenerQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataChangeListenerQueueSize=");
                builder.append(_maxDataChangeListenerQueueSize);
             }
            if (_maxDataStoreExecutorQueueSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxDataStoreExecutorQueueSize=");
                builder.append(_maxDataStoreExecutorQueueSize);
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
            if (_debugTransactions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_debugTransactions=");
                builder.append(_debugTransactions);
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
