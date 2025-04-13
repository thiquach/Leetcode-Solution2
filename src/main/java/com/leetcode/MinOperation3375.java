package main.java.com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MinOperation3375 {
    public static void main(String[] args) {
//        int[] nums = {5,2,5,4,5}; // k=2
//        int[] nums = {9,7,5,3};
        int[] nums = {1};
        int k = 1;
        System.out.println(" minOps " + minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        Integer lastLargest = 0;
        int index = 0;
        int count = 0;
        for (int n: nums) {
            Integer nextLargest = Arrays.stream(nums)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .skip(index++)
                    .findFirst().get();
            if (!lastLargest.equals(nextLargest)) {
                lastLargest = nextLargest;
                if (nextLargest > k)
                    count++;
            }
            if (n < k)
                return -1;
        }
        return count;
    }
}