package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport;


/**
 * NETCONF over Transport Layer Security (TLS).
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * identity netconf-tls {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *     description
 *         "NETCONF over Transport Layer Security (TLS).";
 *     reference
 *         "RFC 5539: NETCONF over Transport Layer Security (TLS)";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-tls</i>
 */
public abstract class NetconfTls extends Transport
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","netconf-tls");;

    public NetconfTls() {
    
    
    }
    








}
