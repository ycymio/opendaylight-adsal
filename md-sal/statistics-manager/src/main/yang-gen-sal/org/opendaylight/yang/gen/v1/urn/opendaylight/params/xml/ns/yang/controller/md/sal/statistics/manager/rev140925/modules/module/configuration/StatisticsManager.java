package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.NotificationService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>statistics-manager</b>
 * <br />(Source path: <i>META-INF\yang\statistics-manager.yang</i>):
 * <pre>
 * case statistics-manager {
 *     container rpc-registry {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager?revision=2014-09-25)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager?revision=2014-09-25)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container data-broker {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager?revision=2014-09-25)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container statistics-manager-settings {
 *         leaf min-request-net-monitor-interval {
 *             type int32;
 *         }
 *         leaf max-nodes-for-collector {
 *             type int32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>statistics-manager/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager?revision=2014-09-25)statistics-manager</i>
 */
public interface StatisticsManager
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.StatisticsManager>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager","2014-09-25","statistics-manager");;

    RpcRegistry getRpcRegistry();
    
    NotificationService getNotificationService();
    
    DataBroker getDataBroker();
    
    StatisticsManagerSettings getStatisticsManagerSettings();

}

