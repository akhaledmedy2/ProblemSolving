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

}