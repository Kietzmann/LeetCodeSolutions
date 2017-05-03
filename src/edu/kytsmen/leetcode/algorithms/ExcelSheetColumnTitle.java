package edu.kytsmen.leetcode.algorithms;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        result.reverse();
        return result.toString();
    }
}
