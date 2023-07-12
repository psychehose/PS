package javacode;

import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public String removeString(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }

        String result = stack.stream()
        .map(a -> a.toString())
        .collect(Collectors.joining(""));
        return result;
    }
}