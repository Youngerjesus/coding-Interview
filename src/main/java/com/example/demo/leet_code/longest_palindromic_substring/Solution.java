package com.example.demo.leet_code.longest_palindromic_substring;

public class Solution {
    public String longestPalindrome(String s) {
        String longestPalindromicSubString = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length() ; j++) {
                String substring = s.substring(i, j);
                if(isPalindrome(substring) && longestPalindromicSubString.length() < substring.length()) {
                    longestPalindromicSubString = substring;
                }
            }
        }

        return longestPalindromicSubString;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }

        return true;
    }
}
