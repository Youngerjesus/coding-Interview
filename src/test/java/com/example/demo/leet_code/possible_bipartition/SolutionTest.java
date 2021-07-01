package com.example.demo.leet_code.possible_bipartition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    @DisplayName("[[1,2],[2,3],[3,1] 삼각관계는 false")
    void testCase1(){
        //given
        int n = 3;
        int[][] dislikes = new int[][]{{1,2},{2,3},{3,1}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertFalse(output);
    }

    @Test
    @DisplayName("[[1,2],[1,3] 왕따시키는 케이스는 true")
    void testCase2(){
        //given
        int n = 3;
        int[][] dislikes = new int[][]{{1,2},{1,3}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertTrue(output);
    }

    @Test
    @DisplayName("[[1,2],[1,3],[2,4],[3,4]]편이 나뉘는 케이스 ")
    void testCase3(){
        //given
        int n = 4;
        int[][] dislikes = new int[][]{{1,2},{1,3},{2,4},{3,4}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertTrue(output);
    }

    @Test
    @DisplayName("[[1,2],[1,3],[2,4]]편이 나뉘는 케이스 ")
    void testCase4(){
        //given
        int n = 4;
        int[][] dislikes = new int[][]{{1,2},{1,3},{2,4}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertTrue(output);
    }

    @Test
    @DisplayName("[[1,2],[3,4],[5,6],[6,7],[8,9],[7,8]]")
    void testCase5(){
        //given
        int n = 10;
        int[][] dislikes = new int[][]{{1,2},{3,4},{5,6},{6,7},{8,9},{7,8}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertTrue(output);
    }

    @Test
    @DisplayName("[[1,2],[1,3],[2,3] 삼각관계는 false")
    void testCase6(){
        //given
        int n = 3;
        int[][] dislikes = new int[][]{{1,2},{1,3},{2,3}};
        //when
        boolean output = solution.possibleBipartition(n, dislikes);
        //then
        assertFalse(output);
    }
}