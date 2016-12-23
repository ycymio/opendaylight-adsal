package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * When the underlying node is connected, its NETCONF context is available verbatim
 * under this container through the mount extension.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>netconf-node-inventory</b>
 * <br />(Source path: <i>META-INF\yang\netconf-node-inventory.yang</i>):
 * <pre>
 * container pass-through {
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>netconf-node-inventory/netconf-node-fields/pass-through</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThroughBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThroughBuilder
 */
public interface PassThrough
    extends
    ChildOf<NetconfNodeFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:netconf-node-inventory","2014-01-08","pass-through");;


}

