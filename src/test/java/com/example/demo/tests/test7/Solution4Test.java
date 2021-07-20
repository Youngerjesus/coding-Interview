package com.example.demo.tests.test7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    Solution4 solution = new Solution4();

    @Test
    void testCase1(){
        //given
        int[] A = new int[]{200,100,1,2};
        int[] B = new int[]{3,6,5,100,200};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        int[] A = new int[]{3,6,5,100,200};
        int[] B = new int[]{200,100,1,2};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase3(){
        //given
        int[] A = new int[]{2,1};
        int[] B = new int[]{3,3};
        int expected = -1;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }
}