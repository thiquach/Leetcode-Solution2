package main.java.com.leetcode;

// 2873 & 2874
public class MaximumTripletValue {
    public static void main(String[] args) {
//        int[] nums = {2,3,1};
//        int[] nums = {1000000,1,1000000};
//        int[] nums = {12,6,1,2,7};
        int[] nums = {1,10,3,4,19};
        System.out.println("max triplet " + maximumTripletValue(nums));
    }

    public static long maximumTripletValue(int[] nums) {
        int len = nums.length;

        if (len < 3)
            return 0;

        long maxTriplet = 0;
        int[] suffixMax = new int[len];
        suffixMax[len - 1] = nums[len - 1];
        for (int i=len-2; i>=0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1], nums[i]);
        }

        int prefixMax = nums[0];
        for (int j=1; j<len - 1; j++) {
            if (prefixMax > nums[j]) {
                long triplet = (long)(prefixMax - nums[j]) * suffixMax[j+1];
                maxTriplet = Math.max(triplet, maxTriplet);
            }
            prefixMax = Math.max(prefixMax, nums[j]);
        }
        return maxTriplet;
    }

    public static long maximumTripletValueBruteForce(int[] nums) {
        if (nums.length < 3)
            return 0;

        long maxTriplet = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    long triplet = (long) (nums[i] - nums[j]) * nums[k];
                    maxTriplet = Math.max(triplet, maxTriplet);
                }
            }
        }
        return maxTriplet;
    }
}