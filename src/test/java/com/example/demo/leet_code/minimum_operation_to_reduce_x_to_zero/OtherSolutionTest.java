package com.example.demo.leet_code.minimum_operation_to_reduce_x_to_zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void testCase1(){
        //given
        int[] nums = new int[]{1,1,4,2,3};
        int x = 5;
        int actual = 2;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        int[] nums = new int[]{0,0,0,0,0,0,0};
        int x = 5;
        int actual = -1;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase3() {
        // given
        int[] nums = new int[]{6,20,5,5,5,5};
        int x = 15;
        int actual = 3;
        // when
        int expected = solution.minOperations(nums, x);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void testCase4(){
        //given
        int[] nums = new int[]{100,1,1,1,1,1,1};
        int x = 10;
        int actual = -1;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase5(){
        //given
        int[] nums = new int[]{20,10,10,100,100,40,0};
        int x = 40;
        int actual = 2;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase6() {
        int[] nums = new int[]{8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int x = 134365;
        int actual = 16;

        int expected = solution.minOperations(nums, x);
        assertEquals(expected, actual);
    }

}