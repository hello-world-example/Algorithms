package xyz.kail.demo.algorithms.core;

import xyz.kail.demo.algorithms.core.struct.ListNode;

/**
 * 列表相关工具
 */
public class ListTool {

    /**
     * 分隔符
     */
    public static final String DELIMITER = ",";

    /**
     * 数组操作
     */
    public static final class Array {

        /**
         * 字符串转数据
         */
        public static String[] fromString(String str) {
            if (null == str || str.length() <= 0) {
                return new String[0];
            }
            return str.split(DELIMITER);
        }

        /**
         * 数组转字符串
         */
        public static String toString(String[] arrs) {
            return String.join(DELIMITER, arrs);
        }
    }


    /**
     * 链表操作
     */
    public static final class Linked {
        /**
         * 字符串转链表
         */
        public static ListNode<String> fromString(String str) {
            final String[] arr = Array.fromString(str);
            if (arr.length <= 0) {
                return null;
            }

            // 保存最后一条数据，没有下一个节点
            ListNode<String> head = new ListNode<>(null, arr[arr.length - 1]);

            // 倒序遍历
            for (int i = arr.length - 2; i >= 0; i--) {
                // 1. 创建新的 head，指向当前 head，保存当前数据
                // 2. 作为新的 head
                head = new ListNode<>(head, arr[i]);
            }
            return head;
        }

        public static String toString(ListNode<?> node) {
            if (null == node) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            // 节点遍历
            for (; null != node; node = node.getNext()) {
                sb.append(node.getData()).append(",");
            }
            return sb.substring(0, sb.length() - 1);
        }
    }


}
