package com.example.demo.tests.test4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    Solution1 solution = new Solution1();

    @Test
    void testCase1(){
        //given
        String S = "00-44  48 5555 8361";
        String answer = "004-448-555-583-61";
        //when
        String output = this.solution.solution(S);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        String S = "0 - 22 1985--324";
        String answer = "022-198-53-24";
        //when
        String output = this.solution.solution(S);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase3(){
        //given
        String S = "00-44  48 5555 83612";
        String answer = "004-448-555-583-612";
        //when
        String output = this.solution.solution(S);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase4(){
        //given
        String S = "666 777";
        //when
        String answer = "666-777";
        //then
        String output = this.solution.solution(S);
        assertEquals(output, answer);
    }

    @Test
    void testCase5(){
        //given
        String S = "666 7777";
        //when
        String answer = "666-77-77";
        //then
        String output = this.solution.solution(S);
        assertEquals(output, answer);
    }

    @Test
    void testCase6(){
        //given
        String S = "666 77";
        //when
        String answer = "666-77";
        //then
        String output = this.solution.solution(S);
        assertEquals(output, answer);
    }

    @Test
    void testCase7(){
        //given
        String S = "666 7";
        //when
        String answer = "66-67";
        //then
        String output = this.solution.solution(S);
        assertEquals(output, answer);
    }

    @Test
    void testCase8(){
        //given
        String S = "666";
        String answer = "666";
        //when
        String output = this.solution.solution(S);
        //then
        assertEquals(output, answer);
    }

}