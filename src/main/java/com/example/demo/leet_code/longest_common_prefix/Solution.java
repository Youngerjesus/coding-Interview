package com.example.demo.leet_code.longest_common_prefix;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get();
        String longestCommonPrefix = "";

        for (int i = 0; i < minStr.length() ; i++) {
            char currentPrefix = minStr.charAt(i);
            int finalI = i;
            boolean allMatch = Arrays.stream(strs).allMatch(s -> s.charAt(finalI) == currentPrefix);
            if(allMatch){
                longestCommonPrefix += currentPrefix;
            }else{
                return longestCommonPrefix;
            }
        }

        return longestCommonPrefix;
    }
}