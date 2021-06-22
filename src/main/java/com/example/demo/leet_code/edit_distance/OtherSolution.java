package com.example.demo.leet_code.edit_distance;

public class OtherSolution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] cache = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            cache[i][0] = i;
        }

        for (int i = 0; i <= len2 ; i++) {
            cache[0][i] = i;
        }

        for (int i = 1; i <= len1 ; i++) {
            for (int j = 1; j <= len2 ; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                   cache[i][j] = cache[i-1][j-1];
                }
                else {
                    cache[i][j] = Math.min(cache[i-1][j-1], Math.min(cache[i][j-1],cache[i-1][j])) + 1;
                }
            }
        }

        return cache[len1][len2];
    }
}
