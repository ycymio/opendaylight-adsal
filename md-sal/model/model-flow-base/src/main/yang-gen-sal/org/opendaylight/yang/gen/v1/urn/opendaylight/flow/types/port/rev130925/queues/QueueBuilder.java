package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueKey;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue
 */
public class QueueBuilder {

    private QueueKey _key;
    private java.lang.Long _port;
    private static List<Range<BigInteger>> _port_range;
    private java.lang.Integer _property;
    private static List<Range<BigInteger>> _property_range;
    private QueueId _queueId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> augmentation = new HashMap<>();

    public QueueBuilder() {
    } 
    
    public QueueBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket arg) {
        this._queueId = arg.getQueueId();
        this._port = arg.getPort();
        this._property = arg.getProperty();
    }
    
    public QueueBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue arg) {
        this._property = arg.getProperty();
    }

    public QueueBuilder(Queue base) {
        if (base.getKey() == null) {
            this._key = new QueueKey(
                base.getQueueId()
            );
            this._queueId = base.getQueueId();
        } else {
            this._key = base.getKey();
            this._queueId = _key.getQueueId();
        }
        this._port = base.getPort();
        this._property = base.getProperty();
        if (base instanceof QueueImpl) {
            QueueImpl _impl = (QueueImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket) {
            this._queueId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket)arg).getQueueId();
            this._port = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket)arg).getPort();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue) {
            this._property = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue)arg).getProperty();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue] \n" +
              "but was: " + arg
            );
        }
    }

    public QueueKey getKey() {
        return _key;
    }
    
    public java.lang.Long getPort() {
        return _port;
    }
    
    public java.lang.Integer getProperty() {
        return _property;
    }
    
    public QueueId getQueueId() {
        return _queueId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public QueueBuilder setKey(QueueKey value) {
        this._key = value;
        return this;
    }
    
    public QueueBuilder setPort(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _port_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _port_range));
            }
        }
        this._port = value;
        return this;
    }
    public static List<Range<BigInteger>> _port_range() {
        if (_port_range == null) {
            synchronized (QueueBuilder.class) {
                if (_port_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _port_range = builder.build();
                }
            }
        }
        return _port_range;
    }
    
    public QueueBuilder setProperty(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _property_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _property_range));
            }
        }
        this._property = value;
        return this;
    }
    public static List<Range<BigInteger>> _property_range() {
        if (_property_range == null) {
            synchronized (QueueBuilder.class) {
                if (_property_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _property_range = builder.build();
                }
            }
        }
        return _property_range;
    }
    
    public QueueBuilder setQueueId(QueueId value) {
        this._queueId = value;
        return this;
    }
    
    public QueueBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Queue build() {
        return new QueueImpl(this);
    }

    private static final class QueueImpl implements Queue {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue.class;
        }

        private final QueueKey _key;
        private final java.lang.Long _port;
        private final java.lang.Integer _property;
        private final QueueId _queueId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> augmentation = new HashMap<>();

        private QueueImpl(QueueBuilder base) {
            if (base.getKey() == null) {
                this._key = new QueueKey(
                    base.getQueueId()
                );
                this._queueId = base.getQueueId();
            } else {
                this._key = base.getKey();
                this._queueId = _key.getQueueId();
            }
            this._port = base.getPort();
            this._property = base.getProperty();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public QueueKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getPort() {
            return _port;
        }
        
        @Override
        public java.lang.Integer getProperty() {
            return _property;
        }
        
        @Override
        public QueueId getQueueId() {
            return _queueId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
            result = prime * result + ((_property == null) ? 0 : _property.hashCode());
            result = prime * result + ((_queueId == null) ? 0 : _queueId.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue other = (org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_port == null) {
                if (other.getPort() != null) {
                    return false;
                }
            } else if(!_port.equals(other.getPort())) {
                return false;
            }
            if (_property == null) {
                if (other.getProperty() != null) {
                    return false;
                }
            } else if(!_property.equals(other.getProperty())) {
                return false;
            }
            if (_queueId == null) {
                if (other.getQueueId() != null) {
                    return false;
                }
            } else if(!_queueId.equals(other.getQueueId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                QueueImpl otherImpl = (QueueImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Queue [");
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
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
             }
            if (_property != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_property=");
                builder.append(_property);
             }
            if (_queueId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_queueId=");
                builder.append(_queueId);
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
