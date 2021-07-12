package com.example.demo.leet_code.longest_palindromic_substring;

public class OtherSolution {
    public String longestPalindrome(String s) {
        String longestPalindromeString = "";

        for (int i = 0; i < s.length(); i++) {
            int oddStart = i;
            int oddEnd = i;
            int evenStart = i;
            int eventEnd = i + 1;

            longestPalindromeString = calculatePalindrome(oddStart, oddEnd, s, longestPalindromeString);
            longestPalindromeString = calculatePalindrome(evenStart, eventEnd, s, longestPalindromeString);
        }

        return longestPalindromeString;
    }

    private String calculatePalindrome(int start, int end, String s, String longestPalindromeString) {
        if(!isBoundary(s, start) || !isBoundary(s, end)) return longestPalindromeString;

        if(s.charAt(start) != s.charAt(end)) return longestPalindromeString;

        while (true){
            if(!isBoundary(s, start - 1)){
                break;
            }
            if(!isBoundary(s, end + 1)){
                break;
            }
            if(s.charAt(start - 1) != s.charAt(end + 1)){
                break;
            }
            start--;
            end++;
        }

        if(longestPalindromeString.length() < end + 1 - start) {
            longestPalindromeString = s.substring(start, end + 1);
        }
        return longestPalindromeString;
    }


    private boolean isBoundary(String s, int i) {
        return i >= 0 && i < s.length();
    }
}
