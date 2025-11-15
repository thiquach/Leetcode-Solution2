package main.java.com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(" sorted squares " + Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        List<Integer> list = new ArrayList<>();

        while (left < right ){
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                list.add(nums[right]*nums[right]);
                right--;
            } else {
                list.add(nums[left]*nums[left]);
                left++;
            }
        }

        if (left == right) {
            list.add(nums[left] * nums[left]);
        }

        Collections.reverse(list);
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
