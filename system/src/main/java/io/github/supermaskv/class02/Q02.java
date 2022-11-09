package io.github.supermaskv.class02;

/**
 * @author supermaskv
 * <p>
 * 一个数组中，有一种数出现了K次，其他数都出现了M次，M>1, K<M, 找到出现K次的数
 */
public class Q02 {
    public static void main(String[] args) {
        // 3个4， 5个2， 5个7
        System.out.println(solute(new int[]{-1, -1, -1, 2, 2, 2, 2, 2, 7, 7, 7, 7, 7}, 3, 5));
    }

    private static Integer solute(int[] arr, int k, int m) {
        if (arr == null || arr.length < k + m) return null;

        int[] helper = new int[32];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 32; j++) {
                if (((arr[i] >> j) & 1) != 0) helper[j]++;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (helper[i] % m) << i;
        }
        return res / k;
    }
}
