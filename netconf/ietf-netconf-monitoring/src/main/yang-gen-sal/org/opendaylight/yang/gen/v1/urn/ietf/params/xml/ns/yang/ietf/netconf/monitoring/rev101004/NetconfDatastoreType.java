package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 */
public enum NetconfDatastoreType {
    Running(0),
    
    Candidate(1),
    
    Startup(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, NetconfDatastoreType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NetconfDatastoreType> b = com.google.common.collect.ImmutableMap.builder();
        for (NetconfDatastoreType enumItem : NetconfDatastoreType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private NetconfDatastoreType(int value) {
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
     * @return corresponding NetconfDatastoreType item
     */
    public static NetconfDatastoreType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
