package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum GroupTypes {
    GroupAll(0),
    
    GroupSelect(1),
    
    GroupIndirect(2),
    
    GroupFf(3)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, GroupTypes> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, GroupTypes> b = com.google.common.collect.ImmutableMap.builder();
        for (GroupTypes enumItem : GroupTypes.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private GroupTypes(int value) {
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
     * @return corresponding GroupTypes item
     */
    public static GroupTypes forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
