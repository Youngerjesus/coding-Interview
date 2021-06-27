package com.example.demo.leet_code.reverse_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    @DisplayName("일반적인 뒤집기 hello -> olleh")
    void testCase1(){
        //given
        char[] s = new char[]{'h','e','l','l','o'};
        char[] answer = new char[]{'o','l','l','e','h'};
        //when
        solution.reverseString(s);
        //then
        assertArrayEquals(s, answer);
    }

    @Test
    @DisplayName("한 글자인 경우 뒤집기 -> h -> h")
    void testCase2(){
        //given
        char[] s = new char[]{'h'};
        char[] answer = new char[]{'h'};
        //when
        solution.reverseString(s);
        //then
        assertArrayEquals(s, answer);
    }

}