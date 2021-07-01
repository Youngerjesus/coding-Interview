package com.example.demo.leet_code.number_of_islands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        char[][] grid = new char[][]{{'1','1','1','1','0'},
                                    {'1','1','0','1','0'},
                                    {'1','1','0','0','0'},
                                    {'0','0','0','0','0'}};
        int answer = 1;
        //when
        int output = solution.numIslands(grid);
        //then
        assertEquals(output, answer);
    }

}