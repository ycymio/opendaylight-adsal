package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcState;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-binding-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-binding-broker-impl.yang</i>):
 * <pre>
 * case binding-rpc-broker {
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
 * <i>opendaylight-sal-binding-broker-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl?revision=2013-10-28)binding-rpc-broker</i>
 */
public interface BindingRpcBroker
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingRpcBroker>,
    RpcState,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl","2013-10-28","binding-rpc-broker");;


}

