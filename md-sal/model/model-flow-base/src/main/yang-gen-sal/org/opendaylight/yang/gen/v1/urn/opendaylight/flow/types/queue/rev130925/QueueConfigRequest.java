package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-queue-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-queue-types.yang</i>):
 * <pre>
 * grouping queue-config-request {
 *     leaf port {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-queue-types/queue-config-request</i>
 */
public interface QueueConfigRequest
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:queue","2013-09-25","queue-config-request");;

    /**
     * Port to be queried.
     */
    java.lang.Long getPort();

}

