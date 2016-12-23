package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Sessions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Schemas;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Datastores;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Capabilities;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.IetfNetconfMonitoringData;


/**
 * The netconf-state container is the root of the monitoring data model.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * container netconf-state {
 *     container capabilities {
 *         leaf-list capability {
 *             type uri;
 *         }
 *     }
 *     container datastores {
 *         list datastore {
 *             key "name"
 *             leaf name {
 *                 type netconf-datastore-type;
 *             }
 *             container locks {
 *                 choice lock-type {
 *                     case global-lock {
 *                         container global-lock {
 *                             leaf locked-by-session {
 *                                 type uint32;
 *                             }
 *                             leaf locked-time {
 *                                 type date-and-time;
 *                             }
 *                             uses netconf-state;
 *                         }
 *                     }
 *                     case partial-lock {
 *                         list partial-lock {
 *                             key "lock-id"
 *                             leaf lock-id {
 *                                 type uint32;
 *                             }
 *                             leaf locked-by-session {
 *                                 type uint32;
 *                             }
 *                             leaf locked-time {
 *                                 type date-and-time;
 *                             }
 *                             leaf-list select {
 *                                 type xpath1.0;
 *                             }
 *                             leaf-list locked-node {
 *                                 type instance-identifier;
 *                             }
 *                             uses netconf-state;
 *                         }
 *                     }
 *                 }
 *                 grouping lock-info {
 *                     leaf locked-by-session {
 *                         type uint32;
 *                     }
 *                     leaf locked-time {
 *                         type date-and-time;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 *     container schemas {
 *         list schema {
 *             key "identifier" 
 *         "version" 
 *         "format"
 *             leaf identifier {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *             leaf format {
 *                 type identityref;
 *             }
 *             leaf namespace {
 *                 type uri;
 *             }
 *             leaf-list location {
 *                 type union;
 *             }
 *         }
 *     }
 *     container sessions {
 *         list session {
 *             key "session-id"
 *             leaf session-id {
 *                 type uint32;
 *             }
 *             leaf transport {
 *                 type identityref;
 *             }
 *             leaf username {
 *                 type string;
 *             }
 *             leaf source-host {
 *                 type host;
 *             }
 *             leaf login-time {
 *                 type date-and-time;
 *             }
 *             leaf in-rpcs {
 *                 type zero-based-counter32;
 *             }
 *             leaf in-bad-rpcs {
 *                 type zero-based-counter32;
 *             }
 *             leaf out-rpc-errors {
 *                 type zero-based-counter32;
 *             }
 *             leaf out-notifications {
 *                 type zero-based-counter32;
 *             }
 *             uses common-counters;
 *         }
 *     }
 *     container statistics {
 *         leaf netconf-start-time {
 *             type date-and-time;
 *         }
 *         leaf in-bad-hellos {
 *             type zero-based-counter32;
 *         }
 *         leaf in-sessions {
 *             type zero-based-counter32;
 *         }
 *         leaf dropped-sessions {
 *             type zero-based-counter32;
 *         }
 *         leaf in-rpcs {
 *             type zero-based-counter32;
 *         }
 *         leaf in-bad-rpcs {
 *             type zero-based-counter32;
 *         }
 *         leaf out-rpc-errors {
 *             type zero-based-counter32;
 *         }
 *         leaf out-notifications {
 *             type zero-based-counter32;
 *         }
 *         uses common-counters;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfStateBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfStateBuilder
 */
public interface NetconfState
    extends
    ChildOf<IetfNetconfMonitoringData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","netconf-state");;

    /**
     * Contains the list of NETCONF capabilities supported by the server.
     */
    Capabilities getCapabilities();
    
    /**
     * Contains the list of NETCONF configuration datastores.
     */
    Datastores getDatastores();
    
    /**
     * Contains the list of data model schemas supported by the server.
     */
    Schemas getSchemas();
    
    /**
     * The sessions container includes session-specific data for NETCONF management 
     * sessions. The session list MUST include all currently active NETCONF sessions.
     */
    Sessions getSessions();
    
    /**
     * Statistical data pertaining to the NETCONF server.
     */
    Statistics getStatistics();

}

