package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-action-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-action-types.yang</i>):
 * <pre>
 * container set-nw-src-action {
 *     choice address {
 *         case ipv4 {
 *             leaf ipv4-address {
 *                 type ipv4-prefix;
 *             }
 *         }
 *         case ipv6 {
 *             leaf ipv6-address {
 *                 type ipv6-prefix;
 *             }
 *         }
 *     }
 *     uses address;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-action-types/action/action/set-nw-src-action-case/set-nw-src-action</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case.SetNwSrcActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case.SetNwSrcActionBuilder
 */
public interface SetNwSrcAction
    extends
    ChildOf<Action>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case.SetNwSrcAction>,
    Address
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","set-nw-src-action");;


}

