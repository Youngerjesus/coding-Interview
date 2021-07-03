package com.example.demo.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {
    Solution4 solution = new Solution4();

    @Test
    void testCase1(){
        //given
        int N = 3;
        int[] coffeeTimes = new int[]{4,2,2,5,3};
        int[] answer = new int[]{2,3,1,5,4};
        //when
        int[] output = this.solution.solution(N, coffeeTimes);
        //then
        assertArrayEquals(output, answer);
    }
}