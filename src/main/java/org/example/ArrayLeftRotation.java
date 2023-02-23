package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {
    public static void main(String[] args) {

        int d = 7;
        List<Integer> a = new ArrayList<>();
        a.add(98);
        a.add(67);
        a.add(35);
        a.add(1);
        a.add(74);
        a.add(79);
        a.add(7);
        a.add(26);
        a.add(54);
        a.add(63);
        a.add(24);
        a.add(17);
        a.add(32);
        a.add(81);

        List<Integer> result = rotLeft(a, d);
        result.stream().forEach(System.out::println);

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        for (int i = 0; i < d; i++) {
            int temp = a.get(0);
            for (int j = 0; j < a.size() - 1; j++) {
                a.set(j, a.get(j + 1));
            }
            a.set(a.size() - 1, temp);
        }

        return a;
    }


}