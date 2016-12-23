package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-queue-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-queue-types.yang</i>):
 * <pre>
 * grouping queue-prop-max-rate {
 *     leaf property {
 *         type uint16;
 *     }
 *     leaf rate {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-queue-types/queue-prop-max-rate</i>
 */
public interface QueuePropMaxRate
    extends
    DataObject,
    CommonQueue
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:queue","2013-09-25","queue-prop-max-rate");;

    /**
     * OFPQT_MAX, len: 16
     */
    java.lang.Integer getRate();

}

