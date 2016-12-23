package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.Statistics;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-rest-connector</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-rest-connector.yang</i>):
 * <pre>
 * container rpcs {
 *     leaf received-requests {
 *         type uint64;
 *     }
 *     uses statistics;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-rest-connector/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector?revision=2014-07-24)rest-connector-impl/rpcs</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.RpcsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.RpcsBuilder
 */
public interface Rpcs
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724.modules.module.state.rest.connector.impl.Rpcs>,
    Statistics
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector","2014-07-24","rpcs");;


}

