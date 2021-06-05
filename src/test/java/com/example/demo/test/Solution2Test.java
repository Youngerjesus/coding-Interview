package com.example.demo.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    Solution2 solution = new Solution2();

    @Test
    void testCase1(){
        //given
        int[][] jobs = new int[][]{{1, 10, 20, 6}, {2, 12, 20, 8}, {3, 20, 30, 2}, {4, 25, 40, 10}};
        int endTime = 30;
        int[] answer = new int[]{1,3};
        //when
        int[] output = this.solution.solution(endTime, jobs);
        //then
        assertArrayEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int[][] jobs = new int[][]{};
        int endingTime = 10;
        int[] answer = new int[]{};
        //when
        int[] output = this.solution.solution(endingTime, jobs);
        //then
        assertArrayEquals(answer, output);
    }
    
    @Test
    void testCase3(){
        //given
        int[][] jobs = new int[][]{{1, 10, 20, 4}, {2, 12, 20, 2}};
        int endingTime = 0;
        int[] answer = new int[]{};
        //when
        int[] output = this.solution.solution(endingTime, jobs);
        //then
        assertArrayEquals(answer, output);
    }

    @Test
    void testCase4(){
        //given
        int[][] jobs = new int[][]{{1, 10, 20, 3}, {2, 14, 20, 9}, {3, 18, 24, 2}, {4, 25, 40, 5}, {5, 28, 40, 1}};
        int endingTime = 40;
        int[] answer = new int[]{1,4,5};
        //when
        int[] output = this.solution.solution(endingTime, jobs);
        //then
        assertArrayEquals(answer, output);
    }
}


