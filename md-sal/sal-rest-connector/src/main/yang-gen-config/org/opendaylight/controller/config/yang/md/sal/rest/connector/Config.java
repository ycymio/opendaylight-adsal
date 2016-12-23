package org.opendaylight.controller.config.yang.md.sal.rest.connector;
public class Config {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private org.opendaylight.controller.config.yang.md.sal.rest.connector.Post post;

    private org.opendaylight.controller.config.yang.md.sal.rest.connector.Put put;

    private org.opendaylight.controller.config.yang.md.sal.rest.connector.Get get;

    public Config () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Post getPost() {
        return post;
    }

    public void setPost(org.opendaylight.controller.config.yang.md.sal.rest.connector.Post post) {
        this.post = post;
    }

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Put getPut() {
        return put;
    }

    public void setPut(org.opendaylight.controller.config.yang.md.sal.rest.connector.Put put) {
        this.put = put;
    }

    public org.opendaylight.controller.config.yang.md.sal.rest.connector.Get getGet() {
        return get;
    }

    public void setGet(org.opendaylight.controller.config.yang.md.sal.rest.connector.Get get) {
        this.get = get;
    }

}
