package org.example;

import java.util.*;

public class SockMerchant {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        int result = sockMerchant(9, ar);
        System.out.println(result);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar.get(i))) {
                map.replace(ar.get(i), map.get(ar.get(i)) + 1);
            } else {
                map.put(ar.get(i), 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                result += entry.getValue() / 2;
            } else {
                result += (entry.getValue() - 1) / 2;
            }
        }
        return result;
    }
}