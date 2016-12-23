package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum OutputPortValues {
    MAX(1),
    
    INPORT(2),
    
    TABLE(3),
    
    NORMAL(4),
    
    FLOOD(5),
    
    ALL(6),
    
    CONTROLLER(7),
    
    LOCAL(8),
    
    ANY(9),
    
    NONE(10)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, OutputPortValues> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OutputPortValues> b = com.google.common.collect.ImmutableMap.builder();
        for (OutputPortValues enumItem : OutputPortValues.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private OutputPortValues(int value) {
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
     * @return corresponding OutputPortValues item
     */
    public static OutputPortValues forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
