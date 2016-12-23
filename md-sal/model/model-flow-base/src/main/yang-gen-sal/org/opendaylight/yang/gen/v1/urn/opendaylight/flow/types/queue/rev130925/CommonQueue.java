package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-queue-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-queue-types.yang</i>):
 * <pre>
 * grouping common-queue {
 *     leaf property {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-queue-types/common-queue</i>
 */
public interface CommonQueue
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:queue","2013-09-25","common-queue");;

    /**
     * One of OFPQT_.
     */
    java.lang.Integer getProperty();

}

