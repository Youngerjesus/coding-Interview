package com.example.demo.leet_code.two_sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolution1Test {

    Solution solution = new OtherSolution1();

    @Test
    @DisplayName("TestCase 1")
    void TestCase1(){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] answer = new int[]{0,1};

        int[] mySolution = solution.twoSum(nums, target);

        assertArrayEquals(answer, mySolution);
    }

    @Test
    @DisplayName("TestCase 2")
    void TestCase2(){
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] answer = new int[]{1,2};

        int[] mySolution = solution.twoSum(nums, target);

        assertArrayEquals(answer, mySolution);
    }

    @Test
    @DisplayName("TestCase 3")
    void TestCase3(){
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] answer = new int[]{0,1};

        int[] mySolution = solution.twoSum(nums, target);

        assertArrayEquals(answer, mySolution);
    }

}