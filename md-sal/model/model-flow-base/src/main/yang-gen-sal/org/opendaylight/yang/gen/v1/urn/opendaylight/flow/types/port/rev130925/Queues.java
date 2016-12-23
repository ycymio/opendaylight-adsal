package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * grouping queues {
 *     list queue {
 *         key "queue-id"
 *         leaf queue-id {
 *             type queue-id;
 *         }
 *         leaf port {
 *             type uint32;
 *         }
 *         leaf property {
 *             type uint16;
 *         }
 *         uses queue-packet;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/queues</i>
 */
public interface Queues
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","queues");;

    List<Queue> getQueue();

}

