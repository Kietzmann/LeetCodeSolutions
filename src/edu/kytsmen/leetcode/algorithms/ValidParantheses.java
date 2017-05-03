package edu.kytsmen.leetcode.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Set<Character> opening = new HashSet<>(Arrays.asList('{', '(', '['));
        char[] chrs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chrs) {
            if (opening.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((top == '{' && c == '}') ||
                        (top == '(' && c == ')') ||
                        (top == '[' && c == ']')) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}
