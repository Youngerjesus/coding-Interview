package com.example.demo.tests.test5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 solution = new Solution1();

    @Test
    void testCase1(){
        //given
        int[] prices = new int[]{13000, 88000, 10000};
        int[] discounts = new int[]{30,20};
        int answer = 82000;
        //when
        int output = this.solution.solution(prices, discounts);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given

        //when

        //then
    }

}