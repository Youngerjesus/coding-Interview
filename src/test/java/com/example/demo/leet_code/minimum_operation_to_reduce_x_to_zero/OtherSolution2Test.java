package com.example.demo.leet_code.minimum_operation_to_reduce_x_to_zero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolution2Test {

    OtherSolution2 solution = new OtherSolution2();

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

    @Test
    void testCase7(){
        //given
        int[] nums = new int[]{3,2,20,1,1,3};
        int x = 10;
        int actual = 5;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase8(){
        //given
        int[] nums = new int[]{5,2,3,1,1};
        int x = 5;
        int actual = 1;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase9(){
        //given
        int[] nums = new int[]{6016,5483,541,4325,8149,3515,7865,2209,9623,9763,4052,6540,2123,2074,765,7520,4941,5290,5868,6150,6006,6077,2856,7826,9119};
        int x = 31841;
        int actual = 6;
        //when
        int expected = solution.minOperations(nums, x);
        //then
        assertEquals(expected, actual);
    }

}