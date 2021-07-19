package com.example.demo.leet_code.maximum_product_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] nums = new int[]{2,3,-2,4};
        int answer = 6;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase2(){
        //given
        int[] nums = new int[]{-3,-6,0,2};
        int answer = 18;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase3(){
        //given
        int[] nums = new int[]{1,1,1,0,-3,5,5,-2};
        int answer = 150;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase4(){
        //given
        int[] nums = new int[]{0,0,0,0,5,0,0,0,0};
        int answer = 5;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase5(){
        //given
        int[] nums = new int[]{1,2,-1,3,4,5,-1};
        int answer = 120;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase6(){
        //given
        int[] nums = new int[]{3,-1,4};
        int answer = 4;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase7(){
        //given
        int[] nums = new int[]{2,-5,-2,-4,3};
        int answer = 24;
        //when
        int expected = solution.maxProduct(nums);
        //then
        assertEquals(expected, answer);
    }
}