package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.complex.dto.binner.Deep;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner
 */
public class ComplexDtoBInnerBuilder {

    private Deep _deep;
    private java.lang.Integer _simpleInt3;
    private static List<Range<BigInteger>> _simpleInt3_range;
    private List<java.lang.Integer> _simpleList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> augmentation = new HashMap<>();

    public ComplexDtoBInnerBuilder() {
    } 

    public ComplexDtoBInnerBuilder(ComplexDtoBInner base) {
        this._deep = base.getDeep();
        this._simpleInt3 = base.getSimpleInt3();
        this._simpleList = base.getSimpleList();
        if (base instanceof ComplexDtoBInnerImpl) {
            ComplexDtoBInnerImpl _impl = (ComplexDtoBInnerImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Deep getDeep() {
        return _deep;
    }
    
    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }
    
    public List<java.lang.Integer> getSimpleList() {
        return _simpleList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ComplexDtoBInnerBuilder setDeep(Deep value) {
        this._deep = value;
        return this;
    }
    
    public ComplexDtoBInnerBuilder setSimpleInt3(java.lang.Integer value) {
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
            synchronized (ComplexDtoBInnerBuilder.class) {
                if (_simpleInt3_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleInt3_range = builder.build();
                }
            }
        }
        return _simpleInt3_range;
    }
    
    public ComplexDtoBInnerBuilder setSimpleList(List<java.lang.Integer> value) {
        this._simpleList = value;
        return this;
    }
    
    public ComplexDtoBInnerBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ComplexDtoBInner build() {
        return new ComplexDtoBInnerImpl(this);
    }

    private static final class ComplexDtoBInnerImpl implements ComplexDtoBInner {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner.class;
        }

        private final Deep _deep;
        private final java.lang.Integer _simpleInt3;
        private final List<java.lang.Integer> _simpleList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> augmentation = new HashMap<>();

        private ComplexDtoBInnerImpl(ComplexDtoBInnerBuilder base) {
            this._deep = base.getDeep();
            this._simpleInt3 = base.getSimpleInt3();
            this._simpleList = base.getSimpleList();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Deep getDeep() {
            return _deep;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_deep == null) ? 0 : _deep.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner)obj;
            if (_deep == null) {
                if (other.getDeep() != null) {
                    return false;
                }
            } else if(!_deep.equals(other.getDeep())) {
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
                ComplexDtoBInnerImpl otherImpl = (ComplexDtoBInnerImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.dto_d.ComplexDtoBInner>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ComplexDtoBInner [");
            boolean first = true;
        
            if (_deep != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_deep=");
                builder.append(_deep);
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
