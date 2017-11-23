package edu.kytsmen.leetcode.algorithms;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
            return num2;
        }
        if (num2.length() == 0) {
            return num1;
        }
        String result;
        if (num1.length() > num2.length()) {
            result = add(num1, num2);
        } else {
            result = add(num2, num1);
        }
        return result;
    }

    public String add(String big, String sm) {
        char[] result = new char[big.length()];
        int diff = big.length() - sm.length();
        boolean carry = false;
        for (int i = sm.length() - 1; i >= 0; --i) {
            int sum = (sm.charAt(i) - '0') + (big.charAt(i + diff) - '0');
            if (carry) {
                ++sum;
            }
            carry = (sum / 10) > 0;
            result[diff + i] = (char) ((sum % 10) + '0');
        }

        for (int i = diff - 1; i >= 0; --i) {
            int sum = big.charAt(i) - '0';
            if (carry) {
                ++sum;
            }
            carry = (sum / 10) > 0;
            result[i] = (char) (sum % 10);
        }
        String res;
        if (carry) {
            char[] ext = new char[result.length + 1];
            System.arraycopy(result, 0, ext, 1, result.length);
            res = new String(ext);
        } else {
            res = new String(result);
        }
        return res;
    }
}
