package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatisticsRequest;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-group-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-group-types.yang</i>):
 * <pre>
 * list group-stats {
 *     key "group-id"
 *     leaf group-id {
 *         type group-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-group-types/group-statistics-request/group-stats</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsKey
 */
public interface GroupStats
    extends
    ChildOf<GroupStatisticsRequest>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>,
    Identifiable<GroupStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","group-stats");;

    GroupId getGroupId();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    GroupStatsKey getKey();

}

