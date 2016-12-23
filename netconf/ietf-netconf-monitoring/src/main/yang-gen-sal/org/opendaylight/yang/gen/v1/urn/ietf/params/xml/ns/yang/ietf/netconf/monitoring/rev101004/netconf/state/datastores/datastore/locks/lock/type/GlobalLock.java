package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.LockType;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * case global-lock {
 *     container global-lock {
 *         leaf locked-by-session {
 *             type uint32;
 *         }
 *         leaf locked-time {
 *             type date-and-time;
 *         }
 *         uses netconf-state;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores/datastore/locks/lock-type/global-lock</i>
 */
public interface GlobalLock
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.GlobalLock>,
    LockType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","global-lock");;

    /**
     * Present if the global lock is set.
     */
    org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks.lock.type.global.lock.GlobalLock getGlobalLock();

}

