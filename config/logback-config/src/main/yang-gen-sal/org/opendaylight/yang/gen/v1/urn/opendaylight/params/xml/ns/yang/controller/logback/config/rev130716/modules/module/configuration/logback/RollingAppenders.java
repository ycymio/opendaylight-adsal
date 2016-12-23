package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppendersKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * list rolling-appenders {
 *     key "name"
 *     leaf append {
 *         type boolean;
 *     }
 *     leaf file-name {
 *         type string;
 *     }
 *     leaf encoder-pattern {
 *         type string;
 *     }
 *     leaf min-index {
 *         type int32;
 *     }
 *     leaf max-index {
 *         type int32;
 *     }
 *     leaf max-file-size {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf file-name-pattern {
 *         type string;
 *     }
 *     leaf rolling-policy-type {
 *         type string;
 *     }
 *     leaf max-history {
 *         type int32;
 *     }
 *     leaf clean-history-on-start {
 *         type boolean;
 *     }
 *     anyxml RollingFileAppenderTO {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-logging/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:logback:config?revision=2013-07-16)logback/rolling-appenders</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppendersBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppendersBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppendersKey
 */
public interface RollingAppenders
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.RollingAppenders>,
    Identifiable<RollingAppendersKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:logback:config","2013-07-16","rolling-appenders");;

    java.lang.Boolean isAppend();
    
    java.lang.String getFileName();
    
    java.lang.String getEncoderPattern();
    
    java.lang.Integer getMinIndex();
    
    java.lang.Integer getMaxIndex();
    
    java.lang.String getMaxFileSize();
    
    java.lang.String getName();
    
    java.lang.String getFileNamePattern();
    
    java.lang.String getRollingPolicyType();
    
    java.lang.Integer getMaxHistory();
    
    java.lang.Boolean isCleanHistoryOnStart();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    RollingAppendersKey getKey();

}

