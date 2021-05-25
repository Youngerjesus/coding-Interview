package com.example.demo.leet_code.implement_str;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }

        int needleIdx = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (needleIdx < needle.length() &&
                    i + needleIdx < haystack.length() &&
                    haystack.charAt(i + needleIdx) == needle.charAt(needleIdx)){
                needleIdx++;
            }
            if(needleIdx == needle.length()){
                return i;
            }else{
                needleIdx = 0;
            }
        }
        return -1;
    }
}
