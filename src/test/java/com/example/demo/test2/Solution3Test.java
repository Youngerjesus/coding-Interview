package com.example.demo.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution = new Solution3();

    @Test
    void testCase1(){
        //given
        int N = 55;
        int answer = 56;
        //when
        int output = this.solution.solution(N);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase2(){
        //given
        int N = 1765;
        int answer = 1767;
        //when
        int output = this.solution.solution(N);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase3(){
        //given
        int N = 98;
        int answer = 101;
        //when
        int output = this.solution.solution(N);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase4(){
        //given
        int N = 44432;
        int answer = 45010;
        //when
        int output = this.solution.solution(N);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase5(){
        //given
        int N = 3298;
        int answer = 3401;
        //when
        int output = this.solution.solution(N);
        //then
        assertEquals(answer,output);
    }

    @Test
    void testCase6(){
        //given
        int N = 1000000000;
        //when
        int output = this.solution.solution(N);
        //then
        System.out.println(output);
    }
}