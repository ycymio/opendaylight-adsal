package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions;
import com.google.common.collect.Range;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Host;
import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;
import com.google.common.collect.ImmutableList;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.ZeroBasedCounter32;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session
 */
public class SessionBuilder {

    private ZeroBasedCounter32 _inBadRpcs;
    private ZeroBasedCounter32 _inRpcs;
    private SessionKey _key;
    private DateAndTime _loginTime;
    private ZeroBasedCounter32 _outNotifications;
    private ZeroBasedCounter32 _outRpcErrors;
    private java.lang.Long _sessionId;
    private static List<Range<BigInteger>> _sessionId_range;
    private Host _sourceHost;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> _transport;
    private java.lang.String _username;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> augmentation = new HashMap<>();

    public SessionBuilder() {
    } 
    
    public SessionBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters arg) {
        this._inRpcs = arg.getInRpcs();
        this._inBadRpcs = arg.getInBadRpcs();
        this._outRpcErrors = arg.getOutRpcErrors();
        this._outNotifications = arg.getOutNotifications();
    }

    public SessionBuilder(Session base) {
        if (base.getKey() == null) {
            this._key = new SessionKey(
                base.getSessionId()
            );
            this._sessionId = base.getSessionId();
        } else {
            this._key = base.getKey();
            this._sessionId = _key.getSessionId();
        }
        this._inBadRpcs = base.getInBadRpcs();
        this._inRpcs = base.getInRpcs();
        this._loginTime = base.getLoginTime();
        this._outNotifications = base.getOutNotifications();
        this._outRpcErrors = base.getOutRpcErrors();
        this._sourceHost = base.getSourceHost();
        this._transport = base.getTransport();
        this._username = base.getUsername();
        if (base instanceof SessionImpl) {
            SessionImpl _impl = (SessionImpl) base;
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

    public ZeroBasedCounter32 getInBadRpcs() {
        return _inBadRpcs;
    }
    
    public ZeroBasedCounter32 getInRpcs() {
        return _inRpcs;
    }
    
    public SessionKey getKey() {
        return _key;
    }
    
    public DateAndTime getLoginTime() {
        return _loginTime;
    }
    
    public ZeroBasedCounter32 getOutNotifications() {
        return _outNotifications;
    }
    
    public ZeroBasedCounter32 getOutRpcErrors() {
        return _outRpcErrors;
    }
    
    public java.lang.Long getSessionId() {
        return _sessionId;
    }
    
    public Host getSourceHost() {
        return _sourceHost;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> getTransport() {
        return _transport;
    }
    
    public java.lang.String getUsername() {
        return _username;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SessionBuilder setInBadRpcs(ZeroBasedCounter32 value) {
        this._inBadRpcs = value;
        return this;
    }
    
    public SessionBuilder setInRpcs(ZeroBasedCounter32 value) {
        this._inRpcs = value;
        return this;
    }
    
    public SessionBuilder setKey(SessionKey value) {
        this._key = value;
        return this;
    }
    
    public SessionBuilder setLoginTime(DateAndTime value) {
        this._loginTime = value;
        return this;
    }
    
    public SessionBuilder setOutNotifications(ZeroBasedCounter32 value) {
        this._outNotifications = value;
        return this;
    }
    
    public SessionBuilder setOutRpcErrors(ZeroBasedCounter32 value) {
        this._outRpcErrors = value;
        return this;
    }
    
    public SessionBuilder setSessionId(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _sessionId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _sessionId_range));
            }
        }
        this._sessionId = value;
        return this;
    }
    public static List<Range<BigInteger>> _sessionId_range() {
        if (_sessionId_range == null) {
            synchronized (SessionBuilder.class) {
                if (_sessionId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ONE, BigInteger.valueOf(4294967295L)));
                    _sessionId_range = builder.build();
                }
            }
        }
        return _sessionId_range;
    }
    
    public SessionBuilder setSourceHost(Host value) {
        this._sourceHost = value;
        return this;
    }
    
    public SessionBuilder setTransport(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> value) {
        this._transport = value;
        return this;
    }
    
    public SessionBuilder setUsername(java.lang.String value) {
        this._username = value;
        return this;
    }
    
    public SessionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Session build() {
        return new SessionImpl(this);
    }

    private static final class SessionImpl implements Session {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session.class;
        }

        private final ZeroBasedCounter32 _inBadRpcs;
        private final ZeroBasedCounter32 _inRpcs;
        private final SessionKey _key;
        private final DateAndTime _loginTime;
        private final ZeroBasedCounter32 _outNotifications;
        private final ZeroBasedCounter32 _outRpcErrors;
        private final java.lang.Long _sessionId;
        private final Host _sourceHost;
        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> _transport;
        private final java.lang.String _username;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> augmentation = new HashMap<>();

        private SessionImpl(SessionBuilder base) {
            if (base.getKey() == null) {
                this._key = new SessionKey(
                    base.getSessionId()
                );
                this._sessionId = base.getSessionId();
            } else {
                this._key = base.getKey();
                this._sessionId = _key.getSessionId();
            }
            this._inBadRpcs = base.getInBadRpcs();
            this._inRpcs = base.getInRpcs();
            this._loginTime = base.getLoginTime();
            this._outNotifications = base.getOutNotifications();
            this._outRpcErrors = base.getOutRpcErrors();
            this._sourceHost = base.getSourceHost();
            this._transport = base.getTransport();
            this._username = base.getUsername();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
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
        public SessionKey getKey() {
            return _key;
        }
        
        @Override
        public DateAndTime getLoginTime() {
            return _loginTime;
        }
        
        @Override
        public ZeroBasedCounter32 getOutNotifications() {
            return _outNotifications;
        }
        
        @Override
        public ZeroBasedCounter32 getOutRpcErrors() {
            return _outRpcErrors;
        }
        
        @Override
        public java.lang.Long getSessionId() {
            return _sessionId;
        }
        
        @Override
        public Host getSourceHost() {
            return _sourceHost;
        }
        
        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> getTransport() {
            return _transport;
        }
        
        @Override
        public java.lang.String getUsername() {
            return _username;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inBadRpcs == null) ? 0 : _inBadRpcs.hashCode());
            result = prime * result + ((_inRpcs == null) ? 0 : _inRpcs.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_loginTime == null) ? 0 : _loginTime.hashCode());
            result = prime * result + ((_outNotifications == null) ? 0 : _outNotifications.hashCode());
            result = prime * result + ((_outRpcErrors == null) ? 0 : _outRpcErrors.hashCode());
            result = prime * result + ((_sessionId == null) ? 0 : _sessionId.hashCode());
            result = prime * result + ((_sourceHost == null) ? 0 : _sourceHost.hashCode());
            result = prime * result + ((_transport == null) ? 0 : _transport.hashCode());
            result = prime * result + ((_username == null) ? 0 : _username.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session other = (org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session)obj;
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
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_loginTime == null) {
                if (other.getLoginTime() != null) {
                    return false;
                }
            } else if(!_loginTime.equals(other.getLoginTime())) {
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
            if (_sessionId == null) {
                if (other.getSessionId() != null) {
                    return false;
                }
            } else if(!_sessionId.equals(other.getSessionId())) {
                return false;
            }
            if (_sourceHost == null) {
                if (other.getSourceHost() != null) {
                    return false;
                }
            } else if(!_sourceHost.equals(other.getSourceHost())) {
                return false;
            }
            if (_transport == null) {
                if (other.getTransport() != null) {
                    return false;
                }
            } else if(!_transport.equals(other.getTransport())) {
                return false;
            }
            if (_username == null) {
                if (other.getUsername() != null) {
                    return false;
                }
            } else if(!_username.equals(other.getUsername())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SessionImpl otherImpl = (SessionImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>>, Augmentation<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Session [");
            boolean first = true;
        
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
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_loginTime != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_loginTime=");
                builder.append(_loginTime);
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
            if (_sessionId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sessionId=");
                builder.append(_sessionId);
             }
            if (_sourceHost != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sourceHost=");
                builder.append(_sourceHost);
             }
            if (_transport != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transport=");
                builder.append(_transport);
             }
            if (_username != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_username=");
                builder.append(_username);
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
