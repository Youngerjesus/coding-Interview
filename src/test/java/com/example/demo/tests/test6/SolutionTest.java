package com.example.demo.tests.test6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testCase1(){
        //given
        long n = 4;
        int actual = 7;
        //when
        long expected = Solution.minOperations(n);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        long n = 13;
        int actual = 9;
        //when
        long expected = Solution.minOperations(n);
        //then
        assertEquals(expected, actual);
    }

}