package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.dom.forwarding.component.BindingMappingService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.dom.forwarding.component.DomAsyncBroker;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker
 */
public class BindingForwardedDataBrokerBuilder {

    private BindingMappingService _bindingMappingService;
    private DomAsyncBroker _domAsyncBroker;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> augmentation = new HashMap<>();

    public BindingForwardedDataBrokerBuilder() {
    } 
    
    public BindingForwardedDataBrokerBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent arg) {
        this._domAsyncBroker = arg.getDomAsyncBroker();
        this._bindingMappingService = arg.getBindingMappingService();
    }

    public BindingForwardedDataBrokerBuilder(BindingForwardedDataBroker base) {
        this._bindingMappingService = base.getBindingMappingService();
        this._domAsyncBroker = base.getDomAsyncBroker();
        if (base instanceof BindingForwardedDataBrokerImpl) {
            BindingForwardedDataBrokerImpl _impl = (BindingForwardedDataBrokerImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent) {
            this._domAsyncBroker = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent)arg).getDomAsyncBroker();
            this._bindingMappingService = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent)arg).getBindingMappingService();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.DomForwardingComponent] \n" +
              "but was: " + arg
            );
        }
    }

    public BindingMappingService getBindingMappingService() {
        return _bindingMappingService;
    }
    
    public DomAsyncBroker getDomAsyncBroker() {
        return _domAsyncBroker;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BindingForwardedDataBrokerBuilder setBindingMappingService(BindingMappingService value) {
        this._bindingMappingService = value;
        return this;
    }
    
    public BindingForwardedDataBrokerBuilder setDomAsyncBroker(DomAsyncBroker value) {
        this._domAsyncBroker = value;
        return this;
    }
    
    public BindingForwardedDataBrokerBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BindingForwardedDataBroker build() {
        return new BindingForwardedDataBrokerImpl(this);
    }

    private static final class BindingForwardedDataBrokerImpl implements BindingForwardedDataBroker {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker.class;
        }

        private final BindingMappingService _bindingMappingService;
        private final DomAsyncBroker _domAsyncBroker;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> augmentation = new HashMap<>();

        private BindingForwardedDataBrokerImpl(BindingForwardedDataBrokerBuilder base) {
            this._bindingMappingService = base.getBindingMappingService();
            this._domAsyncBroker = base.getDomAsyncBroker();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public BindingMappingService getBindingMappingService() {
            return _bindingMappingService;
        }
        
        @Override
        public DomAsyncBroker getDomAsyncBroker() {
            return _domAsyncBroker;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bindingMappingService == null) ? 0 : _bindingMappingService.hashCode());
            result = prime * result + ((_domAsyncBroker == null) ? 0 : _domAsyncBroker.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker)obj;
            if (_bindingMappingService == null) {
                if (other.getBindingMappingService() != null) {
                    return false;
                }
            } else if(!_bindingMappingService.equals(other.getBindingMappingService())) {
                return false;
            }
            if (_domAsyncBroker == null) {
                if (other.getDomAsyncBroker() != null) {
                    return false;
                }
            } else if(!_domAsyncBroker.equals(other.getDomAsyncBroker())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BindingForwardedDataBrokerImpl otherImpl = (BindingForwardedDataBrokerImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("BindingForwardedDataBroker [");
            boolean first = true;
        
            if (_bindingMappingService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bindingMappingService=");
                builder.append(_bindingMappingService);
             }
            if (_domAsyncBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domAsyncBroker=");
                builder.append(_domAsyncBroker);
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
