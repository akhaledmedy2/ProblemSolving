package org.example;

import java.util.ArrayList;
import java.util.List;

public class InsertListElement {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        List<Integer> result = insert(sourceList, 2, 8);
        System.out.println(result);
    }


    public static List<Integer> insert(List<Integer> sourceList, int position, int value) {

        List<Integer> result = new ArrayList<>(sourceList.size() + 1);

        for (int i = 0; i < position; i++) {
            result.add(sourceList.get(i));
        }

        result.add(value);

        for (int i = position; i < sourceList.size(); i++) {
            result.add(sourceList.get(i));
        }

        return result;
    }

    public static void swap(List<Integer> sourceList, int i, int j) {

    }
}