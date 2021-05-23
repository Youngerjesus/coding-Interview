package com.example.demo.algorithm.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransitiveClosureGraphTest {

    @Test
    void testCase1(){
        //given
        TransitiveClosureGraph graph = new TransitiveClosureGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        int[][] answer = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,0,1}};
        //when
        int[][] output = graph.solution();
        //then
        assertArrayEquals(answer, output);
    }

    @Test
    void testCase2(){
        //given
        TransitiveClosureGraph graph = new TransitiveClosureGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        int[][] answer = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,0,1}};
        //when
        int[][] output = graph.otherSolution();
        //then
        assertArrayEquals(answer, output);
    }
}