package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping port-state {
 *     leaf link-down {
 *         type boolean;
 *     }
 *     leaf blocked {
 *         type boolean;
 *     }
 *     leaf live {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/port-state</i>
 */
public interface PortState
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port-state");;

    java.lang.Boolean isLinkDown();
    
    java.lang.Boolean isBlocked();
    
    java.lang.Boolean isLive();

}

