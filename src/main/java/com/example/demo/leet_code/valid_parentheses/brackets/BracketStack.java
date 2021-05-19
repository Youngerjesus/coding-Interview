package com.example.demo.leet_code.valid_parentheses.brackets;

import java.util.Stack;

public class BracketStack {
    Stack<Bracket> stack = new Stack<>();

    public void push(Bracket bracket){
        stack.push(bracket);
    }

    public void createBracket(char bracket) {
        Bracket newBracket = new Bracket();

        if(Bracket.isOpenBracket(bracket)){
            newBracket.setOpenBracket(bracket);
        }else{
            newBracket.setCloseBracket(bracket);
        }

        push(newBracket);
    }

    public boolean isValid(char bracket) {
        if(stack.isEmpty()){
            return false;
        }

        Bracket topBracket = stack.pop();
        return topBracket.isMatch(bracket);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
