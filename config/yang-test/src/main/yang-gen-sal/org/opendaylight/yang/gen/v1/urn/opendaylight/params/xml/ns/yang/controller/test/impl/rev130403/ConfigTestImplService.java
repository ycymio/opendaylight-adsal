package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ContainerOutputInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ListOutputOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ListOutputInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.LeafListOutputInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInnerInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.LeafListOutputOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ContainerOutputOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInnerOutput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * rpc container-output {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         container retValContainer {
 *             leaf v1 {
 *                 type string;
 *             }
 *             leaf v2 {
 *                 type uint32;
 *             }
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc leaf-list-output {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf-list result {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc list-output {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         list ret-val-list {
 *             key     leaf v2 {
 *                 type uint32;
 *             }
 *             leaf v1 {
 *                 type boolean;
 *             }
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc no-arg {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *         leaf arg1 {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc noArgInner {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * rpc noArgInnerInner {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *         leaf arg1 {
 *             type uint16;
 *         }
 *         leaf arg2 {
 *             type boolean;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface ConfigTestImplService
    extends
    RpcService
{




    Future<RpcResult<ContainerOutputOutput>> containerOutput(ContainerOutputInput input);
    
    Future<RpcResult<LeafListOutputOutput>> leafListOutput(LeafListOutputInput input);
    
    Future<RpcResult<ListOutputOutput>> listOutput(ListOutputInput input);
    
    Future<RpcResult<NoArgOutput>> noArg(NoArgInput input);
    
    Future<RpcResult<java.lang.Void>> noArgInner(NoArgInnerInput input);
    
    Future<RpcResult<NoArgInnerInnerOutput>> noArgInnerInner(NoArgInnerInnerInput input);

}

