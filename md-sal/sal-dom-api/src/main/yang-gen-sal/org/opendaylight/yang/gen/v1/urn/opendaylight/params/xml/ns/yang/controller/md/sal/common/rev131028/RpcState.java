package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-md-sal-common</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-common.yang</i>):
 * <pre>
 * grouping rpc-state {
 *     list rpc-router {
 *         key     leaf module {
 *             type string;
 *         }
 *         container routing-tables {
 *             list routing-table {
 *                 key     leaf routing-context {
 *                     type string;
 *                 }
 *                 list routes {
 *                     key     leaf path {
 *                         type string;
 *                     }
 *                     leaf destination {
 *                         type string;
 *                     }
 *                 }
 *                 uses rpc-routing-table;
 *             }
 *         }
 *         uses rpc-router;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-md-sal-common/rpc-state</i>
 */
public interface RpcState
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:common","2013-10-28","rpc-state");;

    List<RpcRouter> getRpcRouter();

}

