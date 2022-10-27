package io.github.supermaskv.utils;

/**
 * @author supermaskv
 * <p>
 * 数据结构生成器
 */
public class Generator {
    public static int[] generateIntArray() {
        // random arr length from -1 to 5 * 10 ^ 4
        int len = getRandomNumber(-1, 50_000);
        if (len == -1) return null;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = getRandomNumber(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return arr;
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
