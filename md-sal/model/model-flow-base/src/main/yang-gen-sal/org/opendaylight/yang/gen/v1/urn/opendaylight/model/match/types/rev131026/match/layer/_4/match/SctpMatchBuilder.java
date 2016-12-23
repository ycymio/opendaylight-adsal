package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch
 */
public class SctpMatchBuilder {

    private PortNumber _sctpDestinationPort;
    private static List<Range<BigInteger>> _sctpDestinationPort_range;
    private PortNumber _sctpSourcePort;
    private static List<Range<BigInteger>> _sctpSourcePort_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentation = new HashMap<>();

    public SctpMatchBuilder() {
    } 
    
    public SctpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields arg) {
        this._sctpSourcePort = arg.getSctpSourcePort();
        this._sctpDestinationPort = arg.getSctpDestinationPort();
    }
    

    public SctpMatchBuilder(SctpMatch base) {
        this._sctpDestinationPort = base.getSctpDestinationPort();
        this._sctpSourcePort = base.getSctpSourcePort();
        if (base instanceof SctpMatchImpl) {
            SctpMatchImpl _impl = (SctpMatchImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields) {
            this._sctpSourcePort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields)arg).getSctpSourcePort();
            this._sctpDestinationPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields)arg).getSctpDestinationPort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public PortNumber getSctpDestinationPort() {
        return _sctpDestinationPort;
    }
    
    public PortNumber getSctpSourcePort() {
        return _sctpSourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SctpMatchBuilder setSctpDestinationPort(PortNumber value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _sctpDestinationPort_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _sctpDestinationPort_range));
            }
        }
        this._sctpDestinationPort = value;
        return this;
    }
    public static List<Range<BigInteger>> _sctpDestinationPort_range() {
        if (_sctpDestinationPort_range == null) {
            synchronized (SctpMatchBuilder.class) {
                if (_sctpDestinationPort_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _sctpDestinationPort_range = builder.build();
                }
            }
        }
        return _sctpDestinationPort_range;
    }
    
    public SctpMatchBuilder setSctpSourcePort(PortNumber value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _sctpSourcePort_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _sctpSourcePort_range));
            }
        }
        this._sctpSourcePort = value;
        return this;
    }
    public static List<Range<BigInteger>> _sctpSourcePort_range() {
        if (_sctpSourcePort_range == null) {
            synchronized (SctpMatchBuilder.class) {
                if (_sctpSourcePort_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _sctpSourcePort_range = builder.build();
                }
            }
        }
        return _sctpSourcePort_range;
    }
    
    public SctpMatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SctpMatch build() {
        return new SctpMatchImpl(this);
    }

    private static final class SctpMatchImpl implements SctpMatch {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch.class;
        }

        private final PortNumber _sctpDestinationPort;
        private final PortNumber _sctpSourcePort;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentation = new HashMap<>();

        private SctpMatchImpl(SctpMatchBuilder base) {
            this._sctpDestinationPort = base.getSctpDestinationPort();
            this._sctpSourcePort = base.getSctpSourcePort();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public PortNumber getSctpDestinationPort() {
            return _sctpDestinationPort;
        }
        
        @Override
        public PortNumber getSctpSourcePort() {
            return _sctpSourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_sctpDestinationPort == null) ? 0 : _sctpDestinationPort.hashCode());
            result = prime * result + ((_sctpSourcePort == null) ? 0 : _sctpSourcePort.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch)obj;
            if (_sctpDestinationPort == null) {
                if (other.getSctpDestinationPort() != null) {
                    return false;
                }
            } else if(!_sctpDestinationPort.equals(other.getSctpDestinationPort())) {
                return false;
            }
            if (_sctpSourcePort == null) {
                if (other.getSctpSourcePort() != null) {
                    return false;
                }
            } else if(!_sctpSourcePort.equals(other.getSctpSourcePort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SctpMatchImpl otherImpl = (SctpMatchImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("SctpMatch [");
            boolean first = true;
        
            if (_sctpDestinationPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sctpDestinationPort=");
                builder.append(_sctpDestinationPort);
             }
            if (_sctpSourcePort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sctpSourcePort=");
                builder.append(_sctpSourcePort);
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
