package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] lettersArray = s.toCharArray();
        int[] letters = new int[26];
        for (char letter : lettersArray) {
            letters[letter - 97]++;
        }

        for (int i = 0; i < lettersArray.length; i++) {
            if (letters[lettersArray[i] - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
