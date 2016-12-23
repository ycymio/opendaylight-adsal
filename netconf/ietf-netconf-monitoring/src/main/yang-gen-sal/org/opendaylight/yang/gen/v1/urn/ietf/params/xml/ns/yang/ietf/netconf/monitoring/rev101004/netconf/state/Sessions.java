package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.sessions.Session;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * The sessions container includes session-specific data for NETCONF management 
 * sessions. The session list MUST include all currently active NETCONF sessions.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * container sessions {
 *     list session {
 *         key "session-id"
 *         leaf session-id {
 *             type uint32;
 *         }
 *         leaf transport {
 *             type identityref;
 *         }
 *         leaf username {
 *             type string;
 *         }
 *         leaf source-host {
 *             type host;
 *         }
 *         leaf login-time {
 *             type date-and-time;
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
 * <i>ietf-netconf-monitoring/netconf-state/sessions</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.SessionsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.SessionsBuilder
 */
public interface Sessions
    extends
    ChildOf<NetconfState>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Sessions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","sessions");;

    /**
     * All NETCONF sessions managed by the NETCONF server MUST be reported in this 
     * list.
     */
    List<Session> getSession();

}

