package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-augment-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-augment-test.yang</i>):
 * <pre>
 * container container-with-uses {
 *     leaf leaf-from-grouping {
 *         type string;
 *     }
 *     uses leaf-from-grouping;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-augment-test/complex-from-grouping/container-with-uses</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ContainerWithUsesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ContainerWithUsesBuilder
 */
public interface ContainerWithUses
    extends
    ChildOf<ComplexFromGrouping>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ContainerWithUses>,
    LeafFromGrouping
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:augment","2014-07-09","container-with-uses");;


}

