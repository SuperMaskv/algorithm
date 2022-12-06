package io.github.supermaskv.class03;

/**
 * @author supermaskv
 * <p>
 * 递归实现在数组中找出最大数
 */
public class Q08 {
    private static int max(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int left, int right) {
        if (left == right) return arr[left];
        int mid = left + ((right - left) >> 1);
        return Math.max(process(arr, left, mid), process(arr, mid + 1, right));
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{12, 34, 2354, 13463, 4567, 5368, 456, 0}));
    }
}
