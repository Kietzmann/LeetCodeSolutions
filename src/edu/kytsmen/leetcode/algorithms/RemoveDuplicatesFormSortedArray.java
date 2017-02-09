package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/9/17.
 */
public class RemoveDuplicatesFormSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[j] == nums[i]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;

            }

        }
        return i + 1;
    }
}
