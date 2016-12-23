package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment
 */
public class RpcLeafOnlyAugmentBuilder {

    private java.lang.String _simpleValue;


    public RpcLeafOnlyAugmentBuilder() {
    } 

    public RpcLeafOnlyAugmentBuilder(RpcLeafOnlyAugment base) {
        this._simpleValue = base.getSimpleValue();
    }


    public java.lang.String getSimpleValue() {
        return _simpleValue;
    }

    public RpcLeafOnlyAugmentBuilder setSimpleValue(java.lang.String value) {
        this._simpleValue = value;
        return this;
    }

    public RpcLeafOnlyAugment build() {
        return new RpcLeafOnlyAugmentImpl(this);
    }

    private static final class RpcLeafOnlyAugmentImpl implements RpcLeafOnlyAugment {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment.class;
        }

        private final java.lang.String _simpleValue;


        private RpcLeafOnlyAugmentImpl(RpcLeafOnlyAugmentBuilder base) {
            this._simpleValue = base.getSimpleValue();
        }

        @Override
        public java.lang.String getSimpleValue() {
            return _simpleValue;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_simpleValue == null) ? 0 : _simpleValue.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyAugment)obj;
            if (_simpleValue == null) {
                if (other.getSimpleValue() != null) {
                    return false;
                }
            } else if(!_simpleValue.equals(other.getSimpleValue())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RpcLeafOnlyAugment [");
            boolean first = true;
        
            if (_simpleValue != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleValue=");
                builder.append(_simpleValue);
             }
            return builder.append(']').toString();
        }
    }

}
