package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum PortReason {
    Add(0),
    
    Delete(1),
    
    Update(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, PortReason> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PortReason> b = com.google.common.collect.ImmutableMap.builder();
        for (PortReason enumItem : PortReason.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private PortReason(int value) {
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
     * @return corresponding PortReason item
     */
    public static PortReason forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
