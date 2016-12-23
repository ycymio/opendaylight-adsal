package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.datastores.Datastore;


/**
 * Contains the list of NETCONF configuration datastores.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * container datastores {
 *     list datastore {
 *         key "name"
 *         leaf name {
 *             type netconf-datastore-type;
 *         }
 *         container locks {
 *             choice lock-type {
 *                 case global-lock {
 *                     container global-lock {
 *                         leaf locked-by-session {
 *                             type uint32;
 *                         }
 *                         leaf locked-time {
 *                             type date-and-time;
 *                         }
 *                         uses netconf-state;
 *                     }
 *                 }
 *                 case partial-lock {
 *                     list partial-lock {
 *                         key "lock-id"
 *                         leaf lock-id {
 *                             type uint32;
 *                         }
 *                         leaf locked-by-session {
 *                             type uint32;
 *                         }
 *                         leaf locked-time {
 *                             type date-and-time;
 *                         }
 *                         leaf-list select {
 *                             type xpath1.0;
 *                         }
 *                         leaf-list locked-node {
 *                             type instance-identifier;
 *                         }
 *                         uses netconf-state;
 *                     }
 *                 }
 *             }
 *             grouping lock-info {
 *                 leaf locked-by-session {
 *                     type uint32;
 *                 }
 *                 leaf locked-time {
 *                     type date-and-time;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/datastores</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.DatastoresBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.DatastoresBuilder
 */
public interface Datastores
    extends
    ChildOf<NetconfState>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Datastores>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","datastores");;

    /**
     * List of NETCONF configuration datastores supported by the NETCONF server and 
     * related information.
     */
    List<Datastore> getDatastore();

}

