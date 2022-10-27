package io.github.supermaskv.class01;

/**
 * @author supermaskv
 * <p>
 * 二分查找
 */
public class Q04 {
    private static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length < 1) return -1;
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = left;
        }

        return -1;
    }
}
