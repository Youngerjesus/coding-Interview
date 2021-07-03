package com.example.demo.test3;

public class Solution1 {
    public String solution(String s1, String s2) {
        String answer1 = "";
        String answer2 = "";
        for (int i = 0; i < s1.length() ; i++) {
            String s1SubBefore = s1.substring(0, i);
            String s1SubAfter = s1.substring(i);
            if(s2.contains(s1SubAfter)){
                answer1 = s1SubBefore + s2;
                break;
            }
        }

        for (int i = 0; i < s2.length() ; i++) {
            String s2SubBefore = s2.substring(0, i);
            String s2SubAfter = s2.substring(i);
            if(s1.contains(s2SubAfter)) {
                answer2 = s2SubBefore + s1;
                break;
            }
        }

        return compareStr(answer1, answer2);
    }

    private String compareStr(String answer1, String answer2) {
        if(answer1.length() == answer2.length()) {
            return answer1.compareTo(answer2) > 0 ? answer2 : answer1;
        }

        return answer1.length() > answer2.length() ? answer2 : answer1;
    }
}
