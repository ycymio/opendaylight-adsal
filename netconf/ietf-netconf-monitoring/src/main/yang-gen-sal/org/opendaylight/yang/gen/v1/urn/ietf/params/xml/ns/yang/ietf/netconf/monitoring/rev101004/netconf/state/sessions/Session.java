package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Sessions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Host;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * All NETCONF sessions managed by the NETCONF server MUST be reported in this 
 * list.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * list session {
 *     key "session-id"
 *     leaf session-id {
 *         type uint32;
 *     }
 *     leaf transport {
 *         type identityref;
 *     }
 *     leaf username {
 *         type string;
 *     }
 *     leaf source-host {
 *         type host;
 *     }
 *     leaf login-time {
 *         type date-and-time;
 *     }
 *     leaf in-rpcs {
 *         type zero-based-counter32;
 *     }
 *     leaf in-bad-rpcs {
 *         type zero-based-counter32;
 *     }
 *     leaf out-rpc-errors {
 *         type zero-based-counter32;
 *     }
 *     leaf out-notifications {
 *         type zero-based-counter32;
 *     }
 *     uses common-counters;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-state/sessions/session</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionBuilder@see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.SessionKey
 */
public interface Session
    extends
    ChildOf<Sessions>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session>,
    CommonCounters,
    Identifiable<SessionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","session");;

    /**
     * Unique identifier for the session. This value is the NETCONF session identifier,
     * as defined in RFC 4741.
     */
    java.lang.Long getSessionId();
    
    /**
     * Identifies the transport for each session, e.g., 'netconf-ssh', 'netconf-soap', 
     * etc.
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport> getTransport();
    
    /**
     * The username is the client identity that was authenticated by the NETCONF 
     * transport protocol. The algorithm used to derive the username is NETCONF 
     * transport protocol specific and in addition specific to the authentication 
     * mechanism used by the NETCONF transport protocol.
     */
    java.lang.String getUsername();
    
    /**
     * Host identifier of the NETCONF client. The value returned is implementation 
     * specific (e.g., hostname, IPv4 address, IPv6 address)
     */
    Host getSourceHost();
    
    /**
     * Time at the server at which the session was established.
     */
    DateAndTime getLoginTime();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    SessionKey getKey();

}

