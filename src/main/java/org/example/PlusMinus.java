package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        result.add(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                result.set(0, result.get(0) + 1);
            } else if (arr.get(i) < 0) {
                result.set(1, result.get(1) + 1);
            } else if (arr.get(i) == 0) {
                result.set(2, result.get(2) + 1);
            }
        }

        double positiveResult = (double) result.get(0) / arr.size();
        double negativeResult = (double) result.get(1) / arr.size();
        double zeroResult = (double) result.get(2) / arr.size();
        System.out.println(positiveResult);
        System.out.println(negativeResult);
        System.out.println(zeroResult);

    }
}