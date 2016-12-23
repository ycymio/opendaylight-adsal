package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.state.logback.Status;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-logging</b>
 * <br />(Source path: <i>META-INF\yang\config-logging.yang</i>):
 * <pre>
 * case logback {
 *     list status {
 *         key     leaf level {
 *             type string;
 *         }
 *         leaf message {
 *             type string;
 *         }
 *         leaf date {
 *             type uint32;
 *         }
 *         anyxml StatusTO {
 *             status CURRENT;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-logging/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:logback:config?revision=2013-07-16)logback</i>
 */
public interface Logback
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.state.Logback>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:logback:config","2013-07-16","logback");;

    List<Status> getStatus();

}

