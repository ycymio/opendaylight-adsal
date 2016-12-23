package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum QueueProperties {
    MinRate(0),
    
    MaxRate(1)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, QueueProperties> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, QueueProperties> b = com.google.common.collect.ImmutableMap.builder();
        for (QueueProperties enumItem : QueueProperties.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private QueueProperties(int value) {
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
     * @return corresponding QueueProperties item
     */
    public static QueueProperties forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
