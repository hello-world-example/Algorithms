package xyz.kail.demo.algorithms.tools;

public class ArrayTreeTool {

    /**
     * 交换位置
     */
    public static <T> void swap(T[] data, int i, int j) throws IndexOutOfBoundsException {
        if (i == j) {
            return;
        }
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     * 父节点 【从0开始存储】
     */
    public static int parentIndex0(int i) {
        return (i - 1) / 2;
    }

    /**
     * 左 子节点 【从0开始存储】
     */
    public static int leftIndex0(int i) {
        return 2 * i + 1;
    }

    /**
     * 右 子节点 【从0开始存储】
     */
    public static int rightIndex0(int i) {
        return 2 * i + 2;
    }

    /**
     * 父节点 【从1开始存储】
     */
    public static int parentIndex1(int i) {
        return i / 2;
    }

    /**
     * 左 子节点 【从1开始存储】
     */
    public static int leftIndex1(int i) {
        return 2 * i;
    }

    /**
     * 右 子节点 【从1开始存储】
     */
    public static int rightIndex1(int i) {
        return 2 * i + 1;
    }

    public static void main(String[] args) {
    }

}
