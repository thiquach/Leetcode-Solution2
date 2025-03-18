package main.java.com.leetcode;

import java.util.Arrays;
// 2206
public class DivideArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
//        int[] nums = {1,2,3,4};
        System.out.println("Divide array " + divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        if (nums.length == 0)
            return false;

        Arrays.sort(nums);
        if (nums.length % 2 != 0)
            return false;

        for (int i=0; i<nums.length/2; i++) {
            int index = 2 * i;
            if (nums[index] != nums[index+1])
                return false;
        }
        return true;
    }
}