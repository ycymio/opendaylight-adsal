package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container.UnkeyedList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-test-store</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-sal-test-store.yang</i>):
 * <pre>
 * container unkeyed-container {
 *     list unkeyed-list {
 *         key     leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         uses name-value;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-test-store/lists/unkeyed-container</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainerBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainerBuilder
 */
public interface UnkeyedContainer
    extends
    ChildOf<Lists>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainer>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:store","2014-04-22","unkeyed-container");;

    List<UnkeyedList> getUnkeyedList();

}

