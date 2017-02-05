package edu.kytsmen.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmytro on 05.02.17.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (map.containsKey(c1)) {
                map.put(c1, map.get(c1) + 1);
            } else {
                map.put(c1, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c2 = t.charAt(i);
            if (map.containsKey(c2)) {
                if (map.get(c2) == 1) {
                    map.remove(c2);
                } else {
                    map.put(c2, map.get(c2) - 1);
                }
            } else {
                return false;
            }
        }

        if (map.size() > 0) {
            return false;
        }

        return true;
    }
}
