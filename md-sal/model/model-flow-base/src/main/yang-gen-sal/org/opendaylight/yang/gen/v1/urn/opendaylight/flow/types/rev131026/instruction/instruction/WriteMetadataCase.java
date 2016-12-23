package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.write.metadata._case.WriteMetadata;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-flow-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-flow-types.yang</i>):
 * <pre>
 * case write-metadata-case {
 *     container write-metadata {
 *         leaf metadata {
 *             type uint64;
 *         }
 *         leaf metadata-mask {
 *             type uint64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-flow-types/instruction/instruction/write-metadata-case</i>
 */
public interface WriteMetadataCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.instruction.WriteMetadataCase>,
    Instruction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","write-metadata-case");;

    WriteMetadata getWriteMetadata();

}

