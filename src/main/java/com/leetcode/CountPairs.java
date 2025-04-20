package main.java.com.leetcode;

public class CountPairs {
    public static void main(String[] args) {
//        int[] nums = {3,1,2,2,2,1,3}; // k=2
        int[] nums = {1,2,3,4};
        int k = 1;
        System.out.println("count pairs " + countPairs(nums, k));
    }

    public static int countPairs(int[] nums, int k) {
        int length = nums.length;

        if (length < 2)
            return 0;

        int count = 0;
        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length; j++) {
                if (nums[i] == nums[j] && ((i * j) % k == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}