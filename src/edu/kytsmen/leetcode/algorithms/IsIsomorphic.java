package edu.kytsmen.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            if (map.containsKey(sArray[i])) {
                if (map.get(sArray[i]) != tArray[i])// if not consistant with previous ones
                    return false;
            } else {
                if (map.containsValue(tArray[i])) //if c2 is already being mapped
                    return false;
                map.put(sArray[i], tArray[i]);
            }
        }
        return true;
    }
}
