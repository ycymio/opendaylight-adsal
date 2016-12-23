package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.mpls.ttl.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-action-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-action-types.yang</i>):
 * <pre>
 * container set-mpls-ttl-action {
 *     leaf mpls-ttl {
 *         type uint8;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-action-types/action/action/set-mpls-ttl-action-case/set-mpls-ttl-action</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.mpls.ttl.action._case.SetMplsTtlActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.mpls.ttl.action._case.SetMplsTtlActionBuilder
 */
public interface SetMplsTtlAction
    extends
    ChildOf<Action>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.mpls.ttl.action._case.SetMplsTtlAction>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","set-mpls-ttl-action");;

    java.lang.Short getMplsTtl();

}

