package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.rpc.routing.rev140701;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-test-routed-rpc</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-test-routed-rpc.yang</i>):
 * <pre>
 * grouping route-in-grouping {
 *     leaf route {
 *         type instance-identifier;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-test-routed-rpc/route-in-grouping</i>
 */
public interface RouteInGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:rpc:routing","2014-07-01","route-in-grouping");;

    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.rpc.routing.rev140701.TestContext.class
    )
    InstanceIdentifier<?> getRoute();

}

