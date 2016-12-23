package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping tcp-match-fields {
 *     leaf tcp-source-port {
 *         type port-number;
 *     }
 *     leaf tcp-destination-port {
 *         type port-number;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/tcp-match-fields</i>
 */
public interface TcpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","tcp-match-fields");;

    /**
     * TCP source port.
     */
    PortNumber getTcpSourcePort();
    
    /**
     * TCP destination port.
     */
    PortNumber getTcpDestinationPort();

}

