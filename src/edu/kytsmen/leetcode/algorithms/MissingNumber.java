package edu.kytsmen.leetcode.algorithms;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int miss = 0;
        for (int i = 0; i < nums.length; i++) {
            miss ^= (i + 1) ^ nums[i];
        }
        return miss;
    }
}
