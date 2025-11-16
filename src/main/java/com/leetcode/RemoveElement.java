package main.java.com.leetcode;

import java.util.Arrays;

// 27
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,5,3};
        int val = 3;
        System.out.println(" remove elements " + removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int k = len;
        for (int i=0; i<k; i++) {
            if (nums[i] == val && i+1 <= k) {
                int last = nums[i];
                for (int j = i+1; j<k; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[k - 1] = last;
                k--;
                i--;
            }
        }
        return k;
    }
}
