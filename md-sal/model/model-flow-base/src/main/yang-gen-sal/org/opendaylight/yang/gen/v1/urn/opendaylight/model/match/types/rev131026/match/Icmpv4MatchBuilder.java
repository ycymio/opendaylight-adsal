package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match
 */
public class Icmpv4MatchBuilder {

    private java.lang.Short _icmpv4Code;
    private static List<Range<BigInteger>> _icmpv4Code_range;
    private java.lang.Short _icmpv4Type;
    private static List<Range<BigInteger>> _icmpv4Type_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentation = new HashMap<>();

    public Icmpv4MatchBuilder() {
    } 
    
    public Icmpv4MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields arg) {
        this._icmpv4Type = arg.getIcmpv4Type();
        this._icmpv4Code = arg.getIcmpv4Code();
    }

    public Icmpv4MatchBuilder(Icmpv4Match base) {
        this._icmpv4Code = base.getIcmpv4Code();
        this._icmpv4Type = base.getIcmpv4Type();
        if (base instanceof Icmpv4MatchImpl) {
            Icmpv4MatchImpl _impl = (Icmpv4MatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields) {
            this._icmpv4Type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields)arg).getIcmpv4Type();
            this._icmpv4Code = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields)arg).getIcmpv4Code();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getIcmpv4Code() {
        return _icmpv4Code;
    }
    
    public java.lang.Short getIcmpv4Type() {
        return _icmpv4Type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Icmpv4MatchBuilder setIcmpv4Code(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _icmpv4Code_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _icmpv4Code_range));
            }
        }
        this._icmpv4Code = value;
        return this;
    }
    public static List<Range<BigInteger>> _icmpv4Code_range() {
        if (_icmpv4Code_range == null) {
            synchronized (Icmpv4MatchBuilder.class) {
                if (_icmpv4Code_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _icmpv4Code_range = builder.build();
                }
            }
        }
        return _icmpv4Code_range;
    }
    
    public Icmpv4MatchBuilder setIcmpv4Type(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _icmpv4Type_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _icmpv4Type_range));
            }
        }
        this._icmpv4Type = value;
        return this;
    }
    public static List<Range<BigInteger>> _icmpv4Type_range() {
        if (_icmpv4Type_range == null) {
            synchronized (Icmpv4MatchBuilder.class) {
                if (_icmpv4Type_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _icmpv4Type_range = builder.build();
                }
            }
        }
        return _icmpv4Type_range;
    }
    
    public Icmpv4MatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Icmpv4Match build() {
        return new Icmpv4MatchImpl(this);
    }

    private static final class Icmpv4MatchImpl implements Icmpv4Match {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match.class;
        }

        private final java.lang.Short _icmpv4Code;
        private final java.lang.Short _icmpv4Type;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentation = new HashMap<>();

        private Icmpv4MatchImpl(Icmpv4MatchBuilder base) {
            this._icmpv4Code = base.getIcmpv4Code();
            this._icmpv4Type = base.getIcmpv4Type();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Short getIcmpv4Code() {
            return _icmpv4Code;
        }
        
        @Override
        public java.lang.Short getIcmpv4Type() {
            return _icmpv4Type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_icmpv4Code == null) ? 0 : _icmpv4Code.hashCode());
            result = prime * result + ((_icmpv4Type == null) ? 0 : _icmpv4Type.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match)obj;
            if (_icmpv4Code == null) {
                if (other.getIcmpv4Code() != null) {
                    return false;
                }
            } else if(!_icmpv4Code.equals(other.getIcmpv4Code())) {
                return false;
            }
            if (_icmpv4Type == null) {
                if (other.getIcmpv4Type() != null) {
                    return false;
                }
            } else if(!_icmpv4Type.equals(other.getIcmpv4Type())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Icmpv4MatchImpl otherImpl = (Icmpv4MatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Icmpv4Match [");
            boolean first = true;
        
            if (_icmpv4Code != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Code=");
                builder.append(_icmpv4Code);
             }
            if (_icmpv4Type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Type=");
                builder.append(_icmpv4Type);
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
