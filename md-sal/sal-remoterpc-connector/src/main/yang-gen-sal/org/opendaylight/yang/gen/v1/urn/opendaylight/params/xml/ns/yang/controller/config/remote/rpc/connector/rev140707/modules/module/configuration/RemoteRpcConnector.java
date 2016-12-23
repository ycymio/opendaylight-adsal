package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.remote.rpc.connector.DomBroker;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>remote-rpc-connector</b>
 * <br />(Source path: <i>META-INF\yang\remote-rpc-connector.yang</i>):
 * <pre>
 * case remote-rpc-connector {
 *     container dom-broker {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector?revision=2014-07-07)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf enable-metric-capture {
 *         type boolean;
 *     }
 *     leaf actor-system-name {
 *         type string;
 *     }
 *     leaf bounded-mailbox-capacity {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>remote-rpc-connector/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector?revision=2014-07-07)remote-rpc-connector</i>
 */
public interface RemoteRpcConnector
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.remote.rpc.connector.rev140707.modules.module.configuration.RemoteRpcConnector>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:remote-rpc-connector","2014-07-07","remote-rpc-connector");;

    DomBroker getDomBroker();
    
    /**
     * Enable or disable metric capture.
     */
    java.lang.Boolean isEnableMetricCapture();
    
    /**
     * Name by which actor system is identified. Its also used to find relevant 
     * configuration
     */
    java.lang.String getActorSystemName();
    
    /**
     * Max queue size that an actor's mailbox can reach
     */
    java.lang.Integer getBoundedMailboxCapacity();

}

