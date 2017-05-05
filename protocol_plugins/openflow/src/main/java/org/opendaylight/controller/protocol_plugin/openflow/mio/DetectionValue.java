package org.opendaylight.controller.protocol_plugin.openflow.mio;

public class DetectionValue {
    private long switchID;
    private short port;

    public DetectionValue(long switchID, short port) {
        this.switchID = switchID;
        this.port = port;
    }
    public long getSwitchID() {
        return switchID;
    }
    public short getPort() {
        return port;
    }
    @Override
    public String toString() {
        return "DetectionValue [switchID=" + switchID + ", port=" + port + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + port;
        result = prime * result + (int) (switchID ^ (switchID >>> 32));
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
        DetectionValue other = (DetectionValue) obj;
//        if (this.port != other.port)
//            return false;
        if (this.switchID != other.switchID)
            return false;
        return true;
    }
}
