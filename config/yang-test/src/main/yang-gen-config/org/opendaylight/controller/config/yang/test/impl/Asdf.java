package org.opendaylight.controller.config.yang.test.impl;
public class Asdf {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Integer simpleInt;

    private java.lang.String simpleString;

    public Asdf () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Integer getSimpleInt() {
        return simpleInt;
    }

    public void setSimpleInt(java.lang.Integer simpleInt) {
        this.simpleInt = simpleInt;
    }

    public java.lang.String getSimpleString() {
        return simpleString;
    }

    public void setSimpleString(java.lang.String simpleString) {
        this.simpleString = simpleString;
    }

}
