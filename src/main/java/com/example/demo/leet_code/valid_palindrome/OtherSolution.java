package com.example.demo.leet_code.valid_palindrome;

public class OtherSolution {
    public boolean isPalindrome(String s) {
        String converterStr = converter(s);
        String reverseStr = new StringBuilder(converterStr).reverse().toString();
        return converterStr.equals(reverseStr);
    }


    private String converter(String s) {
        return s.replaceAll("[^a-zA-Z0-9*]", "").toLowerCase();
    }
}
