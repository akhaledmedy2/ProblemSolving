package org.example;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> nestedArr = new ArrayList<>();
        nestedArr.add(11);
        nestedArr.add(2);
        nestedArr.add(4);
        arr.add(nestedArr);
        nestedArr = new ArrayList<>();

        nestedArr.add(4);
        nestedArr.add(5);
        nestedArr.add(6);
        arr.add(nestedArr);
        nestedArr = new ArrayList<>();

        nestedArr.add(10);
        nestedArr.add(8);
        nestedArr.add(-12);
        arr.add(nestedArr);

        int result = diagonalDifference(arr);
        System.out.println(result);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        int index = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> currentList = arr.get(i);
            firstDiagonal += currentList.get(currentList.size() - index);
            secondDiagonal += currentList.get(index - 1);

            index--;

        }

        return Math.abs(firstDiagonal - secondDiagonal);
    }
}