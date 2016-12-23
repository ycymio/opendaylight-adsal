package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnorderedContainer;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.OrderedContainer;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainer;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists
 */
public class ListsBuilder {

    private OrderedContainer _orderedContainer;
    private UnkeyedContainer _unkeyedContainer;
    private UnorderedContainer _unorderedContainer;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentation = new HashMap<>();

    public ListsBuilder() {
    } 

    public ListsBuilder(Lists base) {
        this._orderedContainer = base.getOrderedContainer();
        this._unkeyedContainer = base.getUnkeyedContainer();
        this._unorderedContainer = base.getUnorderedContainer();
        if (base instanceof ListsImpl) {
            ListsImpl _impl = (ListsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public OrderedContainer getOrderedContainer() {
        return _orderedContainer;
    }
    
    public UnkeyedContainer getUnkeyedContainer() {
        return _unkeyedContainer;
    }
    
    public UnorderedContainer getUnorderedContainer() {
        return _unorderedContainer;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ListsBuilder setOrderedContainer(OrderedContainer value) {
        this._orderedContainer = value;
        return this;
    }
    
    public ListsBuilder setUnkeyedContainer(UnkeyedContainer value) {
        this._unkeyedContainer = value;
        return this;
    }
    
    public ListsBuilder setUnorderedContainer(UnorderedContainer value) {
        this._unorderedContainer = value;
        return this;
    }
    
    public ListsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Lists build() {
        return new ListsImpl(this);
    }

    private static final class ListsImpl implements Lists {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists.class;
        }

        private final OrderedContainer _orderedContainer;
        private final UnkeyedContainer _unkeyedContainer;
        private final UnorderedContainer _unorderedContainer;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentation = new HashMap<>();

        private ListsImpl(ListsBuilder base) {
            this._orderedContainer = base.getOrderedContainer();
            this._unkeyedContainer = base.getUnkeyedContainer();
            this._unorderedContainer = base.getUnorderedContainer();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public OrderedContainer getOrderedContainer() {
            return _orderedContainer;
        }
        
        @Override
        public UnkeyedContainer getUnkeyedContainer() {
            return _unkeyedContainer;
        }
        
        @Override
        public UnorderedContainer getUnorderedContainer() {
            return _unorderedContainer;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_orderedContainer == null) ? 0 : _orderedContainer.hashCode());
            result = prime * result + ((_unkeyedContainer == null) ? 0 : _unkeyedContainer.hashCode());
            result = prime * result + ((_unorderedContainer == null) ? 0 : _unorderedContainer.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists)obj;
            if (_orderedContainer == null) {
                if (other.getOrderedContainer() != null) {
                    return false;
                }
            } else if(!_orderedContainer.equals(other.getOrderedContainer())) {
                return false;
            }
            if (_unkeyedContainer == null) {
                if (other.getUnkeyedContainer() != null) {
                    return false;
                }
            } else if(!_unkeyedContainer.equals(other.getUnkeyedContainer())) {
                return false;
            }
            if (_unorderedContainer == null) {
                if (other.getUnorderedContainer() != null) {
                    return false;
                }
            } else if(!_unorderedContainer.equals(other.getUnorderedContainer())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ListsImpl otherImpl = (ListsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Lists [");
            boolean first = true;
        
            if (_orderedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_orderedContainer=");
                builder.append(_orderedContainer);
             }
            if (_unkeyedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_unkeyedContainer=");
                builder.append(_unkeyedContainer);
             }
            if (_unorderedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_unorderedContainer=");
                builder.append(_unorderedContainer);
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
