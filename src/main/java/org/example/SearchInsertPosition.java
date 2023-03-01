package org.example;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                if (target > nums[i]) {
                    index++;
                }
            } else {
                return i;
            }
        }

        return index;
    }
}