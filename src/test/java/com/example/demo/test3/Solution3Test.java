package com.example.demo.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    void testCase1(){
        //given
        int n = 15;
        int answer = 3;
        //when
        int output = this.solution.solution(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        int n = 21;
        int answer = 5;
        //when
        int output = this.solution.solution(n);
        //then
        assertEquals(output, answer);
    }

}