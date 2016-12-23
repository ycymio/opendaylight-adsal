package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * Module identity base type. All module identities must be derived from this type.
 * A module type uniquely defines a single atomic component, such as an 
 * application. Each such component is assumed to have its unique, stable and 
 * versioned configuration structure.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>config</b>
 * <br />(Source path: <i>META-INF\yang\config.yang</i>):
 * <pre>
 * identity module-type {
 *     description
 *         "Module identity base type. All module identities must be derived
 *                     from this type. A module type uniquely defines a single atomic
 *                     component, such as an application. Each such component is assumed
 *                     to have its unique, stable and versioned configuration structure.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config/module-type</i>
 */
public abstract class ModuleType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config","2013-04-05","module-type");;

    public ModuleType() {
    
    
    }
    








}
