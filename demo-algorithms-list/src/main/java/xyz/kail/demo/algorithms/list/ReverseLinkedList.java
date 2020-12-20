package xyz.kail.demo.algorithms.list;

import xyz.kail.demo.algorithms.core.ListTool;
import xyz.kail.demo.algorithms.core.struct.NodeVO;

/**
 * 反转链表
 * 【思路】
 * 1. 紧邻两个 Node 节点之间的指针交换操作
 * 2. 循环直到最后一个节点
 */
public class ReverseLinkedList {

    /**
     * 反转操作
     */
    public static NodeVO<String> reverse(NodeVO<String> node) {

        // 上个节点
        NodeVO<String> prev = null;
        //
        while (null != node) {
            // nextNode 指针
            final NodeVO<String> next = node.getNext();

            // 当前节点 -> 上一个节点
            node.setNext(prev);
            //
            prev = node;
            // 当前节点往后移
            node = next;
        }

        return prev;
    }


    public static void main(String[] args) {
        final NodeVO<String> linkedList = ListTool.Linked.fromString("1,2,3,4,5,6,7,8,9");

        final NodeVO<String> newList = reverse(linkedList);

        final String format = ListTool.Linked.toString(newList);
        System.out.println(format);

    }

}
