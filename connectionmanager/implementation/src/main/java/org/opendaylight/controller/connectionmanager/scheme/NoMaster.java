package org.opendaylight.controller.connectionmanager.scheme;

import org.opendaylight.controller.clustering.services.IClusterGlobalServices;
import org.opendaylight.controller.connectionmanager.ConnectionMgmtScheme;
import org.opendaylight.controller.sal.core.Node;

class NoMaster extends AbstractScheme {
    private static AbstractScheme myScheme= null;

    protected NoMaster(IClusterGlobalServices clusterServices) {
        super(clusterServices, ConnectionMgmtScheme.NO_MASTER);
    }

    public static AbstractScheme getScheme(IClusterGlobalServices clusterServices) {
        if (myScheme == null) {
            myScheme = new NoMaster(clusterServices);
        }
        return myScheme;
    }

    @Override
    public boolean isConnectionAllowedInternal(Node node) {
        return false;
    }
}
