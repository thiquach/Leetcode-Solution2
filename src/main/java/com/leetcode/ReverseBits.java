package main.java.com.leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        System.out.println("reverse bits " + reverseBits(n));
    }

    private static int reverseBits(int n) {
        int result = 0;
        for (int i=0; i<32; i++) {
            int bits = n & 1;
            result = (result << 1) | bits;
            n = n >> 1;
        }
        return result;
    }


}
