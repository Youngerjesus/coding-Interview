package com.example.demo.leet_code.valid_parentheses.brackets;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBracket {
    Map<Character, Character> pair = new HashMap<>();

    public AbstractBracket() {
        pair.put('(',')');
        pair.put('{','}');
        pair.put('[',']');

        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');
    }

    public abstract boolean isMatch();
    public abstract boolean isUnMatch();

    public static boolean isOpenBracket(char bracket) {
        return (bracket == '(' || bracket == '{' || bracket == '[');
    }

    public static boolean isCloseBracket(char bracket) {
        return (bracket == ')' || bracket == '}' || bracket == ']');
    }
}
