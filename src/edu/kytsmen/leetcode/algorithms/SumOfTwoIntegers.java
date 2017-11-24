package edu.kytsmen.leetcode.algorithms;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {

        while (b != 0) {
            int c = a & b;
            a ^= b;
            b = c << 1;
        }

        return a;
    }
}
