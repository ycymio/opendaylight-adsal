package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ContainerWithUses;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ListViaUses;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-augment-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-augment-test.yang</i>):
 * <pre>
 * grouping complex-from-grouping {
 *     container container-with-uses {
 *         leaf leaf-from-grouping {
 *             type string;
 *         }
 *         uses leaf-from-grouping;
 *     }
 *     list list-via-uses {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-augment-test/complex-from-grouping</i>
 */
public interface ComplexFromGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:augment","2014-07-09","complex-from-grouping");;

    ContainerWithUses getContainerWithUses();
    
    List<ListViaUses> getListViaUses();

}

