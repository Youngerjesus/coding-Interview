package com.example.demo.leet_code.reverse_string;

public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length + 1) / 2; i++) {
            int lastIdx = (s.length - 1) - i;
            char temp = s[lastIdx];
            s[lastIdx] = s[i];
            s[i] = temp;
        }
    }
}
