package com.example.demo.leet_code.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateParenthesisRecursive("",n,0,0);
        return list;
    }

    private void generateParenthesisRecursive(String s, int n, int openBracket, int closeBracket) {
        if(openBracket > n || closeBracket > n) return;

        if(openBracket == n && closeBracket == n) {
            list.add(s);
            return;
        }

        if(s == "" || closeBracket > openBracket) {
            generateParenthesisRecursive(s + "(", n, openBracket + 1, closeBracket);
            return;
        }

        if(closeBracket < openBracket) {
            generateParenthesisRecursive(s + ")", n, openBracket, closeBracket + 1);
        }

        generateParenthesisRecursive(s + "(", n, openBracket + 1, closeBracket);
    }
}
