package com.example.demo.leet_code.valid_palindrome;

public class OtherSolution2 {
    public boolean isPalindrome(String s) {
        int startIdx = 0;
        int endIdx = s.length() - 1;

        while (startIdx < endIdx){
            if(!Character.isLetterOrDigit(s.charAt(startIdx))){
                startIdx++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(endIdx))){
                endIdx--;
            }
            else if(s.toLowerCase().charAt(startIdx) != s.toLowerCase().charAt(endIdx)){
                return false;
            }
            else {
                startIdx++;
                endIdx--;
            }
        }

        return true;
    }
}
