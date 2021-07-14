package com.example.demo.leet_code.reverse_bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int n = 43261596;
        int answer = 964176192;
        //when
        int output = solution.reverseBits(n);
        //then
        assertEquals(output, answer);
    }
}