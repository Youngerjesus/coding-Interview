package com.example.demo.leet_code.valid_parentheses.brackets;

public class Bracket extends AbstractBracket{
    private char openBracket;
    private char closeBracket;

    public char getOpenBracket() {
        return openBracket;
    }

    public void setOpenBracket(char openBracket) {
        this.openBracket = openBracket;
    }

    public char getCloseBracket() {
        return closeBracket;
    }

    public void setCloseBracket(char closeBracket) {
        this.closeBracket = closeBracket;
    }

    @Override
    public boolean isMatch(char closeBracket) {
        return pair.get(openBracket) == closeBracket;
    }

    @Override
    public boolean isUnMatch(char closeBracket) {
        return !isMatch(closeBracket);
    }
}
