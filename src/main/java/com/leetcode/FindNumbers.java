package main.java.com.leetcode;

public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("find numbers " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int length = nums.length;

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (countDigit(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    private static int countDigit(int n) {
        if (n == 0)
            return 1;

        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
}
