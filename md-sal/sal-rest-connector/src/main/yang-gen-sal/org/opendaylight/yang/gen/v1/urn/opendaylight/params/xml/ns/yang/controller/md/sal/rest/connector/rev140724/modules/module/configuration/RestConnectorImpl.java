package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.configuration.rest.connector.impl.DomBroker;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-rest-connector</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-rest-connector.yang</i>):
 * <pre>
 * case rest-connector-impl {
 *     leaf websocket-port {
 *         type port-number;
 *     }
 *     container dom-broker {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector?revision=2014-07-24)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-rest-connector/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector?revision=2014-07-24)rest-connector-impl</i>
 */
public interface RestConnectorImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.configuration.RestConnectorImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector","2014-07-24","rest-connector-impl");;

    PortNumber getWebsocketPort();
    
    DomBroker getDomBroker();

}

