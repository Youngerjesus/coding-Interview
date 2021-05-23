package com.example.demo.algorithm.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandTest {

    @Test
    void testCase1(){
        //given
        int[][] mat = new int[][] {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        //when
        Island island = new Island(mat);
        int answer = 5;
        int output = island.solution();
        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        int[][] mat = new int[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 1, 0}};
        //when
        Island island = new Island(mat);
        int answer = 4;
        int output = island.solution();
        //then
        assertEquals(answer, output);
    }
}