package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>netconf-node-inventory</b>
 * <br />(Source path: <i>META-INF\yang\netconf-node-inventory.yang</i>):
 * <pre>
 * grouping netconf-node-fields {
 *     leaf connected {
 *         type boolean;
 *     }
 *     leaf-list initial-capability {
 *         type string;
 *     }
 *     leaf-list current-capability {
 *         type string;
 *     }
 *     container pass-through {
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>netconf-node-inventory/netconf-node-fields</i>
 */
public interface NetconfNodeFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:netconf-node-inventory","2014-01-08","netconf-node-fields");;

    java.lang.Boolean isConnected();
    
    List<java.lang.String> getInitialCapability();
    
    List<java.lang.String> getCurrentCapability();
    
    /**
     * When the underlying node is connected, its NETCONF context is available verbatim
     * under this container through the mount extension.
     */
    PassThrough getPassThrough();

}

