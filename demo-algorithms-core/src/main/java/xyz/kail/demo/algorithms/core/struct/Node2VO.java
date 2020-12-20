package xyz.kail.demo.algorithms.core.struct;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 双向节点
 */
@NoArgsConstructor
public class Node2VO<T> extends NodeVO<T> {

    /**
     * 上一个
     */
    @Getter
    @Setter
    private Node2VO<T> prev;

    public Node2VO(NodeVO<T> next, Node2VO<T> prev) {
        super(next);
        this.prev = prev;
    }

    public Node2VO(Node2VO<T> prev, NodeVO<T> next, T data) {
        super(next, data);
        this.prev = prev;
    }
}
