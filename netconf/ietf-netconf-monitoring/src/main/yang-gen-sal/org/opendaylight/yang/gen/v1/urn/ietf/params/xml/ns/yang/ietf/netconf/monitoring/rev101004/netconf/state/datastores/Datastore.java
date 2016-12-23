package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.datastore.Locks;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.DatastoreKey;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Datastores;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfDatastoreType;


/**
 * List of NETCONF configuration datastores supported by the NETCONF server and 
 * related information.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * list datastore {
 *     key "name"
 *     leaf name {
 *         type netconf-datastore-type;
 *     }
 *     container locks {
 *         choice lock-type {
 *             case global-lock {
 *                 container global-lock {
 *                     leaf locked-by-session {
 *                         type uint32;
 *                     }
 *                     leaf locked-time {
 *                         type date-and-time;
 *                     }
 *                     uses netconf-state;
 *                 }
 *             }
 *             case partial-lock {
 *                 list partial-lock {
 *                     key "lock-id"
 *                     leaf lock-id {
 *                         type uint32;
 *                     }
 *                     leaf locked-by-session {
 *                         type uint32;
 *                     }
 *                     leaf locked-time {
 *                         type date-and-time;
 *                     }
 *                     leaf-list select {
 *                         type xpath1.0;
 *                     }
 *                     leaf-list locked-node {
 *                         type instance-identifier;
 *                     }
 *                     uses netconf-state;
 *                 }
 *             }
 *         }
 *         grouping lock-info {
 *             leaf locked-by-session {
 *                 type uint32;
 *             }
 *             leaf locked-time {
 *                 type date-and-time;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores/datastore</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.DatastoreBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.DatastoreBuilder@see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.DatastoreKey
 */
public interface Datastore
    extends
    ChildOf<Datastores>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.Datastore>,
    Identifiable<DatastoreKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","datastore");;

    /**
     * Name of the datastore associated with this list entry.
     */
    NetconfDatastoreType getName();
    
    /**
     * The NETCONF <lock> and <partial-lock> operations allow a client to lock specific
     * resources in a datastore. The NETCONF server will prevent changes to the locked 
     * resources by all sessions except the one that acquired the lock(s). Monitoring 
     * information is provided for each datastore entry including details such as the 
     * session that acquired the lock, the type of lock (global or partial) and the 
     * list of locked resources. Multiple locks per datastore are supported.
     */
    Locks getLocks();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    DatastoreKey getKey();

}

