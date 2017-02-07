package edu.kytsmen.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkytsmen on 2/7/17.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] base = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new ArrayList<>();
        for (String string : words) {
            for (String basStr : base) {
                boolean find = true;
                for (char c : string.toCharArray()) {
                    String low = String.valueOf(c).toLowerCase();
                    if (!basStr.contains(low)) {
                        find = false;
                        break;
                    }
                }
                if (find) list.add(string);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
