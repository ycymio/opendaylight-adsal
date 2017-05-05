package my.flowinstall;

public class routePair {
    private long snode;
    private long dnode;
    
    public routePair(long snode, long dnode) {
        super();
        this.snode = snode;
        this.dnode = dnode;
    }
    
    @Override
    public String toString() {
        return "routePair [snode=" + snode + ", dnode=" + dnode + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (dnode ^ (dnode >>> 32));
        result = prime * result + (int) (snode ^ (snode >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        routePair other = (routePair) obj;
        if (dnode != other.dnode)
            return false;
        if (snode != other.snode)
            return false;
        return true;
    }
    

}
