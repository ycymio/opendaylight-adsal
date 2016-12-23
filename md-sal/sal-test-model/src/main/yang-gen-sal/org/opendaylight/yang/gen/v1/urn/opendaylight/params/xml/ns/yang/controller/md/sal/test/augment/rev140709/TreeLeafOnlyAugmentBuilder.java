package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment
 */
public class TreeLeafOnlyAugmentBuilder {

    private java.lang.String _simpleValue;


    public TreeLeafOnlyAugmentBuilder() {
    } 

    public TreeLeafOnlyAugmentBuilder(TreeLeafOnlyAugment base) {
        this._simpleValue = base.getSimpleValue();
    }


    public java.lang.String getSimpleValue() {
        return _simpleValue;
    }

    public TreeLeafOnlyAugmentBuilder setSimpleValue(java.lang.String value) {
        this._simpleValue = value;
        return this;
    }

    public TreeLeafOnlyAugment build() {
        return new TreeLeafOnlyAugmentImpl(this);
    }

    private static final class TreeLeafOnlyAugmentImpl implements TreeLeafOnlyAugment {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment.class;
        }

        private final java.lang.String _simpleValue;


        private TreeLeafOnlyAugmentImpl(TreeLeafOnlyAugmentBuilder base) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeLeafOnlyAugment)obj;
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TreeLeafOnlyAugment [");
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
