package main.java.com.leetcode;

public class ValidMountainArray {
    public static void main(String[] args) {
//        int[] arr = {2,1};
//        int[] arr = {3,5,5};
//        int[] arr = {0,3,2,1};
        int[] arr = {0,1,2,1,2};
        System.out.println(" validMountainArray " + validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int len = arr.length;
        int i = 0;
        int j = arr.length - 1;

        while ((i + 1) < len && arr[i] < arr[i+1]) { i++; }
        while ((j - 1) > 0 && arr[j] < arr[j - 1]) { j--; }
        return (i > 0) && (i == j) && (j < len - 1);
    }
}
