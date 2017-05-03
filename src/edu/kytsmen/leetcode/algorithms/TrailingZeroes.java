package edu.kytsmen.leetcode.algorithms;

public class TrailingZeroes {
    public int trailingZeroes(int n) {
        long div = n;
        int count = 0;
        for (long i = 5; div / i >= 1; i *= 5) {
            count += div / i;
        }

        return count;
    }
}
