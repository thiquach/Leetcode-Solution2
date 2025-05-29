package main.java.com.leetcode;

import java.util.Arrays;
// 300 dynamic programming
public class LengthOfLIS300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println("length of LIS " + longestIS(nums));
    }
    public static int longestIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int[] numsLIS = new int[nums.length];
        Arrays.fill(numsLIS, 1);

        for (int i=1; i<nums.length; i++) {
            for (int j=0; j<=i; j++) {
                if (nums[j] < nums[i]) {
                    numsLIS[i] = numsLIS[j] + 1;
                }
            }
        }
        int maxLIS = 0;
        for (int i=0; i<numsLIS.length; i++) {
            maxLIS = Math.max(maxLIS, numsLIS[i]);
        }
        return maxLIS;
    }
}