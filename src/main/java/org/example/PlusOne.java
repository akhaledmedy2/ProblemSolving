package org.example;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1];
        if (lastDigit == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digits.length; i++) {
                sb.append(digits[i]);
            }
            BigInteger bigInteger = new BigInteger(sb.toString());
            bigInteger = bigInteger.add(new BigInteger("1"));
            
            String numberString = String.valueOf(bigInteger);

            digits = new int[numberString.length()];

            for (int i = 0; i < numberString.length(); i++) {
                digits[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            }
        } else {

            digits[digits.length - 1] = lastDigit + 1;
        }

        return digits;
    }
}