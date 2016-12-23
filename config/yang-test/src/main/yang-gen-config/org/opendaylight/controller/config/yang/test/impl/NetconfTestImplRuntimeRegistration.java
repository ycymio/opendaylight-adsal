package org.opendaylight.controller.config.yang.test.impl;
public class NetconfTestImplRuntimeRegistration implements java.io.Closeable {
    private final java.util.Map<java.lang.String,java.util.concurrent.atomic.AtomicInteger> unkeyedMap = new java.util.HashMap<java.lang.String,java.util.concurrent.atomic.AtomicInteger>();

    private final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration;

    public synchronized org.opendaylight.controller.config.yang.test.impl.InnerRunningDataAdditionalRuntimeRegistration register(final InnerRunningDataAdditionalRuntimeMXBean bean) {
        String key = "InnerRunningDataAdditional"; //TODO: check for conflicts
        String value = String.valueOf(bean.getSimpleString());
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration r = registration.register(key, value, bean);
        return new org.opendaylight.controller.config.yang.test.impl.InnerRunningDataAdditionalRuntimeRegistration(r);
    }

    public synchronized org.opendaylight.controller.config.yang.test.impl.InnerRunningDataRuntimeRegistration register(final InnerRunningDataRuntimeMXBean bean) {
        String key = "InnerRunningData"; //TODO: check for conflicts
        String value = String.valueOf(bean.getSimpleInt3());
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration r = registration.register(key, value, bean);
        return new org.opendaylight.controller.config.yang.test.impl.InnerRunningDataRuntimeRegistration(r);
    }

    @Override
    public void close() {
        registration.close();
    }

    public  NetconfTestImplRuntimeRegistration(final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration) {
        this.registration=registration;

    }

}
