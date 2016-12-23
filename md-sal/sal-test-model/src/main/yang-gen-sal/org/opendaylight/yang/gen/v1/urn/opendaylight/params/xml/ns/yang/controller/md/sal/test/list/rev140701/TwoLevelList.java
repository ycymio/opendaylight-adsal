package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-list-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-list-test.yang</i>):
 * <pre>
 * grouping two-level-list {
 *     list top-level-list {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list nested-list {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-list-test/two-level-list</i>
 */
public interface TwoLevelList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list","2014-07-01","two-level-list");;

    /**
     * Top Level List
     */
    List<TopLevelList> getTopLevelList();

}

