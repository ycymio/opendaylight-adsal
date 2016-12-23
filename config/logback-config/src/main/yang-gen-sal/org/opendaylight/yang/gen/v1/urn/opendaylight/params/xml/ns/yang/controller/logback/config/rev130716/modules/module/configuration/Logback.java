package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * case logback {
 *     list file-appenders {
 *         key "name"
 *         leaf append {
 *             type boolean;
 *         }
 *         leaf file-name {
 *             type string;
 *         }
 *         leaf encoder-pattern {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         anyxml FileAppenderTO {
 *             status CURRENT;
 *         }
 *     }
 *     list rolling-appenders {
 *         key "name"
 *         leaf append {
 *             type boolean;
 *         }
 *         leaf file-name {
 *             type string;
 *         }
 *         leaf encoder-pattern {
 *             type string;
 *         }
 *         leaf min-index {
 *             type int32;
 *         }
 *         leaf max-index {
 *             type int32;
 *         }
 *         leaf max-file-size {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf file-name-pattern {
 *             type string;
 *         }
 *         leaf rolling-policy-type {
 *             type string;
 *         }
 *         leaf max-history {
 *             type int32;
 *         }
 *         leaf clean-history-on-start {
 *             type boolean;
 *         }
 *         anyxml RollingFileAppenderTO {
 *             status CURRENT;
 *         }
 *     }
 *     list console-appenders {
 *         key "name"
 *         leaf encoder-pattern {
 *             type string;
 *         }
 *         leaf threshold-filter {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         anyxml ConsoleAppenderTO {
 *             status CURRENT;
 *         }
 *     }
 *     list loggers {
 *         key "logger-name"
 *         leaf logger-name {
 *             type string;
 *         }
 *         leaf level {
 *             type string;
 *         }
 *         leaf-list appenders {
 *             type string;
 *         }
 *         anyxml LoggerTO {
 *             status CURRENT;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-logging/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:logback:config?revision=2013-07-16)logback</i>
 */
public interface Logback
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.Logback>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:logback:config","2013-07-16","logback");;

    List<FileAppenders> getFileAppenders();
    
    List<RollingAppenders> getRollingAppenders();
    
    List<ConsoleAppenders> getConsoleAppenders();
    
    List<Loggers> getLoggers();

}

