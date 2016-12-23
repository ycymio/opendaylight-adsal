package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ContainerWithUses;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.complex.from.grouping.ListViaUses;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment
 */
public class RpcComplexUsesAugmentBuilder {

    private ContainerWithUses _containerWithUses;
    private List<ListViaUses> _listViaUses;


    public RpcComplexUsesAugmentBuilder() {
    } 
    
    public RpcComplexUsesAugmentBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping arg) {
        this._containerWithUses = arg.getContainerWithUses();
        this._listViaUses = arg.getListViaUses();
    }

    public RpcComplexUsesAugmentBuilder(RpcComplexUsesAugment base) {
        this._containerWithUses = base.getContainerWithUses();
        this._listViaUses = base.getListViaUses();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping) {
            this._containerWithUses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping)arg).getContainerWithUses();
            this._listViaUses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping)arg).getListViaUses();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.ComplexFromGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public ContainerWithUses getContainerWithUses() {
        return _containerWithUses;
    }
    
    public List<ListViaUses> getListViaUses() {
        return _listViaUses;
    }

    public RpcComplexUsesAugmentBuilder setContainerWithUses(ContainerWithUses value) {
        this._containerWithUses = value;
        return this;
    }
    
    public RpcComplexUsesAugmentBuilder setListViaUses(List<ListViaUses> value) {
        this._listViaUses = value;
        return this;
    }

    public RpcComplexUsesAugment build() {
        return new RpcComplexUsesAugmentImpl(this);
    }

    private static final class RpcComplexUsesAugmentImpl implements RpcComplexUsesAugment {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment.class;
        }

        private final ContainerWithUses _containerWithUses;
        private final List<ListViaUses> _listViaUses;


        private RpcComplexUsesAugmentImpl(RpcComplexUsesAugmentBuilder base) {
            this._containerWithUses = base.getContainerWithUses();
            this._listViaUses = base.getListViaUses();
        }

        @Override
        public ContainerWithUses getContainerWithUses() {
            return _containerWithUses;
        }
        
        @Override
        public List<ListViaUses> getListViaUses() {
            return _listViaUses;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_containerWithUses == null) ? 0 : _containerWithUses.hashCode());
            result = prime * result + ((_listViaUses == null) ? 0 : _listViaUses.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.augment.rev140709.RpcComplexUsesAugment)obj;
            if (_containerWithUses == null) {
                if (other.getContainerWithUses() != null) {
                    return false;
                }
            } else if(!_containerWithUses.equals(other.getContainerWithUses())) {
                return false;
            }
            if (_listViaUses == null) {
                if (other.getListViaUses() != null) {
                    return false;
                }
            } else if(!_listViaUses.equals(other.getListViaUses())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("RpcComplexUsesAugment [");
            boolean first = true;
        
            if (_containerWithUses != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerWithUses=");
                builder.append(_containerWithUses);
             }
            if (_listViaUses != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_listViaUses=");
                builder.append(_listViaUses);
             }
            return builder.append(']').toString();
        }
    }

}
