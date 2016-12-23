package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.locks;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Indicates if a global lock or a set of partial locks are set.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * choice lock-type {
 *     case global-lock {
 *         container global-lock {
 *             leaf locked-by-session {
 *                 type uint32;
 *             }
 *             leaf locked-time {
 *                 type date-and-time;
 *             }
 *             uses netconf-state;
 *         }
 *     }
 *     case partial-lock {
 *         list partial-lock {
 *             key "lock-id"
 *             leaf lock-id {
 *                 type uint32;
 *             }
 *             leaf locked-by-session {
 *                 type uint32;
 *             }
 *             leaf locked-time {
 *                 type date-and-time;
 *             }
 *             leaf-list select {
 *                 type xpath1.0;
 *             }
 *             leaf-list locked-node {
 *                 type instance-identifier;
 *             }
 *             uses netconf-state;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores/datastore/locks/lock-type</i>
 */
public interface LockType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","lock-type");;


}

