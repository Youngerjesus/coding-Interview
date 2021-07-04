package com.example.demo.tests.test5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    void testCase1(){
        //given
        String s = "aabcbcd";
        StringBuilder stringBuilder = new StringBuilder(s);
        //when
        String s1 = s.replace("abc", "");
        //then
        System.out.println(s1);
    }

    @Test
    void testCase2(){
        //given
        String s = "aabcbcd";
        String t = "abc";
        int answer = 2;
        //when
        int output = this.solution.solution(s, t);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        String s = "aaaaabbbbb";
        String t = "ab";
        int answer = 5;
        //when
        int output = this.solution.solution(s, t);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        String s = "aaaa";
        String t = "a";
        int answer = 4;
        //when
        int output = this.solution.solution(s, t);
        //then
        assertEquals(output, answer);
    }
}