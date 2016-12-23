package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.inmemory.datastore.provider.rev140617;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inmemory-datastore-provider</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inmemory-datastore-provider.yang</i>):
 * <pre>
 * grouping datastore-configuration {
 *     leaf max-data-change-executor-queue-size {
 *         type uint16;
 *     }
 *     leaf max-data-change-executor-pool-size {
 *         type uint16;
 *     }
 *     leaf max-data-change-listener-queue-size {
 *         type uint16;
 *     }
 *     leaf max-data-store-executor-queue-size {
 *         type uint16;
 *     }
 *     leaf debug-transactions {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inmemory-datastore-provider/datastore-configuration</i>
 */
public interface DatastoreConfiguration
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:inmemory-datastore-provider","2014-06-17","datastore-configuration");;

    /**
     * The maximum queue size for the data change notification executor.
     */
    java.lang.Integer getMaxDataChangeExecutorQueueSize();
    
    /**
     * The maximum thread pool size for the data change notification executor.
     */
    java.lang.Integer getMaxDataChangeExecutorPoolSize();
    
    /**
     * The maximum queue size for the data change listeners.
     */
    java.lang.Integer getMaxDataChangeListenerQueueSize();
    
    /**
     * The maximum queue size for the data store executor.
     */
    java.lang.Integer getMaxDataStoreExecutorQueueSize();
    
    /**
     * Enable transaction lifecycle debugging.
     */
    java.lang.Boolean isDebugTransactions();

}

