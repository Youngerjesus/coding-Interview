package com.example.demo.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    void testCase1(){
        //given
        int[] grade = new int[]{2,2,1};
        int[] answer = new int[]{1,1,3};
        //when
        int[] output = this.solution.solution(grade);
        //then
        assertArrayEquals(output, answer);
    }
}