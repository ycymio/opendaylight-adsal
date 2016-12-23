package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort.PortNumber;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port
 */
public class PortBuilder {

    private PortFeatures _advertisedFeatures;
    private PortConfig _configuration;
    private java.lang.String _containerName;
    private MacAddress _hardwareAddress;
    private PortKey _key;
    private PortConfig _mask;
    private java.lang.Long _portModOrder;
    private static List<Range<BigInteger>> _portModOrder_range;
    private java.lang.String _portName;
    private PortNumber _portNumber;
    private java.lang.Boolean _barrier;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentation = new HashMap<>();

    public PortBuilder() {
    } 
    
    public PortBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort arg) {
        this._portNumber = arg.getPortNumber();
        this._hardwareAddress = arg.getHardwareAddress();
        this._configuration = arg.getConfiguration();
        this._advertisedFeatures = arg.getAdvertisedFeatures();
    }

    public PortBuilder(Port base) {
        if (base.getKey() == null) {
            this._key = new PortKey(
                base.getPortModOrder()
            );
            this._portModOrder = base.getPortModOrder();
        } else {
            this._key = base.getKey();
            this._portModOrder = _key.getPortModOrder();
        }
        this._advertisedFeatures = base.getAdvertisedFeatures();
        this._configuration = base.getConfiguration();
        this._containerName = base.getContainerName();
        this._hardwareAddress = base.getHardwareAddress();
        this._mask = base.getMask();
        this._portName = base.getPortName();
        this._portNumber = base.getPortNumber();
        this._barrier = base.isBarrier();
        if (base instanceof PortImpl) {
            PortImpl _impl = (PortImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort) {
            this._portNumber = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getPortNumber();
            this._hardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getHardwareAddress();
            this._configuration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getConfiguration();
            this._advertisedFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getAdvertisedFeatures();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort] \n" +
              "but was: " + arg
            );
        }
    }

    public PortFeatures getAdvertisedFeatures() {
        return _advertisedFeatures;
    }
    
    public PortConfig getConfiguration() {
        return _configuration;
    }
    
    public java.lang.String getContainerName() {
        return _containerName;
    }
    
    public MacAddress getHardwareAddress() {
        return _hardwareAddress;
    }
    
    public PortKey getKey() {
        return _key;
    }
    
    public PortConfig getMask() {
        return _mask;
    }
    
    public java.lang.Long getPortModOrder() {
        return _portModOrder;
    }
    
    public java.lang.String getPortName() {
        return _portName;
    }
    
    public PortNumber getPortNumber() {
        return _portNumber;
    }
    
    public java.lang.Boolean isBarrier() {
        return _barrier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PortBuilder setAdvertisedFeatures(PortFeatures value) {
        this._advertisedFeatures = value;
        return this;
    }
    
    public PortBuilder setConfiguration(PortConfig value) {
        this._configuration = value;
        return this;
    }
    
    public PortBuilder setContainerName(java.lang.String value) {
        this._containerName = value;
        return this;
    }
    
    public PortBuilder setHardwareAddress(MacAddress value) {
        this._hardwareAddress = value;
        return this;
    }
    
    public PortBuilder setKey(PortKey value) {
        this._key = value;
        return this;
    }
    
    public PortBuilder setMask(PortConfig value) {
        this._mask = value;
        return this;
    }
    
    public PortBuilder setPortModOrder(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _portModOrder_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _portModOrder_range));
            }
        }
        this._portModOrder = value;
        return this;
    }
    public static List<Range<BigInteger>> _portModOrder_range() {
        if (_portModOrder_range == null) {
            synchronized (PortBuilder.class) {
                if (_portModOrder_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _portModOrder_range = builder.build();
                }
            }
        }
        return _portModOrder_range;
    }
    
    public PortBuilder setPortName(java.lang.String value) {
        this._portName = value;
        return this;
    }
    
    public PortBuilder setPortNumber(PortNumber value) {
        this._portNumber = value;
        return this;
    }
    
    public PortBuilder setBarrier(java.lang.Boolean value) {
        this._barrier = value;
        return this;
    }
    
    public PortBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Port build() {
        return new PortImpl(this);
    }

    private static final class PortImpl implements Port {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port.class;
        }

        private final PortFeatures _advertisedFeatures;
        private final PortConfig _configuration;
        private final java.lang.String _containerName;
        private final MacAddress _hardwareAddress;
        private final PortKey _key;
        private final PortConfig _mask;
        private final java.lang.Long _portModOrder;
        private final java.lang.String _portName;
        private final PortNumber _portNumber;
        private final java.lang.Boolean _barrier;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentation = new HashMap<>();

        private PortImpl(PortBuilder base) {
            if (base.getKey() == null) {
                this._key = new PortKey(
                    base.getPortModOrder()
                );
                this._portModOrder = base.getPortModOrder();
            } else {
                this._key = base.getKey();
                this._portModOrder = _key.getPortModOrder();
            }
            this._advertisedFeatures = base.getAdvertisedFeatures();
            this._configuration = base.getConfiguration();
            this._containerName = base.getContainerName();
            this._hardwareAddress = base.getHardwareAddress();
            this._mask = base.getMask();
            this._portName = base.getPortName();
            this._portNumber = base.getPortNumber();
            this._barrier = base.isBarrier();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public PortFeatures getAdvertisedFeatures() {
            return _advertisedFeatures;
        }
        
        @Override
        public PortConfig getConfiguration() {
            return _configuration;
        }
        
        @Override
        public java.lang.String getContainerName() {
            return _containerName;
        }
        
        @Override
        public MacAddress getHardwareAddress() {
            return _hardwareAddress;
        }
        
        @Override
        public PortKey getKey() {
            return _key;
        }
        
        @Override
        public PortConfig getMask() {
            return _mask;
        }
        
        @Override
        public java.lang.Long getPortModOrder() {
            return _portModOrder;
        }
        
        @Override
        public java.lang.String getPortName() {
            return _portName;
        }
        
        @Override
        public PortNumber getPortNumber() {
            return _portNumber;
        }
        
        @Override
        public java.lang.Boolean isBarrier() {
            return _barrier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_advertisedFeatures == null) ? 0 : _advertisedFeatures.hashCode());
            result = prime * result + ((_configuration == null) ? 0 : _configuration.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_hardwareAddress == null) ? 0 : _hardwareAddress.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_mask == null) ? 0 : _mask.hashCode());
            result = prime * result + ((_portModOrder == null) ? 0 : _portModOrder.hashCode());
            result = prime * result + ((_portName == null) ? 0 : _portName.hashCode());
            result = prime * result + ((_portNumber == null) ? 0 : _portNumber.hashCode());
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port other = (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port)obj;
            if (_advertisedFeatures == null) {
                if (other.getAdvertisedFeatures() != null) {
                    return false;
                }
            } else if(!_advertisedFeatures.equals(other.getAdvertisedFeatures())) {
                return false;
            }
            if (_configuration == null) {
                if (other.getConfiguration() != null) {
                    return false;
                }
            } else if(!_configuration.equals(other.getConfiguration())) {
                return false;
            }
            if (_containerName == null) {
                if (other.getContainerName() != null) {
                    return false;
                }
            } else if(!_containerName.equals(other.getContainerName())) {
                return false;
            }
            if (_hardwareAddress == null) {
                if (other.getHardwareAddress() != null) {
                    return false;
                }
            } else if(!_hardwareAddress.equals(other.getHardwareAddress())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_mask == null) {
                if (other.getMask() != null) {
                    return false;
                }
            } else if(!_mask.equals(other.getMask())) {
                return false;
            }
            if (_portModOrder == null) {
                if (other.getPortModOrder() != null) {
                    return false;
                }
            } else if(!_portModOrder.equals(other.getPortModOrder())) {
                return false;
            }
            if (_portName == null) {
                if (other.getPortName() != null) {
                    return false;
                }
            } else if(!_portName.equals(other.getPortName())) {
                return false;
            }
            if (_portNumber == null) {
                if (other.getPortNumber() != null) {
                    return false;
                }
            } else if(!_portNumber.equals(other.getPortNumber())) {
                return false;
            }
            if (_barrier == null) {
                if (other.isBarrier() != null) {
                    return false;
                }
            } else if(!_barrier.equals(other.isBarrier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PortImpl otherImpl = (PortImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Port [");
            boolean first = true;
        
            if (_advertisedFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_advertisedFeatures=");
                builder.append(_advertisedFeatures);
             }
            if (_configuration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configuration=");
                builder.append(_configuration);
             }
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
             }
            if (_hardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hardwareAddress=");
                builder.append(_hardwareAddress);
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
            if (_mask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mask=");
                builder.append(_mask);
             }
            if (_portModOrder != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portModOrder=");
                builder.append(_portModOrder);
             }
            if (_portName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portName=");
                builder.append(_portName);
             }
            if (_portNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portNumber=");
                builder.append(_portNumber);
             }
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
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
