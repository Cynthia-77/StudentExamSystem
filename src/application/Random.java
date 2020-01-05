package application;

import java.util.Arrays;

public class Random {
    //生成不重复的随机数列
    public int[] random(int n, int k) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //Math.random() generate double that between 0 and 1 (0 included, 1 not included)
            //int r represents the index that between 0 and n-1 (both included)
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        //Arrays.sort(result);

        return result;
    }
}
