package com.example.demo.leet_code.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Boolean> duplicatedMap = new HashMap<>();

            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);

                if(hasRepeat(substring.charAt(j-i-1), duplicatedMap)) {
                    break;
                }

                duplicatedMap.put(substring.charAt(j-i-1), true);
                maxLength = Math.max(maxLength, substring.length());
            }
        }

        return maxLength;
    }

    private boolean hasRepeat(char c, Map<Character, Boolean> duplicatedMap) {
        return duplicatedMap.containsKey(c);
    }
}
