package main.java.com.leetcode;
// #38
public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("count & say " + n + " -> " + countAndSay(n));
    }

    public static String countAndSay(int n) {
        String result = "1";

        for (int i=1; i<n; i++) {
            result = runLengthEncoding(result);
        }
        return result;
    }

    private static String runLengthEncoding(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }

        result.append(count).append(s.charAt(s.length() - 1));
        return result.toString();
    }
}