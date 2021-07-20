package com.example.demo.tests.test7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolution4Test {
    OtherSolution4 solution = new OtherSolution4();

    @Test
    void testCase1(){
        //given
        int[] A = new int[]{200,100,1,2};
        int[] B = new int[]{3,6,5,100,200};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        int[] A = new int[]{3,6,5,100,200};
        int[] B = new int[]{200,100,1,2};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase3(){
        //given
        int[] A = new int[]{2,1};
        int[] B = new int[]{3,3};
        int expected = -1;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase4(){
        //given
        int[] A = new int[]{100,1,2};
        int[] B = new int[]{3,6,5,100};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase5(){
        //given
        int[] B = new int[]{100,1,2};
        int[] A = new int[]{3,6,5,100};
        int expected = 100;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase6(){
        //given
        int[] B = new int[]{100,1,2};
        int[] A = new int[]{3,6,5,100,1};
        int expected = 1;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase7(){
        //given
        int[] B = new int[]{7,9,2};
        int[] A = new int[]{3,6,5,100,1};
        int expected = -1;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase8(){
        //given
        int[] B = new int[]{2,2,2};
        int[] A = new int[]{2,2,2,2,1};
        int expected = 2;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase9(){
        //given
        int[] B = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] A = new int[]{10,9,8,4};
        int expected = 4;
        //when
        int actual = this.solution.solution(A, B);
        //then
        assertEquals(expected, actual);
    }
}