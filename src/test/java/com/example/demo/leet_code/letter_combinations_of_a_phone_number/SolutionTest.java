package com.example.demo.leet_code.letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void solution(){
        //given
        List<String> answer = new ArrayList<>();
        answer.add("ad");
        answer.add("ae");
        answer.add("af");
        answer.add("bd");
        answer.add("be");
        answer.add("bf");
        answer.add("cd");
        answer.add("ce");
        answer.add("cf");

        String digit = "23";
        UsingNumber usingNumber = new UsingNumber(digit);
        //when
        List<String> result = usingNumber.getPossibleCombinationsOrderByDictionary();
        //then
        assertArrayEquals(answer.toArray(), result.toArray());
    }

    @Test
    void testCase2(){
        //given
        String digit = "";
        List<String> answer = new ArrayList<>();
        //when
        List<String> result = solution.letterCombinations(digit);
        //then
        assertArrayEquals(answer.toArray(), result.toArray());
    }

    @Test
    void testCase3(){
        //given
        String digit = "2";
        List<String> answer = new ArrayList<>();

        answer.add("a");
        answer.add("b");
        answer.add("c");
        //when
        List<String> result = solution.letterCombinations(digit);
        //then
        assertArrayEquals(answer.toArray(), result.toArray());
    }

    @Test
    void testCase4(){
        //given
        String digit = "22";
        List<String> answer = new ArrayList<>();

        answer.add("aa");
        answer.add("ab");
        answer.add("ac");
        answer.add("ba");
        answer.add("bb");
        answer.add("bc");
        answer.add("ca");
        answer.add("cb");
        answer.add("cc");
        //when
        List<String> result = solution.letterCombinations(digit);
        //then
        assertArrayEquals(answer.toArray(), result.toArray());
    }
}