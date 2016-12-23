package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum ExtendEnum {
    ONE(0),
    
    TWO(1)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, ExtendEnum> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ExtendEnum> b = com.google.common.collect.ImmutableMap.builder();
        for (ExtendEnum enumItem : ExtendEnum.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private ExtendEnum(int value) {
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
     * @return corresponding ExtendEnum item
     */
    public static ExtendEnum forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
