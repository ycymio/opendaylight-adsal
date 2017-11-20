package org.opendaylight.controller.connectionmanager.loadbalanced;

import java.util.Map;

public class ControllerStateInCluster {
	private long packetInAvailable;
	private Map<Long, Long> rtt;
	private long timeStamp; // minimal interval between migration
	
	public ControllerStateInCluster(long packetIns, Map<Long, Long> rtt) {
		this.packetInAvailable = packetIns;
		this.rtt = rtt;
		timeStamp = 0L;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public long getPacketInAvailable() {
		return packetInAvailable;
	}

	public Map<Long, Long> getRtt() {
		return rtt;
	}

	@Override
	public String toString() {
		return "ControllerStateInCluster [packetInAvailable=" + packetInAvailable + ", rtt="
				+ rtt + ", timeStamp=" + timeStamp + "]";
	}
}
