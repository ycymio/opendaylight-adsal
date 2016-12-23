package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.dom.broker.impl;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.DataState;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-dom-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-dom-broker-impl.yang</i>):
 * <pre>
 * container data {
 *     container transactions {
 *         leaf created {
 *             type uint32;
 *         }
 *         leaf submitted {
 *             type uint32;
 *         }
 *         leaf successful {
 *             type uint32;
 *         }
 *         leaf failed {
 *             type uint32;
 *         }
 *     }
 *     uses data-state;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-dom-broker-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)dom-broker-impl/data</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.dom.broker.impl.DataBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.dom.broker.impl.DataBuilder
 */
public interface Data
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.dom.broker.impl.Data>,
    DataState
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl","2013-10-28","data");;


}

