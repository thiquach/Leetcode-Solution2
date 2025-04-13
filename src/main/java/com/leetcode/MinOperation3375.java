package main.java.com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MinOperation3375 {
    public static void main(String[] args) {
        int[] nums = {5,2,5,4,5}; // k=2
//        int[] nums = {9,7,5,3};
//        int[] nums = {1};
        int k = 2;
        System.out.println(" minOps " + minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int n:nums) {
            if (n < k)
                return -1;

            if (n > k)
                numsMap.put(n, numsMap.getOrDefault(n, 0) + 1);
        }

        return numsMap.size();
    }
}