package org.example;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {

        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        BigInteger firstNumber = new BigInteger(a, 2);
        BigInteger secondNumber = new BigInteger(b, 2);

        BigInteger sum = firstNumber.add(secondNumber);

        return sum.toString(2);
    }
}