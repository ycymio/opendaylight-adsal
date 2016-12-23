package org.opendaylight.controller.cluster.datastore.messages;

import org.junit.Assert;
import org.junit.Test;
import org.opendaylight.controller.md.cluster.datastore.model.TestModel;
import org.opendaylight.yangtools.yang.data.impl.schema.ImmutableNodes;
import org.opendaylight.yangtools.yang.model.api.SchemaContext;

public class MergeDataTest {

    @Test
    public void testSerialization() {
        SchemaContext schemaContext = TestModel.createTestContext();
        MergeData expected = new MergeData(TestModel.TEST_PATH, ImmutableNodes
            .containerNode(TestModel.TEST_QNAME), schemaContext);

        MergeData actual = MergeData.fromSerializable(expected.toSerializable(), schemaContext);
        Assert.assertEquals("getPath", expected.getPath(), actual.getPath());
        Assert.assertEquals("getData", expected.getData(), actual.getData());
    }
}
