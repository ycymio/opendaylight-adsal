package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.SchemaService;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.ConfigDataStore;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.OperationalDataStore;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-dom-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-dom-broker-impl.yang</i>):
 * <pre>
 * case dom-inmemory-data-broker {
 *     container schema-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container config-data-store {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container operational-data-store {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     leaf max-data-broker-future-callback-queue-size {
 *         type uint16;
 *     }
 *     leaf max-data-broker-future-callback-pool-size {
 *         type uint16;
 *     }
 *     leaf max-data-broker-commit-queue-size {
 *         type uint16;
 *     }
 *     leaf allow-concurrent-commits {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-dom-broker-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)dom-inmemory-data-broker</i>
 */
public interface DomInmemoryDataBroker
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl","2013-10-28","dom-inmemory-data-broker");;

    SchemaService getSchemaService();
    
    ConfigDataStore getConfigDataStore();
    
    OperationalDataStore getOperationalDataStore();
    
    /**
     * The maximum queue size for the data broker's commit future callback executor.
     */
    java.lang.Integer getMaxDataBrokerFutureCallbackQueueSize();
    
    /**
     * The maximum thread pool size for the data broker's commit future callback 
     * executor.
     */
    java.lang.Integer getMaxDataBrokerFutureCallbackPoolSize();
    
    /**
     * The maximum queue size for the data broker's commit executor.
     */
    java.lang.Integer getMaxDataBrokerCommitQueueSize();
    
    /**
     * Specifies whether or not to allow 3-phrase commits to run concurrently. Use with
     * caution. If set to true, the data store implementations must be prepared to 
     * handle concurrent commits. The default is false
     */
    java.lang.Boolean isAllowConcurrentCommits();

}

