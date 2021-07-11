package com.example.demo.leet_code.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution2 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char k = 'a'; k <= 'z'; k++) {
            characterCountMap.put(k, 0);
        }

        while (j < s.length()) {
            characterCountMap.put(s.charAt(j), characterCountMap.getOrDefault(s.charAt(j), 0) + 1);
            if(characterCountMap.get(s.charAt(j)) == 2){
                while (characterCountMap.get(s.charAt(j)) != 1){
                    characterCountMap.put(s.charAt(i), characterCountMap.get(s.charAt(i)) - 1);
                    i++;
                }
            }
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }

    private boolean hasRepeat(char c, Map<Character, Boolean> duplicatedMap) {
        return duplicatedMap.containsKey(c);
    }
}
