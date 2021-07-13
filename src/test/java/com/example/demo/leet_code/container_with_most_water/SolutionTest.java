package com.example.demo.leet_code.container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int answer = 49;
        //when
        int expected = solution.maxArea(height);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase2(){
        //given
        int[] height = new int[]{1,1};
        int answer = 1;
        //when
        int expected = solution.maxArea(height);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase3(){
        //given
        int[] height = new int[]{4,3,2,1,4};
        int answer = 16;
        //when
        int expected = solution.maxArea(height);
        //then
        assertEquals(expected, answer);
    }

}