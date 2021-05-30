package com.example.demo.leet_code.climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {
    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        int input = 2;
        int answer = 2;
        //when
        int output = solution.climbStairs(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int input = 3;
        int answer =3;
        //when
        int output = solution.climbStairs(input);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        int input = 35;
        int answer = 14930352;
        //when
        int output = solution.climbStairs(input);
        //then
        assertEquals(answer, output);
    }

}