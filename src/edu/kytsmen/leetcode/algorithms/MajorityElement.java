package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/8/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count = 1;
            } else if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
