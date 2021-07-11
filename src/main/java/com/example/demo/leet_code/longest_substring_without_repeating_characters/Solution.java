package com.example.demo.leet_code.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;

        int maxLength = 1;
        Map<String, Boolean> duplicateMap = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                String s2 = s.substring(j);
                // 앞아벳 중복 체크
                if(isDuplicateCharacter(s1)) {
                    break;
                }

                if(duplicateMap.containsKey(s1)) {
                    continue;
                }

                maxLength = Math.max(maxLength, s1.length());
                if(s2.contains(s1)) {
                    duplicateMap.put(s1, true);
                }
            }
        }

        return maxLength;
    }

    private boolean isDuplicateCharacter(String s1) {
        Map<Character, Boolean> duplicateCharacterMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if(duplicateCharacterMap.containsKey(s1.charAt(i))){
                return true;
            }
            duplicateCharacterMap.put(s1.charAt(i), true);
        }
        return false;
    }
}
