package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.threadpool.rev130409;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.threadpool.rev130409.Threadpool;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * An extension of the simple pool of threads able to schedule work to be executed 
 * at some point in time.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>threadpool</b>
 * <br />(Source path: <i>META-INF\yang\threadpool.yang</i>):
 * <pre>
 * identity scheduled-threadpool {
 *     base "()IdentitySchemaNodeImpl[base=IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)service-type], qname=(urn:opendaylight:params:xml:ns:yang:controller:threadpool?revision=2013-04-09)threadpool]";
 *     description
 *         "An extension of the simple pool of threads able to schedule
 *                      work to be executed at some point in time.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>threadpool/scheduled-threadpool</i>
 */
public abstract class ScheduledThreadpool extends Threadpool
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:threadpool","2013-04-09","scheduled-threadpool");;

    public ScheduledThreadpool() {
    
    
    }
    








}
