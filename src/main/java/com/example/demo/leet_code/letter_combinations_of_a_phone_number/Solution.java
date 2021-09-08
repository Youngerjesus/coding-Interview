package com.example.demo.leet_code.letter_combinations_of_a_phone_number;

import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        UsingNumber usingNumber = new UsingNumber(digits);
        return usingNumber.getPossibleCombinationsOrderByDictionary();
    }
}
