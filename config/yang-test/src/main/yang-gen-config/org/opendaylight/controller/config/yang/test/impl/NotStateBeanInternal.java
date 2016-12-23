package org.opendaylight.controller.config.yang.test.impl;
public class NotStateBeanInternal {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.String element2;

    public NotStateBeanInternal () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.String getElement2() {
        return element2;
    }

    public void setElement2(java.lang.String element2) {
        this.element2 = element2;
    }

}
