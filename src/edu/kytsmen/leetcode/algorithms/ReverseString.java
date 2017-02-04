package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 04.02.17.
 */
public class ReverseString {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
