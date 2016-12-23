package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.flood.action._case.FloodAction;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase
 */
public class FloodActionCaseBuilder {

    private FloodAction _floodAction;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> augmentation = new HashMap<>();

    public FloodActionCaseBuilder() {
    } 
    

    public FloodActionCaseBuilder(FloodActionCase base) {
        this._floodAction = base.getFloodAction();
        if (base instanceof FloodActionCaseImpl) {
            FloodActionCaseImpl _impl = (FloodActionCaseImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public FloodAction getFloodAction() {
        return _floodAction;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FloodActionCaseBuilder setFloodAction(FloodAction value) {
        this._floodAction = value;
        return this;
    }
    
    public FloodActionCaseBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FloodActionCase build() {
        return new FloodActionCaseImpl(this);
    }

    private static final class FloodActionCaseImpl implements FloodActionCase {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase.class;
        }

        private final FloodAction _floodAction;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> augmentation = new HashMap<>();

        private FloodActionCaseImpl(FloodActionCaseBuilder base) {
            this._floodAction = base.getFloodAction();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public FloodAction getFloodAction() {
            return _floodAction;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_floodAction == null) ? 0 : _floodAction.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase other = (org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase)obj;
            if (_floodAction == null) {
                if (other.getFloodAction() != null) {
                    return false;
                }
            } else if(!_floodAction.equals(other.getFloodAction())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FloodActionCaseImpl otherImpl = (FloodActionCaseImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.FloodActionCase>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("FloodActionCase [");
            boolean first = true;
        
            if (_floodAction != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_floodAction=");
                builder.append(_floodAction);
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
