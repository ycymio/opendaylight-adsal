package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-augment-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-augment-test.yang</i>):
 * <pre>
 * grouping leaf-from-grouping {
 *     leaf leaf-from-grouping {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-augment-test/leaf-from-grouping</i>
 */
public interface LeafFromGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:augment","2014-07-09","leaf-from-grouping");;

    java.lang.String getLeafFromGrouping();

}

