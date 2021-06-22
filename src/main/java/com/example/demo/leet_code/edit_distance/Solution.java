package com.example.demo.leet_code.edit_distance;

import org.springframework.scheduling.annotation.SchedulingConfiguration;

public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] cache = new int[len1 + 1][len2 + 1];

        for (int i = 0; i < len1; i++) {
            cache[i][0] = i;
        }

        for (int i = 0; i < len2 ; i++) {
            cache[0][i] = i;
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {

                if(isEqual(i,j))
                {
                    if(isEqual(word1.charAt(i), word2.charAt(j)))
                        cache[i+1][j+1] = cache[i][j]; // 2,2 ->
                    else {
                        cache[i+1][j+1] = cache[i][j] + 1;
                    }
                }

                else if(i - j == 1){
                    if(isEqual(word1.charAt(i), word2.charAt(j))){
                        if(isEqual(word1.charAt(i-1), word2.charAt(j))){
                            cache[i+1][j+1] = cache[i][j+1] + 1;
                        }
                        else {
                            cache[i+1][j+1] = cache[i][j+1];
                        }
                    }
                    else {
                        cache[i+1][j+1] = cache[i][j+1] + 1;
                    }
                }
                else if(j - i == 1){
                    if(isEqual(word1.charAt(i), word2.charAt(j))){
                        if(isEqual(word1.charAt(i), word2.charAt(j-1))){
                            cache[i+1][j+1] = cache[i+1][j] + 1;
                        }
                        else {
                            cache[i+1][j+1] = cache[i+1][j];
                        }
                    }
                    else {
                        cache[i+1][j+1] = cache[i+1][j] + 1;
                    }
                }
                else if(i - j >= 2) {
                    cache[i+1][j+1] = cache[j+3][j+1] + i - j - 1;
                }
                else if (j - i >= 2) {
                    cache[i+1][j+1] = cache[i+1][i+3] + j - i - 1;
                }
            }
        }

        return cache[len1][len2];
    }

    private boolean isEqual(char c1, char c2) {
        return c1 == c2;
    }

    private boolean isEqual(int i1, int i2) { return i1 == i2; }
}
