package xyz.kail.demo.algorithms.list;

import xyz.kail.demo.algorithms.core.ListTool;
import xyz.kail.demo.algorithms.core.struct.ListNode;

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
    public static ListNode<String> reverse(ListNode<String> head) {

        // 上个节点
        ListNode<String> prev = null;
        //
        while (null != head) {
            // nextNode 指针
            final ListNode<String> next = head.next;

            // 当前节点 -> 上一个节点
            head.next = prev;
            //
            prev = head;
            // 当前节点往后移
            head = next;
        }

        return prev;
    }


    public static void main(String[] args) {
        final ListNode<String> linkedList = ListTool.Linked.fromString("1,2,3,4,5,6,7,8,9");

        final ListNode<String> newList = reverse(linkedList);

        final String format = ListTool.Linked.toString(newList);
        System.out.println(format);

    }

}
