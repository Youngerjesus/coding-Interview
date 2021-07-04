package com.example.demo.tests.test5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    void testCase1(){
        //given
        String s = "abcxyasdfasdfxyabc";
        String[] answer = new String[]{"abc", "xy", "asdf", "asdf", "xy", "abc"};
        //when
        String[] output = this.solution.solution(s);
        assertArrayEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        String s = "abcxyqwertyxyabc";
        String[] answer = new String[]{"abc","xy","qwerty","xy","abc"};
        //when
        String[] output = this.solution.solution(s);
        //then
        assertArrayEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        String s = "abcabcabcabc";
        String[] answer = new String[]{"abc","abc","abc","abc"};
        //when
        String[] output = this.solution.solution(s);
        //then
        assertArrayEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        String s = "abcdef";
        String[] answer = new String[]{"abcdef"};
        //when
        String[] output = this.solution.solution(s);
        //then
        assertArrayEquals(output, answer);
    }
}