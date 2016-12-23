package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class SessionKey
 implements Identifier<Session> {
    private static final long serialVersionUID = -877935666187531988L;
    final private java.lang.Long _sessionId;

    public SessionKey(java.lang.Long _sessionId) {
    
    
        this._sessionId = _sessionId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SessionKey(SessionKey source) {
        this._sessionId = source._sessionId;
    }


    public java.lang.Long getSessionId() {
        return _sessionId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_sessionId == null) ? 0 : _sessionId.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SessionKey other = (SessionKey) obj;
        if (_sessionId == null) {
            if (other._sessionId != null) {
                return false;
            }
        } else if(!_sessionId.equals(other._sessionId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_sessionId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_sessionId=");
            builder.append(_sessionId);
         }
        return builder.append(']').toString();
    }



}
