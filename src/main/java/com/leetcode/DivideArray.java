package main.java.com.leetcode;

import java.util.HashMap;
import java.util.Map;
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

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num: nums) {
          numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: numsMap.entrySet()) {
            if (entry.getValue() % 2 != 0)
                return false;
        }
        return true;
    }
}