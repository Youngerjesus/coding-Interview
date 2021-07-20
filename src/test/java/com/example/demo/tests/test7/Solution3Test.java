package com.example.demo.tests.test7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    void testCase1(){
        //given
        int[] A = new int[]{3,2,-2,5,-3};
        int expected = 3;
        //when
        int actual = this.solution.solution(A);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        //when

        //then
    }

}