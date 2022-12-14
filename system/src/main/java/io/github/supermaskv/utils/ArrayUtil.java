package io.github.supermaskv.utils;


/**
 * @author supermaskv
 * <p>
 * 数组相关工具
 */
public class ArrayUtil {
    public static boolean checkArrayIsEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static int[] copyArray(int[] arr) {
        return arr == null ? null : arr.clone();
    }
}
