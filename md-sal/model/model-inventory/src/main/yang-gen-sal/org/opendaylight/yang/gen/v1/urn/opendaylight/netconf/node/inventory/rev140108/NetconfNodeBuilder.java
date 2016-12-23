package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode
 */
public class NetconfNodeBuilder {

    private List<java.lang.String> _currentCapability;
    private List<java.lang.String> _initialCapability;
    private PassThrough _passThrough;
    private java.lang.Boolean _connected;


    public NetconfNodeBuilder() {
    } 
    
    public NetconfNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields arg) {
        this._connected = arg.isConnected();
        this._initialCapability = arg.getInitialCapability();
        this._currentCapability = arg.getCurrentCapability();
        this._passThrough = arg.getPassThrough();
    }

    public NetconfNodeBuilder(NetconfNode base) {
        this._currentCapability = base.getCurrentCapability();
        this._initialCapability = base.getInitialCapability();
        this._passThrough = base.getPassThrough();
        this._connected = base.isConnected();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields) {
            this._connected = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).isConnected();
            this._initialCapability = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getInitialCapability();
            this._currentCapability = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getCurrentCapability();
            this._passThrough = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getPassThrough();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields] \n" +
              "but was: " + arg
            );
        }
    }

    public List<java.lang.String> getCurrentCapability() {
        return _currentCapability;
    }
    
    public List<java.lang.String> getInitialCapability() {
        return _initialCapability;
    }
    
    public PassThrough getPassThrough() {
        return _passThrough;
    }
    
    public java.lang.Boolean isConnected() {
        return _connected;
    }

    public NetconfNodeBuilder setCurrentCapability(List<java.lang.String> value) {
        this._currentCapability = value;
        return this;
    }
    
    public NetconfNodeBuilder setInitialCapability(List<java.lang.String> value) {
        this._initialCapability = value;
        return this;
    }
    
    public NetconfNodeBuilder setPassThrough(PassThrough value) {
        this._passThrough = value;
        return this;
    }
    
    public NetconfNodeBuilder setConnected(java.lang.Boolean value) {
        this._connected = value;
        return this;
    }

    public NetconfNode build() {
        return new NetconfNodeImpl(this);
    }

    private static final class NetconfNodeImpl implements NetconfNode {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode.class;
        }

        private final List<java.lang.String> _currentCapability;
        private final List<java.lang.String> _initialCapability;
        private final PassThrough _passThrough;
        private final java.lang.Boolean _connected;


        private NetconfNodeImpl(NetconfNodeBuilder base) {
            this._currentCapability = base.getCurrentCapability();
            this._initialCapability = base.getInitialCapability();
            this._passThrough = base.getPassThrough();
            this._connected = base.isConnected();
        }

        @Override
        public List<java.lang.String> getCurrentCapability() {
            return _currentCapability;
        }
        
        @Override
        public List<java.lang.String> getInitialCapability() {
            return _initialCapability;
        }
        
        @Override
        public PassThrough getPassThrough() {
            return _passThrough;
        }
        
        @Override
        public java.lang.Boolean isConnected() {
            return _connected;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_currentCapability == null) ? 0 : _currentCapability.hashCode());
            result = prime * result + ((_initialCapability == null) ? 0 : _initialCapability.hashCode());
            result = prime * result + ((_passThrough == null) ? 0 : _passThrough.hashCode());
            result = prime * result + ((_connected == null) ? 0 : _connected.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode other = (org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode)obj;
            if (_currentCapability == null) {
                if (other.getCurrentCapability() != null) {
                    return false;
                }
            } else if(!_currentCapability.equals(other.getCurrentCapability())) {
                return false;
            }
            if (_initialCapability == null) {
                if (other.getInitialCapability() != null) {
                    return false;
                }
            } else if(!_initialCapability.equals(other.getInitialCapability())) {
                return false;
            }
            if (_passThrough == null) {
                if (other.getPassThrough() != null) {
                    return false;
                }
            } else if(!_passThrough.equals(other.getPassThrough())) {
                return false;
            }
            if (_connected == null) {
                if (other.isConnected() != null) {
                    return false;
                }
            } else if(!_connected.equals(other.isConnected())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NetconfNode [");
            boolean first = true;
        
            if (_currentCapability != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_currentCapability=");
                builder.append(_currentCapability);
             }
            if (_initialCapability != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_initialCapability=");
                builder.append(_initialCapability);
             }
            if (_passThrough != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_passThrough=");
                builder.append(_passThrough);
             }
            if (_connected != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connected=");
                builder.append(_connected);
             }
            return builder.append(']').toString();
        }
    }

}
