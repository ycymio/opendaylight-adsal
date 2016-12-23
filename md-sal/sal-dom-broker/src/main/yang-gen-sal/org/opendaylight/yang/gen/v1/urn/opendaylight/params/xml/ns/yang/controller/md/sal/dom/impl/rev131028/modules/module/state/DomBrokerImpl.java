package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.dom.broker.impl.Data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-dom-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-dom-broker-impl.yang</i>):
 * <pre>
 * case dom-broker-impl {
 *     container data {
 *         container transactions {
 *             leaf created {
 *                 type uint32;
 *             }
 *             leaf submitted {
 *                 type uint32;
 *             }
 *             leaf successful {
 *                 type uint32;
 *             }
 *             leaf failed {
 *                 type uint32;
 *             }
 *         }
 *         uses data-state;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-dom-broker-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl?revision=2013-10-28)dom-broker-impl</i>
 */
public interface DomBrokerImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.state.DomBrokerImpl>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl","2013-10-28","dom-broker-impl");;

    Data getData();

}

