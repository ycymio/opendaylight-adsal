package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127;
import com.google.common.base.Preconditions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.ExtendOnce;
import java.io.Serializable;
import java.beans.ConstructorProperties;


public class ExtendTwice extends ExtendOnce
 implements Serializable {
    private static final long serialVersionUID = 1231984600739541551L;

    @ConstructorProperties("value")
    public ExtendTwice(java.lang.Integer _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ExtendTwice(ExtendTwice source) {
        super(source);
    }
    /**
     * Creates a new instance from ExtendOnce
     *
     * @param source Source object
     */
    public ExtendTwice(ExtendOnce source) {
            super(source);
    }

    public static ExtendTwice getDefaultInstance(String defaultValue) {
        return new ExtendTwice(Integer.valueOf(defaultValue));
    }







}
