package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum GroupCapabilities {
    SelectWeight(0),
    
    SelectLiveness(1),
    
    Chaining(2),
    
    ChainingChecks(3)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, GroupCapabilities> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, GroupCapabilities> b = com.google.common.collect.ImmutableMap.builder();
        for (GroupCapabilities enumItem : GroupCapabilities.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private GroupCapabilities(int value) {
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
     * @return corresponding GroupCapabilities item
     */
    public static GroupCapabilities forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
