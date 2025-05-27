package main.java.com.leetcode;

public class DifferenceOfSums {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println("difference of sum " + differenceOfSums(n, m));
    }

    public static int differenceOfSums(int n, int m) {
        if ((n < 1 || n > 1000) || (m < 1 || m > 1000))
            return 0;

        int result = 0;
        for (int i=1; i<=n; i++) {
            if (i % m != 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
    }
}
