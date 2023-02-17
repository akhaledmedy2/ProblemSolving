package org.example;

import java.util.ArrayList;
import java.util.List;

public class VeryBigSum {

    public static void main(String[] args) {
        List<Long> arr = new ArrayList<>();
        arr.add(1000000001L);
        arr.add(1000000002L);
        arr.add(1000000003L);
        arr.add(1000000004L);
        arr.add(1000000005L);
        long result = aVeryBigSum(arr);
        System.out.println(result);
    }

    public static long aVeryBigSum(List<Long> arr) {
        return arr.stream().mapToLong(Long::longValue).sum();
    }
}