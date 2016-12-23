package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131;
import java.util.concurrent.Future;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatInput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>kitchen-service-impl</b>
 * <br />(Source path: <i>META-INF\yang\kitchen-service-impl.yang</i>):
 * <pre>
 * rpc make-scrambled-with-wheat {
 *     "Shortcut JMX call to make breakfast with scrambled eggs and wheat toast for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
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
public interface KitchenServiceImplService
    extends
    RpcService
{




    /**
     * Shortcut JMX call to make breakfast with scrambled eggs and wheat toast for 
     * testing.
     */
    Future<RpcResult<MakeScrambledWithWheatOutput>> makeScrambledWithWheat(MakeScrambledWithWheatInput input);

}

