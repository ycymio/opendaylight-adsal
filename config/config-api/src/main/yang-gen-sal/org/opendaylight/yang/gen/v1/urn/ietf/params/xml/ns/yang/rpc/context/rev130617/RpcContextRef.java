package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * A reference to RPC context.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>rpc-context</b>
 * <br />(Source path: <i>META-INF\yang\rpc-context.yang</i>):
 * <pre>
 * grouping rpc-context-ref {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>rpc-context/rpc-context-ref</i>
 */
public interface RpcContextRef
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:rpc-context","2013-06-17","rpc-context-ref");;

    /**
     * Pointer to the context.
     */
    InstanceIdentifier<?> getContextInstance();

}

