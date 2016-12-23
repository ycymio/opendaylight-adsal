package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping port-mod {
 *     container port {
 *         list port {
 *             key "port-mod-order"
 *             leaf port-mod-order {
 *                 type uint32;
 *             }
 *             leaf port-number {
 *                 type union;
 *             }
 *             leaf hardware-address {
 *                 type mac-address;
 *             }
 *             leaf configuration {
 *                 type port-config;
 *             }
 *             leaf advertised-features {
 *                 type port-features;
 *             }
 *             leaf mask {
 *                 type port-config;
 *             }
 *             leaf container-name {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             leaf barrier {
 *                 type boolean;
 *             }
 *             uses common-port;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/port-mod</i>
 */
public interface PortMod
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port-mod");;

    Port getPort();

}

