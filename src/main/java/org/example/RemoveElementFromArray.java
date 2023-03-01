package org.example;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;
        int temp;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }

        return index ;
    }
}