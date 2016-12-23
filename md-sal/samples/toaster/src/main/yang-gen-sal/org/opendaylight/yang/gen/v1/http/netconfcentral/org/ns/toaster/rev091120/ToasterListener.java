package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterRestocked;
import org.opendaylight.yangtools.yang.binding.NotificationListener;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread;


/**
 * Interface for receiving the following YANG notifications defined in module <b>toaster</b>
 * <br />(Source path: <i>META-INF\yang\toaster.yang</i>):
 * <pre>
 * notification toasterOutOfBread {
 *     description
 *         "Indicates that the toaster has run of out bread.";
 *     status CURRENT;
 * }
 * notification toasterRestocked {
 *     description
 *         "Indicates that the toaster has run of out bread.";
 *     leaf amountOfBread {
 *         type uint32;
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface ToasterListener
    extends
    NotificationListener
{




    /**
     * Indicates that the toaster has run of out bread.
     */
    void onToasterOutOfBread(ToasterOutOfBread notification);
    
    /**
     * Indicates that the toaster has run of out bread.
     */
    void onToasterRestocked(ToasterRestocked notification);

}

