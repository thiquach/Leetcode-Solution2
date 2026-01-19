package main.java.com.leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("group anagram " + groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        char[] first = {};
        Map<String, List<String>> result = new HashMap<>();

        for (int i=0; i<strs.length; i++) {
            first = strs[i].toCharArray();
            Arrays.sort(first);
            String key = new String(first);

            if (!result.containsKey(key)) {
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(strs[i]);
        }

        return new ArrayList<>(result.values());
    }
}
