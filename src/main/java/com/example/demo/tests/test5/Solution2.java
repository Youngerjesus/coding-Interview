package com.example.demo.tests.test5;

public class Solution2 {
    public String[] solution(String s) {
        StringBuilder sliceStr = new StringBuilder(s);

        int start = 0;
        int end = s.length();
        int slushCount = 0;
        while (start <= end) {
            for (int i = 1; i <= s.length() - 1 ; i++) {
                if(start + i > end - i) {
                    start = start + i;
                    end = end - i;
                    break;
                }
                String beforeStr = s.substring(start, start + i);
                String afterStr = s.substring(end - i, end);
                if(beforeStr.equals(afterStr)){
                    start = start + i;
                    end = end - i;
                    if(start == end) {
                        sliceStr.insert(start + slushCount, "/");
                        break;
                    }
                    sliceStr.insert(start + slushCount, "/");
                    sliceStr.insert(end + slushCount + 1, "/");
                    slushCount++;
                    break;
                }
            }
        }

        String[] answer = sliceStr.toString().split("/");
        return answer;
    }
}
