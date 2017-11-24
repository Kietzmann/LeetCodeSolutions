package edu.kytsmen.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        char[] chars = pattern.toCharArray();
        if (words.length != chars.length) {
            return false;
        }
        Map<Character, String> entries = new HashMap<>();

        for (int i = 0; i < chars.length && i < words.length; ++i) {
            if (!(!entries.containsKey(chars[i]) && entries.containsValue(words[i]))) {
                String val = entries.get(chars[i]);
                if (val == null) {
                    entries.put(chars[i], words[i]);
                } else {
                    if (!val.equals(words[i])) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
