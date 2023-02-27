package org.example;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(14521));
    }

    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);

        int result = 0;
        int loops = number.length() % 2 == 0 ? number.length() / 2 : (number.length() - 1) / 2;
        for (int i = 0; i < loops; i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                result++;
            } else {
                return false;
            }
        }

        return result == loops;

    }
}