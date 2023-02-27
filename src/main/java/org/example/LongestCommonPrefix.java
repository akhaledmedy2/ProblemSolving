package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

//        String[] strs = {"flower", "flow", "flight"}; // fl
//        String[] strs = {"ab", "a"}; // a
//        String[] strs = {"flower", "flower", "flower", "flower"}; // flower
//        String[] strs = {"abab", "aba", ""}; // ""
        String[] strs = {"b", "bcb"}; // b
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs);

            if (strs[0].isEmpty() || strs[strs.length - 1].isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int loops = strs[0].length() <= strs[strs.length - 1].length()
                    ? strs[0].length() : strs[strs.length - 1].length() - 1;

            for (int i = 0; i < loops; i++) {
                if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                    sb.append(strs[0].charAt(i));
                } else {
                    break;
                }
            }

            return sb.toString();
        }
    }
}