package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * list port {
 *     key "port-mod-order"
 *     leaf port-mod-order {
 *         type uint32;
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
 *     leaf mask {
 *         type port-config;
 *     }
 *     leaf container-name {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     leaf barrier {
 *         type boolean;
 *     }
 *     uses common-port;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/port-mod/port/port</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey
 */
public interface Port
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>,
    CommonPort,
    Identifiable<PortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port");;

    java.lang.Long getPortModOrder();
    
    /**
     * Bitmap of OFPPC-* flags to be changed
     */
    PortConfig getMask();
    
    java.lang.String getContainerName();
    
    java.lang.String getPortName();
    
    java.lang.Boolean isBarrier();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    PortKey getKey();

}

