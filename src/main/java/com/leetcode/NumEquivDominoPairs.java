package main.java.com.leetcode;

public class NumEquivDominoPairs {
    public static void main(String[] args) {
//        int[][] dominoes = {{1,2},{2,1}, {3,4}, {5,6}};
//        int[][] dominoes = {{1,2},{1,2},{1,1},{1,2}, {2,2}};
        int[][] dominoes = {{2,1},{1,2},{1,2},{1,2},{2,1},{1,1},{1,2},{2,2}};
        System.out.println("num equiv domino pairs " + numEquivDominoPairs(dominoes));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] pair = new int[100];
        for (int i=0; i<dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int key = (a < b) ? (a*10 + b) : (b*10 + a);
            pair[key]++;
        }

        int pairCount = 0;
        for (int freq: pair) {
            if (freq > 1) {
                pairCount += (freq * (freq - 1))/2;
            }
        }

        return pairCount;
    }
}
