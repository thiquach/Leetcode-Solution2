package main.java.com.leetcode;

public class CountSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,1};
//        int[] nums = {1,1,1};
        System.out.println("count subarrays " + countSubarrays(nums));
    }

    public static int countSubarrays(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length-2; i++) {
            if ((i + 2) <= nums.length) {
                if ((nums[i] + nums[i+2]) * 2 == nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }
}