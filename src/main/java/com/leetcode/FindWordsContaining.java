package main.java.com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println("find words containing " + findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        if (words == null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}
