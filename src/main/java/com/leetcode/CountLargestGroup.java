package main.java.com.leetcode;

import java.util.HashMap;
import java.util.Map;
// #1399
public class CountLargestGroup {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("count largest group " + countLargestGroup(n));
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> digitSumMap = new HashMap<>();
        int maxSumCount = 0;
        for (int i=1; i<=n; i++) {
            int dSum = 0, unit = i;
            while (unit != 0) {
                dSum += unit % 10;
                unit /= 10;
            }
            int sumCount = digitSumMap.getOrDefault(dSum, 0) + 1;
            digitSumMap.put(dSum, sumCount);
            maxSumCount = Math.max(maxSumCount, sumCount);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : digitSumMap.entrySet()) {
            if (entry.getValue() == maxSumCount) {
                count++;
            }
        }
        return count;
    }
}