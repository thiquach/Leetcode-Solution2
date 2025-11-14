package main.java.com.leetcode;

import java.util.Arrays;

public class HasSameDigits {
    public static void main(String[] args) {
        String s = "3902";
//        String s = "34789";
        System.out.println("hasSameDigits " + hasSameDigits(s));
    }

    public static boolean hasSameDigits(String s) {
        if (s.length() < 2) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        while (s.length() > 2) {
            for (int i=1; i<s.length(); i++) {
                char ch = (char)(((s.charAt(i - 1) - '0' + s.charAt(i) - '0') % 10) + '0');
                sb.append(ch);
            }
            s = sb.toString();
            sb.setLength(0);
        }
        return s.charAt(0) == s.charAt(1);
    }
}
