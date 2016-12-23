package org.opendaylight.controller.config.yang.md.sal.rest.connector;
public class Get {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.math.BigInteger receivedRequests;

    public Get () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.math.BigInteger getReceivedRequests() {
        return receivedRequests;
    }

    public void setReceivedRequests(java.math.BigInteger receivedRequests) {
        this.receivedRequests = receivedRequests;
    }

}
