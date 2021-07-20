package com.example.demo.tests.test7;

import com.example.demo.leet_code.coure_schedule.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 solution = new Solution1();

    @Test
    void testCase1(){
        //given
        int U = 3;
        int L = 2;
        int[] C = new int[]{2,1,1,0,1};
        String expected = "11100,10001";
        //when
        String actual = this.solution.solution(U, L, C);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        int U = 2;
        int L = 3;
        int[] C = new int[]{0,0,1,1,2};
        //when
        String actual = this.solution.solution(U, L, C);
        //then
        assertEquals("IMPOSSIBLE", actual);
    }

}