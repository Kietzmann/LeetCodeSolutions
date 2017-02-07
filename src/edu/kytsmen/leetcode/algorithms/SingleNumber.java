package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int x = 0;
        for (int a : A) {
            x = x ^ a;
        }
        return x;
    }
}
