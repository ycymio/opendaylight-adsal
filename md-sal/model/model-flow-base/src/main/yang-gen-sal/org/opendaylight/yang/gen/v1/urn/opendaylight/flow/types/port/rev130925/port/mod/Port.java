package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * container port {
 *     list port {
 *         key "port-mod-order"
 *         leaf port-mod-order {
 *             type uint32;
 *         }
 *         leaf port-number {
 *             type union;
 *         }
 *         leaf hardware-address {
 *             type mac-address;
 *         }
 *         leaf configuration {
 *             type port-config;
 *         }
 *         leaf advertised-features {
 *             type port-features;
 *         }
 *         leaf mask {
 *             type port-config;
 *         }
 *         leaf container-name {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         leaf barrier {
 *             type boolean;
 *         }
 *         uses common-port;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/port-mod/port</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.PortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.PortBuilder
 */
public interface Port
    extends
    ChildOf<PortMod>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port");;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getPort();

}

