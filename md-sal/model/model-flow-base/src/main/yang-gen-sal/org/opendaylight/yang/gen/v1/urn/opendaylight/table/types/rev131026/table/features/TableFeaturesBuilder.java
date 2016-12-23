package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeaturesKey;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures
 */
public class TableFeaturesBuilder {

    private TableConfig _config;
    private TableFeaturesKey _key;
    private java.lang.Long _maxEntries;
    private static List<Range<BigInteger>> _maxEntries_range;
    private BigInteger _metadataMatch;
    private static List<Range<BigInteger>> _metadataMatch_range;
    private BigInteger _metadataWrite;
    private static List<Range<BigInteger>> _metadataWrite_range;
    private java.lang.String _name;
    private java.lang.Short _tableId;
    private static List<Range<BigInteger>> _tableId_range;
    private TableProperties _tableProperties;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentation = new HashMap<>();

    public TableFeaturesBuilder() {
    } 

    public TableFeaturesBuilder(TableFeatures base) {
        if (base.getKey() == null) {
            this._key = new TableFeaturesKey(
                base.getTableId()
            );
            this._tableId = base.getTableId();
        } else {
            this._key = base.getKey();
            this._tableId = _key.getTableId();
        }
        this._config = base.getConfig();
        this._maxEntries = base.getMaxEntries();
        this._metadataMatch = base.getMetadataMatch();
        this._metadataWrite = base.getMetadataWrite();
        this._name = base.getName();
        this._tableProperties = base.getTableProperties();
        if (base instanceof TableFeaturesImpl) {
            TableFeaturesImpl _impl = (TableFeaturesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public TableConfig getConfig() {
        return _config;
    }
    
    public TableFeaturesKey getKey() {
        return _key;
    }
    
    public java.lang.Long getMaxEntries() {
        return _maxEntries;
    }
    
    public BigInteger getMetadataMatch() {
        return _metadataMatch;
    }
    
    public BigInteger getMetadataWrite() {
        return _metadataWrite;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Short getTableId() {
        return _tableId;
    }
    
    public TableProperties getTableProperties() {
        return _tableProperties;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableFeaturesBuilder setConfig(TableConfig value) {
        this._config = value;
        return this;
    }
    
    public TableFeaturesBuilder setKey(TableFeaturesKey value) {
        this._key = value;
        return this;
    }
    
    public TableFeaturesBuilder setMaxEntries(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _maxEntries_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _maxEntries_range));
            }
        }
        this._maxEntries = value;
        return this;
    }
    public static List<Range<BigInteger>> _maxEntries_range() {
        if (_maxEntries_range == null) {
            synchronized (TableFeaturesBuilder.class) {
                if (_maxEntries_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _maxEntries_range = builder.build();
                }
            }
        }
        return _maxEntries_range;
    }
    
    public TableFeaturesBuilder setMetadataMatch(BigInteger value) {
        if (value != null) {
            BigInteger _constraint = value;
            boolean isValidRange = false;
            for (Range<BigInteger> r : _metadataMatch_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _metadataMatch_range));
            }
        }
        this._metadataMatch = value;
        return this;
    }
    public static List<Range<BigInteger>> _metadataMatch_range() {
        if (_metadataMatch_range == null) {
            synchronized (TableFeaturesBuilder.class) {
                if (_metadataMatch_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _metadataMatch_range = builder.build();
                }
            }
        }
        return _metadataMatch_range;
    }
    
    public TableFeaturesBuilder setMetadataWrite(BigInteger value) {
        if (value != null) {
            BigInteger _constraint = value;
            boolean isValidRange = false;
            for (Range<BigInteger> r : _metadataWrite_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _metadataWrite_range));
            }
        }
        this._metadataWrite = value;
        return this;
    }
    public static List<Range<BigInteger>> _metadataWrite_range() {
        if (_metadataWrite_range == null) {
            synchronized (TableFeaturesBuilder.class) {
                if (_metadataWrite_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _metadataWrite_range = builder.build();
                }
            }
        }
        return _metadataWrite_range;
    }
    
    public TableFeaturesBuilder setName(java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public TableFeaturesBuilder setTableId(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _tableId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _tableId_range));
            }
        }
        this._tableId = value;
        return this;
    }
    public static List<Range<BigInteger>> _tableId_range() {
        if (_tableId_range == null) {
            synchronized (TableFeaturesBuilder.class) {
                if (_tableId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _tableId_range = builder.build();
                }
            }
        }
        return _tableId_range;
    }
    
    public TableFeaturesBuilder setTableProperties(TableProperties value) {
        this._tableProperties = value;
        return this;
    }
    
    public TableFeaturesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableFeatures build() {
        return new TableFeaturesImpl(this);
    }

    private static final class TableFeaturesImpl implements TableFeatures {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures.class;
        }

        private final TableConfig _config;
        private final TableFeaturesKey _key;
        private final java.lang.Long _maxEntries;
        private final BigInteger _metadataMatch;
        private final BigInteger _metadataWrite;
        private final java.lang.String _name;
        private final java.lang.Short _tableId;
        private final TableProperties _tableProperties;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentation = new HashMap<>();

        private TableFeaturesImpl(TableFeaturesBuilder base) {
            if (base.getKey() == null) {
                this._key = new TableFeaturesKey(
                    base.getTableId()
                );
                this._tableId = base.getTableId();
            } else {
                this._key = base.getKey();
                this._tableId = _key.getTableId();
            }
            this._config = base.getConfig();
            this._maxEntries = base.getMaxEntries();
            this._metadataMatch = base.getMetadataMatch();
            this._metadataWrite = base.getMetadataWrite();
            this._name = base.getName();
            this._tableProperties = base.getTableProperties();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public TableConfig getConfig() {
            return _config;
        }
        
        @Override
        public TableFeaturesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getMaxEntries() {
            return _maxEntries;
        }
        
        @Override
        public BigInteger getMetadataMatch() {
            return _metadataMatch;
        }
        
        @Override
        public BigInteger getMetadataWrite() {
            return _metadataWrite;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Short getTableId() {
            return _tableId;
        }
        
        @Override
        public TableProperties getTableProperties() {
            return _tableProperties;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_config == null) ? 0 : _config.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_maxEntries == null) ? 0 : _maxEntries.hashCode());
            result = prime * result + ((_metadataMatch == null) ? 0 : _metadataMatch.hashCode());
            result = prime * result + ((_metadataWrite == null) ? 0 : _metadataWrite.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
            result = prime * result + ((_tableProperties == null) ? 0 : _tableProperties.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures other = (org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures)obj;
            if (_config == null) {
                if (other.getConfig() != null) {
                    return false;
                }
            } else if(!_config.equals(other.getConfig())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_maxEntries == null) {
                if (other.getMaxEntries() != null) {
                    return false;
                }
            } else if(!_maxEntries.equals(other.getMaxEntries())) {
                return false;
            }
            if (_metadataMatch == null) {
                if (other.getMetadataMatch() != null) {
                    return false;
                }
            } else if(!_metadataMatch.equals(other.getMetadataMatch())) {
                return false;
            }
            if (_metadataWrite == null) {
                if (other.getMetadataWrite() != null) {
                    return false;
                }
            } else if(!_metadataWrite.equals(other.getMetadataWrite())) {
                return false;
            }
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_tableId == null) {
                if (other.getTableId() != null) {
                    return false;
                }
            } else if(!_tableId.equals(other.getTableId())) {
                return false;
            }
            if (_tableProperties == null) {
                if (other.getTableProperties() != null) {
                    return false;
                }
            } else if(!_tableProperties.equals(other.getTableProperties())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TableFeaturesImpl otherImpl = (TableFeaturesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TableFeatures [");
            boolean first = true;
        
            if (_config != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_config=");
                builder.append(_config);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_maxEntries != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxEntries=");
                builder.append(_maxEntries);
             }
            if (_metadataMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadataMatch=");
                builder.append(_metadataMatch);
             }
            if (_metadataWrite != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadataWrite=");
                builder.append(_metadataWrite);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
             }
            if (_tableProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableProperties=");
                builder.append(_tableProperties);
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
