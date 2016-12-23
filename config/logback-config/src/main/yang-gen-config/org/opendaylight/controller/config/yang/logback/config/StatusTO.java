package org.opendaylight.controller.config.yang.logback.config;
public class StatusTO {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Long date;

    private java.lang.String message;

    private java.lang.String level;

    public StatusTO () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Long getDate() {
        return date;
    }

    public void setDate(java.lang.Long date) {
        this.date = date;
    }

    public java.lang.String getMessage() {
        return message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public java.lang.String getLevel() {
        return level;
    }

    public void setLevel(java.lang.String level) {
        this.level = level;
    }

}
