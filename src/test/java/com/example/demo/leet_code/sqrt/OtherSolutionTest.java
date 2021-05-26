package com.example.demo.leet_code.sqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        int input = 4;
        int answer = 2;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int input = 8;
        int answer = 2;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        int input = 1;
        int answer = 1;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        int input = 0;
        int answer = 0;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase5(){
        //given
        int input = 2147395599;
        int answer = 46339;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase6(){
        //given
        int input = 2;
        int answer = 1;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase7(){
        //given
        int input = 5;
        int answer = 2;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase8(){
        //given
        int input = 2147483647;
        int answer = 46340;
        //when
        int output = solution.mySqrt(input);
        //then
        assertEquals(answer, output);
    }
}