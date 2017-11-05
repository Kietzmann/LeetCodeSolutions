package edu.kytsmen.leetcode.algorithms;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        if (aChar.length > bChar.length) {
            int offset = aChar.length - bChar.length;
            return addBinaries(aChar, bChar, offset);

        } else {
            int offset = bChar.length - aChar.length;
            return addBinaries(bChar, aChar, offset);
        }
    }

    public String addBinaries(char[] a, char[] b, int offset) {
        int carry = 0;
        for (int i = a.length - 1, j = b.length - 1; i >= 0 && j >= 0; --i, --j) {
            int temp = (a[i] - '0') + (b[j] - '0');
            a[i] = (char) ('0' + (temp + carry) % 2);
            carry = (temp + carry) / 2;
        }
        for (int i = offset - 1; i >= 0 && carry == 1; --i) {
            if (a[i] == '0') {
                a[i] = '1';
                carry = 0;
            } else {
                a[i] = '0';
            }
        }
        if (carry == 1) {
            char result[] = new char[a.length + 1];
            System.arraycopy(a, 0, result, 1, a.length);
            result[0] = '1';
            return new String(result);
        }
        return new String(a);
    }
}
