package com.example.demo.leet_code.fizz_buzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    @DisplayName("Test Case 1")
    void TestCase1(){
        int n = 3;
        String[] answers = solution.fizzBuzz(n).toArray(String[]::new);
        String[] expected = new String[]{"1", "2", "Fizz"};

        assertArrayEquals(answers, expected);
    }

    @Test
    @DisplayName("Test Case 2")
    void TestCase2(){
        int n = 5;
        String[] answers = solution.fizzBuzz(n).toArray(String[]::new);
        String[] expected = new String[]{"1","2","Fizz","4","Buzz"};

        assertArrayEquals(answers, expected);
    }

    @Test
    @DisplayName("Test Case 3")
    void TestCase3(){
        int n = 15;
        String[] answers = solution.fizzBuzz(n).toArray(String[]::new);
        String[] expected = new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};

        assertArrayEquals(answers, expected);
    }

    @Test
    @DisplayName("Else 예약어 줄이기 - Polymorphism")
    void polymorphism(){


    }
}