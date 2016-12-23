package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import com.google.common.base.Preconditions;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * id for the specific queue.
 */
public class QueueId extends Counter32
 implements Serializable {
    private static final long serialVersionUID = 5541817945389971122L;

    @ConstructorProperties("value")
    public QueueId(java.lang.Long _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public QueueId(QueueId source) {
        super(source);
    }
    /**
     * Creates a new instance from Counter32
     *
     * @param source Source object
     */
    public QueueId(Counter32 source) {
            super(source);
    }

    public static QueueId getDefaultInstance(String defaultValue) {
        return new QueueId(Long.valueOf(defaultValue));
    }







}
