package com.example.demo.leet_code.pascal_triangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testCase1(){
        //given
        int numRows = 5;
        Integer[][] answer = new Integer[][]{{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        //when
        List<List<Integer>> generate = solution.generate(numRows);
        //then
        for (int i = 0; i < generate.size(); i++) {
            Integer[] toArray = generate.get(i).toArray(Integer[]::new);
            assertArrayEquals(answer[i], toArray);
        }

    }
}