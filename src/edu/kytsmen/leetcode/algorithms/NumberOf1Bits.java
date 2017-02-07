package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        // int counter = 0;
        // for (int i = 0; i < 32; i++) {
        //     if ((n & 1) != 0) {
        //         counter++;
        //     }
        //     n >>>= 1;
        // }
        // return counter;
        return Integer.bitCount(n);
    }
}
