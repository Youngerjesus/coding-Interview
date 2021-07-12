package com.example.demo.leet_code.zig_zag_conversion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    @DisplayName("PAYPALISHIRING -> PAHNAPLSIIGYIR")
    void testCase1(){
        //given
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String answer = "PAHNAPLSIIGYIR";
        //when
        String expected = solution.convert(s, numRows);
        //then
        assertEquals(expected, answer);
    }

    @Test
    void testCase2(){
        //given
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String answer = "PINALSIGYAHRPI";
        //when
        String expected = solution.convert(s, numRows);
        //then
        assertEquals(expected, answer);
    }

    @Test
    @DisplayName("numRows 1 -> abcdef -> abcdef")
    void testCase3(){
        //given
        String s = "abcdef";
        int numRows = 1;
        String answer = "abcdef";
        //when
        String expected = solution.convert(s, numRows);
        //then
        assertEquals(expected, answer);
    }
}