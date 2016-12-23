package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Xpath10;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockKey;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock
 */
public class PartialLockBuilder {

    private PartialLockKey _key;
    private java.lang.Long _lockId;
    private static List<Range<BigInteger>> _lockId_range;
    private java.lang.Long _lockedBySession;
    private static List<Range<BigInteger>> _lockedBySession_range;
    private List<InstanceIdentifier<?>> _lockedNode;
    private DateAndTime _lockedTime;
    private List<Xpath10> _select;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> augmentation = new HashMap<>();

    public PartialLockBuilder() {
    } 
    
    public PartialLockBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo arg) {
        this._lockedBySession = arg.getLockedBySession();
        this._lockedTime = arg.getLockedTime();
    }

    public PartialLockBuilder(PartialLock base) {
        if (base.getKey() == null) {
            this._key = new PartialLockKey(
                base.getLockId()
            );
            this._lockId = base.getLockId();
        } else {
            this._key = base.getKey();
            this._lockId = _key.getLockId();
        }
        this._lockedBySession = base.getLockedBySession();
        this._lockedNode = base.getLockedNode();
        this._lockedTime = base.getLockedTime();
        this._select = base.getSelect();
        if (base instanceof PartialLockImpl) {
            PartialLockImpl _impl = (PartialLockImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo) {
            this._lockedBySession = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo)arg).getLockedBySession();
            this._lockedTime = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo)arg).getLockedTime();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public PartialLockKey getKey() {
        return _key;
    }
    
    public java.lang.Long getLockId() {
        return _lockId;
    }
    
    public java.lang.Long getLockedBySession() {
        return _lockedBySession;
    }
    
    public List<InstanceIdentifier<?>> getLockedNode() {
        return _lockedNode;
    }
    
    public DateAndTime getLockedTime() {
        return _lockedTime;
    }
    
    public List<Xpath10> getSelect() {
        return _select;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PartialLockBuilder setKey(PartialLockKey value) {
        this._key = value;
        return this;
    }
    
    public PartialLockBuilder setLockId(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _lockId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _lockId_range));
            }
        }
        this._lockId = value;
        return this;
    }
    public static List<Range<BigInteger>> _lockId_range() {
        if (_lockId_range == null) {
            synchronized (PartialLockBuilder.class) {
                if (_lockId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _lockId_range = builder.build();
                }
            }
        }
        return _lockId_range;
    }
    
    public PartialLockBuilder setLockedBySession(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _lockedBySession_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _lockedBySession_range));
            }
        }
        this._lockedBySession = value;
        return this;
    }
    public static List<Range<BigInteger>> _lockedBySession_range() {
        if (_lockedBySession_range == null) {
            synchronized (PartialLockBuilder.class) {
                if (_lockedBySession_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _lockedBySession_range = builder.build();
                }
            }
        }
        return _lockedBySession_range;
    }
    
    public PartialLockBuilder setLockedNode(List<InstanceIdentifier<?>> value) {
        this._lockedNode = value;
        return this;
    }
    
    public PartialLockBuilder setLockedTime(DateAndTime value) {
        this._lockedTime = value;
        return this;
    }
    
    public PartialLockBuilder setSelect(List<Xpath10> value) {
        this._select = value;
        return this;
    }
    
    public PartialLockBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PartialLock build() {
        return new PartialLockImpl(this);
    }

    private static final class PartialLockImpl implements PartialLock {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock.class;
        }

        private final PartialLockKey _key;
        private final java.lang.Long _lockId;
        private final java.lang.Long _lockedBySession;
        private final List<InstanceIdentifier<?>> _lockedNode;
        private final DateAndTime _lockedTime;
        private final List<Xpath10> _select;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> augmentation = new HashMap<>();

        private PartialLockImpl(PartialLockBuilder base) {
            if (base.getKey() == null) {
                this._key = new PartialLockKey(
                    base.getLockId()
                );
                this._lockId = base.getLockId();
            } else {
                this._key = base.getKey();
                this._lockId = _key.getLockId();
            }
            this._lockedBySession = base.getLockedBySession();
            this._lockedNode = base.getLockedNode();
            this._lockedTime = base.getLockedTime();
            this._select = base.getSelect();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public PartialLockKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getLockId() {
            return _lockId;
        }
        
        @Override
        public java.lang.Long getLockedBySession() {
            return _lockedBySession;
        }
        
        @Override
        public List<InstanceIdentifier<?>> getLockedNode() {
            return _lockedNode;
        }
        
        @Override
        public DateAndTime getLockedTime() {
            return _lockedTime;
        }
        
        @Override
        public List<Xpath10> getSelect() {
            return _select;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_lockId == null) ? 0 : _lockId.hashCode());
            result = prime * result + ((_lockedBySession == null) ? 0 : _lockedBySession.hashCode());
            result = prime * result + ((_lockedNode == null) ? 0 : _lockedNode.hashCode());
            result = prime * result + ((_lockedTime == null) ? 0 : _lockedTime.hashCode());
            result = prime * result + ((_select == null) ? 0 : _select.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_lockId == null) {
                if (other.getLockId() != null) {
                    return false;
                }
            } else if(!_lockId.equals(other.getLockId())) {
                return false;
            }
            if (_lockedBySession == null) {
                if (other.getLockedBySession() != null) {
                    return false;
                }
            } else if(!_lockedBySession.equals(other.getLockedBySession())) {
                return false;
            }
            if (_lockedNode == null) {
                if (other.getLockedNode() != null) {
                    return false;
                }
            } else if(!_lockedNode.equals(other.getLockedNode())) {
                return false;
            }
            if (_lockedTime == null) {
                if (other.getLockedTime() != null) {
                    return false;
                }
            } else if(!_lockedTime.equals(other.getLockedTime())) {
                return false;
            }
            if (_select == null) {
                if (other.getSelect() != null) {
                    return false;
                }
            } else if(!_select.equals(other.getSelect())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PartialLockImpl otherImpl = (PartialLockImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("PartialLock [");
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
            if (_lockId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lockId=");
                builder.append(_lockId);
             }
            if (_lockedBySession != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lockedBySession=");
                builder.append(_lockedBySession);
             }
            if (_lockedNode != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lockedNode=");
                builder.append(_lockedNode);
             }
            if (_lockedTime != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_lockedTime=");
                builder.append(_lockedTime);
             }
            if (_select != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_select=");
                builder.append(_select);
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
