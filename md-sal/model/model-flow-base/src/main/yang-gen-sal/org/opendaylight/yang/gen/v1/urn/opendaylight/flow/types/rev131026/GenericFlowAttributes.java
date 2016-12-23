package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-flow-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-flow-types.yang</i>):
 * <pre>
 * grouping generic_flow_attributes {
 *     leaf priority {
 *         type uint16;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     leaf cookie {
 *         type flow-cookie;
 *     }
 *     leaf table_id {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-flow-types/generic_flow_attributes</i>
 */
public interface GenericFlowAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","generic_flow_attributes");;

    java.lang.Integer getPriority();
    
    java.lang.Integer getIdleTimeout();
    
    java.lang.Integer getHardTimeout();
    
    FlowCookie getCookie();
    
    java.lang.Short getTableId();

}

