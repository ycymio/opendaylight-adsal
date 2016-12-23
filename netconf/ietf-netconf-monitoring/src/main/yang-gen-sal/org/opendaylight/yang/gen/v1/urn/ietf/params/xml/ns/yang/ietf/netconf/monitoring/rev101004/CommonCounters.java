package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.ZeroBasedCounter32;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Counters that exist both per session, and also globally, accumulated from all 
 * sessions.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * grouping common-counters {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/common-counters</i>
 */
public interface CommonCounters
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","common-counters");;

    /**
     * Number of correct <rpc> messages received.
     */
    ZeroBasedCounter32 getInRpcs();
    
    /**
     * Number of messages received when an <rpc> message was expected, that were not 
     * correct <rpc> messages. This includes XML parse errors and errors on the rpc 
     * layer.
     */
    ZeroBasedCounter32 getInBadRpcs();
    
    /**
     * Number of <rpc-reply> messages sent that contained an <rpc-error> element.
     */
    ZeroBasedCounter32 getOutRpcErrors();
    
    /**
     * Number of <notification> messages sent.
     */
    ZeroBasedCounter32 getOutNotifications();

}

