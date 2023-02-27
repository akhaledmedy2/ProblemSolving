package org.example;

import java.util.ArrayList;
import java.util.Arrays;
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

//        int d = 4;
//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);


        List<Integer> result = rotLeft(a, d);
        result.stream().forEach(System.out::println);

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer[] result = new Integer[a.size()];

        for (int i = 0; i < a.size(); i++) {
            if (d > i) {
                result[a.size() - d + i] = a.get(i);
            } else {
                result[i - d] = a.get(i);
            }

        }


        return Arrays.asList(result);
    }


}