package com.example.demo.leet_code.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void testCase1(){
        //given
        int[] nums = new int[]{1,2,3,1};
        //when
        boolean output = solution.containsDuplicate(nums);
        //then
        assertTrue(output);
    }
}