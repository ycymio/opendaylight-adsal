package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.rest.connector.rev140724;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.math.BigInteger;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-rest-connector</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-rest-connector.yang</i>):
 * <pre>
 * grouping statistics {
 *     leaf received-requests {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-rest-connector/statistics</i>
 */
public interface Statistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:rest:connector","2014-07-24","statistics");;

    BigInteger getReceivedRequests();

}

