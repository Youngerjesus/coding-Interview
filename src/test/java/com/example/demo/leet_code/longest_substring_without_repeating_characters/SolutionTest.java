package com.example.demo.leet_code.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        String s = "pwwkew";
        int answer = 3;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase2(){
        //given
        String s = "bbbbb";
        int answer = 1;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase3(){
        //given
        String s = "abcabcdef";
        int answer = 6;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase4(){
        //given
        String s = "defabcabc";
        int answer = 6;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase5(){
        //given
        String s = "";
        int answer = 0;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase6(){
        //given
        String s = "abcabcbb";
        int answer = 3;
        //when
        int expected = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase7(){
        //given
        String s = "aab";
        int answer = 2;
        //when
        int output = solution.lengthOfLongestSubstring(s);
        //then
        assertEquals(output, answer);
    }
}