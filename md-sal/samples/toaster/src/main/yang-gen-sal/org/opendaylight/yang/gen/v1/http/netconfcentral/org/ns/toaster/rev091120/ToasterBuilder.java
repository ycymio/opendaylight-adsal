package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.ToasterStatus;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster
 */
public class ToasterBuilder {

    private java.lang.Long _darknessFactor;
    private static List<Range<BigInteger>> _darknessFactor_range;
    private DisplayString _toasterManufacturer;
    private static List<Range<BigInteger>> _toasterManufacturer_length;
    private DisplayString _toasterModelNumber;
    private static List<Range<BigInteger>> _toasterModelNumber_length;
    private ToasterStatus _toasterStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation = new HashMap<>();

    public ToasterBuilder() {
    } 

    public ToasterBuilder(Toaster base) {
        this._darknessFactor = base.getDarknessFactor();
        this._toasterManufacturer = base.getToasterManufacturer();
        this._toasterModelNumber = base.getToasterModelNumber();
        this._toasterStatus = base.getToasterStatus();
        if (base instanceof ToasterImpl) {
            ToasterImpl _impl = (ToasterImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getDarknessFactor() {
        return _darknessFactor;
    }
    
    public DisplayString getToasterManufacturer() {
        return _toasterManufacturer;
    }
    
    public DisplayString getToasterModelNumber() {
        return _toasterModelNumber;
    }
    
    public ToasterStatus getToasterStatus() {
        return _toasterStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ToasterBuilder setDarknessFactor(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _darknessFactor_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _darknessFactor_range));
            }
        }
        this._darknessFactor = value;
        return this;
    }
    public static List<Range<BigInteger>> _darknessFactor_range() {
        if (_darknessFactor_range == null) {
            synchronized (ToasterBuilder.class) {
                if (_darknessFactor_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _darknessFactor_range = builder.build();
                }
            }
        }
        return _darknessFactor_range;
    }
    
    public ToasterBuilder setToasterManufacturer(DisplayString value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue().length());
            boolean isValidLength = false;
            for (Range<BigInteger> r : _toasterManufacturer_length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", value, _toasterManufacturer_length));
            }
        }
        this._toasterManufacturer = value;
        return this;
    }
    public static List<Range<BigInteger>> _toasterManufacturer_length() {
        if (_toasterManufacturer_length == null) {
            synchronized (ToasterBuilder.class) {
                if (_toasterManufacturer_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _toasterManufacturer_length = builder.build();
                }
            }
        }
        return _toasterManufacturer_length;
    }
    
    public ToasterBuilder setToasterModelNumber(DisplayString value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue().length());
            boolean isValidLength = false;
            for (Range<BigInteger> r : _toasterModelNumber_length()) {
                if (r.contains(_constraint)) {
                    isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: %s, expected: %s.", value, _toasterModelNumber_length));
            }
        }
        this._toasterModelNumber = value;
        return this;
    }
    public static List<Range<BigInteger>> _toasterModelNumber_length() {
        if (_toasterModelNumber_length == null) {
            synchronized (ToasterBuilder.class) {
                if (_toasterModelNumber_length == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _toasterModelNumber_length = builder.build();
                }
            }
        }
        return _toasterModelNumber_length;
    }
    
    public ToasterBuilder setToasterStatus(ToasterStatus value) {
        this._toasterStatus = value;
        return this;
    }
    
    public ToasterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Toaster build() {
        return new ToasterImpl(this);
    }

    private static final class ToasterImpl implements Toaster {

        public java.lang.Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.class;
        }

        private final java.lang.Long _darknessFactor;
        private final DisplayString _toasterManufacturer;
        private final DisplayString _toasterModelNumber;
        private final ToasterStatus _toasterStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation = new HashMap<>();

        private ToasterImpl(ToasterBuilder base) {
            this._darknessFactor = base.getDarknessFactor();
            this._toasterManufacturer = base.getToasterManufacturer();
            this._toasterModelNumber = base.getToasterModelNumber();
            this._toasterStatus = base.getToasterStatus();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getDarknessFactor() {
            return _darknessFactor;
        }
        
        @Override
        public DisplayString getToasterManufacturer() {
            return _toasterManufacturer;
        }
        
        @Override
        public DisplayString getToasterModelNumber() {
            return _toasterModelNumber;
        }
        
        @Override
        public ToasterStatus getToasterStatus() {
            return _toasterStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_darknessFactor == null) ? 0 : _darknessFactor.hashCode());
            result = prime * result + ((_toasterManufacturer == null) ? 0 : _toasterManufacturer.hashCode());
            result = prime * result + ((_toasterModelNumber == null) ? 0 : _toasterModelNumber.hashCode());
            result = prime * result + ((_toasterStatus == null) ? 0 : _toasterStatus.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster other = (org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster)obj;
            if (_darknessFactor == null) {
                if (other.getDarknessFactor() != null) {
                    return false;
                }
            } else if(!_darknessFactor.equals(other.getDarknessFactor())) {
                return false;
            }
            if (_toasterManufacturer == null) {
                if (other.getToasterManufacturer() != null) {
                    return false;
                }
            } else if(!_toasterManufacturer.equals(other.getToasterManufacturer())) {
                return false;
            }
            if (_toasterModelNumber == null) {
                if (other.getToasterModelNumber() != null) {
                    return false;
                }
            } else if(!_toasterModelNumber.equals(other.getToasterModelNumber())) {
                return false;
            }
            if (_toasterStatus == null) {
                if (other.getToasterStatus() != null) {
                    return false;
                }
            } else if(!_toasterStatus.equals(other.getToasterStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterImpl otherImpl = (ToasterImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Toaster [");
            boolean first = true;
        
            if (_darknessFactor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_darknessFactor=");
                builder.append(_darknessFactor);
             }
            if (_toasterManufacturer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterManufacturer=");
                builder.append(_toasterManufacturer);
             }
            if (_toasterModelNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterModelNumber=");
                builder.append(_toasterModelNumber);
             }
            if (_toasterStatus != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterStatus=");
                builder.append(_toasterStatus);
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
