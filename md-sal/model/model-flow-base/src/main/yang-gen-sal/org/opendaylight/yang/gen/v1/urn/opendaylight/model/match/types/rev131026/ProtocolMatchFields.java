package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields.Pbb;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * grouping protocol-match-fields {
 *     leaf mpls-label {
 *         type uint32;
 *     }
 *     leaf mpls-tc {
 *         type uint8;
 *     }
 *     leaf mpls-bos {
 *         type uint8;
 *     }
 *     container pbb {
 *         leaf pbb-isid {
 *             type uint32;
 *         }
 *         leaf pbb-mask {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/protocol-match-fields</i>
 */
public interface ProtocolMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","protocol-match-fields");;

    /**
     * Label in the first MPLS shim header
     */
    java.lang.Long getMplsLabel();
    
    /**
     * TC in the first MPLS shim header
     */
    java.lang.Short getMplsTc();
    
    /**
     * BoS bit in the first MPLS shim header
     */
    java.lang.Short getMplsBos();
    
    Pbb getPbb();

}

