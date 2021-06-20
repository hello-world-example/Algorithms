package xyz.kail.demo.algorithms.sort;

import xyz.kail.demo.algorithms.core.TreeTool;

import java.util.Arrays;
import java.util.Comparator;

public class HeapSort {

    public static void shiftUp(Integer[] dataArr, int newData, Comparator<Integer> c) {
        // 这里首位不存储数据，保存数据长度
        int index = ++dataArr[0];
        // 新数据入位
        dataArr[index] = newData;

        // 父节点
        int parentIndex = index / 2;

        // 新插入节点与父节点比较大小并交换，直到根节点
        for (; parentIndex > 0; ) {
            final int parentData = dataArr[parentIndex];
            // 父 > 子 就往上调整（小顶堆）
            if (c.compare(parentData, newData) > 0) {
                TreeTool.Array.swap(dataArr, parentIndex, index);
            } else {
                break;
            }
            // 交换后记录节点位置，继续向上比较交换
            parentIndex = index / 2;
        }
    }

    public static Integer shiftDown(Integer[] dataArr, Comparator<Integer> c) {
        // 返回堆顶节点
        Integer firstData = dataArr[1];
        // 首末未交换
        TreeTool.Array.swap(dataArr, 1, dataArr[0]);
        // 元素个数 -1
        Integer size = --dataArr[0];

        // 第一个节点作为父节点，从上往下交换
        int pIdx = 1;
        for (; pIdx <= size; ) {
            // 左子树
            int minIdx = pIdx * 2;
            // 没有左子树则结束
            if (minIdx > size) {
                break;
            }
            // 右子树
            int rIdx = pIdx * 2 + 1;
            if (rIdx <= size) {
                // 找最小的子节点
                minIdx = c.compare(dataArr[rIdx], dataArr[minIdx]) < 1 ? rIdx : minIdx;
            }
            // 最小子节点 与 父节点 比较 找最小
            minIdx = c.compare(dataArr[pIdx], dataArr[minIdx]) < 1 ? pIdx : minIdx;
            // 如果最后找到的节点就是父节点，则无需进行交换
            if (minIdx == pIdx) {
                break;
            }
            TreeTool.Array.swap(dataArr, minIdx, pIdx);
            pIdx = minIdx;
        }
        return firstData;
    }


    public static void main(String[] args) {
        Integer[] originData = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.asList(originData));
        for (int i = 1; i < originData.length; i++) {
            // 小顶堆
            shiftUp(originData, originData[i], Integer::compare);
            // 大顶堆
//            shiftUp(originData, originData[i], (n, p) -> -Integer.compare(n, p));
        }
        System.out.println(Arrays.asList(originData));

        for (; originData[0] > 0; ) {
            System.out.println(shiftDown(originData, (n, p) -> Integer.compare(n, p)));
        }
        System.out.println(Arrays.asList(originData));

//        9,
//     8,    6,
//    7, 3,  2, 5,
//  1,  4

    }

}
