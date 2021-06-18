package com.example.demo.leet_code.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class OtherSolution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>(); 
        process(ret, "", n, 0, 0);
        return ret; 
    }

    // numClose > numOpen -> termination Check
    private void process(List<String> ret, String s, int n, int numOpen, int numClose) {
        // termination Check
        if(numOpen == n && numClose == n){
            ret.add(s);
            return;
        }

        // recursion next 유효성 상태로 재귀를 돌아가면 종료까지 안전하게 간다.
        if(numOpen < n) {
            process(ret, s + "(", n,numOpen + 1, numClose); // add open Bracket
        }
        if(numOpen > numClose) {
            process(ret, s + ")", n, numOpen, numClose + 1); // add close Bracket
        }
    }
}
