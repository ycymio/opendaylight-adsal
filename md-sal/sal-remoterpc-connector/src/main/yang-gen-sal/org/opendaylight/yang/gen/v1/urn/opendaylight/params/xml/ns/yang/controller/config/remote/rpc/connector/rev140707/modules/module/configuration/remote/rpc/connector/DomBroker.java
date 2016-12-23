package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>remote-rpc-connector</b>
 * <br />(Source path: <i>META-INF\yang\remote-rpc-connector.yang</i>):
 * <pre>
 * container dom-broker {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector?revision=2014-07-07)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>remote-rpc-connector/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector?revision=2014-07-07)remote-rpc-connector/dom-broker</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector.DomBrokerBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector.DomBrokerBuilder
 */
public interface DomBroker
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector.DomBroker>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector","2014-07-07","dom-broker");;


}

