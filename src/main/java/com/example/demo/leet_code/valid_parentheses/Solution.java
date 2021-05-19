package com.example.demo.leet_code.valid_parentheses;

import com.example.demo.leet_code.valid_parentheses.brackets.Bracket;

import java.util.Deque;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length() ; i++) {
            char currentBracket = s.charAt(i);

            if(currentBracket == '(' ||
                currentBracket == '{' ||
                currentBracket == '['){
                stack.push(currentBracket);
            }

            else if (currentBracket == ')' ||
                currentBracket == '}' ||
                currentBracket == ']'){

                if(stack.isEmpty()){
                    return false;
                }

                Character openBracket = stack.pop();

                if(isUnMatch(currentBracket, openBracket)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isUnMatch(char closeBracket, char openBracket) {
        return !isMatch(closeBracket, openBracket);
    }

    private boolean isMatch(char closeBracket, char openBracket) {
        return (closeBracket == ')' && openBracket == '(') ||
                (closeBracket == '}' && openBracket == '{') ||
                (closeBracket == ']' && openBracket == '[');
    }
}
