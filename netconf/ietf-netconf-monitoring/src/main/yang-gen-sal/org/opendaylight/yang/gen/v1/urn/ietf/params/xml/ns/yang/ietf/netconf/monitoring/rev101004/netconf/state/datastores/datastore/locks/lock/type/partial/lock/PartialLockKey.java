package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class PartialLockKey
 implements Identifier<PartialLock> {
    private static final long serialVersionUID = -4582923252065902181L;
    final private java.lang.Long _lockId;

    public PartialLockKey(java.lang.Long _lockId) {
    
    
        this._lockId = _lockId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PartialLockKey(PartialLockKey source) {
        this._lockId = source._lockId;
    }


    public java.lang.Long getLockId() {
        return _lockId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_lockId == null) ? 0 : _lockId.hashCode());
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
        PartialLockKey other = (PartialLockKey) obj;
        if (_lockId == null) {
            if (other._lockId != null) {
                return false;
            }
        } else if(!_lockId.equals(other._lockId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_lockId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_lockId=");
            builder.append(_lockId);
         }
        return builder.append(']').toString();
    }



}
