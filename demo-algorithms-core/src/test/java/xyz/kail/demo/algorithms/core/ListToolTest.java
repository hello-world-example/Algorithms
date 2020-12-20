package xyz.kail.demo.algorithms.core;

import org.junit.Assert;
import org.junit.Test;
import xyz.kail.demo.algorithms.core.struct.NodeVO;

public class ListToolTest {

    @Test
    public void testLined() {
        final NodeVO<String> nodeVO = ListTool.Linked.fromString("1,2,3,4,5");

        Assert.assertEquals("", "1", nodeVO.getData());
        Assert.assertEquals("", "2", nodeVO.getNext().getData());
        Assert.assertEquals("", "3", nodeVO.getNext().getNext().getData());
        Assert.assertEquals("", "4", nodeVO.getNext().getNext().getNext().getData());
        Assert.assertEquals("", "5", nodeVO.getNext().getNext().getNext().getNext().getData());
        Assert.assertNull("", nodeVO.getNext().getNext().getNext().getNext().getNext());

        Assert.assertEquals("", "1,2,3,4,5", ListTool.Linked.toString(nodeVO));

    }

}