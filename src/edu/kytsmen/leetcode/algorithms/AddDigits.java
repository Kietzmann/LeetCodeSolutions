package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/8/17.
 */
public class AddDigits {
    public int addDigits(int num) {
        return num - 9 * ((num - 1) / 9);
    }
}
