package com.example.demo.leet_code.hamming_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1() {
        int x = 1;
        int y = 4;
        int answer = 2;
        int output = solution.hammingDistance(x, y);
        assertEquals(answer, output);
    }

}