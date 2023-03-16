package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
    private static TreeMap<Integer, String> romanMap = new TreeMap<>();

    static {
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(35));
    }

    public static String intToRoman(int num) {

        int floorKey = romanMap.floorKey(num);
        if (num == floorKey) {
            return romanMap.get(num);
        }
        return romanMap.get(floorKey) + intToRoman(num - floorKey);
    }


}