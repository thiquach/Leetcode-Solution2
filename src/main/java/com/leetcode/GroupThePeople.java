package main.java.com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {
    public static void main(String[] args) {
//        int[] groupSizes = {2,1,3,3,3,2};
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println("Group the ppl " + groupThePeople(groupSizes));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groupList = new ArrayList<>();

        Map<Integer, List<Integer>> groupsMap = new HashMap<>();

        for (int i=0; i<groupSizes.length; i++) {
            if (!groupsMap.containsKey(groupSizes[i])) {
                groupsMap.put(groupSizes[i], new ArrayList<>());
            }
            groupsMap.get(groupSizes[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : groupsMap.entrySet()) {
            int key = entry.getKey();
            int size = entry.getValue().size();
            int count = 1;
            while (size > 0) {
                int start = key * (count - 1);
                int end = key * count;
                List<Integer> list = new ArrayList<>();
                for (int i=start; i<end; i++) {
                    list.add(entry.getValue().get(i));
                    size--;
                }
                groupList.add(list);
                count++;
            }
        }
        return groupList;
    }
}