package com.example.demo.tests.test4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    void testCase1(){
        //given
        int[] A = new int[]{3,2,3,2,3};
        int answer = 5;
        //when
        int output = this.solution.solution(A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        int[] A = new int[]{7,4,-2,4,-2,-9};
        int answer = 4;
        //when
        int output = this.solution.solution(A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        int[] A = new int[]{7,-5,-5,-5,7,-1,7};
        int answer = 3;
        //when
        int output = this.solution.solution(A);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        int[] A = new int[]{4};
        int answer = 1;
        //when
        int output = this.solution.solution(A);
        //then
        assertEquals(output, answer);

    }

    @Test
    void testCase5(){
        //given
        int[] A = new int[]{4,4,4};
        int answer = 3;
        //when
        int output = this.solution.solution(A);
        //then
        assertEquals(output, answer);

    }

}