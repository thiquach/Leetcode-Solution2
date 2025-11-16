package main.java.com.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,3,4,5,6,7};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,2};
//        int[] nums = {1,1};
//        int[] nums = {1,1,2,3,4,5,6,7};
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};  // [0,1,2,3,4]
//        int[] nums = {0,0,5,6,7,2,2,3,3,4};  // [0,1,2,3,4]
        System.out.println(" remove duplicates " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        System.out.println(" nums " + Arrays.toString(nums));

        int i = 1;
        for (int j=1; j<nums.length; j++) {
            if (nums[i-1] != nums[j]) {
                nums[i] = nums[j];
                i++;
                System.out.println(" nums " + Arrays.toString(nums));
            }
        }

        return i;
    }
}
