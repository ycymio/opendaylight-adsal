package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.InstructionKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction
 */
public class InstructionBuilder {

    private org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction _instruction;
    private InstructionKey _key;
    private java.lang.Integer _order;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentation = new HashMap<>();

    public InstructionBuilder() {
    } 
    
    public InstructionBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction arg) {
        this._instruction = arg.getInstruction();
    }
    
    public InstructionBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered arg) {
        this._order = arg.getOrder();
    }

    public InstructionBuilder(Instruction base) {
        if (base.getKey() == null) {
            this._key = new InstructionKey(
                base.getOrder()
            );
            this._order = base.getOrder();
        } else {
            this._key = base.getKey();
            this._order = _key.getOrder();
        }
        this._instruction = base.getInstruction();
        if (base instanceof InstructionImpl) {
            InstructionImpl _impl = (InstructionImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction) {
            this._instruction = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction)arg).getInstruction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction] \n" +
              "but was: " + arg
            );
        }
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction getInstruction() {
        return _instruction;
    }
    
    public InstructionKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getOrder() {
        return _order;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InstructionBuilder setInstruction(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction value) {
        this._instruction = value;
        return this;
    }
    
    public InstructionBuilder setKey(InstructionKey value) {
        this._key = value;
        return this;
    }
    
    public InstructionBuilder setOrder(java.lang.Integer value) {
        this._order = value;
        return this;
    }
    
    public InstructionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Instruction build() {
        return new InstructionImpl(this);
    }

    private static final class InstructionImpl implements Instruction {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction.class;
        }

        private final org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction _instruction;
        private final InstructionKey _key;
        private final java.lang.Integer _order;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentation = new HashMap<>();

        private InstructionImpl(InstructionBuilder base) {
            if (base.getKey() == null) {
                this._key = new InstructionKey(
                    base.getOrder()
                );
                this._order = base.getOrder();
            } else {
                this._key = base.getKey();
                this._order = _key.getOrder();
            }
            this._instruction = base.getInstruction();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction getInstruction() {
            return _instruction;
        }
        
        @Override
        public InstructionKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getOrder() {
            return _order;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_instruction == null) ? 0 : _instruction.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_order == null) ? 0 : _order.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction other = (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction)obj;
            if (_instruction == null) {
                if (other.getInstruction() != null) {
                    return false;
                }
            } else if(!_instruction.equals(other.getInstruction())) {
                return false;
            }
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstructionImpl otherImpl = (InstructionImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Instruction [");
            boolean first = true;
        
            if (_instruction != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_instruction=");
                builder.append(_instruction);
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
            if (_order != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_order=");
                builder.append(_order);
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
