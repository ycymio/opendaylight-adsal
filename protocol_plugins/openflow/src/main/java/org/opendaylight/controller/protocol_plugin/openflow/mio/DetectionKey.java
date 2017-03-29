package org.opendaylight.controller.protocol_plugin.openflow.mio;

import java.util.Arrays;

public class DetectionKey {
    private byte[] dataLayerSource;
    private int networkSource;
    private int networkDestination;
    private Thread thread;

    //    private FirstThread threadOne;
    class FirstThread implements Runnable{
        private DetectionKey key;
        public FirstThread(DetectionKey key) {
            this.key = key;
        }
        public void run() {
            // check
            try {
                Thread.sleep(1000);
                // Do something.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("hello");
            }
        }
    }


    public DetectionKey(byte[] dataLayerSource, int sourceip, int destip) {
        super();
        this.dataLayerSource = dataLayerSource;
        this.networkSource = sourceip;
        this.networkDestination = destip;
        thread = new Thread(new FirstThread(this));
    }

    public byte[] getDataLayerSource() {
        return dataLayerSource;
    }
    public int getNetworkSource() {
        return networkSource;
    }
    public int getNetworkDestination() {
        return networkDestination;
    }
    public Thread getThread() {
        return thread;
    }
    @Override
    public String toString() {
        return "DetectionKey [dataLayerSource=" + Arrays.toString(dataLayerSource) + ", networkSource=" + networkSource
                + ", networkDestination=" + networkDestination + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(dataLayerSource);
        result = prime * result + networkDestination;
        result = prime * result + networkSource;
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
        if (!Arrays.equals(dataLayerSource, other.dataLayerSource))
            return false;
        if (networkDestination != other.networkDestination)
            return false;
        if (networkSource != other.networkSource)
            return false;
        return true;
    }


}
