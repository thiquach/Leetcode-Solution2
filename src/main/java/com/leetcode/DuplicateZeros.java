package main.java.com.leetcode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
//        int[] nums = {1,0,2,3,0,4,5,0};
//        int[] nums = {0,0,0,0,0,0,0};
        int[] nums = {8,4,5,0,0,0,0,7};
        System.out.println("duplicate numbers " + Arrays.toString(duplicateZeros(nums)));
    }

    public static int[] duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0 && i+1 < len) {
                for (int j = len - 1; j >= i+1; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
        return arr;
    }
}
