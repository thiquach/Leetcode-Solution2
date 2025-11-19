package main.java.com.leetcode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.MIN_VALUE;

public class MaxDifference {
    public static void main(String[] args) {
        String s = "aaaaabbc";
//        String s = "mmsmsym";
//        String s = "tzt";
        System.out.println("max difference " + maxDifference(s));
    }

    public static int maxDifference(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int[] count = new int[26];
        for (Character c: s.toCharArray()) {
            count[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = s.length();
        for (int i=0; i<26; i++) {
            if (count[i] % 2 == 0 && count[i] > 0) {
                minEven = Math.min(count[i], minEven);
            }
            if (count[i] % 2 != 0) {
                maxOdd = Math.max(count[i], maxOdd);
            }
        }
        return maxOdd  - minEven;
    }
}
