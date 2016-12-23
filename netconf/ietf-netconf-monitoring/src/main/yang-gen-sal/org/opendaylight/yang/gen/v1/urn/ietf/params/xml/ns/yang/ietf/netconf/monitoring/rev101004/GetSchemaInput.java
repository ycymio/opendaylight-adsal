package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />(Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * container input {
 *     leaf identifier {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     leaf format {
 *         type identityref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>ietf-netconf-monitoring/get-schema/input</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.GetSchemaInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.GetSchemaInputBuilder
 */
public interface GetSchemaInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.GetSchemaInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring","2010-10-04","input");;

    /**
     * Identifier for the schema list entry.
     */
    java.lang.String getIdentifier();
    
    /**
     * Version of the schema requested. If this parameter is not present, and more than
     * one version of the schema exists on the server, a 'data-not-unique' error is 
     * returned, as described above.
     */
    java.lang.String getVersion();
    
    /**
     * The data modeling language of the schema. If this parameter is not present, and 
     * more than one formats of the schema exists on the server, a 'data-not-unique' 
     * error is returned, as described above.
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.SchemaFormat> getFormat();

}

