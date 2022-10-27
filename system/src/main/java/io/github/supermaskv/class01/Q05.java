package io.github.supermaskv.class01;

/**
 * @author supermaskv
 * <p>
 * 二分查找左边界，找到大于等于target的最左侧
 */
public class Q05 {
    private static int binarySearchLeftBoundary(int[] arr, int target) {
        if (arr == null || arr.length < 1) return -1;
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6};
        System.out.println(binarySearchLeftBoundary(arr, 3));
    }
}
