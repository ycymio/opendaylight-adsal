package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions
 */
public class TransactionsBuilder {

    private java.lang.Long _created;
    private static List<Range<BigInteger>> _created_range;
    private java.lang.Long _failed;
    private static List<Range<BigInteger>> _failed_range;
    private java.lang.Long _submitted;
    private static List<Range<BigInteger>> _submitted_range;
    private java.lang.Long _successful;
    private static List<Range<BigInteger>> _successful_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> augmentation = new HashMap<>();

    public TransactionsBuilder() {
    } 

    public TransactionsBuilder(Transactions base) {
        this._created = base.getCreated();
        this._failed = base.getFailed();
        this._submitted = base.getSubmitted();
        this._successful = base.getSuccessful();
        if (base instanceof TransactionsImpl) {
            TransactionsImpl _impl = (TransactionsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getCreated() {
        return _created;
    }
    
    public java.lang.Long getFailed() {
        return _failed;
    }
    
    public java.lang.Long getSubmitted() {
        return _submitted;
    }
    
    public java.lang.Long getSuccessful() {
        return _successful;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TransactionsBuilder setCreated(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _created_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _created_range));
            }
        }
        this._created = value;
        return this;
    }
    public static List<Range<BigInteger>> _created_range() {
        if (_created_range == null) {
            synchronized (TransactionsBuilder.class) {
                if (_created_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _created_range = builder.build();
                }
            }
        }
        return _created_range;
    }
    
    public TransactionsBuilder setFailed(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _failed_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _failed_range));
            }
        }
        this._failed = value;
        return this;
    }
    public static List<Range<BigInteger>> _failed_range() {
        if (_failed_range == null) {
            synchronized (TransactionsBuilder.class) {
                if (_failed_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _failed_range = builder.build();
                }
            }
        }
        return _failed_range;
    }
    
    public TransactionsBuilder setSubmitted(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _submitted_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _submitted_range));
            }
        }
        this._submitted = value;
        return this;
    }
    public static List<Range<BigInteger>> _submitted_range() {
        if (_submitted_range == null) {
            synchronized (TransactionsBuilder.class) {
                if (_submitted_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _submitted_range = builder.build();
                }
            }
        }
        return _submitted_range;
    }
    
    public TransactionsBuilder setSuccessful(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _successful_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _successful_range));
            }
        }
        this._successful = value;
        return this;
    }
    public static List<Range<BigInteger>> _successful_range() {
        if (_successful_range == null) {
            synchronized (TransactionsBuilder.class) {
                if (_successful_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _successful_range = builder.build();
                }
            }
        }
        return _successful_range;
    }
    
    public TransactionsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Transactions build() {
        return new TransactionsImpl(this);
    }

    private static final class TransactionsImpl implements Transactions {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions.class;
        }

        private final java.lang.Long _created;
        private final java.lang.Long _failed;
        private final java.lang.Long _submitted;
        private final java.lang.Long _successful;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> augmentation = new HashMap<>();

        private TransactionsImpl(TransactionsBuilder base) {
            this._created = base.getCreated();
            this._failed = base.getFailed();
            this._submitted = base.getSubmitted();
            this._successful = base.getSuccessful();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getCreated() {
            return _created;
        }
        
        @Override
        public java.lang.Long getFailed() {
            return _failed;
        }
        
        @Override
        public java.lang.Long getSubmitted() {
            return _submitted;
        }
        
        @Override
        public java.lang.Long getSuccessful() {
            return _successful;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_created == null) ? 0 : _created.hashCode());
            result = prime * result + ((_failed == null) ? 0 : _failed.hashCode());
            result = prime * result + ((_submitted == null) ? 0 : _submitted.hashCode());
            result = prime * result + ((_successful == null) ? 0 : _successful.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions)obj;
            if (_created == null) {
                if (other.getCreated() != null) {
                    return false;
                }
            } else if(!_created.equals(other.getCreated())) {
                return false;
            }
            if (_failed == null) {
                if (other.getFailed() != null) {
                    return false;
                }
            } else if(!_failed.equals(other.getFailed())) {
                return false;
            }
            if (_submitted == null) {
                if (other.getSubmitted() != null) {
                    return false;
                }
            } else if(!_submitted.equals(other.getSubmitted())) {
                return false;
            }
            if (_successful == null) {
                if (other.getSuccessful() != null) {
                    return false;
                }
            } else if(!_successful.equals(other.getSuccessful())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TransactionsImpl otherImpl = (TransactionsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Transactions [");
            boolean first = true;
        
            if (_created != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_created=");
                builder.append(_created);
             }
            if (_failed != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_failed=");
                builder.append(_failed);
             }
            if (_submitted != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_submitted=");
                builder.append(_submitted);
             }
            if (_successful != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_successful=");
                builder.append(_successful);
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
