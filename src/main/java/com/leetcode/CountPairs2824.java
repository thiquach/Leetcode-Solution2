package main.java.com.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// #2824
public class CountPairs2824 {
    public static void main(String[] args) {
//        int[] nums = {-1,1,2,3,1}; // 2
        int[] nums = {-6,2,5,-2,-7,-1,3};
        List<Integer> numList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        int target =-2;
        System.out.println("count pairs " + countPairs(numList, target));
    }

    public static long countPairs(List<Integer> numList, int target) {
        int[] numArray = numList.stream()
                .mapToInt(Integer::intValue) // Unbox each Integer to int
                .toArray();

        Arrays.sort(numArray);

        int left = 0;
        int right = numArray.length - 1;
        int pairs = 0;
        while (left < right) {
            long sum = numArray[left] + numArray[right];
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