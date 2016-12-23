package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.TableFeaturePropType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties
 */
public class TableFeaturePropertiesBuilder {

    private TableFeaturePropertiesKey _key;
    private java.lang.Integer _order;
    private TableFeaturePropType _tableFeaturePropType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentation = new HashMap<>();

    public TableFeaturePropertiesBuilder() {
    } 
    
    public TableFeaturePropertiesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType arg) {
        this._tableFeaturePropType = arg.getTableFeaturePropType();
    }
    
    public TableFeaturePropertiesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered arg) {
        this._order = arg.getOrder();
    }

    public TableFeaturePropertiesBuilder(TableFeatureProperties base) {
        if (base.getKey() == null) {
            this._key = new TableFeaturePropertiesKey(
                base.getOrder()
            );
            this._order = base.getOrder();
        } else {
            this._key = base.getKey();
            this._order = _key.getOrder();
        }
        this._tableFeaturePropType = base.getTableFeaturePropType();
        if (base instanceof TableFeaturePropertiesImpl) {
            TableFeaturePropertiesImpl _impl = (TableFeaturePropertiesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered) {
            this._order = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered)arg).getOrder();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType) {
            this._tableFeaturePropType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType)arg).getTableFeaturePropType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered, org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType] \n" +
              "but was: " + arg
            );
        }
    }

    public TableFeaturePropertiesKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getOrder() {
        return _order;
    }
    
    public TableFeaturePropType getTableFeaturePropType() {
        return _tableFeaturePropType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableFeaturePropertiesBuilder setKey(TableFeaturePropertiesKey value) {
        this._key = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder setOrder(java.lang.Integer value) {
        this._order = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder setTableFeaturePropType(TableFeaturePropType value) {
        this._tableFeaturePropType = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableFeatureProperties build() {
        return new TableFeaturePropertiesImpl(this);
    }

    private static final class TableFeaturePropertiesImpl implements TableFeatureProperties {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties.class;
        }

        private final TableFeaturePropertiesKey _key;
        private final java.lang.Integer _order;
        private final TableFeaturePropType _tableFeaturePropType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentation = new HashMap<>();

        private TableFeaturePropertiesImpl(TableFeaturePropertiesBuilder base) {
            if (base.getKey() == null) {
                this._key = new TableFeaturePropertiesKey(
                    base.getOrder()
                );
                this._order = base.getOrder();
            } else {
                this._key = base.getKey();
                this._order = _key.getOrder();
            }
            this._tableFeaturePropType = base.getTableFeaturePropType();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public TableFeaturePropertiesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getOrder() {
            return _order;
        }
        
        @Override
        public TableFeaturePropType getTableFeaturePropType() {
            return _tableFeaturePropType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_order == null) ? 0 : _order.hashCode());
            result = prime * result + ((_tableFeaturePropType == null) ? 0 : _tableFeaturePropType.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties other = (org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_order == null) {
                if (other.getOrder() != null) {
                    return false;
                }
            } else if(!_order.equals(other.getOrder())) {
                return false;
            }
            if (_tableFeaturePropType == null) {
                if (other.getTableFeaturePropType() != null) {
                    return false;
                }
            } else if(!_tableFeaturePropType.equals(other.getTableFeaturePropType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TableFeaturePropertiesImpl otherImpl = (TableFeaturePropertiesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TableFeatureProperties [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_order != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_order=");
                builder.append(_order);
             }
            if (_tableFeaturePropType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableFeaturePropType=");
                builder.append(_tableFeaturePropType);
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
