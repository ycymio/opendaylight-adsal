package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State
 */
public class StateBuilder {

    private java.lang.Boolean _blocked;
    private java.lang.Boolean _linkDown;
    private java.lang.Boolean _live;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentation = new HashMap<>();

    public StateBuilder() {
    } 
    
    public StateBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState arg) {
        this._linkDown = arg.isLinkDown();
        this._blocked = arg.isBlocked();
        this._live = arg.isLive();
    }

    public StateBuilder(State base) {
        this._blocked = base.isBlocked();
        this._linkDown = base.isLinkDown();
        this._live = base.isLive();
        if (base instanceof StateImpl) {
            StateImpl _impl = (StateImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState) {
            this._linkDown = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isLinkDown();
            this._blocked = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isBlocked();
            this._live = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isLive();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Boolean isBlocked() {
        return _blocked;
    }
    
    public java.lang.Boolean isLinkDown() {
        return _linkDown;
    }
    
    public java.lang.Boolean isLive() {
        return _live;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public StateBuilder setBlocked(java.lang.Boolean value) {
        this._blocked = value;
        return this;
    }
    
    public StateBuilder setLinkDown(java.lang.Boolean value) {
        this._linkDown = value;
        return this;
    }
    
    public StateBuilder setLive(java.lang.Boolean value) {
        this._live = value;
        return this;
    }
    
    public StateBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public State build() {
        return new StateImpl(this);
    }

    private static final class StateImpl implements State {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State.class;
        }

        private final java.lang.Boolean _blocked;
        private final java.lang.Boolean _linkDown;
        private final java.lang.Boolean _live;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentation = new HashMap<>();

        private StateImpl(StateBuilder base) {
            this._blocked = base.isBlocked();
            this._linkDown = base.isLinkDown();
            this._live = base.isLive();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Boolean isBlocked() {
            return _blocked;
        }
        
        @Override
        public java.lang.Boolean isLinkDown() {
            return _linkDown;
        }
        
        @Override
        public java.lang.Boolean isLive() {
            return _live;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_blocked == null) ? 0 : _blocked.hashCode());
            result = prime * result + ((_linkDown == null) ? 0 : _linkDown.hashCode());
            result = prime * result + ((_live == null) ? 0 : _live.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State other = (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State)obj;
            if (_blocked == null) {
                if (other.isBlocked() != null) {
                    return false;
                }
            } else if(!_blocked.equals(other.isBlocked())) {
                return false;
            }
            if (_linkDown == null) {
                if (other.isLinkDown() != null) {
                    return false;
                }
            } else if(!_linkDown.equals(other.isLinkDown())) {
                return false;
            }
            if (_live == null) {
                if (other.isLive() != null) {
                    return false;
                }
            } else if(!_live.equals(other.isLive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StateImpl otherImpl = (StateImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("State [");
            boolean first = true;
        
            if (_blocked != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_blocked=");
                builder.append(_blocked);
             }
            if (_linkDown != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_linkDown=");
                builder.append(_linkDown);
             }
            if (_live != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_live=");
                builder.append(_live);
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
