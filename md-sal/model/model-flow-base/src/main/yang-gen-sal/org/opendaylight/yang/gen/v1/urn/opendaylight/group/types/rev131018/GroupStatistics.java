package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * grouping group-statistics {
 *     leaf group-id {
 *         type group-id;
 *     }
 *     leaf ref-count {
 *         type counter32;
 *     }
 *     leaf packet-count {
 *         type counter64;
 *     }
 *     leaf byte-count {
 *         type counter64;
 *     }
 *     container duration {
 *         leaf second {
 *             type counter32;
 *         }
 *         leaf nanosecond {
 *             type counter32;
 *         }
 *     }
 *     container buckets {
 *         list bucket-counter {
 *             key "bucket-id"
 *             leaf bucket-id {
 *                 type bucket-id;
 *             }
 *             leaf packet-count {
 *                 type counter64;
 *             }
 *             leaf byte-count {
 *                 type counter64;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-statistics</i>
 */
public interface GroupStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-statistics");;

    GroupId getGroupId();
    
    Counter32 getRefCount();
    
    Counter64 getPacketCount();
    
    Counter64 getByteCount();
    
    Duration getDuration();
    
    Buckets getBuckets();

}

