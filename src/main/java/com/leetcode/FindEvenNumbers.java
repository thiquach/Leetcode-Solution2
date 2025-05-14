package main.java.com.leetcode;

import java.util.*;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2,2,8,8,2};
//        int[] digits = {1,2,3,0};
//        int[] digits = {3,7,5};
        System.out.println("find even # " + Arrays.toString(findEvenNumbers(digits)));
    }

    public static int[] findEvenNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        if (digits.length == 0)
            return new int[] {};

        Map<Integer,Integer> digitMap = new HashMap<>();
        int evenCount = 0;
        for (int d: digits) {
            digitMap.put(d, digitMap.getOrDefault(d, 0) + 1);
            if (d % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            return new int[] {};
        }

        Map<Integer, Integer> copyMap = new HashMap<>(digitMap);
        for (int i=100; i<=999; i++) {
            if (i % 2 == 0) {
                if (matchEvenNumber(digitMap,i)) {
                    result.add(i);
                }
            }
        }

        int[] arrResult = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            arrResult[i] = result.get(i);
        }

        return arrResult;
    }

    private static boolean matchEvenNumber(Map<Integer, Integer> digitMap, int i) {
        Map<Integer, Integer> copyMap = new HashMap<>(digitMap);
        String iString = String.valueOf(i);

        for (char c: iString.toCharArray()) {
            int key = c - '0';
            if (!copyMap.containsKey(key) || copyMap.get(key) == 0) {
                return false;
            }
            copyMap.put(key, copyMap.get(key) - 1);
        }
        return true;
    }
}
