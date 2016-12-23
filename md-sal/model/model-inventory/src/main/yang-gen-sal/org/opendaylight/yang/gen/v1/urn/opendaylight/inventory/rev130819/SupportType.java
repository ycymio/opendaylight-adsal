package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum SupportType {
    Native(0),
    
    Emulated(1),
    
    NotSupported(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, SupportType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, SupportType> b = com.google.common.collect.ImmutableMap.builder();
        for (SupportType enumItem : SupportType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private SupportType(int value) {
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
     * @return corresponding SupportType item
     */
    public static SupportType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
