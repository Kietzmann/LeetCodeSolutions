package edu.kytsmen.leetcode.algorithms;

public class LengthOfTheLastWord {
    public int lengthOfLastWord(String a) {
        int length = 0;

        for (int i = a.length() - 1; i > -1; --i)
            if (a.charAt(i) != ' ')
                length++;

            else if (length != 0)
                break;

        return length;
    }
}
