package org.opendaylight.controller.config.yang.test.impl;
public class NotStateBean {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.util.List<org.opendaylight.controller.config.yang.test.impl.NotStateBeanInternal> notStateBeanInternal;

    private java.lang.String element;

    public NotStateBean () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.util.List<org.opendaylight.controller.config.yang.test.impl.NotStateBeanInternal> getNotStateBeanInternal() {
        return notStateBeanInternal;
    }

    public void setNotStateBeanInternal(java.util.List<org.opendaylight.controller.config.yang.test.impl.NotStateBeanInternal> notStateBeanInternal) {
        this.notStateBeanInternal = notStateBeanInternal;
    }

    public java.lang.String getElement() {
        return element;
    }

    public void setElement(java.lang.String element) {
        this.element = element;
    }

}
