package com.example.demo.leet_code.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        String input = "()";
        boolean answer = true;
        //when
        boolean output = solution.isValid(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        String input = "()[]{}";
        boolean answer = true;
        //when
        boolean output = solution.isValid(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        String input = "(]";
        boolean answer = false;
        //when
        boolean output = solution.isValid(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        String input = "([)]";
        boolean answer = false;
        //when
        boolean output = solution.isValid(input);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase5(){
        //given
        String input = "{[]}";
        boolean answer = true;
        //when
        boolean output = solution.isValid(input);
        //then
        assertEquals(answer, output);
    }
}