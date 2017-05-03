package edu.kytsmen.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        List<Character> vowList = new ArrayList<Character>();
        vowList.add('a');
        vowList.add('e');
        vowList.add('i');
        vowList.add('o');
        vowList.add('u');
        vowList.add('A');
        vowList.add('E');
        vowList.add('I');
        vowList.add('O');
        vowList.add('U');
        char[] sArray = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!vowList.contains(sArray[i])) {
                i++;
                continue;
            }
            if (!vowList.contains(sArray[j])) {
                j--;
                continue;
            }

            char t = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = t;
            i++;
            j--;
        }
        return new String(sArray);
    }

    private final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public String reverseVowels2(String s) {
        boolean[] map = new boolean[256];
        for (char c : vowels) map[c] = true;
        int i = 0;
        int j = s.length() - 1;
        char[] word = s.toCharArray();
        while (i < j) {
            while (i < j && !map[word[i]]) i++;
            while (i < j && !map[word[j]]) j--;
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
