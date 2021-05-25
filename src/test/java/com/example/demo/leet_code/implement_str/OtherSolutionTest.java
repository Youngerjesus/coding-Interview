package com.example.demo.leet_code.implement_str;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {
    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        String haystack = "hello";
        String needle = "ll";
        int answer = 2;
        //when
        int output = solution.strStr(haystack, needle);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        String haystack = "aaaaa";
        String needle = "bba";
        int answer = -1;
        //when
        int output = solution.strStr(haystack, needle);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        String haystack = "";
        String needle = "";
        int answer = 0;
        //when
        int output = solution.strStr(haystack, needle);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        String hayStack = "aaa";
        String needle = "aaaa";
        int answer = -1;
        //when
        int output = solution.strStr(hayStack, needle);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase5(){
        //given
        String hayStack = "mississippi";
        String needle = "issipi";
        int answer = -1;
        //when
        int output = solution.strStr(hayStack, needle);
        //then
        assertEquals(answer, output);
    }

}