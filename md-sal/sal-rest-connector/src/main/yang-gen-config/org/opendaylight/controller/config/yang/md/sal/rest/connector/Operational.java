package org.opendaylight.controller.config.yang.md.sal.rest.connector;
public class Operational {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private org.opendaylight.controller.config.yang.md.sal.rest.connector.Get get;

    public Operational () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Get getGet() {
        return get;
    }

    public void setGet(org.opendaylight.controller.config.yang.md.sal.rest.connector.Get get) {
        this.get = get;
    }

}
