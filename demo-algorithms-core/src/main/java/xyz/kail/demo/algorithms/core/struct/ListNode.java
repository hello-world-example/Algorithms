package xyz.kail.demo.algorithms.core.struct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 单项节点
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListNode<T> {

    /**
     * 下一个节点
     */
    public ListNode<T> next;

    /**
     * 数据节点
     */
    public T data;

    public ListNode(ListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.hashCode() + ":" + data + "->" + (null == next ? null : next.data);
    }
}
