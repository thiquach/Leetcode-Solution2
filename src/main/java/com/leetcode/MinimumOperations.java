package main.java.com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperations {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,2,3,3,5,7};
//        int[] nums = {4,5,6,4,4};
        int[] nums = {6,7,8,9};
        System.out.println("min ops " + minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int len = nums.length;

        Set<Integer> numsSet = new HashSet<>();
        int index = Integer.MIN_VALUE;
        for (int i=len-1; i>=0; i--) {
            if (!numsSet.contains(nums[i])) {
                numsSet.add(nums[i]);
            } else {
              index = i;
              break;
            }
        }

        return (index == Integer.MIN_VALUE) ? 0 : index/3 + 1;
    }
}
