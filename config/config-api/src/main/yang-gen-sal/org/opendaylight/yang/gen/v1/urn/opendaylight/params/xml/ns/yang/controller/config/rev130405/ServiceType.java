package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * Service identity base type. All service identities must be derived from this 
 * type. A service type uniquely defines a single atomic API contract, such as a 
 * Java interface, a set of C function declarations, or similar. If the service 
 * type has a corresponding Java interface, the name of that interface should be 
 * attached to the derived identity MUST include a java-class keyword, whose name 
 * argument points to that interface.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>config</b>
 * <br />(Source path: <i>META-INF\yang\config.yang</i>):
 * <pre>
 * identity service-type {
 *     description
 *         "Service identity base type. All service identities must be
 *                      derived from this type. A service type uniquely defines a single
 *                      atomic API contract, such as a Java interface, a set of C
 *                      function declarations, or similar.
 *         
 *                      If the service type has a corresponding Java interface, the name
 *                      of that interface should be attached to the derived identity MUST
 *                      include a java-class keyword, whose name argument points to that
 *                      interface.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config/service-type</i>
 */
public abstract class ServiceType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config","2013-04-05","service-type");;

    public ServiceType() {
    
    
    }
    








}
