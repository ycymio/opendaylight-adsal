package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.Transport;


/**
 * NETCONF over Simple Object Access Protocol (SOAP) over Blocks Extensible 
 * Exchange Protocol (BEEP).
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * identity netconf-soap-over-beep {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *     description
 *         "NETCONF over Simple Object Access Protocol (SOAP) over
 *                Blocks Extensible Exchange Protocol (BEEP).";
 *     reference
 *         "RFC 4743: Using NETCONF over the Simple Object
 *                 	  Access Protocol (SOAP)";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/netconf-soap-over-beep</i>
 */
public abstract class NetconfSoapOverBeep extends Transport
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","netconf-soap-over-beep");;

    public NetconfSoapOverBeep() {
    
    
    }
    








}
