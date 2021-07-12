package com.example.demo.leet_code.longest_palindromic_substring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    @DisplayName("bab -> bab")
    void testCase1(){
        //given
        String s = "bab";
        String answer = "bab";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("babbd -> bab")
    void testCase2(){
        //given
        String s = "babbd";
        String answer = "bab";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("empty")
    void testCase3(){
        //given
        String s = "";
        String answer = "";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("aaaaa -> aaaaa")
    void testCase4(){
        //given
        String s = "aaaaa";
        String answer = "aaaaa";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("zxvtatbnz -> tat")
    void testCase5(){
        //given
        String s = "zxvtatbnz";
        String answer = "tat";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase6(){
        //given
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String answer = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        //when
        String expected = solution.longestPalindrome(s);
        //then
        assertEquals(expected, answer);
    }

}