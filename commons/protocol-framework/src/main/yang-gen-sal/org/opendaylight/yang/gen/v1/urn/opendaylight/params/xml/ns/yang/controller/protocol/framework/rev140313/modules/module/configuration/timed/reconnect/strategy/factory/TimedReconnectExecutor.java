package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>protocol-framework</b>
 * <br />(Source path: <i>META-INF\yang\odl-protocol-framework-cfg.yang</i>):
 * <pre>
 * container timed-reconnect-executor {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:protocol:framework?revision=2014-03-13)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>protocol-framework/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:protocol:framework?revision=2014-03-13)timed-reconnect-strategy-factory/timed-reconnect-executor</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory.TimedReconnectExecutorBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory.TimedReconnectExecutorBuilder
 */
public interface TimedReconnectExecutor
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory.TimedReconnectExecutor>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:protocol:framework","2014-03-13","timed-reconnect-executor");;


}

