package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null)
            return -1;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int i = 0;
        int j = nums.length;

        while (i < j) {
            int m = (i + j) / 2;
            if (target > nums[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }

        return j;
    }
}
