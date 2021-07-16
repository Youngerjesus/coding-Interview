package com.example.demo.leet_code.repeated_substring_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        String s = "abab";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertTrue(expected);
    }

    @Test
    void testCase2(){
        //given
        String s = "abcabcabcabc";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertTrue(expected);
    }

    @Test
    void testCase3(){
        //given
        String s = "aba";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertFalse(expected);
    }

    @Test
    void testCase4(){
        //given
        String s = "ababab";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertTrue(expected);
    }

    @Test
    void testCase5(){
        //given
        String s = "babbabbabbabbab";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertTrue(expected);
    }

    @Test
    void testCase6(){
        //given
        String s = "aabaaba";
        //when
        boolean expected = solution.repeatedSubstringPattern(s);
        //then
        assertFalse(expected);
    }
}