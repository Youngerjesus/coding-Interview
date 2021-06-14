package com.example.demo.leet_code.valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = stringConverter(s);

        int startIdx = 0;
        int endIdx = str.length() - 1;

        while (startIdx < endIdx) {
            if(str.charAt(startIdx++) != str.charAt(endIdx--)) return false;
        }

        return true;
    }

    private StringBuilder stringConverter(String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z0-9*]", "").strip().toLowerCase());
    }
}
