package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.DataChangedNotification;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventKey;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sal-remote</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-md-sal-remote.yang</i>):
 * <pre>
 * list data-change-event {
 *     key "path"
 *     leaf path {
 *         type instance-identifier;
 *     }
 *     leaf store {
 *         type enumeration;
 *     }
 *     leaf operation {
 *         type enumeration;
 *     }
 *     anyxml data;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sal-remote/data-changed-notification/data-change-event</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventKey
 */
public interface DataChangeEvent
    extends
    ChildOf<DataChangedNotification>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>,
    Identifiable<DataChangeEventKey>
{


    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Store {
        Config(0),
        
        Operation(1)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, Store> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Store> b = com.google.common.collect.ImmutableMap.builder();
            for (Store enumItem : Store.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private Store(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding Store item
         */
        public static Store forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Operation {
        Created(0),
        
        Updated(1),
        
        Deleted(2)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, Operation> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Operation> b = com.google.common.collect.ImmutableMap.builder();
            for (Operation enumItem : Operation.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private Operation(int value) {
            this.value = value;
        }
        
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding Operation item
         */
        public static Operation forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:remote","2014-01-14","data-change-event");;

    InstanceIdentifier<?> getPath();
    
    Store getStore();
    
    Operation getOperation();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    DataChangeEventKey getKey();

}

