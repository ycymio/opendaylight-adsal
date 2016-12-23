package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Node1} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Node1
 */
public class Node1Builder {



    public Node1Builder() {
    } 

    public Node1Builder(Node1 base) {
    }




    public Node1 build() {
        return new Node1Impl(this);
    }

    private static final class Node1Impl implements Node1 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Node1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Node1.class;
        }



        private Node1Impl(Node1Builder base) {
        }



        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Node1 [");
            boolean first = true;
        
            return builder.append(']').toString();
        }
    }

}
