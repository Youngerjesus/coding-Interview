package com.example.demo.leet_code.valid_parentheses;

import com.example.demo.leet_code.valid_parentheses.brackets.Bracket;
import com.example.demo.leet_code.valid_parentheses.brackets.BracketStack;

public class OtherSolution2 extends Solution{
    public boolean isValid(String s) {
        BracketStack bracketStack = new BracketStack();

        for (int i = 0; i < s.length() ; i++) {
            if(Bracket.isOpenBracket(s.charAt(i))){
                bracketStack.createBracket(s.charAt(i));
            }
            else if(Bracket.isCloseBracket(s.charAt(i))) {
                if(!bracketStack.isValid(s.charAt(i))){
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();
    }
}
