package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppendersKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * list file-appenders {
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
 *     leaf name {
 *         type string;
 *     }
 *     anyxml FileAppenderTO {
 *         status CURRENT;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-logging/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:logback:config?revision=2013-07-16)logback/file-appenders</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppendersBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppendersBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppendersKey
 */
public interface FileAppenders
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.FileAppenders>,
    Identifiable<FileAppendersKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:logback:config","2013-07-16","file-appenders");;

    java.lang.Boolean isAppend();
    
    java.lang.String getFileName();
    
    java.lang.String getEncoderPattern();
    
    java.lang.String getName();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    FileAppendersKey getKey();

}

