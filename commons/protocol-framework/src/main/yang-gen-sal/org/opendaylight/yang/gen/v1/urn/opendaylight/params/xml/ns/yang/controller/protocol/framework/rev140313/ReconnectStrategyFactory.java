package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType;


/**
 * Service representing a reconnect strategy factory.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>protocol-framework</b>
 * <br />(Source path: <i>META-INF\yang\odl-protocol-framework-cfg.yang</i>):
 * <pre>
 * identity reconnect-strategy-factory {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)service-type]";
 *     description
 *         "Service representing a reconnect strategy factory.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>protocol-framework/reconnect-strategy-factory</i>
 */
public abstract class ReconnectStrategyFactory extends ServiceType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:protocol:framework","2014-03-13","reconnect-strategy-factory");;

    public ReconnectStrategyFactory() {
    
    
    }
    








}
