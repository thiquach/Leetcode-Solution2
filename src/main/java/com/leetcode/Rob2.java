package main.java.com.leetcode;

public class Rob2 {
    public static void main(String[] args) {
//        int[] nums = {2,3,2};
        int[] nums = {1,2,3};
//        int[] nums = {1,2,3,1};
//        int[] nums = {1,2,1,1};
        System.out.println("rob2 " + rob(nums));
    }

    public static int rob(int[] nums) {
        int robRound1 = robbing(nums, 0);
        int robRound2 = robbing(nums, 1);
        return Math.max(robRound1, robRound2);
    }

    private static int robbing(int[] nums, int start) {
        int length = nums.length;

        if (length == 0)
            return 0;

        if (length == 1)
            return nums[0];

        if (length == 2)
            return Math.max(nums[0], nums[1]);

        int end = length - 1;
        int[] dp = new int[end];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);

        for (int i = 2; i < end; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i+start] + dp[i - 2]);
        }
        return dp[end - 1];
    }
}