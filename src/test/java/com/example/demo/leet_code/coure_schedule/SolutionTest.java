package com.example.demo.leet_code.coure_schedule;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int numberCourses = 2;
        int[][] prerequisites = new int[][]{{1,0}};
        //when
        boolean output = solution.canFinish(numberCourses, prerequisites);
        //then
        assertTrue(output);
    }

    @Test
    @DisplayName("Cycle")
    void testCase2(){
        //given
        int numberCourses = 3;
        int[][] prerequisites = new int[][]{{1,0},{0,2},{2,1}};
        //when
        boolean output = solution.canFinish(numberCourses, prerequisites);
        //then
        assertFalse(output);
    }

    @Test
    @DisplayName("20" +
            "[[0,10],[3,18],[5,5],[6,11],[11,14],[13,1],[15,1],[17,4]]")
    void testCase4(){
        //given
        int numberCourses = 5;
        int[][] prerequisites = new int[][]{{1,4},{2,4},{3,1},{3,2}};
        //when
        boolean output = solution.canFinish(numberCourses, prerequisites);
        //then
        assertTrue(output);
    }
}