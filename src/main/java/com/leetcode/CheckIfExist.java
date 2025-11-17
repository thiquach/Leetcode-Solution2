package main.java.com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1346
public class CheckIfExist {
    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,1,7,11};
//        int[] arr = {0,-2,2};
        int[] arr = {0,0};
        System.out.println(" CheckIfExist " + checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num: arr) {
            if (num != 0) {
                if (map.containsKey(2 * num) ||
                        (num % 2 == 0 && map.containsKey(num / 2))) {
                    return true;
                }
            } else {
                if (map.containsKey(num) && map.get(num) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
