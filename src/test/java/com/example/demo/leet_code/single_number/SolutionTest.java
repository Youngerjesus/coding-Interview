package com.example.demo.leet_code.single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution(); 
    
    @Test
    void testCase1(){
        //given
        int[] nums = new int[]{2,2,1};
        int answer = 1;
        //when
        int output = solution.singleNumber(nums);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int[] nums = new int[]{4,1,2,1,2};
        int answer = 4;
        //when
        int output = solution.singleNumber(nums);
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        int[] nums = new int[]{1};
        int answer = 1;
        //when
        int output = solution.singleNumber(nums);
        //then
        assertEquals(answer, output);
    }
}