package org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.CreateDataChangeEventSubscriptionInput;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentation;


public interface CreateDataChangeEventSubscriptionInput1
    extends
    DataObject,
    Augmentation<CreateDataChangeEventSubscriptionInput>
{


    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Datastore {
        OPERATIONAL(0),
        
        CONFIGURATION(1)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, Datastore> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Datastore> b = com.google.common.collect.ImmutableMap.builder();
            for (Datastore enumItem : Datastore.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private Datastore(int value) {
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
         * @return corresponding Datastore item
         */
        public static Datastore forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    /**
     * The enumeration built-in type represents values from a set of assigned names.
     */
    public enum Scope {
        BASE(0),
        
        ONE(1),
        
        SUBTREE(2)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, Scope> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Scope> b = com.google.common.collect.ImmutableMap.builder();
            for (Scope enumItem : Scope.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private Scope(int value) {
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
         * @return corresponding Scope item
         */
        public static Scope forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }


    Datastore getDatastore();
    
    Scope getScope();

}

