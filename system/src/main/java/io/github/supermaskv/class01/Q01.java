package io.github.supermaskv.class01;

import io.github.supermaskv.utils.ArrayUtil;
import io.github.supermaskv.utils.Generator;

import java.util.Arrays;

/**
 * @author supermaskv
 * <p>
 * 选择排序
 */
public class Q01 {
    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                minIdx = arr[j] < arr[minIdx] ? j : minIdx;
            }
            swap(arr, i, minIdx);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int times = 100;
        for (int i = 0; i < times; i++) {
            int[] arr1 = Generator.generateIntArray();
            if (arr1 == null) continue;
            int[] arr2 = arr1.clone();
            Arrays.sort(arr1);
            selectSort(arr2);
            if (!ArrayUtil.checkArrayIsEquals(arr1, arr2)) {
                System.out.println("test failed");
                break;
            }
        }
    }
}
