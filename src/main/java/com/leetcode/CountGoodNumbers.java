package main.java.com.leetcode;
// 1922 count good number
public class CountGoodNumbers {
    public static void main(String[] args) {
        long n = 4;
        System.out.println("good number count " + countGoodNumbers(n));
    }

    public static int countGoodNumbers(long n) {
        long mod = 1000000007;

        long evenExp = (int) ((n + 1)/2);
        long oddExp = (int) (n/2);

        long evenPower = powerMod(5, evenExp, mod);
        long oddPower = powerMod(5, oddExp, mod);

        return (int)((evenPower * oddPower) % mod);
    }

    private static long powerMod(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}