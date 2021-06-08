package com.example.demo.leet_code.best_time_to_buy_and_sell_stock_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] prices = new int[]{7,1,5,3,6,4};
        int answer = 7;
        //when
        int output = solution.maxProfit(prices);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int[] prices = new int[]{7,6,4,3,1};
        int answer = 0;
        //when
        int output = solution.maxProfit(prices);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        int[] prices = new int[]{1,2,3,4,5};
        int answer = 4;
        //when
        int output = solution.maxProfit(prices);
        //then
        assertEquals(answer, output);
    }

}