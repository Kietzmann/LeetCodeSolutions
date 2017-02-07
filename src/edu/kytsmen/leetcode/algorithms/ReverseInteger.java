package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int goal = 0;
        while (x != 0) {
            if (goal != 0 && Integer.MAX_VALUE / goal < 10
                    && Integer.MAX_VALUE / goal > -10) {
                return 0;
            }
            goal = goal * 10 + x % 10;
            x /= 10;
        }

        return goal;
    }
}
