package com.example.demo.leet_code.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        String s = "A man, a plan, a canal: Panama";
        boolean answer = true;
        //when
        boolean output = solution.isPalindrome(s);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        String s = "race a car";
        //when
        boolean output = solution.isPalindrome(s);
        //then
        assertFalse(output);
    }

    @Test
    void testCase3(){
        //given
        String s = "a.";
        //when
        boolean output = solution.isPalindrome(s);
        //then
        assertTrue(output);
    }

    @Test
    void testCase4(){
        //given
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        //when
        boolean output = solution.isPalindrome(s);
        //then
        assertTrue(output);
    }

    @Test
    void testCase5(){
        //given
        String s = "0P";
        //when
        boolean output = solution.isPalindrome(s);
        //then
        assertFalse(output);
    }
}