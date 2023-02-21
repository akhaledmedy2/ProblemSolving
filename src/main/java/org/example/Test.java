package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    //implement method that has as a
    // parameter HashMap of strings and
    // return List of sorted values that contains char ‘A’
//    public static void main(String[] args) {
//
//    }

    public List<String> sortedList(Map<String, String> map, String keyword) {
        List<String> resultList = map.entrySet().stream().filter(entry -> entry.getValue().contains(keyword))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        for (Map.Entry<String, String> value : map.entrySet()) {
            if (value.getValue().contains(keyword)) {
                resultList.add(value.getValue());
            }
        }

        Collections.sort(resultList);

        return resultList;
    }
}