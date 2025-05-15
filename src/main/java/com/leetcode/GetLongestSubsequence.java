package main.java.com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetLongestSubsequence {
    public static void main(String[] args) {
//        String[] words = {"e","a","b"}; // 0,0,1
        String[] words = {"a","b","c","d"}; // 0,0,1
        int[] groups = {1,0,1,1};
        System.out.println("get longest sub " + getLongestSubsequence(words, groups));
    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        if (words.length == 0 || groups.length == 0)
            return result;

        if (words.length == 1 || groups.length == 1) {
            result.add(words[0]);
            return result;
        }

        result.add(words[0]);
        for (int i=1; i<groups.length; i++) {
            if (groups[i] != groups[i-1]) {
                result.add(words[i]);
            }
        }
        return result;
    }
}