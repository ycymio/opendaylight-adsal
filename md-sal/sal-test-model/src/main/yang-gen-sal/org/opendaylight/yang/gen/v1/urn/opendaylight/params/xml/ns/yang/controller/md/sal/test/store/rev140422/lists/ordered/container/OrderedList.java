package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.NameValue;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedListKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.OrderedContainer;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-test-store</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-sal-test-store.yang</i>):
 * <pre>
 * list ordered-list {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     uses name-value;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-test-store/lists/ordered-container/ordered-list</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedListBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedListKey
 */
public interface OrderedList
    extends
    ChildOf<OrderedContainer>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.ordered.container.OrderedList>,
    NameValue,
    Identifiable<OrderedListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:store","2014-04-22","ordered-list");;

    /**
     * Returns Primary Key of Yang List Type
     */
    OrderedListKey getKey();

}

