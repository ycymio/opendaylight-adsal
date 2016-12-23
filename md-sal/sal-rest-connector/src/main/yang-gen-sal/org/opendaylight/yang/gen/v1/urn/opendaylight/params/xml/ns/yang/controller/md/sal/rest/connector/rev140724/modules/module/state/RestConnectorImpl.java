package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Config;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Operational;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Rpcs;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-rest-connector</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-rest-connector.yang</i>):
 * <pre>
 * case rest-connector-impl {
 *     container rpcs {
 *         leaf received-requests {
 *             type uint64;
 *         }
 *         uses statistics;
 *     }
 *     container config {
 *         container get {
 *             leaf received-requests {
 *                 type uint64;
 *             }
 *             uses statistics;
 *         }
 *         container post {
 *             leaf received-requests {
 *                 type uint64;
 *             }
 *             uses statistics;
 *         }
 *         container put {
 *             leaf received-requests {
 *                 type uint64;
 *             }
 *             uses statistics;
 *         }
 *     }
 *     container operational {
 *         container get {
 *             leaf received-requests {
 *                 type uint64;
 *             }
 *             uses statistics;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-rest-connector/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector?revision=2014-07-24)rest-connector-impl</i>
 */
public interface RestConnectorImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.RestConnectorImpl>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector","2014-07-24","rest-connector-impl");;

    Rpcs getRpcs();
    
    Config getConfig();
    
    Operational getOperational();

}

