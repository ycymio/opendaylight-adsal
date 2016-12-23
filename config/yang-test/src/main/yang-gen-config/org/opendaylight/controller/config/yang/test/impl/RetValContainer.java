package org.opendaylight.controller.config.yang.test.impl;
public class RetValContainer {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Long v2;

    private java.lang.String v1 = "from rpc";

    public RetValContainer () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Long getV2() {
        return v2;
    }

    public void setV2(java.lang.Long v2) {
        this.v2 = v2;
    }

    public java.lang.String getV1() {
        return v1;
    }

    public void setV1(java.lang.String v1) {
        this.v1 = v1;
    }

}
