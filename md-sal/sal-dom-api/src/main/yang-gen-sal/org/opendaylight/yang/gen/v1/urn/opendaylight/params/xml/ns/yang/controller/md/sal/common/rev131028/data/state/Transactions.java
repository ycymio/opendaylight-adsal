package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.DataState;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-md-sal-common</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-common.yang</i>):
 * <pre>
 * container transactions {
 *     leaf created {
 *         type uint32;
 *     }
 *     leaf submitted {
 *         type uint32;
 *     }
 *     leaf successful {
 *         type uint32;
 *     }
 *     leaf failed {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-md-sal-common/data-state/transactions</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.TransactionsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.TransactionsBuilder
 */
public interface Transactions
    extends
    ChildOf<DataState>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:common","2013-10-28","transactions");;

    java.lang.Long getCreated();
    
    java.lang.Long getSubmitted();
    
    java.lang.Long getSuccessful();
    
    java.lang.Long getFailed();

}

