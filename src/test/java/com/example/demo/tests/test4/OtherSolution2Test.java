package com.example.demo.tests.test4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolution2Test {

    OtherSolution2 solution = new OtherSolution2();

    @Test
    void testCase1(){
        //given
        int[] T = new int[]{0,0,1,1};
        int[] A = new int[]{2};
        int answer = 3;
        //when
        int output = this.solution.solution(T, A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        int[] T = new int[]{0,0,0,0,2,3,3};
        int[] A = new int[]{2,5,6};
        int answer = 5;
        //when
        int output = this.solution.solution(T, A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        int[] T = new int[]{0,0,1,2};
        int[] A = new int[]{1,2};
        int answer = 3;
        //when
        int output = this.solution.solution(T, A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        int[] T = new int[]{0,3,0,0,5,0,5};
        int[] A = new int[]{4,2,6,1,0};
        int answer = 7;
        //when
        int output = this.solution.solution(T, A);
        //then
        assertEquals(output, answer);
    }

}