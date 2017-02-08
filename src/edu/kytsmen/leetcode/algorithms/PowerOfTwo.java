package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/8/17.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}

