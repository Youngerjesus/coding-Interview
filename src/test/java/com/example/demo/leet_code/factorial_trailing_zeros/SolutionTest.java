package com.example.demo.leet_code.factorial_trailing_zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void TestCase1(){
        //given
        int n = 5;
        int answer = 1;
        //when
        int output = solution.trailingZeroes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void TestCase2(){
        //given
        int n = 0;
        int answer = 0;
        //when
        int output = solution.trailingZeroes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void TestCase3(){
        //given
        int n = 13;
        int answer = 2;
        //when
        int output = solution.trailingZeroes(n);
        //then
        assertEquals(output, answer);
    }
}