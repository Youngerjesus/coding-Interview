package com.example.demo.leet_code.edit_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    OtherSolution solution = new OtherSolution();

    @Test
    void TestCase1(){
        //given
        String word1 = "horse";
        String word2 = "ros";
        int answer = 3;
        //when
        int output = solution.minDistance(word1, word2);
        //then
        assertEquals(answer, output);
    }
}