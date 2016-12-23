package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.ZeroBasedCounter32;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics
 */
public class StatisticsBuilder {

    private ZeroBasedCounter32 _droppedSessions;
    private ZeroBasedCounter32 _inBadHellos;
    private ZeroBasedCounter32 _inBadRpcs;
    private ZeroBasedCounter32 _inRpcs;
    private ZeroBasedCounter32 _inSessions;
    private DateAndTime _netconfStartTime;
    private ZeroBasedCounter32 _outNotifications;
    private ZeroBasedCounter32 _outRpcErrors;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> augmentation = new HashMap<>();

    public StatisticsBuilder() {
    } 
    
    public StatisticsBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters arg) {
        this._inRpcs = arg.getInRpcs();
        this._inBadRpcs = arg.getInBadRpcs();
        this._outRpcErrors = arg.getOutRpcErrors();
        this._outNotifications = arg.getOutNotifications();
    }

    public StatisticsBuilder(Statistics base) {
        this._droppedSessions = base.getDroppedSessions();
        this._inBadHellos = base.getInBadHellos();
        this._inBadRpcs = base.getInBadRpcs();
        this._inRpcs = base.getInRpcs();
        this._inSessions = base.getInSessions();
        this._netconfStartTime = base.getNetconfStartTime();
        this._outNotifications = base.getOutNotifications();
        this._outRpcErrors = base.getOutRpcErrors();
        if (base instanceof StatisticsImpl) {
            StatisticsImpl _impl = (StatisticsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters) {
            this._inRpcs = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters)arg).getInRpcs();
            this._inBadRpcs = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters)arg).getInBadRpcs();
            this._outRpcErrors = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters)arg).getOutRpcErrors();
            this._outNotifications = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters)arg).getOutNotifications();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters] \n" +
              "but was: " + arg
            );
        }
    }

    public ZeroBasedCounter32 getDroppedSessions() {
        return _droppedSessions;
    }
    
    public ZeroBasedCounter32 getInBadHellos() {
        return _inBadHellos;
    }
    
    public ZeroBasedCounter32 getInBadRpcs() {
        return _inBadRpcs;
    }
    
    public ZeroBasedCounter32 getInRpcs() {
        return _inRpcs;
    }
    
    public ZeroBasedCounter32 getInSessions() {
        return _inSessions;
    }
    
    public DateAndTime getNetconfStartTime() {
        return _netconfStartTime;
    }
    
    public ZeroBasedCounter32 getOutNotifications() {
        return _outNotifications;
    }
    
    public ZeroBasedCounter32 getOutRpcErrors() {
        return _outRpcErrors;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public StatisticsBuilder setDroppedSessions(ZeroBasedCounter32 value) {
        this._droppedSessions = value;
        return this;
    }
    
    public StatisticsBuilder setInBadHellos(ZeroBasedCounter32 value) {
        this._inBadHellos = value;
        return this;
    }
    
    public StatisticsBuilder setInBadRpcs(ZeroBasedCounter32 value) {
        this._inBadRpcs = value;
        return this;
    }
    
    public StatisticsBuilder setInRpcs(ZeroBasedCounter32 value) {
        this._inRpcs = value;
        return this;
    }
    
    public StatisticsBuilder setInSessions(ZeroBasedCounter32 value) {
        this._inSessions = value;
        return this;
    }
    
    public StatisticsBuilder setNetconfStartTime(DateAndTime value) {
        this._netconfStartTime = value;
        return this;
    }
    
    public StatisticsBuilder setOutNotifications(ZeroBasedCounter32 value) {
        this._outNotifications = value;
        return this;
    }
    
    public StatisticsBuilder setOutRpcErrors(ZeroBasedCounter32 value) {
        this._outRpcErrors = value;
        return this;
    }
    
    public StatisticsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Statistics build() {
        return new StatisticsImpl(this);
    }

    private static final class StatisticsImpl implements Statistics {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics.class;
        }

        private final ZeroBasedCounter32 _droppedSessions;
        private final ZeroBasedCounter32 _inBadHellos;
        private final ZeroBasedCounter32 _inBadRpcs;
        private final ZeroBasedCounter32 _inRpcs;
        private final ZeroBasedCounter32 _inSessions;
        private final DateAndTime _netconfStartTime;
        private final ZeroBasedCounter32 _outNotifications;
        private final ZeroBasedCounter32 _outRpcErrors;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> augmentation = new HashMap<>();

        private StatisticsImpl(StatisticsBuilder base) {
            this._droppedSessions = base.getDroppedSessions();
            this._inBadHellos = base.getInBadHellos();
            this._inBadRpcs = base.getInBadRpcs();
            this._inRpcs = base.getInRpcs();
            this._inSessions = base.getInSessions();
            this._netconfStartTime = base.getNetconfStartTime();
            this._outNotifications = base.getOutNotifications();
            this._outRpcErrors = base.getOutRpcErrors();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public ZeroBasedCounter32 getDroppedSessions() {
            return _droppedSessions;
        }
        
        @Override
        public ZeroBasedCounter32 getInBadHellos() {
            return _inBadHellos;
        }
        
        @Override
        public ZeroBasedCounter32 getInBadRpcs() {
            return _inBadRpcs;
        }
        
        @Override
        public ZeroBasedCounter32 getInRpcs() {
            return _inRpcs;
        }
        
        @Override
        public ZeroBasedCounter32 getInSessions() {
            return _inSessions;
        }
        
        @Override
        public DateAndTime getNetconfStartTime() {
            return _netconfStartTime;
        }
        
        @Override
        public ZeroBasedCounter32 getOutNotifications() {
            return _outNotifications;
        }
        
        @Override
        public ZeroBasedCounter32 getOutRpcErrors() {
            return _outRpcErrors;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_droppedSessions == null) ? 0 : _droppedSessions.hashCode());
            result = prime * result + ((_inBadHellos == null) ? 0 : _inBadHellos.hashCode());
            result = prime * result + ((_inBadRpcs == null) ? 0 : _inBadRpcs.hashCode());
            result = prime * result + ((_inRpcs == null) ? 0 : _inRpcs.hashCode());
            result = prime * result + ((_inSessions == null) ? 0 : _inSessions.hashCode());
            result = prime * result + ((_netconfStartTime == null) ? 0 : _netconfStartTime.hashCode());
            result = prime * result + ((_outNotifications == null) ? 0 : _outNotifications.hashCode());
            result = prime * result + ((_outRpcErrors == null) ? 0 : _outRpcErrors.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics)obj;
            if (_droppedSessions == null) {
                if (other.getDroppedSessions() != null) {
                    return false;
                }
            } else if(!_droppedSessions.equals(other.getDroppedSessions())) {
                return false;
            }
            if (_inBadHellos == null) {
                if (other.getInBadHellos() != null) {
                    return false;
                }
            } else if(!_inBadHellos.equals(other.getInBadHellos())) {
                return false;
            }
            if (_inBadRpcs == null) {
                if (other.getInBadRpcs() != null) {
                    return false;
                }
            } else if(!_inBadRpcs.equals(other.getInBadRpcs())) {
                return false;
            }
            if (_inRpcs == null) {
                if (other.getInRpcs() != null) {
                    return false;
                }
            } else if(!_inRpcs.equals(other.getInRpcs())) {
                return false;
            }
            if (_inSessions == null) {
                if (other.getInSessions() != null) {
                    return false;
                }
            } else if(!_inSessions.equals(other.getInSessions())) {
                return false;
            }
            if (_netconfStartTime == null) {
                if (other.getNetconfStartTime() != null) {
                    return false;
                }
            } else if(!_netconfStartTime.equals(other.getNetconfStartTime())) {
                return false;
            }
            if (_outNotifications == null) {
                if (other.getOutNotifications() != null) {
                    return false;
                }
            } else if(!_outNotifications.equals(other.getOutNotifications())) {
                return false;
            }
            if (_outRpcErrors == null) {
                if (other.getOutRpcErrors() != null) {
                    return false;
                }
            } else if(!_outRpcErrors.equals(other.getOutRpcErrors())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StatisticsImpl otherImpl = (StatisticsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Statistics [");
            boolean first = true;
        
            if (_droppedSessions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_droppedSessions=");
                builder.append(_droppedSessions);
             }
            if (_inBadHellos != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inBadHellos=");
                builder.append(_inBadHellos);
             }
            if (_inBadRpcs != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inBadRpcs=");
                builder.append(_inBadRpcs);
             }
            if (_inRpcs != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inRpcs=");
                builder.append(_inRpcs);
             }
            if (_inSessions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inSessions=");
                builder.append(_inSessions);
             }
            if (_netconfStartTime != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_netconfStartTime=");
                builder.append(_netconfStartTime);
             }
            if (_outNotifications != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_outNotifications=");
                builder.append(_outNotifications);
             }
            if (_outRpcErrors != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_outRpcErrors=");
                builder.append(_outRpcErrors);
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
