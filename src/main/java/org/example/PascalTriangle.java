package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> rowNumList;
        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rowNumList = new ArrayList<>();
            rowNumList.add(1);
            if(i==0){
                resultList.add(rowNumList);
                continue;
            }
            if (i > 1) {
                List<Integer> previousRowNum = resultList.get(i - 1);
                previousRowNum = sumResultList(previousRowNum);
                rowNumList.addAll(previousRowNum);
            }
            rowNumList.add(1);
            resultList.add(rowNumList);
        }
        return resultList;
    }

    public static List<Integer> sumResultList(List<Integer> rowNumList) {
        List<Integer> currentNumList = new ArrayList<>();
        for (int i = 0; i < rowNumList.size() - 1; i++) {
            currentNumList.add(rowNumList.get(i) + rowNumList.get(i + 1));
        }
        return currentNumList;
    }
}