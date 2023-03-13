package org.example;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        int current;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            if (numsMap.containsKey(current)) {
                numsMap.replace(nums[i], numsMap.get(current) + 1);
            } else {
                numsMap.put(current, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (numsMap.get(entry.getKey()) == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}