package com.example.demo.leet_code.reverse_integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new OtherSolution1();

    @Test
    @DisplayName("TestCase 1")
    void TestCase1(){
        int input = 123;
        int output = 321;
        int answer = solution.reverse(input);

        assertEquals(output, answer);
    }

    @Test
    @DisplayName("TestCase 2")
    void TestCase2(){
        int input = -123;
        int output = -321;
        int answer = solution.reverse(input);

        assertEquals(output, answer);
    }

    @Test
    @DisplayName("TestCase 3")
    void TestCase3() {
        int input = 120;
        int output = 21;
        int answer = solution.reverse(input);

        assertEquals(output, answer);
    }

    @Test
    @DisplayName("TestCase 4")
    void TestCase4(){
        int input = 0;
        int output = 0;
        int answer = solution.reverse(input);

        assertEquals(output, answer);
    }

    @Test
    @DisplayName("TestCase 5")
    void TestCase5(){
        int input = 1534236469;
        long output = 0;

        assertEquals(output, solution.reverse(input));
    }

    @Test
    @DisplayName("TestCase 6")
    void TestCase6(){
        int input = -2147483648;
        long output = 0;

        assertEquals(output, solution.reverse(input));
    }
}