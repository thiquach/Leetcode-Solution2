package main.java.com.leetcode;

public class IsPowerOfThree {
    public static void main(String[] args) {
        int n =8;
        System.out.println("isPowerOfThree " + n + " -> " + isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            } else {
                n = n / 3;
            }
        }
        return true;
    }
}
