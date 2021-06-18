package com.example.demo.leet_code.generate_parentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1() throws Exception {
        //given
        int n = 3;
        String[] answer = new String[]{"((()))","(()())","(())()","()(())","()()()"};
        //when
        List<String> output = solution.generateParenthesis(3);
        //then
        for (String s : answer) {
            if(!output.contains(s)) {
                throw new Exception();
            }
        }
    }
}