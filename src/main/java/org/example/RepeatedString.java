package org.example;

import java.util.*;

public class RepeatedString {
    public static void main(String[] args) {

        long result = repeatedString("aba", 10L);
        System.out.println(result);
    }

    public static long repeatedString(String s, long n) {
        if (!s.contains("a")) return 0;

        if (s.length() == 1 && s.charAt(0) == 'a') return n;

        long counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') counter++;
        }

        counter = counter * (n / s.length());

        long remainingCharsCount = n % s.length();

        for (int j = 0; j < remainingCharsCount; j++) {
            if (s.charAt(j) == 'a') counter++;
        }

        return counter;
    }

//    public static long repeatedString(String s, long n) {
//        try {
//            if (!s.contains("a")) {
//                return 0;
//            }
//            char[] cArr = s.toCharArray();
//            char[] chars = new char[(int) n];
//            int index = 0;
//            for (int i = 0; i <= chars.length; i++) {
//                for (int j = 0; j < s.length(); j++) {
//                    chars[index] = cArr[j];
//                    index++;
//                    if (n == index) {
//                        break;
//                    }
//                }
//                if (chars.length == index)
//                    break;
//            }
//            Map<Character, Integer> result = new TreeMap<>();
//            for (char c : chars) {
//                if (c == 'a') {
//                    if (result.containsKey('a')) {
//                        result.replace('a', result.get('a') + 1);
//                    } else {
//                        result.put('a', 1);
//                    }
//                }
//            }
//
//            return result.get('a');
//        } catch (Exception ex) {
//            return n;
//        }
//    }
}