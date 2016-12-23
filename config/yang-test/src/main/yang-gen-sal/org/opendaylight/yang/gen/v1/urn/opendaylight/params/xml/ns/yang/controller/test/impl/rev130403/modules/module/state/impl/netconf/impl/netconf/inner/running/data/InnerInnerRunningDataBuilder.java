package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataKey;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.Deep3;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.inner.inner.running.data.NotStateBean;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData
 */
public class InnerInnerRunningDataBuilder {

    private Deep3 _deep3;
    private InnerInnerRunningDataKey _key;
    private List<java.lang.String> _listOfStrings;
    private List<NotStateBean> _notStateBean;
    private java.lang.Integer _simpleInt3;
    private static List<Range<BigInteger>> _simpleInt3_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> augmentation = new HashMap<>();

    public InnerInnerRunningDataBuilder() {
    } 

    public InnerInnerRunningDataBuilder(InnerInnerRunningData base) {
        if (base.getKey() == null) {
            this._key = new InnerInnerRunningDataKey(
                base.getSimpleInt3()
            );
            this._simpleInt3 = base.getSimpleInt3();
        } else {
            this._key = base.getKey();
            this._simpleInt3 = _key.getSimpleInt3();
        }
        this._deep3 = base.getDeep3();
        this._listOfStrings = base.getListOfStrings();
        this._notStateBean = base.getNotStateBean();
        if (base instanceof InnerInnerRunningDataImpl) {
            InnerInnerRunningDataImpl _impl = (InnerInnerRunningDataImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Deep3 getDeep3() {
        return _deep3;
    }
    
    public InnerInnerRunningDataKey getKey() {
        return _key;
    }
    
    public List<java.lang.String> getListOfStrings() {
        return _listOfStrings;
    }
    
    public List<NotStateBean> getNotStateBean() {
        return _notStateBean;
    }
    
    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InnerInnerRunningDataBuilder setDeep3(Deep3 value) {
        this._deep3 = value;
        return this;
    }
    
    public InnerInnerRunningDataBuilder setKey(InnerInnerRunningDataKey value) {
        this._key = value;
        return this;
    }
    
    public InnerInnerRunningDataBuilder setListOfStrings(List<java.lang.String> value) {
        this._listOfStrings = value;
        return this;
    }
    
    public InnerInnerRunningDataBuilder setNotStateBean(List<NotStateBean> value) {
        this._notStateBean = value;
        return this;
    }
    
    public InnerInnerRunningDataBuilder setSimpleInt3(java.lang.Integer value) {
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
            synchronized (InnerInnerRunningDataBuilder.class) {
                if (_simpleInt3_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleInt3_range = builder.build();
                }
            }
        }
        return _simpleInt3_range;
    }
    
    public InnerInnerRunningDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InnerInnerRunningData build() {
        return new InnerInnerRunningDataImpl(this);
    }

    private static final class InnerInnerRunningDataImpl implements InnerInnerRunningData {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData.class;
        }

        private final Deep3 _deep3;
        private final InnerInnerRunningDataKey _key;
        private final List<java.lang.String> _listOfStrings;
        private final List<NotStateBean> _notStateBean;
        private final java.lang.Integer _simpleInt3;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> augmentation = new HashMap<>();

        private InnerInnerRunningDataImpl(InnerInnerRunningDataBuilder base) {
            if (base.getKey() == null) {
                this._key = new InnerInnerRunningDataKey(
                    base.getSimpleInt3()
                );
                this._simpleInt3 = base.getSimpleInt3();
            } else {
                this._key = base.getKey();
                this._simpleInt3 = _key.getSimpleInt3();
            }
            this._deep3 = base.getDeep3();
            this._listOfStrings = base.getListOfStrings();
            this._notStateBean = base.getNotStateBean();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Deep3 getDeep3() {
            return _deep3;
        }
        
        @Override
        public InnerInnerRunningDataKey getKey() {
            return _key;
        }
        
        @Override
        public List<java.lang.String> getListOfStrings() {
            return _listOfStrings;
        }
        
        @Override
        public List<NotStateBean> getNotStateBean() {
            return _notStateBean;
        }
        
        @Override
        public java.lang.Integer getSimpleInt3() {
            return _simpleInt3;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_deep3 == null) ? 0 : _deep3.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_listOfStrings == null) ? 0 : _listOfStrings.hashCode());
            result = prime * result + ((_notStateBean == null) ? 0 : _notStateBean.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData)obj;
            if (_deep3 == null) {
                if (other.getDeep3() != null) {
                    return false;
                }
            } else if(!_deep3.equals(other.getDeep3())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_listOfStrings == null) {
                if (other.getListOfStrings() != null) {
                    return false;
                }
            } else if(!_listOfStrings.equals(other.getListOfStrings())) {
                return false;
            }
            if (_notStateBean == null) {
                if (other.getNotStateBean() != null) {
                    return false;
                }
            } else if(!_notStateBean.equals(other.getNotStateBean())) {
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
                InnerInnerRunningDataImpl otherImpl = (InnerInnerRunningDataImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InnerInnerRunningData [");
            boolean first = true;
        
            if (_deep3 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_deep3=");
                builder.append(_deep3);
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
            if (_listOfStrings != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_listOfStrings=");
                builder.append(_listOfStrings);
             }
            if (_notStateBean != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notStateBean=");
                builder.append(_notStateBean);
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
