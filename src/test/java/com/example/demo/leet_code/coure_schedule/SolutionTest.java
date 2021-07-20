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
    void testCase4(){
        //given
        int numberCourses = 5;
        int[][] prerequisites = new int[][]{{1,4},{2,4},{3,1},{3,2}};
        //when
        boolean output = solution.canFinish(numberCourses, prerequisites);
        //then
        assertTrue(output);
    }

    @Test
    void testCase5(){
        //given
        int numberCourses = 1;
        int[][] preRequisites = new int[][]{};
        //when
        boolean actual = solution.canFinish(numberCourses, preRequisites);
        //then
        assertTrue(actual);
    }
}