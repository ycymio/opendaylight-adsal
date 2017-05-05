package org.opendaylight.controller.protocol_plugin.openflow.mio;

import java.util.Arrays;

import org.opendaylight.controller.protocol_plugin.openflow.mio.DetectionDetail.shortWaitThread;

public class DetectionKey {
//    private byte[] dataLayerSource;
    private short port;
    private int networkSource;
    private int networkDestination;

    public int getNetworkSource() {
        return networkSource;
    }
    public int getNetworkDestination() {
        return networkDestination;
    }
    public short getPort() {
        return port;
    }
    @Override
    public String toString() {
        return "DetectionKey [port=" + port + ", networkSource=" + networkSource + ", networkDestination="
                + networkDestination + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + networkDestination;
        result = prime * result + networkSource;
        result = prime * result + port;
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
        DetectionKey other = (DetectionKey) obj;
        if (networkDestination != other.networkDestination)
            return false;
        if (networkSource != other.networkSource)
            return false;
        if (port != other.port)
            return false;
        return true;
    }
    public DetectionKey(short port, int networkSource, int networkDestination) {
        super();
        this.port = port;
        this.networkSource = networkSource;
        this.networkDestination = networkDestination;
    }

}
