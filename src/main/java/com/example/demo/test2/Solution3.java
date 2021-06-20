package com.example.demo.test2;

import java.util.List;

public class Solution3 {
    public int solution(int N) {
        while (true) {
            String nStr = String.valueOf(++N);
            if(!isTwoConsecutiveDigit(nStr)){
                break;
            }
        }
        return N;
    }

    private boolean isTwoConsecutiveDigit(String s) {
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)){
               return true;
            }
        }
        return false;
    }
}
