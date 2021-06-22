package com.example.demo.leet_code.excel_sheet_column_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void TestCase1(){
        //given
        String columnTitle = "ZY";
        int answer = 701;
        //when
        int output = solution.titleToNumber(columnTitle);
        //then
        assertEquals(output, answer);
    }

    @Test
    void TestCase2(){
        //given
        String columnTitle = "FXSHRXW";
        int answer = 2147483647;
        //when
        int output = solution.titleToNumber(columnTitle);
        //then
        assertEquals(output, answer);
    }
}