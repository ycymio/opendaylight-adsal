package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>statistics-manager</b>
 * <br />(Source path: <i>META-INF\yang\statistics-manager.yang</i>):
 * <pre>
 * container statistics-manager-settings {
 *     leaf min-request-net-monitor-interval {
 *         type int32;
 *     }
 *     leaf max-nodes-for-collector {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>statistics-manager/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager?revision=2014-09-25)statistics-manager/statistics-manager-settings</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettingsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettingsBuilder
 */
public interface StatisticsManagerSettings
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:statistics-manager","2014-09-25","statistics-manager-settings");;

    java.lang.Integer getMinRequestNetMonitorInterval();
    
    java.lang.Integer getMaxNodesForCollector();

}

