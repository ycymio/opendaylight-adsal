package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppendersKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * list console-appenders {
 *     key "name"
 *     leaf encoder-pattern {
 *         type string;
 *     }
 *     leaf threshold-filter {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     anyxml ConsoleAppenderTO {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-logging/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:logback:config?revision=2013-07-16)logback/console-appenders</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppendersBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppendersBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppendersKey
 */
public interface ConsoleAppenders
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.ConsoleAppenders>,
    Identifiable<ConsoleAppendersKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:logback:config","2013-07-16","console-appenders");;

    java.lang.String getEncoderPattern();
    
    java.lang.String getThresholdFilter();
    
    java.lang.String getName();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    ConsoleAppendersKey getKey();

}

