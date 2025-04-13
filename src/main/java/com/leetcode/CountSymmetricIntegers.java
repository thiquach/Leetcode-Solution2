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

        parts[0] = s.substring(0, mid);
        parts[1] = s.substring(mid);

        return sumOfDigits(parts[0]) == sumOfDigits(parts[1]);
    }

    private static int sumOfDigits(String part) {

        int sum = 0;
        for (int i=0; i<part.length(); i++) {
            sum += Integer.parseInt(String.valueOf(part.charAt(i)));
        }
        return sum;
    }
}