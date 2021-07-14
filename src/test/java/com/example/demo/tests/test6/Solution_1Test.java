package com.example.demo.tests.test6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1Test {
    @Test
    void testCase1(){
        //given

    }

    @Test
    void testCase2(){
        //given
        List<Integer> nums = new ArrayList<>();
        nums.add(31);
        nums.add(15);
        nums.add(7);
        nums.add(3);
        nums.add(2);

        List<Integer> actual = new ArrayList<>();
        actual.add(2);
        actual.add(3);
        actual.add(7);
        actual.add(15);
        actual.add(31);
        //when
        List<Integer> expected = Solution_1.cardinalitySort(nums);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase3(){
        //given
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(4);
        actual.add(3);
        actual.add(5);
        //when
        List<Integer> expected = Solution_1.cardinalitySort(nums);
        //then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void testCase4(){
        //given

        //when

        //then
    }
}