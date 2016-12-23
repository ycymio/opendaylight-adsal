package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Lock related parameters, common to both global and partial locks.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * grouping lock-info {
 *     leaf locked-by-session {
 *         type uint32;
 *     }
 *     leaf locked-time {
 *         type date-and-time;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores/datastore/locks/lock-info</i>
 */
public interface LockInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","lock-info");;

    /**
     * The session ID of the session that has locked this resource. Both a global lock 
     * and a partial lock MUST contain the NETCONF session-id. If the lock is held by a
     * session that is not managed by the NETCONF server (e.g., a CLI session), a 
     * session id of 0 (zero) is reported.
     */
    java.lang.Long getLockedBySession();
    
    /**
     * The date and time of when the resource was locked.
     */
    DateAndTime getLockedTime();

}

