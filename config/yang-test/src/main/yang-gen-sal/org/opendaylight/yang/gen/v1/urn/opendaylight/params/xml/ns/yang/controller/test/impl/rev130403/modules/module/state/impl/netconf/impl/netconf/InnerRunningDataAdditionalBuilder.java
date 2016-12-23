package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.additional.Deep4;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditionalKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional
 */
public class InnerRunningDataAdditionalBuilder {

    private Deep4 _deep4;
    private InnerRunningDataAdditionalKey _key;
    private java.lang.Integer _simpleInt3;
    private static List<Range<BigInteger>> _simpleInt3_range;
    private java.lang.String _simpleString;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> augmentation = new HashMap<>();

    public InnerRunningDataAdditionalBuilder() {
    } 

    public InnerRunningDataAdditionalBuilder(InnerRunningDataAdditional base) {
        if (base.getKey() == null) {
            this._key = new InnerRunningDataAdditionalKey(
                base.getSimpleString()
            );
            this._simpleString = base.getSimpleString();
        } else {
            this._key = base.getKey();
            this._simpleString = _key.getSimpleString();
        }
        this._deep4 = base.getDeep4();
        this._simpleInt3 = base.getSimpleInt3();
        if (base instanceof InnerRunningDataAdditionalImpl) {
            InnerRunningDataAdditionalImpl _impl = (InnerRunningDataAdditionalImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Deep4 getDeep4() {
        return _deep4;
    }
    
    public InnerRunningDataAdditionalKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }
    
    public java.lang.String getSimpleString() {
        return _simpleString;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InnerRunningDataAdditionalBuilder setDeep4(Deep4 value) {
        this._deep4 = value;
        return this;
    }
    
    public InnerRunningDataAdditionalBuilder setKey(InnerRunningDataAdditionalKey value) {
        this._key = value;
        return this;
    }
    
    public InnerRunningDataAdditionalBuilder setSimpleInt3(java.lang.Integer value) {
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
            synchronized (InnerRunningDataAdditionalBuilder.class) {
                if (_simpleInt3_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleInt3_range = builder.build();
                }
            }
        }
        return _simpleInt3_range;
    }
    
    public InnerRunningDataAdditionalBuilder setSimpleString(java.lang.String value) {
        this._simpleString = value;
        return this;
    }
    
    public InnerRunningDataAdditionalBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InnerRunningDataAdditional build() {
        return new InnerRunningDataAdditionalImpl(this);
    }

    private static final class InnerRunningDataAdditionalImpl implements InnerRunningDataAdditional {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional.class;
        }

        private final Deep4 _deep4;
        private final InnerRunningDataAdditionalKey _key;
        private final java.lang.Integer _simpleInt3;
        private final java.lang.String _simpleString;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> augmentation = new HashMap<>();

        private InnerRunningDataAdditionalImpl(InnerRunningDataAdditionalBuilder base) {
            if (base.getKey() == null) {
                this._key = new InnerRunningDataAdditionalKey(
                    base.getSimpleString()
                );
                this._simpleString = base.getSimpleString();
            } else {
                this._key = base.getKey();
                this._simpleString = _key.getSimpleString();
            }
            this._deep4 = base.getDeep4();
            this._simpleInt3 = base.getSimpleInt3();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Deep4 getDeep4() {
            return _deep4;
        }
        
        @Override
        public InnerRunningDataAdditionalKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getSimpleInt3() {
            return _simpleInt3;
        }
        
        @Override
        public java.lang.String getSimpleString() {
            return _simpleString;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_deep4 == null) ? 0 : _deep4.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_simpleInt3 == null) ? 0 : _simpleInt3.hashCode());
            result = prime * result + ((_simpleString == null) ? 0 : _simpleString.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional)obj;
            if (_deep4 == null) {
                if (other.getDeep4() != null) {
                    return false;
                }
            } else if(!_deep4.equals(other.getDeep4())) {
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
            if (_simpleString == null) {
                if (other.getSimpleString() != null) {
                    return false;
                }
            } else if(!_simpleString.equals(other.getSimpleString())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InnerRunningDataAdditionalImpl otherImpl = (InnerRunningDataAdditionalImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InnerRunningDataAdditional [");
            boolean first = true;
        
            if (_deep4 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_deep4=");
                builder.append(_deep4);
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
            if (_simpleString != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleString=");
                builder.append(_simpleString);
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
