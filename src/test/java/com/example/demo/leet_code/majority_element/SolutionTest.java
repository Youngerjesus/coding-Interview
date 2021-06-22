package com.example.demo.leet_code.majority_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int[] nums = new int[]{3,2,3};
        int answer = 3;
        //when
        int output = solution.majorityElement(nums);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int answer = 2;
        //when
        int output = solution.majorityElement(nums);
        //then
        assertEquals(output, answer);
    }
}