package com.example.demo.leet_code.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Character, Integer> romanMap = new HashMap<>();

    public Solution() {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        if(isSingleSymbol(s)){
            return romanMap.get(s.charAt(0));
        }

        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            if(isAddExplanation(s.charAt(i), s.charAt(i-1))){
                sum += add(s, i);
            }else{
                sum += subtraction(s, i);
                i++;
            }
        }
        return sum;
    }

    private boolean isSingleSymbol(String s) {
        return s.length() == 1;
    }

    private int subtraction(String s, int i) {
        return i == s.length() - 2 ? romanMap.get(s.charAt(i)) - romanMap.get(s.charAt(i-1)) + romanMap.get(s.charAt(i+1)) : romanMap.get(s.charAt(i)) - romanMap.get(s.charAt(i-1));
    }

    private int add(String s, int i) {
        return i == s.length() - 1 ? romanMap.get(s.charAt(i-1)) + romanMap.get(s.charAt(i)) : romanMap.get(s.charAt(i - 1));
    }

    private boolean isAddExplanation(char presentSymbol, char beforeSymbol) {
        return romanMap.get(beforeSymbol) >= romanMap.get(presentSymbol);
    }
}
