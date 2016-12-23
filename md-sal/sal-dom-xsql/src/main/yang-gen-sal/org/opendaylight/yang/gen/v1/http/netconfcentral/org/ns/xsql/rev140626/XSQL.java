package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQLData;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Container to indicate the XSQL availability
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>XSQL</b>
 * <br />(Source path: <i>META-INF\yang\XSQL.yang</i>):
 * <pre>
 * container XSQL {
 *     leaf port {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>XSQL/XSQL</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQLBuilder}.
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQLBuilder
 */
public interface XSQL
    extends
    ChildOf<XSQLData>,
    Augmentable<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://netconfcentral.org/ns/XSQL","2014-06-26","XSQL");;

    /**
     * The port the XSQL binds on
     */
    java.lang.String getPort();

}

