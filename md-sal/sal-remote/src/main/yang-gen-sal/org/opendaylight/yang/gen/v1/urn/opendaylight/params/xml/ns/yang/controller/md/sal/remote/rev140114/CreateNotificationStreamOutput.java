package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sal-remote</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-remote.yang</i>):
 * <pre>
 * container output {
 *     leaf notification-stream-identifier {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sal-remote/create-notification-stream/output</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateNotificationStreamOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateNotificationStreamOutputBuilder
 */
public interface CreateNotificationStreamOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateNotificationStreamOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:remote","2014-01-14","output");;

    /**
     * Unique notification stream identifier, in which notifications will be propagated
     */
    java.lang.String getNotificationStreamIdentifier();

}

