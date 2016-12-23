package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1
 */
public class Topology1Builder {



    public Topology1Builder() {
    } 

    public Topology1Builder(Topology1 base) {
    }




    public Topology1 build() {
        return new Topology1Impl(this);
    }

    private static final class Topology1Impl implements Topology1 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.Topology1.class;
        }



        private Topology1Impl(Topology1Builder base) {
        }



        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Topology1 [");
            boolean first = true;
        
            return builder.append(']').toString();
        }
    }

}
