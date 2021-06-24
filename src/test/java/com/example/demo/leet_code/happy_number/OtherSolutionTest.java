package com.example.demo.leet_code.happy_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        int n = 19;
        //when
        boolean ouput = solution.isHappy(n);
        //then
        assertTrue(ouput);
    }

    @Test
    void testCase2(){
        //given
        int n = 2;
        //when
        boolean ouput = solution.isHappy(n);
        //then
        assertFalse(ouput);
    }
}