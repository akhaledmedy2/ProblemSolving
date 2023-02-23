package org.example;

import java.util.ArrayList;
import java.util.List;

public class CatAndMouse {
    public static void main(String[] args) {

        int q = 2;
        List<Integer> firstQuery = new ArrayList<>();
        firstQuery.add(1);
        firstQuery.add(2);
        firstQuery.add(3);

        List<Integer> secondQuery = new ArrayList<>();
        secondQuery.add(1);
        secondQuery.add(3);
        secondQuery.add(2);

        List<List<Integer>> xyz = new ArrayList<>();
        xyz.add(firstQuery);
        xyz.add(secondQuery);

        for (int i = 0; i < q; i++) {
            List<Integer> query = xyz.get(i);
            String result = catAndMouse(query.get(0), query.get(1), query.get(2));
            System.out.println(result);
        }

    }

    // X is Cat A
    // Y is Cat B
    // Z is Mouse C
    static String catAndMouse(int x, int y, int z) {

        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if (a < b) {
            return "Cat A";
        } else if (a > b) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}