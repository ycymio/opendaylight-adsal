package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.NameValue;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainer;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-test-store</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-sal-test-store.yang</i>):
 * <pre>
 * list unkeyed-list {
 *     key     leaf name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     uses name-value;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-test-store/lists/unkeyed-container/unkeyed-list</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container.UnkeyedListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container.UnkeyedListBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container.UnkeyedListKey
 */
public interface UnkeyedList
    extends
    ChildOf<UnkeyedContainer>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.unkeyed.container.UnkeyedList>,
    NameValue
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:store","2014-04-22","unkeyed-list");;


}

