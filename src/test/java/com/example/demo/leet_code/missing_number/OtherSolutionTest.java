package com.example.demo.leet_code.missing_number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    @DisplayName("3이 빠진 경우 0,1,2,4,5")
    void testCase1(){
        //given
        int[] nums = new int[]{0,4,1,5,2};
        int answer = 3;
        //when
        int output = solution.missingNumber(nums);
        //then
        assertEquals(output, answer);
    }

    @Test
    @DisplayName("[0,3] 이 주어진 범위인 경우 4이 있어야 함")
    void testCase2(){
        //given
        int[] nums = new int[]{0,1,3,2};
        int answer = 4;
        //when
        int output = solution.missingNumber(nums);
        //then
        assertEquals(output, answer);
    }

    @Test
    @DisplayName("[0] 인 경우 1이 필요함")
    void testCase3(){
        //given
        int[] nums = new int[]{0};
        int answer = 1;
        //when
        int output = solution.missingNumber(nums);
        //then
        assertEquals(output, answer);
    }

}