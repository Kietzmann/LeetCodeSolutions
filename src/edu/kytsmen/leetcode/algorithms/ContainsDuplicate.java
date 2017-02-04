package edu.kytsmen.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dmytro on 04.02.17.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
