package org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1.Datastore;
import org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1.Scope;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1
 */
public class CreateDataChangeEventSubscriptionInput1Builder {

    private Datastore _datastore;
    private Scope _scope;


    public CreateDataChangeEventSubscriptionInput1Builder() {
    } 

    public CreateDataChangeEventSubscriptionInput1Builder(CreateDataChangeEventSubscriptionInput1 base) {
        this._datastore = base.getDatastore();
        this._scope = base.getScope();
    }


    public Datastore getDatastore() {
        return _datastore;
    }
    
    public Scope getScope() {
        return _scope;
    }

    public CreateDataChangeEventSubscriptionInput1Builder setDatastore(Datastore value) {
        this._datastore = value;
        return this;
    }
    
    public CreateDataChangeEventSubscriptionInput1Builder setScope(Scope value) {
        this._scope = value;
        return this;
    }

    public CreateDataChangeEventSubscriptionInput1 build() {
        return new CreateDataChangeEventSubscriptionInput1Impl(this);
    }

    private static final class CreateDataChangeEventSubscriptionInput1Impl implements CreateDataChangeEventSubscriptionInput1 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1.class;
        }

        private final Datastore _datastore;
        private final Scope _scope;


        private CreateDataChangeEventSubscriptionInput1Impl(CreateDataChangeEventSubscriptionInput1Builder base) {
            this._datastore = base.getDatastore();
            this._scope = base.getScope();
        }

        @Override
        public Datastore getDatastore() {
            return _datastore;
        }
        
        @Override
        public Scope getScope() {
            return _scope;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_datastore == null) ? 0 : _datastore.hashCode());
            result = prime * result + ((_scope == null) ? 0 : _scope.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1 other = (org.opendaylight.yang.gen.v1.urn.sal.restconf.event.subscription.rev140708.CreateDataChangeEventSubscriptionInput1)obj;
            if (_datastore == null) {
                if (other.getDatastore() != null) {
                    return false;
                }
            } else if(!_datastore.equals(other.getDatastore())) {
                return false;
            }
            if (_scope == null) {
                if (other.getScope() != null) {
                    return false;
                }
            } else if(!_scope.equals(other.getScope())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("CreateDataChangeEventSubscriptionInput1 [");
            boolean first = true;
        
            if (_datastore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_datastore=");
                builder.append(_datastore);
             }
            if (_scope != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_scope=");
                builder.append(_scope);
             }
            return builder.append(']').toString();
        }
    }

}
