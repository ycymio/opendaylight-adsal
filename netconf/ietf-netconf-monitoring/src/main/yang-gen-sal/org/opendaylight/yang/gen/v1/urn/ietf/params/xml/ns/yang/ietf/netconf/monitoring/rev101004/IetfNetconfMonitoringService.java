package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.GetSchemaInput;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.GetSchemaOutput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * rpc get-schema {
 *     "This operation is used to retrieve a schema from the
 *            NETCONF server.
 *     
 *            Positive Response:
 *              The NETCONF server returns the requested schema.
 *     
 *            Negative Response:
 *              If requested schema does not exist, the <error-tag> is
 *              'invalid-value'.
 *     
 *              If more than one schema matches the requested parameters, the
 *              <error-tag> is 'operation-failed', and <error-app-tag> is
 *              'data-not-unique'.";
 *     input {
 *         leaf identifier {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         leaf format {
 *             type identityref;
 *         }
 *     }
 *     
 *     output {
 *         anyxml data;
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface IetfNetconfMonitoringService
    extends
    RpcService
{




    /**
     * This operation is used to retrieve a schema from the NETCONF server. Positive 
     * Response: The NETCONF server returns the requested schema. Negative Response: If
     * requested schema does not exist, the <error-tag> is 'invalid-value'. If more 
     * than one schema matches the requested parameters, the <error-tag> is 
     * 'operation-failed', and <error-app-tag> is 'data-not-unique'.
     */
    Future<RpcResult<GetSchemaOutput>> getSchema(GetSchemaInput input);

}

