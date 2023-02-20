package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RepeatedString {
    public static void main(String[] args) {

        long result = repeatedString("aab", 882787L);
        System.out.println(result);
    }

    public static long repeatedString(String s, long n) {
        try {

            char[] cArr = s.toCharArray();
            char[] chars = new char[(int) n];
            int index = 0;
            for (int i = 0; i <= s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    chars[index] = cArr[j];
                    index++;
                    if (chars.length == index)
                        break;
                }
            }
            Map<Character, Integer> result = new TreeMap<>();
            for (char c : chars) {
                if (result.containsKey(c)) {
                    result.replace(c, result.get(c) + 1);
                } else {
                    result.put(c, 1);
                }
            }

            return result.get(s.charAt(0));
        } catch (Exception ex) {
            return n;
        }
    }
}