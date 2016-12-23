package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.ResetInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * rpc reset {
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface ConfigLoggingService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> reset(ResetInput input);

}

