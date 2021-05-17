package com.example.demo.leet_code.roman_to_integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolution2Test {

    Solution solution = new OtherSolution2();

    @Test
    @DisplayName("TestCase 1")
    void testCase1(){
        String input = "III";
        int answer = 3;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 2")
    void testCase2(){
        String input = "IV";
        int answer = 4;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 3")
    void testCase3(){
        String input = "IX";
        int answer = 9;
        int output= solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 4")
    void testCase4(){
        String input = "LVIII";
        int answer = 58;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 5")
    void testCase5(){
        String input = "MCMXCIV";
        int answer = 1994;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 7")
    void testCase6(){
        String input = "MDCXCV";
        int answer = 1695;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

    @Test
    @DisplayName("TestCase 3")
    void testCase7(){
        String input = "D";
        int answer = 500;
        int output = solution.romanToInt(input);

        assertEquals(answer, output);
    }

}