package org.example;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9\\\\s+]", "");

        int loops = s.length() % 2 == 0 ? s.length() / 2 : (s.length() - 1) / 2;
        int result = 0;
        for (int i = 0; i < loops; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                result++;
            } else {
                return false;
            }
        }

        return result == loops;
    }


}