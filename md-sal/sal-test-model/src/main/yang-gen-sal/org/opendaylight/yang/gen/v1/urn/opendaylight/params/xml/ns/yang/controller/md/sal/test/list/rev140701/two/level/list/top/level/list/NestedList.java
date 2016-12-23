package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.TopLevelList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedListKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * A list of service functions that compose the service chain
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-mdsal-list-test</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-mdsal-list-test.yang</i>):
 * <pre>
 * list nested-list {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf type {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-mdsal-list-test/two-level-list/top-level-list/nested-list</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedListBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedListKey
 */
public interface NestedList
    extends
    ChildOf<TopLevelList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.list.rev140701.two.level.list.top.level.list.NestedList>,
    Identifiable<NestedListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:list","2014-07-01","nested-list");;

    java.lang.String getName();
    
    /**
     * Mandatory type of list.
     */
    java.lang.String getType();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    NestedListKey getKey();

}

