package com.example.demo.leet_code.count_prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int n = 10;
        int answer = 4;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        int n = 0;
        int answer = 0;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        int n = 1;
        int answer = 0;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        int n = 2;
        int answer = 0;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase5(){
        //given
        int n = 499979;
        int answer = 41537;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase6(){
        //given
        int n = 1500000;
        int answer = 114155;
        //when
        int output = solution.countPrimes(n);
        //then
        assertEquals(output, answer);
    }
}