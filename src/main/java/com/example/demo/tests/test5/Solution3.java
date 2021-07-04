package com.example.demo.tests.test5;

public class Solution3 {
    public int solution(String s, String t) {
        if(!s.contains(t)) return -1;
        int result = 0;

        while (s.contains(t)){
            String replace = s.replaceFirst(t, "");
            s = replace;
            result++;
        }
        return result;
    }
}
