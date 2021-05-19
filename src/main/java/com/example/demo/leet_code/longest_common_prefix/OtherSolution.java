package com.example.demo.leet_code.longest_common_prefix;

public class OtherSolution extends Solution {
    @Override
    public String longestCommonPrefix(String[] strs) {
        String longestCommonStr = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            longestCommonStr = commonPrefix(longestCommonStr, strs[i]);
        }
        return longestCommonStr;
    }

    private String commonPrefix(String commonStr, String str) {
        while (str.indexOf(commonStr) != 0) {
            commonStr = commonStr.substring(0, commonStr.length() - 1);
        }
        return commonStr;
    }
}
