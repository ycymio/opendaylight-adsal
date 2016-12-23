package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.DataChangedNotification;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
 * Interface for receiving the following YANG notifications defined in module <b>sal-remote</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-remote.yang</i>):
 * <pre>
 * notification data-changed-notification {
 *     description
 *         "Data change notification.";
 *     list data-change-event {
 *         key "path"
 *         leaf path {
 *             type instance-identifier;
 *         }
 *         leaf store {
 *             type enumeration;
 *         }
 *         leaf operation {
 *             type enumeration;
 *         }
 *         anyxml data;
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface SalRemoteListener
    extends
    NotificationListener
{




    /**
     * Data change notification.
     */
    void onDataChangedNotification(DataChangedNotification notification);

}

