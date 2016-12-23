package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping flow-capable-port {
 *     leaf port-number {
 *         type union;
 *     }
 *     leaf hardware-address {
 *         type mac-address;
 *     }
 *     leaf configuration {
 *         type port-config;
 *     }
 *     leaf advertised-features {
 *         type port-features;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     container state {
 *         leaf link-down {
 *             type boolean;
 *         }
 *         leaf blocked {
 *             type boolean;
 *         }
 *         leaf live {
 *             type boolean;
 *         }
 *         uses port-state;
 *     }
 *     leaf current-feature {
 *         type port-features;
 *     }
 *     leaf supported {
 *         type port-features;
 *     }
 *     leaf peer-features {
 *         type port-features;
 *     }
 *     leaf current-speed {
 *         type uint32;
 *     }
 *     leaf maximum-speed {
 *         type uint32;
 *     }
 *     list queue {
 *         key "queue-id"
 *         leaf queue-id {
 *             type queue-id;
 *         }
 *         leaf port {
 *             type uint32;
 *         }
 *         leaf property {
 *             type uint16;
 *         }
 *         uses queue-packet;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/flow-capable-port</i>
 */
public interface FlowCapablePort
    extends
    DataObject,
    Queues,
    CommonPort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","flow-capable-port");;

    /**
     * Human readable name of the port
     */
    java.lang.String getName();
    
    /**
     * Description of state of port
     */
    State getState();
    
    /**
     * Bit map of OFPPF-* flags
     */
    PortFeatures getCurrentFeature();
    
    /**
     * Features supported by the port
     */
    PortFeatures getSupported();
    
    /**
     * Features advertised by peer
     */
    PortFeatures getPeerFeatures();
    
    /**
     * Current port bit rate in kbps
     */
    java.lang.Long getCurrentSpeed();
    
    /**
     * Max port bit rate in kbps
     */
    java.lang.Long getMaximumSpeed();

}

