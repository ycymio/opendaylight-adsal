package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-port-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-port-types.yang</i>):
 * <pre>
 * list queue {
 *     key "queue-id"
 *     leaf queue-id {
 *         type queue-id;
 *     }
 *     leaf port {
 *         type uint32;
 *     }
 *     leaf property {
 *         type uint16;
 *     }
 *     uses queue-packet;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-port-types/queues/queue</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueKey
 */
public interface Queue
    extends
    ChildOf<Queues>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>,
    QueuePacket,
    Identifiable<QueueKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","queue");;

    /**
     * Returns Primary Key of Yang List Type
     */
    QueueKey getKey();

}

