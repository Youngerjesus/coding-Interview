package com.example.demo.tests.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 solution = new Solution1();

    @Test
    void testCase1(){
        //given
        String s = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String c = "Example";
        String answer = "john.doe@example.com; peter.parker@example.com; mary.watsonpa@example.com; john.doe2@example.com; john.doe3@example.com; jane.doe@example.com; peter.parker2@example.com";
        //when
        String output = this.solution.solution(s, c);
        //then
        assertEquals(output, answer);
    }

    @Test
    void testCase2(){
        //given
        String s = "Peter Able carry-with; james bond";
        String c = "naver";
        String answer = "peter.carrywit@naver.com; james.bond@naver.com";
        //when
        String output = this.solution.solution(s, c);
        //then
        assertEquals(output, answer);
    }
}