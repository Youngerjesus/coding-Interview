package com.example.demo.leet_code.valid_parentheses;

import com.example.demo.leet_code.valid_parentheses.brackets.Bracket;

import java.util.Stack;

public class OtherSolution extends Solution{
    public boolean isValid(String s) {
        Stack<Bracket> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(Bracket.isOpenBracket(s.charAt(i))){
                Bracket bracket = new Bracket();
                bracket.setOpenBracket(s.charAt(i));
                stack.push(bracket);
            }
            else {
                if(stack.isEmpty()) return false;

                Bracket bracket = stack.pop();
                if(bracket.isUnMatch(s.charAt(i))){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
