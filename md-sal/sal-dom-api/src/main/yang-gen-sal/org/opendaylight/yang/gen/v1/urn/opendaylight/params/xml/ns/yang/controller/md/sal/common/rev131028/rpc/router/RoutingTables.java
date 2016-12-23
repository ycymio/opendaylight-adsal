package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-md-sal-common</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-common.yang</i>):
 * <pre>
 * container routing-tables {
 *     list routing-table {
 *         key     leaf routing-context {
 *             type string;
 *         }
 *         list routes {
 *             key     leaf path {
 *                 type string;
 *             }
 *             leaf destination {
 *                 type string;
 *             }
 *         }
 *         uses rpc-routing-table;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-md-sal-common/rpc-router/routing-tables</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.RoutingTablesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.RoutingTablesBuilder
 */
public interface RoutingTables
    extends
    ChildOf<RpcRouter>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.RoutingTables>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:common","2013-10-28","routing-tables");;

    List<RoutingTable> getRoutingTable();

}

