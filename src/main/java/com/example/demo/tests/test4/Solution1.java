package com.example.demo.tests.test4;

public class Solution1 {
    public String solution(String S) {
        StringBuilder reformatStr = new StringBuilder(S.replaceAll("\\s|-", ""));

        int loop = reformatStr.length() / 3 - 1;

        if(reformatStr.length() >= 4){
            if(reformatStr.length() % 3 == 1) {
                reformatStr.insert(reformatStr.length() - 2, "-");
            }
            else if (reformatStr.length() % 3 == 2) {
                reformatStr.insert(reformatStr.length() - 2, "-");
            }
        }

        for (int i = 0; i < loop; i++) {
            reformatStr.insert(i * 3 + 3 + i, "-");
        }

        return reformatStr.toString();
    }
}
