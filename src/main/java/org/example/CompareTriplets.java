package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(2);
        b.add(1);

        List<Integer> result = compareTriplets(a, b);
        result.stream().forEach(System.out::println);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2);
        result.add(0);
        result.add(0);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }

        return result;
    }
}