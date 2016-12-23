package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateDataChangeEventSubscriptionInput;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateDataChangeEventSubscriptionOutput;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateNotificationStreamInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateNotificationStreamOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.BeginTransactionOutput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>sal-remote</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-remote.yang</i>):
 * <pre>
 * rpc begin-transaction {
 *     output {
 *         anyxml data-modification-transaction;
 *     }
 *     status CURRENT;
 * }
 * rpc create-data-change-event-subscription {
 *     input {
 *         leaf path {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf stream-name {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc create-notification-stream {
 *     input {
 *         leaf-list notifications {
 *             type q-name;
 *         }
 *     }
 *     
 *     output {
 *         leaf notification-stream-identifier {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface SalRemoteService
    extends
    RpcService
{




    Future<RpcResult<BeginTransactionOutput>> beginTransaction();
    
    Future<RpcResult<CreateDataChangeEventSubscriptionOutput>> createDataChangeEventSubscription(CreateDataChangeEventSubscriptionInput input);
    
    Future<RpcResult<CreateNotificationStreamOutput>> createNotificationStream(CreateNotificationStreamInput input);

}

