package com.example.demo.leet_code.maximum_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        // given
        int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int answer = 6;
        // when
        int output = solution.maxSubArray(input);
        // then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        // given
        int[] input = new int[]{1};
        int answer = 1;
        // when
        int output = solution.maxSubArray(input);
        // then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        // given
        int[] input = new int[]{5,4,-1,7,8};
        int answer = 23;
        // when
        int output = solution.maxSubArray(input);
        // then
        assertEquals(answer, output);
    }

    @Test
    void testCase4(){
        // given
        int[] input = new int[]{-1};
        int answer = -1;
        // when
        int output = solution.maxSubArray(input);
        // then
        assertEquals(answer, output);
    }
}