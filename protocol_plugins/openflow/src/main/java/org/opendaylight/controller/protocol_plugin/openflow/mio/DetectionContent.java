package org.opendaylight.controller.protocol_plugin.openflow.mio;

import org.openflow.protocol.OFMatch;

public class DetectionContent {
    private OFMatch match;
    private long switchID;
    private int xid;
    public DetectionContent(OFMatch match, long switchID, int xid) {
        this.match = match;
        this.switchID = switchID;
        this.xid = xid;
    }

    public OFMatch getMatch() {
        return match;
    }
    public void setMatch(OFMatch match) {
        this.match = match;
    }
    public long getSwitchID() {
        return switchID;
    }
    public void setSwitchID(long switchID) {
        this.switchID = switchID;
    }
    public int getXid() {
        return xid;
    }
    public void setXid(int xid) {
        this.xid = xid;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime * result + (int) (switchID ^ (switchID >>> 32));
        result = prime * result + xid;
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
        DetectionContent other = (DetectionContent) obj;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if (switchID != other.switchID)
            return false;
        if (xid != other.xid)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "DetectionContent [match=" + match + ", switchID=" + switchID + ", xid=" + xid + "]";
    }
}
