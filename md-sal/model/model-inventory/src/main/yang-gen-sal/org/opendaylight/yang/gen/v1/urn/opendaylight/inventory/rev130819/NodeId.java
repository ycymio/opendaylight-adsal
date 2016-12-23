package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import com.google.common.base.Preconditions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * Identifier for a particular node. For example:
 * 
 *                         myprotocol:<unique_node_id>
 * 
 *                         myprotocol:12
 * 
 *                     It is a good practice to always lead with a scoping identifier.
 *                     In the example above the scoping was 'myprotocol'. In your app you
 *                     could use 'myapp' etc.
 */
public class NodeId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 1905618053033346106L;

    @ConstructorProperties("value")
    public NodeId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeId(NodeId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public NodeId(Uri source) {
            super(source);
    }

    public static NodeId getDefaultInstance(String defaultValue) {
        return new NodeId(defaultValue);
    }







}
