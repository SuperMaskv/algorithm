package io.github.supermaskv.class02;

import java.util.Arrays;

/**
 * @author supermaskv
 *
 * 一个数组中有两种数出现了奇数次，其他都出现了偶数次，怎么在空间复杂度O(1)的条件下找到这两个数
 */
public class Q01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOdds(new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5})));
    }

    private static int[] findOdds(int[] arr) {
        if (arr == null || arr.length < 2) return null;

        int x = 0;
        for (int i : arr) {
            x ^= i;
        }

        int rightOne = x ^ (-x);
        int a = 0;
        for (int i : arr) {
            if ((i & rightOne) != 0) a ^= i;
        }

        return new int[]{a, x ^ a};
    }

}
