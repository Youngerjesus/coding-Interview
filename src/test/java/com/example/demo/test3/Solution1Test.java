package com.example.demo.test3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    Solution1 solution = new Solution1();

    @Test
    void testCase1(){
        //given
        String s1 = "xyZA";
        String s2 = "ABCxy";
        String answer = "ABCxyZA";
        //when
        String output = this.solution.solution(s1, s2);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        String s1 = "AxA";
        String s2 = "AyA";
        String answer = "AxAyA";
        //when
        String output = this.solution.solution(s1, s2);
        //then
        assertEquals(output, answer);
    }

    @Test
    @DisplayName("두 문자열이 동일한 경우")
    void testCase3(){
        //given
        String s1 = "AAA";
        String s2 = "AAA";
        String answer = "AAA";
        //when
        String output = this.solution.solution(s1, s2);
        //then
        assertEquals(output, answer);
    }

}