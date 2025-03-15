package main.java.com.leetcode;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] nums = {-1, 0,3,5,9,12};
        int target = 9;
        System.out.println(" Binary Search " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0)
            return -1;

        int low = 0;
        int high = length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}