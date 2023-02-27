package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("{[()]}"));
//        System.out.println(isValid("(("));
//        System.out.println(isValid("()"));
//        System.out.println(isValid("(){}}{"));
        System.out.println(isValid("[[[]"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Integer> parenthesesMapCount = new HashMap<>();
        parenthesesMapCount.put('(', 0);
        parenthesesMapCount.put(')', 0);
        parenthesesMapCount.put('[', 0);
        parenthesesMapCount.put(']', 0);
        parenthesesMapCount.put('{', 0);
        parenthesesMapCount.put('}', 0);

        if ((s.contains("(") && !s.contains(")")) ||
                (s.contains("[") && !s.contains("]")) ||
                (s.contains("{") && !s.contains("}"))) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            parenthesesMapCount.replace(s.charAt(i), parenthesesMapCount.get(s.charAt(i)) + 1);

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty())
                return false;

            char current = stack.pop();
            switch (s.charAt(i)) {
                case ')':
                    if (current == '[' || current == '{')
                        return false;
                    break;
                case ']':
                    if (current == '(' || current == '{')
                        return false;
                    break;
                case '}':
                    if (current == '(' || current == '[')
                        return false;
                    break;
            }

        }

        if (parenthesesMapCount.get('(') > parenthesesMapCount.get(')')
                || parenthesesMapCount.get('[') > parenthesesMapCount.get(']')
                || parenthesesMapCount.get('{') > parenthesesMapCount.get('}')) {
            return false;
        }

        return true;
    }
}