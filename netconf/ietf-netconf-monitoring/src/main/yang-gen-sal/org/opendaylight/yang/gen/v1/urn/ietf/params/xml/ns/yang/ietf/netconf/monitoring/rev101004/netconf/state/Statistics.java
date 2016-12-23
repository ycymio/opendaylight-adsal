package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.ZeroBasedCounter32;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.DateAndTime;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.CommonCounters;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Statistical data pertaining to the NETCONF server.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * container statistics {
 *     leaf netconf-start-time {
 *         type date-and-time;
 *     }
 *     leaf in-bad-hellos {
 *         type zero-based-counter32;
 *     }
 *     leaf in-sessions {
 *         type zero-based-counter32;
 *     }
 *     leaf dropped-sessions {
 *         type zero-based-counter32;
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
 * <i>ietf-netconf-monitoring/netconf-state/statistics</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.StatisticsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.StatisticsBuilder
 */
public interface Statistics
    extends
    ChildOf<NetconfState>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.netconf.state.Statistics>,
    CommonCounters
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","statistics");;

    /**
     * Date and time at which the management subsystem was started.
     */
    DateAndTime getNetconfStartTime();
    
    /**
     * Number of sessions silently dropped because an invalid <hello> message was 
     * received. This includes <hello> messages with a 'session-id' attribute, bad 
     * namespace, and bad capability declarations.
     */
    ZeroBasedCounter32 getInBadHellos();
    
    /**
     * Number of sessions started. This counter is incremented when a <hello> message 
     * with a <session-id> is sent. 'in-sessions' - 'in-bad-hellos' = 'number of 
     * correctly started netconf sessions'
     */
    ZeroBasedCounter32 getInSessions();
    
    /**
     * Number of sessions that were abnormally terminated, e.g., due to idle timeout or
     * transport close. This counter is not incremented when a session is properly 
     * closed by a <close-session> operation, or killed by a <kill-session> operation.
     */
    ZeroBasedCounter32 getDroppedSessions();

}

