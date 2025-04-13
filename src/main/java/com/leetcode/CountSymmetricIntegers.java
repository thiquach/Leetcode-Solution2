package main.java.com.leetcode;

public class CountSymmetricIntegers {
    public static void main(String[] args) {
        // 1, 100
        int low = 1200;
        int high = 1230;
        System.out.println("symmetric " + countSymmetricIntegers(low, high));
    }

    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                if (isStringSymmetric(s)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isStringSymmetric(String s) {
        int len = s.length();

        if (len % 2 != 0)
            return false;

        String[] parts = new String[2];
        int mid = len / 2;

        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i<mid; i++) {
            sum1 += s.charAt(i) - '0';
        }

        for (int j=mid; j<len; j++) {
            sum2 += s.charAt(j) - '0';
        }
        return (sum1 == sum2);
    }
}