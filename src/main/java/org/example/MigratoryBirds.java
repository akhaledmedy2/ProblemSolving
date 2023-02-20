package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(3);
        int result = migratoryBirds(arr);
        System.out.println(result);
    }

    public static int migratoryBirds(List<Integer> arr) {
        TreeMap<Integer, Integer> result = new TreeMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (result.containsKey(arr.get(i))) {
                result.replace(current, result.get(current) + 1);
            } else {
                result.put(current, 1);
            }
        }

        int maxValue = result.values().stream().max(Integer::compare).get();

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() == maxValue) {
                return entry.getKey();
            }
        }

        return result.firstKey();
    }
}