package main.java.com.leetcode;
// 1295
public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("find numbers " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (countDigit(nums[i]) % 2 == 0) {
                ++count;
            }
        }

        return count;
    }

    private static int countDigit(int num) {

        int count = 0;
        while (num != 0 ) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
