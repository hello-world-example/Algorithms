package xyz.kail.demo.algorithms.core.struct;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 单项节点
 */
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode<T> {

    /**
     * 左节点
     */
    public TreeNode<T> left;

    /**
     * 右节点
     */
    public TreeNode<T> right;

    /**
     * 数据节点
     */
    public T data;

    public TreeNode(TreeNode<T> left, TreeNode<T> right) {
        this.left = left;
        this.right = right;
    }
}
