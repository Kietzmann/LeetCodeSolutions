package edu.kytsmen.leetcode.algorithms;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                result = result > counter ? result : counter;
            } else {
                counter = 0;
            }

        }
        return result;
    }
}
