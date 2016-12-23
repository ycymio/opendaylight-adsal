package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Type of references to a particular service instance. This type can be used when 
 * defining module configuration to refer to a particular service instance. 
 * Containers using this grouping should not define anything else. The run-time 
 * implementation is expected to inject a reference to the service as the value of 
 * the container.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>config</b>
 * <br />(Source path: <i>META-INF\yang\config.yang</i>):
 * <pre>
 * grouping service-ref {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config/service-ref</i>
 */
public interface ServiceRef
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config","2013-04-05","service-ref");;

    /**
     * Type of the service being referenced. Users of this grouping should refine this 
     * leaf with required-identity pointing to the actual service-type which is 
     * actually required.
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> getType();
    
    java.lang.Object getName();

}

