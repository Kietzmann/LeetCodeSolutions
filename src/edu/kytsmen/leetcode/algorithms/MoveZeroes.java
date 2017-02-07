package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
