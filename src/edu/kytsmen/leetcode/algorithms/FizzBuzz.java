package edu.kytsmen.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static String fizzBuzz = "FizzBuzz";
    static String fizz = "Fizz";
    static String buzz = "Buzz";

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add(fizzBuzz);
            } else if (i % 5 == 0) {
                result.add(buzz);
            } else if (i % 3 == 0) {
                result.add(fizz);
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
