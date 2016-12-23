package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.Deep2;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData
 */
public class InnerRunningDataBuilder {

    private Deep2 _deep2;
    private List<InnerInnerRunningData> _innerInnerRunningData;
    private InnerRunningDataKey _key;
    private java.lang.Integer _simpleInt3;
    private static List<Range<BigInteger>> _simpleInt3_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> augmentation = new HashMap<>();

    public InnerRunningDataBuilder() {
    } 

    public InnerRunningDataBuilder(InnerRunningData base) {
        if (base.getKey() == null) {
            this._key = new InnerRunningDataKey(
                base.getSimpleInt3()
            );
            this._simpleInt3 = base.getSimpleInt3();
        } else {
            this._key = base.getKey();
            this._simpleInt3 = _key.getSimpleInt3();
        }
        this._deep2 = base.getDeep2();
        this._innerInnerRunningData = base.getInnerInnerRunningData();
        if (base instanceof InnerRunningDataImpl) {
            InnerRunningDataImpl _impl = (InnerRunningDataImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Deep2 getDeep2() {
        return _deep2;
    }
    
    public List<InnerInnerRunningData> getInnerInnerRunningData() {
        return _innerInnerRunningData;
    }
    
    public InnerRunningDataKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InnerRunningDataBuilder setDeep2(Deep2 value) {
        this._deep2 = value;
        return this;
    }
    
    public InnerRunningDataBuilder setInnerInnerRunningData(List<InnerInnerRunningData> value) {
        this._innerInnerRunningData = value;
        return this;
    }
    
    public InnerRunningDataBuilder setKey(InnerRunningDataKey value) {
        this._key = value;
        return this;
    }
    
    public InnerRunningDataBuilder setSimpleInt3(java.lang.Integer value) {
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
            synchronized (InnerRunningDataBuilder.class) {
                if (_simpleInt3_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleInt3_range = builder.build();
                }
            }
        }
        return _simpleInt3_range;
    }
    
    public InnerRunningDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InnerRunningData build() {
        return new InnerRunningDataImpl(this);
    }

    private static final class InnerRunningDataImpl implements InnerRunningData {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData.class;
        }

        private final Deep2 _deep2;
        private final List<InnerInnerRunningData> _innerInnerRunningData;
        private final InnerRunningDataKey _key;
        private final java.lang.Integer _simpleInt3;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> augmentation = new HashMap<>();

        private InnerRunningDataImpl(InnerRunningDataBuilder base) {
            if (base.getKey() == null) {
                this._key = new InnerRunningDataKey(
                    base.getSimpleInt3()
                );
                this._simpleInt3 = base.getSimpleInt3();
            } else {
                this._key = base.getKey();
                this._simpleInt3 = _key.getSimpleInt3();
            }
            this._deep2 = base.getDeep2();
            this._innerInnerRunningData = base.getInnerInnerRunningData();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Deep2 getDeep2() {
            return _deep2;
        }
        
        @Override
        public List<InnerInnerRunningData> getInnerInnerRunningData() {
            return _innerInnerRunningData;
        }
        
        @Override
        public InnerRunningDataKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getSimpleInt3() {
            return _simpleInt3;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_deep2 == null) ? 0 : _deep2.hashCode());
            result = prime * result + ((_innerInnerRunningData == null) ? 0 : _innerInnerRunningData.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_simpleInt3 == null) ? 0 : _simpleInt3.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData)obj;
            if (_deep2 == null) {
                if (other.getDeep2() != null) {
                    return false;
                }
            } else if(!_deep2.equals(other.getDeep2())) {
                return false;
            }
            if (_innerInnerRunningData == null) {
                if (other.getInnerInnerRunningData() != null) {
                    return false;
                }
            } else if(!_innerInnerRunningData.equals(other.getInnerInnerRunningData())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_simpleInt3 == null) {
                if (other.getSimpleInt3() != null) {
                    return false;
                }
            } else if(!_simpleInt3.equals(other.getSimpleInt3())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InnerRunningDataImpl otherImpl = (InnerRunningDataImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InnerRunningData [");
            boolean first = true;
        
            if (_deep2 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_deep2=");
                builder.append(_deep2);
             }
            if (_innerInnerRunningData != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_innerInnerRunningData=");
                builder.append(_innerInnerRunningData);
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
            if (_simpleInt3 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt3=");
                builder.append(_simpleInt3);
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
