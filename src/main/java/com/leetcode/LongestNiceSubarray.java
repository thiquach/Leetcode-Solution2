package main.java.com.leetcode;
// 2401
public class LongestNiceSubarray {
    public static void main(String[] args) {
        int[] nums = {1,3,8,48,10};
//        int[] nums = {3,1,5,11,13};
//        int[] nums = {45106826,547958667,823366125,332020148,611677524,510346561,555831456,436600904,12594192,127206768,540754485,201997978,473116514,233000361,538246458,729745279,343417143,892046691,376031730};
//        int[] nums = {178830999,19325904,844110858,806734874,280746028,64,256,33554432,882197187,104359873,453049214,820924081,624788281,710612132,839991691};
        System.out.println("Longest NICE " + longestNiceSubarray(nums));
    }

    public static int longestNiceSubarray(int[] nums) {
        if (nums.length == 0)
            return 0;

        int mask = 0;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while (right < nums.length) {
            while (left < right && (mask & nums[right]) != 0) {
                mask ^= nums[left];
                left++;
            }
            mask |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}