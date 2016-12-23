package org.opendaylight.controller.config.yang.md.sal.rest.connector;
public interface RestConnectorRuntimeMXBean extends org.opendaylight.controller.config.api.runtime.RuntimeBean {
    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Rpcs getRpcs();

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Config getConfig();

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Operational getOperational();

}
