package io.github.supermaskv.class01;


/**
 * @author supermaskv
 * <p>
 * 在一个每个元素都不同的数组中，找到其中的一个极小值
 * <p>
 * 5,4,6,7,2,3
 * 1 or 4
 */
public class Q06 {
    private static int binarySearchForMinimal(int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        // check left boundary
        if (arr[0] < arr[1]) return 0;
        // check right boundary
        int len = arr.length;
        if (arr[len - 1] < arr[len - 2]) return len - 1;

        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (mid == 0) {
                left = 1;
                continue;
            }
            if (mid == len - 1) {
                right = len - 2;
                continue;
            }
            if (arr[mid - 1] > arr[mid] && arr[mid + 1] > arr[mid]) return mid;
            else if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]) right = mid - 1;
            else if (arr[mid - 1] > arr[mid] && arr[mid + 1] < arr[mid]) left = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 7, 2, 3};
        System.out.println(binarySearchForMinimal(arr));
    }
}
