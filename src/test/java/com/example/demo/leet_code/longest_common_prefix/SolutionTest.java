package com.example.demo.leet_code.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        String[] input = new String[]{"flower", "flow", "flight"};
        String answer = "fl";

        //when
        String output = solution.longestCommonPrefix(input);

        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase2(){
        String[] input = new String[]{"dog", "racecar", "car"};
        String answer = "";

        //when
        String output = solution.longestCommonPrefix(input);

        //then
        assertEquals(answer, output);
    }

    @Test
    void testCase3(){
        //given
        String[] input = new String[]{"cir", "car"};
        String answer = "c";

        //when
        String output = solution.longestCommonPrefix(input);

        //then
        assertEquals(answer, output);
    }
}