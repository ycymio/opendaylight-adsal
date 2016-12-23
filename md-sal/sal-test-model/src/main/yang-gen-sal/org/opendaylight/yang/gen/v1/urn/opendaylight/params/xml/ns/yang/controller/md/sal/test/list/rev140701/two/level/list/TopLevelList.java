package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelListKey;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.TwoLevelList;


/**
 * Top Level List
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-list-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-list-test.yang</i>):
 * <pre>
 * list top-level-list {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list nested-list {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf type {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-list-test/two-level-list/top-level-list</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelListBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelListKey
 */
public interface TopLevelList
    extends
    ChildOf<TwoLevelList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelList>,
    Identifiable<TopLevelListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list","2014-07-01","top-level-list");;

    java.lang.String getName();
    
    /**
     * A list of service functions that compose the service chain
     */
    List<NestedList> getNestedList();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    TopLevelListKey getKey();

}

