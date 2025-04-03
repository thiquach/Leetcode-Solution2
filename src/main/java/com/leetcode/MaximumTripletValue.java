package main.java.com.leetcode;
// 2873
public class MaximumTripletValue {
    public static void main(String[] args) {
//        int[] nums = {2,3,1};
        int[] nums = {1000000,1,1000000};
//        int[] nums = {12,6,1,2,7};
        System.out.println("max triplet " + maximumTripletValue(nums));
    }

    public static long maximumTripletValue(int[] nums) {
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