package io.github.supermaskv.class01;

import io.github.supermaskv.utils.ArrayUtil;
import io.github.supermaskv.utils.Generator;

import java.util.Arrays;

/**
 * @author supermaskv
 * <p>
 * 插入排序
 */
public class Q03 {
    private static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 1; i < arr.length; i++) {
            int cur = i;
            while (cur - 1 >= 0 && arr[cur - 1] > arr[cur]) {
                swap(arr, cur - 1, cur);
                cur--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }

    public static void main(String[] args) {
        int times = 100;
        for (int i = 0; i < times; i++) {
            int[] arr1 = Generator.generateIntArray();
            if (arr1 == null) continue;
            int[] arr2 = arr1.clone();
            Arrays.sort(arr1);
            insertSort(arr2);
            if (!ArrayUtil.checkArrayIsEquals(arr1, arr2)) {
                System.out.println("test failed");
                break;
            }
        }
    }
}
