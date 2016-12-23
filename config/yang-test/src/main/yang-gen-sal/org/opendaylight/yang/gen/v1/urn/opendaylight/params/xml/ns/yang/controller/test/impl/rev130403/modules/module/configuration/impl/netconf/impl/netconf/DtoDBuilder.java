package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD
 */
public class DtoDBuilder {

    private List<ComplexDtoBInner> _complexDtoBInner;
    private java.lang.Long _simpleInt1;
    private static List<Range<BigInteger>> _simpleInt1_range;
    private java.lang.Long _simpleInt2;
    private static List<Range<BigInteger>> _simpleInt2_range;
    private java.lang.Integer _simpleInt3;
    private static List<Range<BigInteger>> _simpleInt3_range;
    private List<java.lang.Integer> _simpleList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> augmentation = new HashMap<>();

    public DtoDBuilder() {
    } 

    public DtoDBuilder(DtoD base) {
        this._complexDtoBInner = base.getComplexDtoBInner();
        this._simpleInt1 = base.getSimpleInt1();
        this._simpleInt2 = base.getSimpleInt2();
        this._simpleInt3 = base.getSimpleInt3();
        this._simpleList = base.getSimpleList();
        if (base instanceof DtoDImpl) {
            DtoDImpl _impl = (DtoDImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public List<ComplexDtoBInner> getComplexDtoBInner() {
        return _complexDtoBInner;
    }
    
    public java.lang.Long getSimpleInt1() {
        return _simpleInt1;
    }
    
    public java.lang.Long getSimpleInt2() {
        return _simpleInt2;
    }
    
    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }
    
    public List<java.lang.Integer> getSimpleList() {
        return _simpleList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DtoDBuilder setComplexDtoBInner(List<ComplexDtoBInner> value) {
        this._complexDtoBInner = value;
        return this;
    }
    
    public DtoDBuilder setSimpleInt1(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleInt1_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleInt1_range));
            }
        }
        this._simpleInt1 = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleInt1_range() {
        if (_simpleInt1_range == null) {
            synchronized (DtoDBuilder.class) {
                if (_simpleInt1_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _simpleInt1_range = builder.build();
                }
            }
        }
        return _simpleInt1_range;
    }
    
    public DtoDBuilder setSimpleInt2(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleInt2_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleInt2_range));
            }
        }
        this._simpleInt2 = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleInt2_range() {
        if (_simpleInt2_range == null) {
            synchronized (DtoDBuilder.class) {
                if (_simpleInt2_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _simpleInt2_range = builder.build();
                }
            }
        }
        return _simpleInt2_range;
    }
    
    public DtoDBuilder setSimpleInt3(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleInt3_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleInt3_range));
            }
        }
        this._simpleInt3 = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleInt3_range() {
        if (_simpleInt3_range == null) {
            synchronized (DtoDBuilder.class) {
                if (_simpleInt3_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleInt3_range = builder.build();
                }
            }
        }
        return _simpleInt3_range;
    }
    
    public DtoDBuilder setSimpleList(List<java.lang.Integer> value) {
        this._simpleList = value;
        return this;
    }
    
    public DtoDBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DtoD build() {
        return new DtoDImpl(this);
    }

    private static final class DtoDImpl implements DtoD {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD.class;
        }

        private final List<ComplexDtoBInner> _complexDtoBInner;
        private final java.lang.Long _simpleInt1;
        private final java.lang.Long _simpleInt2;
        private final java.lang.Integer _simpleInt3;
        private final List<java.lang.Integer> _simpleList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> augmentation = new HashMap<>();

        private DtoDImpl(DtoDBuilder base) {
            this._complexDtoBInner = base.getComplexDtoBInner();
            this._simpleInt1 = base.getSimpleInt1();
            this._simpleInt2 = base.getSimpleInt2();
            this._simpleInt3 = base.getSimpleInt3();
            this._simpleList = base.getSimpleList();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<ComplexDtoBInner> getComplexDtoBInner() {
            return _complexDtoBInner;
        }
        
        @Override
        public java.lang.Long getSimpleInt1() {
            return _simpleInt1;
        }
        
        @Override
        public java.lang.Long getSimpleInt2() {
            return _simpleInt2;
        }
        
        @Override
        public java.lang.Integer getSimpleInt3() {
            return _simpleInt3;
        }
        
        @Override
        public List<java.lang.Integer> getSimpleList() {
            return _simpleList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_complexDtoBInner == null) ? 0 : _complexDtoBInner.hashCode());
            result = prime * result + ((_simpleInt1 == null) ? 0 : _simpleInt1.hashCode());
            result = prime * result + ((_simpleInt2 == null) ? 0 : _simpleInt2.hashCode());
            result = prime * result + ((_simpleInt3 == null) ? 0 : _simpleInt3.hashCode());
            result = prime * result + ((_simpleList == null) ? 0 : _simpleList.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD)obj;
            if (_complexDtoBInner == null) {
                if (other.getComplexDtoBInner() != null) {
                    return false;
                }
            } else if(!_complexDtoBInner.equals(other.getComplexDtoBInner())) {
                return false;
            }
            if (_simpleInt1 == null) {
                if (other.getSimpleInt1() != null) {
                    return false;
                }
            } else if(!_simpleInt1.equals(other.getSimpleInt1())) {
                return false;
            }
            if (_simpleInt2 == null) {
                if (other.getSimpleInt2() != null) {
                    return false;
                }
            } else if(!_simpleInt2.equals(other.getSimpleInt2())) {
                return false;
            }
            if (_simpleInt3 == null) {
                if (other.getSimpleInt3() != null) {
                    return false;
                }
            } else if(!_simpleInt3.equals(other.getSimpleInt3())) {
                return false;
            }
            if (_simpleList == null) {
                if (other.getSimpleList() != null) {
                    return false;
                }
            } else if(!_simpleList.equals(other.getSimpleList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DtoDImpl otherImpl = (DtoDImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DtoD [");
            boolean first = true;
        
            if (_complexDtoBInner != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_complexDtoBInner=");
                builder.append(_complexDtoBInner);
             }
            if (_simpleInt1 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt1=");
                builder.append(_simpleInt1);
             }
            if (_simpleInt2 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt2=");
                builder.append(_simpleInt2);
             }
            if (_simpleInt3 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt3=");
                builder.append(_simpleInt3);
             }
            if (_simpleList != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleList=");
                builder.append(_simpleList);
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
