package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditional;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class InnerRunningDataAdditionalKey
 implements Identifier<InnerRunningDataAdditional> {
    private static final long serialVersionUID = 2889089099346509767L;
    final private java.lang.String _simpleString;

    public InnerRunningDataAdditionalKey(java.lang.String _simpleString) {
    
    
        this._simpleString = _simpleString;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InnerRunningDataAdditionalKey(InnerRunningDataAdditionalKey source) {
        this._simpleString = source._simpleString;
    }


    public java.lang.String getSimpleString() {
        return _simpleString;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_simpleString == null) ? 0 : _simpleString.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        InnerRunningDataAdditionalKey other = (InnerRunningDataAdditionalKey) obj;
        if (_simpleString == null) {
            if (other._simpleString != null) {
                return false;
            }
        } else if(!_simpleString.equals(other._simpleString)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.InnerRunningDataAdditionalKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_simpleString != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_simpleString=");
            builder.append(_simpleString);
         }
        return builder.append(']').toString();
    }



}
