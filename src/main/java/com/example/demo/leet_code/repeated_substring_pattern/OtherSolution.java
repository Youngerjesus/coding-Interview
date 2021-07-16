package com.example.demo.leet_code.repeated_substring_pattern;

public class OtherSolution {
    public boolean repeatedSubstringPattern(String s){
        int L = s.length();
        for (int i = 1; i < L; i++) {
            String pattern = s.substring(0, i);
            int M = pattern.length();
            int j = i;
            for (;j < L && j + M <= L; j += M) {
                String substring = s.substring(j, j + pattern.length());
                if (!substring.equals(pattern)) {
                    break;
                }
            }

            if (j == L) {
                return true;
            }
        }
        return false;
    }
}
