package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * A base identity definition which represents a generic node type and can be 
 * extended in other yang files.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * identity node-type {
 *     description
 *         "A base identity definition which represents a generic node type and can be extended in other yang files.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-type</i>
 */
public abstract class NodeType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-type");;

    public NodeType() {
    
    
    }
    








}
