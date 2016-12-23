package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists;


/**
 * Regression Test model for data store
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-test-store</b>
 * <br />Source path: <i>META-INF\yang\opendaylight-sal-test-store.yang</i>):
 * <pre>
 * module opendaylight-sal-test-store {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:controller:md:sal:test:store";
 *     prefix "binding-impl";
 * 
 *     revision 2014-04-22 {
 *         description "Regression Test model for data store
 *         ";
 *     }
 * 
 *     container lists {
 *         container unordered-container {
 *             list unordered-list {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-value;
 *             }
 *         }
 *         container ordered-container {
 *             list ordered-list {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-value;
 *             }
 *         }
 *         container unkeyed-container {
 *             list unkeyed-list {
 *                 key     leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *                 uses name-value;
 *             }
 *         }
 *     }
 * 
 *     grouping name-value {
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 */
public interface OpendaylightSalTestStoreData
    extends
    DataRoot
{




    Lists getLists();

}

