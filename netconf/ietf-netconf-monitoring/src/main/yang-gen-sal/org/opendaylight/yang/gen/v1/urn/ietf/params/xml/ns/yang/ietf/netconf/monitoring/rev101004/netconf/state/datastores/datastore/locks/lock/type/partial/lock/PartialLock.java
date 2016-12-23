package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Xpath10;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.Locks;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockInfo;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * List of partial locks.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * list partial-lock {
 *     key "lock-id"
 *     leaf lock-id {
 *         type uint32;
 *     }
 *     leaf locked-by-session {
 *         type uint32;
 *     }
 *     leaf locked-time {
 *         type date-and-time;
 *     }
 *     leaf-list select {
 *         type xpath1.0;
 *     }
 *     leaf-list locked-node {
 *         type instance-identifier;
 *     }
 *     uses netconf-state;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores/datastore/locks/lock-type/partial-lock/partial-lock</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockBuilder@see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLockKey
 */
public interface PartialLock
    extends
    ChildOf<Locks>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.partial.lock.PartialLock>,
    LockInfo,
    Identifiable<PartialLockKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","partial-lock");;

    /**
     * This is the lock id returned in the <partial-lock> response.
     */
    java.lang.Long getLockId();
    
    /**
     * The xpath expression that was used to request the lock. The select expression 
     * indicates the original intended scope of the lock.
     */
    List<Xpath10> getSelect();
    
    /**
     * The list of instance-identifiers (i.e., the locked nodes). The scope of the 
     * partial lock is defined by the list of locked nodes.
     */
    List<InstanceIdentifier<?>> getLockedNode();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    PartialLockKey getKey();

}

