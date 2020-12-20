package xyz.kail.demo.algorithms.core.struct;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 双向节点
 */
@NoArgsConstructor
public class ListNode2<T> extends ListNode<T> {

    /**
     * 上一个
     */
    @Getter
    @Setter
    private ListNode2<T> prev;

    public ListNode2(ListNode<T> next, ListNode2<T> prev) {
        super(next);
        this.prev = prev;
    }

    public ListNode2(ListNode2<T> prev, ListNode<T> next, T data) {
        super(next, data);
        this.prev = prev;
    }
}
