package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>toaster</b>
 * <br />(Source path: <i>META-INF\yang\toaster.yang</i>):
 * <pre>
 * rpc cancel-toast {
 *     "Stop making toast, if any is being made.
 *                A 'resource-denied' error will be returned 
 *                if the toaster service is disabled.";
 *     status CURRENT;
 * }
 * rpc make-toast {
 *     "Make some toast.
 *                The toastDone notification will be sent when 
 *                the toast is finished.
 *                An 'in-use' error will be returned if toast
 *                is already being made.
 *                A 'resource-denied' error will be returned 
 *                if the toaster service is disabled.";
 *     input {
 *         leaf toasterDoneness {
 *             type uint32;
 *         }
 *         leaf toasterToastType {
 *             type identityref;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * rpc restock-toaster {
 *     "Restocks the toaster with the amount of bread specified.";
 *     input {
 *         leaf amountOfBreadToStock {
 *             type uint32;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface ToasterService
    extends
    RpcService
{




    /**
     * Stop making toast, if any is being made. A 'resource-denied' error will be 
     * returned if the toaster service is disabled.
     */
    Future<RpcResult<java.lang.Void>> cancelToast();
    
    /**
     * Make some toast. The toastDone notification will be sent when the toast is 
     * finished. An 'in-use' error will be returned if toast is already being made. A 
     * 'resource-denied' error will be returned if the toaster service is disabled.
     */
    Future<RpcResult<java.lang.Void>> makeToast(MakeToastInput input);
    
    /**
     * Restocks the toaster with the amount of bread specified.
     */
    Future<RpcResult<java.lang.Void>> restockToaster(RestockToasterInput input);

}

