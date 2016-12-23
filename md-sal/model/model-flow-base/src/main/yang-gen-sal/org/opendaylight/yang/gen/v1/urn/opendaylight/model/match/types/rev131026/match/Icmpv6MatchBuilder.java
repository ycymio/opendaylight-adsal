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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match
 */
public class Icmpv6MatchBuilder {

    private java.lang.Short _icmpv6Code;
    private static List<Range<BigInteger>> _icmpv6Code_range;
    private java.lang.Short _icmpv6Type;
    private static List<Range<BigInteger>> _icmpv6Type_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentation = new HashMap<>();

    public Icmpv6MatchBuilder() {
    } 
    
    public Icmpv6MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields arg) {
        this._icmpv6Type = arg.getIcmpv6Type();
        this._icmpv6Code = arg.getIcmpv6Code();
    }

    public Icmpv6MatchBuilder(Icmpv6Match base) {
        this._icmpv6Code = base.getIcmpv6Code();
        this._icmpv6Type = base.getIcmpv6Type();
        if (base instanceof Icmpv6MatchImpl) {
            Icmpv6MatchImpl _impl = (Icmpv6MatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields) {
            this._icmpv6Type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields)arg).getIcmpv6Type();
            this._icmpv6Code = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields)arg).getIcmpv6Code();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Short getIcmpv6Code() {
        return _icmpv6Code;
    }
    
    public java.lang.Short getIcmpv6Type() {
        return _icmpv6Type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Icmpv6MatchBuilder setIcmpv6Code(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _icmpv6Code_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _icmpv6Code_range));
            }
        }
        this._icmpv6Code = value;
        return this;
    }
    public static List<Range<BigInteger>> _icmpv6Code_range() {
        if (_icmpv6Code_range == null) {
            synchronized (Icmpv6MatchBuilder.class) {
                if (_icmpv6Code_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _icmpv6Code_range = builder.build();
                }
            }
        }
        return _icmpv6Code_range;
    }
    
    public Icmpv6MatchBuilder setIcmpv6Type(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _icmpv6Type_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _icmpv6Type_range));
            }
        }
        this._icmpv6Type = value;
        return this;
    }
    public static List<Range<BigInteger>> _icmpv6Type_range() {
        if (_icmpv6Type_range == null) {
            synchronized (Icmpv6MatchBuilder.class) {
                if (_icmpv6Type_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _icmpv6Type_range = builder.build();
                }
            }
        }
        return _icmpv6Type_range;
    }
    
    public Icmpv6MatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Icmpv6Match build() {
        return new Icmpv6MatchImpl(this);
    }

    private static final class Icmpv6MatchImpl implements Icmpv6Match {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match.class;
        }

        private final java.lang.Short _icmpv6Code;
        private final java.lang.Short _icmpv6Type;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentation = new HashMap<>();

        private Icmpv6MatchImpl(Icmpv6MatchBuilder base) {
            this._icmpv6Code = base.getIcmpv6Code();
            this._icmpv6Type = base.getIcmpv6Type();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Short getIcmpv6Code() {
            return _icmpv6Code;
        }
        
        @Override
        public java.lang.Short getIcmpv6Type() {
            return _icmpv6Type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_icmpv6Code == null) ? 0 : _icmpv6Code.hashCode());
            result = prime * result + ((_icmpv6Type == null) ? 0 : _icmpv6Type.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match)obj;
            if (_icmpv6Code == null) {
                if (other.getIcmpv6Code() != null) {
                    return false;
                }
            } else if(!_icmpv6Code.equals(other.getIcmpv6Code())) {
                return false;
            }
            if (_icmpv6Type == null) {
                if (other.getIcmpv6Type() != null) {
                    return false;
                }
            } else if(!_icmpv6Type.equals(other.getIcmpv6Type())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Icmpv6MatchImpl otherImpl = (Icmpv6MatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Icmpv6Match [");
            boolean first = true;
        
            if (_icmpv6Code != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Code=");
                builder.append(_icmpv6Code);
             }
            if (_icmpv6Type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Type=");
                builder.append(_icmpv6Type);
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
