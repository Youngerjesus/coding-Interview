package com.example.demo.leet_code.repeated_substring_pattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int N = s.length();

        for (int i = 1; i <= N / 2; i++) {
            String pattern = s.substring(0, i);
            int[] rightSkip = rightSkip(pattern);
            int M = pattern.length();
            int skip;
            int j = i;
            for (;j < N; j += skip) {
                skip = 0;
                for (int k = M - 1; k >= 0; k--) {
                    if (j + k >= N) {
                        skip = M;
                        break;
                    }
                    if (pattern.charAt(k) != s.charAt(j + k)) {
                        skip = Math.max(1, k - rightSkip[s.charAt(j + k)]);
                        break;
                    }
                }
                if (skip != 0) break;
                else skip = M;
            }
            if (j >= N) return true;
        }

        return false;
    }

    private int[] rightSkip(String pattern) {
        int[] rightSkip = new int[123];

        for (char i = 'a'; i < 'z'; i++) {
            rightSkip[i] = -1;
        }

        for (int i = 0; i < pattern.length(); i++) {
            rightSkip[pattern.charAt(i)] = i;
        }

        return rightSkip;
    }
}
