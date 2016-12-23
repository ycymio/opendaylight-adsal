package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer4Match;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * case tcp-match {
 *     leaf tcp-source-port {
 *         type port-number;
 *     }
 *     leaf tcp-destination-port {
 *         type port-number;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/layer-4-match/tcp-match</i>
 */
public interface TcpMatch
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>,
    TcpMatchFields,
    Layer4Match
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","tcp-match");;


}

