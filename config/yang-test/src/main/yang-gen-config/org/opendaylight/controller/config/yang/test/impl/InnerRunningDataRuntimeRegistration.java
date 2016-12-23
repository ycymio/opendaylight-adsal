package org.opendaylight.controller.config.yang.test.impl;
public class InnerRunningDataRuntimeRegistration implements java.io.Closeable {
    private final java.util.Map<java.lang.String,java.util.concurrent.atomic.AtomicInteger> unkeyedMap = new java.util.HashMap<java.lang.String,java.util.concurrent.atomic.AtomicInteger>();

    private final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration;

    public synchronized org.opendaylight.controller.config.yang.test.impl.InnerInnerRunningDataRuntimeRegistration register(final InnerInnerRunningDataRuntimeMXBean bean) {
        String key = "InnerInnerRunningData"; //TODO: check for conflicts
        String value = String.valueOf(bean.getSimpleInt3());
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration r = registration.register(key, value, bean);
        return new org.opendaylight.controller.config.yang.test.impl.InnerInnerRunningDataRuntimeRegistration(r);
    }

    @Override
    public void close() {
        registration.close();
    }

    public  InnerRunningDataRuntimeRegistration(final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration) {
        this.registration=registration;

    }

}
