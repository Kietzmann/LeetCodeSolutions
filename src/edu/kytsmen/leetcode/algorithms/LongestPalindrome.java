package edu.kytsmen.leetcode.algorithms;

import java.util.Arrays;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int[] entries = new int[256];
        Arrays.fill(entries, 0);
        for (int i = 0; i < sArray.length; i++) {
            entries[sArray[i]]++;
        }

        int count = 0;
        int odd = 0;
        for (int i = 0; i < entries.length; i++) {
            if ((entries[i] & 1) == 1) {
                if (odd == 0) {
                    odd += entries[i];
                } else {
                    odd += entries[i] - 1;
                }
            } else if ((entries[i] & 1) == 0 && entries[i] != 0) {
                count += entries[i];
            }
        }

        return count + odd;
    }
}
