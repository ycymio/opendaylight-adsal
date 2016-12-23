package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.rpc.routing.rev140701;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.rpc.routing.rev140701.RoutedSimpleRouteInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>opendaylight-test-routed-rpc</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-test-routed-rpc.yang</i>):
 * <pre>
 * rpc routed-simple-route {
 *     input {
 *         leaf route {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface OpendaylightTestRoutedRpcService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> routedSimpleRoute(RoutedSimpleRouteInput input);

}

