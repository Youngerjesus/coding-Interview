package com.example.demo.leet_code.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testCase1(){
        //given
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,2};
        int answerLength = 2;
        int[] answerArray = new int[]{1,2};
        //when
        int output = solution.removeDuplicates(nums);
        //then
        assertEquals(answerLength, output);
        for (int i = 0; i < output; i++) {
            assertEquals(answerArray[i], nums[i]);
        }
    }

    @Test
    void testCase2(){
        //given
        Solution solution = new Solution();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int answerLength = 5;
        int[] answerArray = new int[]{0,1,2,3,4};
        //when
        int output = solution.removeDuplicates(nums);
        //then
        assertEquals(answerLength, output);
        for (int i = 0; i < output; i++) {
            assertEquals(answerArray[i], nums[i]);
        }
    }

    @Test
    void testCase3(){
        //given
        Solution solution = new Solution();
        int[] nums = new int[]{1,2};
        int answerLength = 2;
        int[] answerArray = new int[]{1,2};
        //when
        int output = solution.removeDuplicates(nums);
        //then
        assertEquals(answerLength, output);
        for (int i = 0; i < output; i++) {
            assertEquals(answerArray[i], nums[i]);
        }

    }
}