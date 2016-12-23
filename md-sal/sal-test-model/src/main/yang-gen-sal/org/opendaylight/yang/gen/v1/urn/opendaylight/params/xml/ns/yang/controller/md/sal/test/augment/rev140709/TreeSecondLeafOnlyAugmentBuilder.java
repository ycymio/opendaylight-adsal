package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment
 */
public class TreeSecondLeafOnlyAugmentBuilder {

    private java.lang.String _secondSimpleValue;


    public TreeSecondLeafOnlyAugmentBuilder() {
    } 

    public TreeSecondLeafOnlyAugmentBuilder(TreeSecondLeafOnlyAugment base) {
        this._secondSimpleValue = base.getSecondSimpleValue();
    }


    public java.lang.String getSecondSimpleValue() {
        return _secondSimpleValue;
    }

    public TreeSecondLeafOnlyAugmentBuilder setSecondSimpleValue(java.lang.String value) {
        this._secondSimpleValue = value;
        return this;
    }

    public TreeSecondLeafOnlyAugment build() {
        return new TreeSecondLeafOnlyAugmentImpl(this);
    }

    private static final class TreeSecondLeafOnlyAugmentImpl implements TreeSecondLeafOnlyAugment {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment.class;
        }

        private final java.lang.String _secondSimpleValue;


        private TreeSecondLeafOnlyAugmentImpl(TreeSecondLeafOnlyAugmentBuilder base) {
            this._secondSimpleValue = base.getSecondSimpleValue();
        }

        @Override
        public java.lang.String getSecondSimpleValue() {
            return _secondSimpleValue;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_secondSimpleValue == null) ? 0 : _secondSimpleValue.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.TreeSecondLeafOnlyAugment)obj;
            if (_secondSimpleValue == null) {
                if (other.getSecondSimpleValue() != null) {
                    return false;
                }
            } else if(!_secondSimpleValue.equals(other.getSecondSimpleValue())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("TreeSecondLeafOnlyAugment [");
            boolean first = true;
        
            if (_secondSimpleValue != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_secondSimpleValue=");
                builder.append(_secondSimpleValue);
             }
            return builder.append(']').toString();
        }
    }

}
