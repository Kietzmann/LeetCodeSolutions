package edu.kytsmen.leetcode.algorithms;

import java.util.Arrays;

/**
 * Created by dkytsmen on 2/8/17.
 */
public class FrequencySort {
    public String frequencySort(String s) {
        int[][] count = new int[256][2];

        for (char c : s.toCharArray()) {
            count[c][0] = c;
            count[c][1]++;
        }

        Arrays.sort(count, (a, b) -> a[1] == b[1] ? 0 : (a[1] < b[1] ? 1 : -1));


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (count[i][1] > 0) {
                for (int j = 0; j < count[i][1]; j++) {
                    sb.append((char) count[i][0]);
                }
            }
        }

        return sb.toString();
    }
}
