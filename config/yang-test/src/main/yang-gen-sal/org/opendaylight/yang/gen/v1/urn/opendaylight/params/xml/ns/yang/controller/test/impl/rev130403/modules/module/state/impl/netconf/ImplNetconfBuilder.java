package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.Asdf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningData;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf
 */
public class ImplNetconfBuilder {

    private Asdf _asdf;
    private java.lang.Long _createdSessions;
    private static List<Range<BigInteger>> _createdSessions_range;
    private List<InnerRunningData> _innerRunningData;
    private List<InnerRunningDataAdditional> _innerRunningDataAdditional;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> augmentation = new HashMap<>();

    public ImplNetconfBuilder() {
    } 

    public ImplNetconfBuilder(ImplNetconf base) {
        this._asdf = base.getAsdf();
        this._createdSessions = base.getCreatedSessions();
        this._innerRunningData = base.getInnerRunningData();
        this._innerRunningDataAdditional = base.getInnerRunningDataAdditional();
        if (base instanceof ImplNetconfImpl) {
            ImplNetconfImpl _impl = (ImplNetconfImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public Asdf getAsdf() {
        return _asdf;
    }
    
    public java.lang.Long getCreatedSessions() {
        return _createdSessions;
    }
    
    public List<InnerRunningData> getInnerRunningData() {
        return _innerRunningData;
    }
    
    public List<InnerRunningDataAdditional> getInnerRunningDataAdditional() {
        return _innerRunningDataAdditional;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ImplNetconfBuilder setAsdf(Asdf value) {
        this._asdf = value;
        return this;
    }
    
    public ImplNetconfBuilder setCreatedSessions(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _createdSessions_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _createdSessions_range));
            }
        }
        this._createdSessions = value;
        return this;
    }
    public static List<Range<BigInteger>> _createdSessions_range() {
        if (_createdSessions_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_createdSessions_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _createdSessions_range = builder.build();
                }
            }
        }
        return _createdSessions_range;
    }
    
    public ImplNetconfBuilder setInnerRunningData(List<InnerRunningData> value) {
        this._innerRunningData = value;
        return this;
    }
    
    public ImplNetconfBuilder setInnerRunningDataAdditional(List<InnerRunningDataAdditional> value) {
        this._innerRunningDataAdditional = value;
        return this;
    }
    
    public ImplNetconfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ImplNetconf build() {
        return new ImplNetconfImpl(this);
    }

    private static final class ImplNetconfImpl implements ImplNetconf {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf.class;
        }

        private final Asdf _asdf;
        private final java.lang.Long _createdSessions;
        private final List<InnerRunningData> _innerRunningData;
        private final List<InnerRunningDataAdditional> _innerRunningDataAdditional;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> augmentation = new HashMap<>();

        private ImplNetconfImpl(ImplNetconfBuilder base) {
            this._asdf = base.getAsdf();
            this._createdSessions = base.getCreatedSessions();
            this._innerRunningData = base.getInnerRunningData();
            this._innerRunningDataAdditional = base.getInnerRunningDataAdditional();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public Asdf getAsdf() {
            return _asdf;
        }
        
        @Override
        public java.lang.Long getCreatedSessions() {
            return _createdSessions;
        }
        
        @Override
        public List<InnerRunningData> getInnerRunningData() {
            return _innerRunningData;
        }
        
        @Override
        public List<InnerRunningDataAdditional> getInnerRunningDataAdditional() {
            return _innerRunningDataAdditional;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_asdf == null) ? 0 : _asdf.hashCode());
            result = prime * result + ((_createdSessions == null) ? 0 : _createdSessions.hashCode());
            result = prime * result + ((_innerRunningData == null) ? 0 : _innerRunningData.hashCode());
            result = prime * result + ((_innerRunningDataAdditional == null) ? 0 : _innerRunningDataAdditional.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf)obj;
            if (_asdf == null) {
                if (other.getAsdf() != null) {
                    return false;
                }
            } else if(!_asdf.equals(other.getAsdf())) {
                return false;
            }
            if (_createdSessions == null) {
                if (other.getCreatedSessions() != null) {
                    return false;
                }
            } else if(!_createdSessions.equals(other.getCreatedSessions())) {
                return false;
            }
            if (_innerRunningData == null) {
                if (other.getInnerRunningData() != null) {
                    return false;
                }
            } else if(!_innerRunningData.equals(other.getInnerRunningData())) {
                return false;
            }
            if (_innerRunningDataAdditional == null) {
                if (other.getInnerRunningDataAdditional() != null) {
                    return false;
                }
            } else if(!_innerRunningDataAdditional.equals(other.getInnerRunningDataAdditional())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ImplNetconfImpl otherImpl = (ImplNetconfImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.ImplNetconf>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ImplNetconf [");
            boolean first = true;
        
            if (_asdf != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_asdf=");
                builder.append(_asdf);
             }
            if (_createdSessions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_createdSessions=");
                builder.append(_createdSessions);
             }
            if (_innerRunningData != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_innerRunningData=");
                builder.append(_innerRunningData);
             }
            if (_innerRunningDataAdditional != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_innerRunningDataAdditional=");
                builder.append(_innerRunningDataAdditional);
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
