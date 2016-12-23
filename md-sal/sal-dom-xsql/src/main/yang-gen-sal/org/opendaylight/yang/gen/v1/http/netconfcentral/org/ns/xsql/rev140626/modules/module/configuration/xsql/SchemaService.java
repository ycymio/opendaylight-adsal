package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>XSQL</b>
 * <br />(Source path: <i>META-INF\yang\XSQL.yang</i>):
 * <pre>
 * container schema-service {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (http://netconfcentral.org/ns/XSQL?revision=2014-06-26)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>XSQL/modules/module/configuration/(http://netconfcentral.org/ns/XSQL?revision=2014-06-26)XSQL/schema-service</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.SchemaServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.SchemaServiceBuilder
 */
public interface SchemaService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.modules.module.configuration.xsql.SchemaService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/XSQL","2014-06-26","schema-service");;


}

