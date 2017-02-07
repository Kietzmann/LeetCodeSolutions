package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int counter = 0;
            int digit = i;
            for (int j = 0; j < 32; j++) {
                if ((digit & 1) != 0) {
                    counter++;
                }
                digit >>>= 1;
            }
            arr[i] = counter;
        }
        return arr;
    }
}
