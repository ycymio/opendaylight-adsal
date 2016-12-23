package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment
 */
public class RpcLeafOnlyUsesAugmentBuilder {

    private java.lang.String _leafFromGrouping;


    public RpcLeafOnlyUsesAugmentBuilder() {
    } 
    
    public RpcLeafOnlyUsesAugmentBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping arg) {
        this._leafFromGrouping = arg.getLeafFromGrouping();
    }

    public RpcLeafOnlyUsesAugmentBuilder(RpcLeafOnlyUsesAugment base) {
        this._leafFromGrouping = base.getLeafFromGrouping();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping) {
            this._leafFromGrouping = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping)arg).getLeafFromGrouping();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.LeafFromGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getLeafFromGrouping() {
        return _leafFromGrouping;
    }

    public RpcLeafOnlyUsesAugmentBuilder setLeafFromGrouping(java.lang.String value) {
        this._leafFromGrouping = value;
        return this;
    }

    public RpcLeafOnlyUsesAugment build() {
        return new RpcLeafOnlyUsesAugmentImpl(this);
    }

    private static final class RpcLeafOnlyUsesAugmentImpl implements RpcLeafOnlyUsesAugment {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment.class;
        }

        private final java.lang.String _leafFromGrouping;


        private RpcLeafOnlyUsesAugmentImpl(RpcLeafOnlyUsesAugmentBuilder base) {
            this._leafFromGrouping = base.getLeafFromGrouping();
        }

        @Override
        public java.lang.String getLeafFromGrouping() {
            return _leafFromGrouping;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_leafFromGrouping == null) ? 0 : _leafFromGrouping.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcLeafOnlyUsesAugment)obj;
            if (_leafFromGrouping == null) {
                if (other.getLeafFromGrouping() != null) {
                    return false;
                }
            } else if(!_leafFromGrouping.equals(other.getLeafFromGrouping())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RpcLeafOnlyUsesAugment [");
            boolean first = true;
        
            if (_leafFromGrouping != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_leafFromGrouping=");
                builder.append(_leafFromGrouping);
             }
            return builder.append(']').toString();
        }
    }

}
