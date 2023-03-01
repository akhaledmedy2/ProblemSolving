package org.example;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }


        return index;

//        if(nums.length == 0)
//            return 0;
//
//        int addIndex = 1; //index that unique characters will be inserted at
//
//        for(int i = 0; i < nums.length - 1; i++) {
//
//            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
//                nums[addIndex] = nums[i + 1];
//                addIndex++;
//            }
//        }
//        return addIndex;
    }
}