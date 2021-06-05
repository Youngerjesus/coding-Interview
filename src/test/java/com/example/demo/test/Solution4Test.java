package com.example.demo.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    Solution4 solution = new Solution4();

    @Test
    void testCase1(){
        //given
        int n = 3;
        int[][] queries = new int[][]{{1,4}, {2,2}, {1,3}, {1,6}, {3, -1}, {2,-1}};
        int[] answer = new int[]{4,2};
        //when
        int[] output = this.solution.solution(n, queries);
        //then
        assertArrayEquals(answer, output);
    }


}