package main.java.com.leetcode;

public class HasSameDigits {
    public static void main(String[] args) {
        String s = "3902";
        System.out.println("has same digits " + hasSameDigits(s));
    }

    public static boolean hasSameDigits(String s) {
        if (s.length() < 2) {
            return false;
        }

        char[] sArray = s.toCharArray();

        while (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i=1; i<s.length(); i++) {
                char result = (char)(((s.charAt(i - 1) - '0' + s.charAt(i) - '0') % 10) + '0');
                sb.append(result);
            }
            s = sb.toString();
        }

        return sArray[0] == sArray[1];
    }
}
