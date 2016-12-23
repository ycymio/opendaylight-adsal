package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortReason;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping flow-port-status {
 *     leaf reason {
 *         type port-reason;
 *     }
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
 * <i>opendaylight-port-types/flow-port-status</i>
 */
public interface FlowPortStatus
    extends
    DataObject,
    FlowCapablePort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","flow-port-status");;

    PortReason getReason();

}

