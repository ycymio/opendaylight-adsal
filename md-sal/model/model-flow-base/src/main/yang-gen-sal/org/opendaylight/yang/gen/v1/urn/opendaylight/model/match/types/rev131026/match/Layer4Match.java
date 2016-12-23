package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * choice layer-4-match {
 *     case sctp-match {
 *         leaf sctp-source-port {
 *             type port-number;
 *         }
 *         leaf sctp-destination-port {
 *             type port-number;
 *         }
 *     }
 *     case tcp-match {
 *         leaf tcp-source-port {
 *             type port-number;
 *         }
 *         leaf tcp-destination-port {
 *             type port-number;
 *         }
 *     }
 *     case udp-match {
 *         leaf udp-source-port {
 *             type port-number;
 *         }
 *         leaf udp-destination-port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/layer-4-match</i>
 */
public interface Layer4Match
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","layer-4-match");;


}

