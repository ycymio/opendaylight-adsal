package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.bi.ba.rpcservice.rev140701;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.bi.ba.rpcservice.rev140701.RockTheHouseInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>opendaylight-test-rpc-service</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-test-rpc-service.yang</i>):
 * <pre>
 * rpc rock-the-house {
 *     input {
 *         leaf zip-code {
 *             type string;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface OpendaylightTestRpcServiceService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> rockTheHouse(RockTheHouseInput input);

}

