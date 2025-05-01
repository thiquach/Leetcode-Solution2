package main.java.com.leetcode;

import java.util.Arrays;

public class CountFairPairs {
    public static void main(String[] args) {
        int[] nums = {0, 1, 7, 4, 4, 5}; // 3,6
//        int[] nums = {0,0,0,0,0,0}; // 0, 0
//        int[] nums = {1,7,9,2,5}; // 11, 11
        int lower = 3;
        int upper = 6;
        System.out.println("Fair pairs count " + countFairPairs(nums, lower, upper));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        long result = 0;
        upper = upper + 1;
        result += binSearch(nums, left, right, upper);
        result -= binSearch(nums, left, right, lower);
        return result;
    }

    private static long binSearch(int[] nums, int left, int right, int target) {
        Arrays.sort(nums);
        long pairs = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                pairs = pairs + (right - left);
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }
}