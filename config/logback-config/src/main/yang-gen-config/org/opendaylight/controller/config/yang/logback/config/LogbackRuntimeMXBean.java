package org.opendaylight.controller.config.yang.logback.config;
public interface LogbackRuntimeMXBean extends org.opendaylight.controller.config.api.runtime.RuntimeBean {
    public java.util.List<org.opendaylight.controller.config.yang.logback.config.StatusTO> getStatusTO();

    public void reset();

}
