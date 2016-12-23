package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.xsql.rev140626.XSQL;


/**
 * YANG version of the XSQL status
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>XSQL</b>
 * <br />Source path: <i>META-INF\yang\XSQL.yang</i>):
 * <pre>
 * module XSQL {
 *     yang-version 1;
 *     namespace "http://netconfcentral.org/ns/XSQL";
 *     prefix "XSQL";
 * 
 *     import opendaylight-md-sal-binding { prefix "mdsal"; }
 *     
 *     import opendaylight-md-sal-common { prefix "common"; }
 *     
 *     import config { prefix "config"; }
 *     
 *     import opendaylight-md-sal-dom { prefix "sal"; }
 *     
 *     import rpc-context { prefix "rpcx"; }
 *     revision 2014-06-26 {
 *         description "YANG version of the XSQL status
 *         ";
 *     }
 * 
 *     container XSQL {
 *         leaf port {
 *             type string;
 *         }
 *     }
 * 
 *     augment \(urn:opendaylight:params:xml:ns:yang:controller:config)modules\(urn:opendaylight:params:xml:ns:yang:controller:config)module\(urn:opendaylight:params:xml:ns:yang:controller:config)configuration {
 *         status CURRENT;
 *         case XSQL {
 *             container data-broker {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *                 leaf name {
 *                     type leafref;
 *                 }
 *                 uses service-ref {
 *                     refine (http://netconfcentral.org/ns/XSQL?revision=2014-06-26)type {
 *                         leaf type {
 *                             type service-type-ref;
 *                         }
 *                     }
 *                 }
 *             }
 *             container async-data-broker {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *                 leaf name {
 *                     type leafref;
 *                 }
 *                 uses service-ref {
 *                     refine (http://netconfcentral.org/ns/XSQL?revision=2014-06-26)type {
 *                         leaf type {
 *                             type service-type-ref;
 *                         }
 *                     }
 *                 }
 *             }
 *             container schema-service {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *                 leaf name {
 *                     type leafref;
 *                 }
 *                 uses service-ref {
 *                     refine (http://netconfcentral.org/ns/XSQL?revision=2014-06-26)type {
 *                         leaf type {
 *                             type service-type-ref;
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * 
 *     identity XSQL {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)module-type]";
 *         status CURRENT;
 *     }
 * }
 * </pre>
 */
public interface XSQLData
    extends
    DataRoot
{




    /**
     * Container to indicate the XSQL availability
     */
    XSQL getXSQL();

}

