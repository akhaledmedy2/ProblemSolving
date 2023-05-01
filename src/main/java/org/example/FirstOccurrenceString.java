package org.example;

public class FirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.contains(needle)) {
            index = haystack.indexOf(needle);
        }

        return index;
    }
}